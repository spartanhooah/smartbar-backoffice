package net.frey;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import net.frey.smartbar.backoffice.api.GreetingResourceTest;

@QuarkusIntegrationTest
class GreetingResourceIT extends GreetingResourceTest {
    // Execute the same tests but in packaged mode.
}
