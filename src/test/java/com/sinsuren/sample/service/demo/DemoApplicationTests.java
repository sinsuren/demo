package com.sinsuren.sample.service.demo;

import com.sinsuren.sample.service.demo.service.impl.RandomServiceImpl;
import com.sinsuren.sample.service.demo.service.impl.SampleServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

//@SpringBootTest(classes = DemoApplication.class)
//@ActiveProfiles("test")
//@RunWith(SpringJUnit4ClassRunner.class)
public class DemoApplicationTests {
    @InjectMocks
    private SampleServiceImpl sampleServiceImpl;

    @Mock
    private RandomServiceImpl randomService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void firstTest() {
        Mockito.when(randomService.getRandom()).thenReturn(5);

        Integer value = sampleServiceImpl.add(1, 1);
        Assert.assertEquals(value, new Integer(10));
    }

    @Test
    public void getRandomTest() {
        Mockito.when(randomService.getRandom()).thenReturn(5);

        Integer value = randomService.getRandom();

        Assert.assertEquals(value, new Integer(5));
    }
}
