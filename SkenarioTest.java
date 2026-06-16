class BaseReport {
    public void cetakHeader() {
        System.out.println("--- START AUTOMATION TEST REPORT ---");
    }
}

class SmokeTest extends BaseReport {
    public void testLogin() {
        System.out.println("[SMOKE TEST] Verifikasi fungsi login berhasil diselesaikan.");
    }
}

public class SkenarioTest {
    public static void main(String[] args) {
        SmokeTest smokeTest = new SmokeTest();
        smokeTest.cetakHeader();
        smokeTest.testLogin();
    }
}
