package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class we4 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new pe4(this, (byte) 4));

    public we4(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        we4 we4Var = (we4) this.c.getValue();
        return we4Var != null ? we4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("allow_cdn_domain_access", "android-external-integration-service", a()));
    }
}
