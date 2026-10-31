package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vl4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new gk4(this, (byte) 16));

    public vl4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        vl4 vl4Var = (vl4) this.d.getValue();
        return vl4Var != null ? vl4Var.a() : this.a;
    }

    public final boolean b() {
        vl4 vl4Var = (vl4) this.d.getValue();
        return vl4Var != null ? vl4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_instrumentation_enabled", "android-libs-appstorage", a()), new fpb("is_shared_preferences_instrumentation_enabled", "android-libs-appstorage", b()));
    }
}
