/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.guided.dtable.service;

import org.drools.workbench.models.guided.dtable.shared.model.GuidedDecisionTable52;
import org.drools.workbench.screens.guided.dtable.model.GuidedDecisionTableEditorContent;
import org.guvnor.common.services.shared.file.SupportsCopy;
import org.guvnor.common.services.shared.file.SupportsCreate;
import org.guvnor.common.services.shared.file.SupportsDelete;
import org.guvnor.common.services.shared.file.SupportsRead;
import org.guvnor.common.services.shared.file.SupportsRename;
import org.guvnor.common.services.shared.file.SupportsUpdate;
import org.guvnor.common.services.shared.validation.ValidationService;
import org.jboss.errai.bus.server.annotations.Remote;
import org.kie.workbench.common.services.datamodel.model.PackageDataModelOracleBaselinePayload;
import org.kie.workbench.common.services.shared.source.ViewSourceService;
import org.uberfire.backend.vfs.Path;

@Remote
public interface GuidedDecisionTableEditorService
        extends
        ViewSourceService<GuidedDecisionTable52>,
        ValidationService<GuidedDecisionTable52>,
        SupportsCreate<GuidedDecisionTable52>,
        SupportsRead<GuidedDecisionTable52>,
        SupportsUpdate<GuidedDecisionTable52>,
        SupportsDelete,
        SupportsCopy,
        SupportsRename {

    GuidedDecisionTableEditorContent loadContent( final Path path );

    PackageDataModelOracleBaselinePayload loadDataModel( final Path path );

}
