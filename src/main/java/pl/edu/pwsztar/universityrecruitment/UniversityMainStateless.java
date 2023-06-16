package pl.edu.pwsztar.universityrecruitment;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class UniversityMainStateless {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		StatelessKieSession kSession = kContainer.newStatelessKieSession("ksession-rules-stateless");

		UniversityCandidate uc = new UniversityCandidate(1L, "Anna", "Kowalewska", 120, Boolean.FALSE);

		kSession.execute(uc);
	}
}