package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g35 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 11));

    public g35(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        g35 g35Var = (g35) this.c.getValue();
        return g35Var != null ? g35Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("liked_songs_decoration_enabled", "android-system-offline-data-sources-impl", a()));
    }
}
