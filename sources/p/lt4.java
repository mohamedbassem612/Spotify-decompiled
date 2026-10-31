package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 24));

    public lt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        lt4 lt4Var = (lt4) this.c.getValue();
        return lt4Var != null ? lt4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_service", "android-microsoft-continuity-service", a()));
    }
}
