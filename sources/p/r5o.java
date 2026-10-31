package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r5o {
    public final gp41 a;
    public final ohv0 b;

    public /* synthetic */ r5o(gp41 gp41Var, ohv0 ohv0Var) {
        this.a = gp41Var;
        this.b = ohv0Var;
    }

    public void a() {
        this.b.a(new khv0(this.a.a, 4, (Map) null, "credential_manager_save_dialog_skipped"));
    }

    public void b() {
        this.b.a(new khv0(this.a.a, 4, (Map) null, "credential_manager_save_credentials_success"));
    }

    public void c(String str) {
        this.b.a(new jhv0(this.a.a, "third_party_auth_failed", "google_auth_button", str));
    }

    public void d(int i, String str) {
        this.b.a(new jhv0(this.a.a, str, 4, String.valueOf(i)));
    }
}
