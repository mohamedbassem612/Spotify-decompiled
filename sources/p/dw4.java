package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dw4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new fv4(this, (byte) 16));

    public dw4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        dw4 dw4Var = (dw4) this.d.getValue();
        return dw4Var != null ? dw4Var.a() : this.a;
    }

    public final boolean b() {
        dw4 dw4Var = (dw4) this.d.getValue();
        return dw4Var != null ? dw4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("reference_plugin_enabled", "android-offline-plugin-support-service", a()), new fpb("shutdown_awareness_enabled", "android-offline-plugin-support-service", b()));
    }
}
