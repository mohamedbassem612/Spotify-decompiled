package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g15 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 17));

    public g15(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        g15 g15Var = (g15) this.c.getValue();
        return g15Var != null ? g15Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("is_page_enabled", "android-settings-page-parental-controls", a()));
    }
}
