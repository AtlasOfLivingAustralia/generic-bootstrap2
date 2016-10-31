class GenericBootstrap2GrailsPlugin {
    // the plugin version
    def version = "1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.4 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Generic Bootstrap2 Plugin" // Headline display name of the plugin
    def author = "Nick dos Remedios"
    def authorEmail = "nick.dosremedios@csiro.au"
    def description = '''\
Light-weight plugin for Bootstrap2 files and application resources for use with clients of biocache-hubs (a drop-in replacement for
ala-bootstrap2 plugin for use in non-ALA web apps).
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/AtlasOfLivingAustralia/generic-bootstrap2"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "MPL1.1"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Atlas of Living Australia", url: "http://www.ala.org.au/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Dave Martin", email: "david.martin@csiro.au" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/AtlasOfLivingAustralia/generic-bootstrap2/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "url: \"git://github.com/AtlasOfLivingAustralia/generic-bootstrap2" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
