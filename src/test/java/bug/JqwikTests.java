package bug;

import net.jqwik.api.*;

class JqwikTests {

	@Property
	void aProperty(@ForAll int anInt) {}
}
