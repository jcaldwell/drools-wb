package org.drools.workbench.screens.guided.rule.client.type;

import javax.enterprise.context.ApplicationScoped;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import org.drools.workbench.screens.guided.rule.client.resources.GuidedRuleEditorResources;
import org.drools.workbench.screens.guided.rule.type.GuidedRuleDSLRResourceTypeDefinition;
import org.uberfire.client.workbench.type.ClientResourceType;

@ApplicationScoped
public class GuidedRuleDSLRResourceType
        extends GuidedRuleDSLRResourceTypeDefinition
        implements ClientResourceType {

    private static final Image IMAGE = new Image( GuidedRuleEditorResources.INSTANCE.images().guidedRuleIcon() );

    @Override
    public IsWidget getIcon() {
        return IMAGE;
    }

}
