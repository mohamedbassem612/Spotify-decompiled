package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gpn0 implements hac0 {
    public final kg0 a;
    public final npn0 b;
    public final bpb1 c;
    public final xe01 d;

    public gpn0(kg0 kg0Var, npn0 npn0Var) {
        this.a = kg0Var;
        this.b = npn0Var;
        bpb1 bpb1VarB = gio1.b(kpn0.a);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }

    public final void a(String str, String str2) {
        this.c.m((Object) null, new jpn0(str, str2));
        String strF = f4i1.f(str, ": ", str2);
        npn0 npn0Var = this.b;
        npn0Var.b.a(new jhv0(npn0Var.a.a, "third_party_auth_failed", "naver_button", strF));
    }

    public final void b(String str) {
        this.c.m((Object) null, new lpn0(str));
        npn0 npn0Var = this.b;
        npn0Var.b.a(new khv0(npn0Var.a.a, 4, (Map) null, "naver_log_in_success"));
        this.a.d(new yit(new e3f0(str, "spotify-auth-music://callback/r/android/music/login"), bk8.g, (n5o) null, 12), true);
    }

    public final void c() {
        npn0 npn0Var = this.b;
        npn0Var.b.a(new khv0(npn0Var.a.a, 4, (Map) null, "naver_log_in_cancelled"));
        this.a.a(true);
    }
}
