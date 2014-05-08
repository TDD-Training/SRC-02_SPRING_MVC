package pl.leanleaders.tdd.web;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


public class GreetingControllerTest {

	private static final Object VIEW_NAME = "greeting";

	@InjectMocks
	GreetingController controller;
	
	MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
						
		mockMvc = standaloneSetup(controller).setViewResolvers(viewResolver()).build();
	}

	private InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".html");
		return viewResolver;
	}

	@Test
	public void shouldPointToGreetingsSite() throws Exception {
		mockMvc.perform(get("/greeting"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(view().name(is(VIEW_NAME)));
	}
	
	
}
