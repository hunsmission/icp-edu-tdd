package com.santa.cafe.beverage;

import com.santa.cafe.beverage.model.Beverage;
import com.santa.cafe.beverage.model.BeverageSize;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BeverageServiceTest {

    @InjectMocks
    BeverageService subject;

    @Mock
    BeverageRepository mockBeverageRepository;

    @Before
    public void setUp() throws Exception {
        Beverage mockBeverage = new Beverage("americano", 1000, BeverageSize.SMALL);
        when(mockBeverageRepository.findAll()).thenReturn(Arrays.asList(mockBeverage));
    }

    @Test
    public void WhenGetBeverageList_ThenReturnBeverageList() {
        //when
        List<Beverage> result = subject.getBeverages();

        //then
        assertThat(result.isEmpty(), is(false));
    }

    @Test
    public void WhenRegisteredAmericano_WhenGetBeverageList_ThenVerifyAmericanoFromBeverageList() {
        //when
        List<Beverage> result = subject.getBeverages();

        //then
        assertThat(result.get(0).getName(), is("americano"));
        assertThat(result.get(0).getCost(), is(1000));
        assertThat(result.get(0).getSize(), is(BeverageSize.SMALL));
    }
}
