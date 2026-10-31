package p;

import com.spotify.messages.PartnerBannerSessionEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bxn0 {
    public final k1s0 a;
    public final yqg b;
    public i1s0 c;
    public boolean d;

    public bxn0(k1s0 k1s0Var, yqg yqgVar) {
        this.a = k1s0Var;
        this.b = yqgVar;
    }

    public final long a() {
        i1s0 i1s0VarA = this.c;
        if (i1s0VarA == null || i1s0VarA.e() == 0) {
            return 0L;
        }
        if (i1s0VarA.d() != 0) {
            i1s0VarA = i1s0.a(i1s0VarA, i1s0VarA.d(), 0L, 0L, 223);
        }
        return i1s0VarA.c() + ((this.b.b() - i1s0VarA.e()) / 1000);
    }

    public final void b() {
        i1s0 i1s0Var = this.c;
        if (i1s0Var == null) {
            i1s0Var = new i1s0(0L, 255, (String) null);
        }
        this.a.a(i1s0Var.b(), "manual_close", a(), "navigation", z6x.a, "waze");
        this.c = null;
    }

    public final void c() {
        i1s0 i1s0Var = this.c;
        if (i1s0Var == null) {
            i1s0Var = new i1s0(0L, 255, (String) null);
        }
        this.a.a(i1s0Var.b(), "sent_to_waze", a(), "navigation", i1s0Var.i(), "waze");
        this.c = null;
    }

    public final void d(i1s0 i1s0Var) {
        String strB = i1s0Var.b();
        String strG = i1s0Var.g();
        String strH = i1s0Var.h();
        List listI = i1s0Var.i();
        String strF = i1s0Var.f();
        k1s0 k1s0Var = this.a;
        k1s0Var.getClass();
        j1s0 j1s0VarO = PartnerBannerSessionEvent.o();
        j1s0VarO.q(strB);
        j1s0VarO.t("start");
        j1s0VarO.s(strG);
        j1s0VarO.u(0L);
        j1s0VarO.v(strH);
        j1s0VarO.n(listI);
        j1s0VarO.r(strF);
        k1s0Var.a.a(j1s0VarO.build());
    }
}
