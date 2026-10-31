package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class npn0 {
    public final gp41 a;
    public final ohv0 b;

    public /* synthetic */ npn0(gp41 gp41Var, ohv0 ohv0Var) {
        this.a = gp41Var;
        this.b = ohv0Var;
    }

    public void a(String str, String str2, boolean z) {
        this.b.a(new khv0(this.a.a, "recaptcha_cached_token_result", sqg0.J(new mmr0[]{new mmr0("result", z ? "hit" : "miss"), new mmr0("login_type", str), new mmr0("auth_source", str2)})));
    }

    public void b() {
        this.b.a(new khv0(this.a.a, 4, (Map) null, "recaptcha_token_fetch_timeout"));
    }

    public void c(long j) {
        this.b.a(new khv0(this.a.a, "recaptcha_user_wait_duration", Collections.singletonMap("value", String.valueOf(j))));
    }

    public void d(long j) {
        this.b.a(new khv0(this.a.a, "recaptcha_sdk_initialization_duration", Collections.singletonMap("value", String.valueOf(j))));
    }

    public void e(String str) {
        this.b.a(new khv0(this.a.a, "recaptcha_sdk_initialization_failure", Collections.singletonMap("sdk_error", str)));
    }

    public void f(long j, String str) {
        this.b.a(new khv0(this.a.a, "recaptcha_token_fetch", sqg0.J(new mmr0[]{new mmr0("site_key", str), new mmr0("duration", String.valueOf(j))})));
    }

    public void g(long j) {
        this.b.a(new khv0(this.a.a, "recaptcha_token_fetch_duration", Collections.singletonMap("value", String.valueOf(j))));
    }

    public void h(long j, String str, String str2) {
        this.b.a(new khv0(this.a.a, "recaptcha_token_fetch_failure", sqg0.J(new mmr0[]{new mmr0("site_key", str), new mmr0("error", str2), new mmr0("duration", String.valueOf(j))})));
    }
}
