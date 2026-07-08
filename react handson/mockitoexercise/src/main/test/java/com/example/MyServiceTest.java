package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchData();

        // Verify output
        assertEquals("Mock Data", result);
    }

@Test
public void testVerifyInteraction() {

    // Create mock object
    ExternalApi mockApi = mock(ExternalApi.class);

    // Create service
    MyService service = new MyService(mockApi);

    // Call method
    service.fetchData();

    // Verify interaction
    verify(mockApi).getData();
}

}