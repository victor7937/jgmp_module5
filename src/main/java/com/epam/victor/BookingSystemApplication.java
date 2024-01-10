package com.epam.victor;

import com.epam.victor.facade.BookingFacade;
import com.epam.victor.model.Event;
import com.epam.victor.model.Ticket;
import com.epam.victor.model.User;
import com.epam.victor.model.UserAccount;
import com.epam.victor.repository.EventRepository;
import com.epam.victor.repository.TicketRepository;
import com.epam.victor.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@SpringBootApplication
public class BookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(BookingFacade bookingFacade){
//		return args -> {


//		};
//
//	}

}
