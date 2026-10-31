package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ik21 {
    public final i8h1 a;
    public final kt91 b;
    public final th30 c;
    public final kdy0 d;
    public final yna0 e;
    public final uww0 f;
    public final qe41 g;
    public gk21 h;
    public final vku i = new vku();
    public String j = "";
    public dsk0 k;

    public ik21(i8h1 i8h1Var, kt91 kt91Var, th30 th30Var, kdy0 kdy0Var, yna0 yna0Var, dg30 dg30Var, uww0 uww0Var, dg30 dg30Var2) {
        this.a = i8h1Var;
        this.b = kt91Var;
        this.c = th30Var;
        this.d = kdy0Var;
        this.e = yna0Var;
        this.f = uww0Var;
        this.g = dg30Var2;
        nt21 nt21Var = ((g0i) dg30Var2).d;
        nt21Var.j().e("report_blocking_state");
        nt21Var.j().c("report_blocking_state", new uk(this, (byte) 17));
        dg30Var.runOnUiThread(new xfz0(this, (byte) 5));
    }

    public final void a(String str) {
        this.b.k(k4k.q(str).c());
        this.i.c();
        this.h = null;
    }

    public final int b() {
        Set set = s4b1.f;
        int iOrdinal = uic.x(this.j).c.ordinal();
        if (iOrdinal != 44) {
            return iOrdinal != 926 ? 0 : 2;
        }
        return 1;
    }

    public final void c() {
        if (this.j.length() == 0) {
            return;
        }
        this.i.a(this.d.l(this.j, b(), this.h).subscribe(new hk21(this, (byte) 2), new hk21(this, (byte) 3)));
    }
}
