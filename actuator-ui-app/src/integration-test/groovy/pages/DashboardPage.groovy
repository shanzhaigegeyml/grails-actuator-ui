package pages

import geb.Page

class DashboardPage extends Page {
    static url = "/sample/actuator/dashboard"
    static at = { title.startsWith 'actuator-ui-app' }
}
