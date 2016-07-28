package com.mcnc.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			LOG.error("Error Message!");
			LOG.warn("Warn Message!");
			LOG.info("Info Message!");
			LOG.debug("Debug Message!");
		}
	}
}
