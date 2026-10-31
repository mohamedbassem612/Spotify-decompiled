package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ei4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ei4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sh4(this, (byte) 5));
    }

    public final boolean a() {
        ei4 ei4Var = (ei4) this.c.getValue();
        return ei4Var != null ? ei4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("language_settings", "android-feature-settings", a()));
    }

    public ei4(luk lukVar) {
        this(false, lukVar);
    }
}
