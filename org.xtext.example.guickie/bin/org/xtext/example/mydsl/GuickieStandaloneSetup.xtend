/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GuickieStandaloneSetup extends GuickieStandaloneSetupGenerated {

	def static void doSetup() {
		new GuickieStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
