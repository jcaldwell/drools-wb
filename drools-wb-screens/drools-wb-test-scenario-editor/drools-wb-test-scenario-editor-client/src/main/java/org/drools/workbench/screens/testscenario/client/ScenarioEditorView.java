package org.drools.workbench.screens.testscenario.client;

import com.google.gwt.user.client.ui.IsWidget;
import org.drools.workbench.models.datamodel.imports.Imports;
import org.drools.workbench.models.testscenarios.shared.Scenario;
import org.drools.workbench.screens.testscenario.service.ScenarioTestEditorService;
import org.guvnor.common.services.shared.metadata.model.Metadata;
import org.guvnor.common.services.shared.rulenames.RuleNamesService;
import org.jboss.errai.common.client.api.Caller;
import org.kie.workbench.common.widgets.client.datamodel.AsyncPackageDataModelOracle;
import org.kie.workbench.common.widgets.client.widget.HasBusyIndicator;
import org.uberfire.backend.vfs.Path;

public interface ScenarioEditorView
        extends IsWidget,
                HasBusyIndicator {

    void showCanNotSaveReadOnly();

    void clear();

    void renderEditor();

    void addTestRunnerWidget( final Scenario scenario,
                              final Caller<ScenarioTestEditorService> testScenarioEditorService,
                              final Path path );

    void addMetaDataPage( final Path path,
                          final boolean isReadOnly );

    void setScenario( final Scenario scenario,
                      final AsyncPackageDataModelOracle oracle,
                      final Caller<RuleNamesService> ruleNamesService );

    void showSaveSuccessful();

    String getTitle( final String fileName,
                     final String version );

    void initImportsTab( final AsyncPackageDataModelOracle oracle,
                         final Imports imports,
                         final boolean readOnly );

    Metadata getMetadata();

    void resetMetadataDirty();

    void addBulkRunTestScenarioPanel( final Path path,
                                      final boolean isReadOnly );
}
