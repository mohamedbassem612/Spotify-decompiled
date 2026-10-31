package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f35 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 10));

    public f35(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        f35 f35Var = (f35) this.c.getValue();
        return f35Var != null ? f35Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("disable_auto_preview_when_active_npv", "android-system-multiplayer-devicestateprovider", a()));
    }
}
