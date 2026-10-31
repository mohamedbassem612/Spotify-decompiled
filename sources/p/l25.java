package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l25 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 0));

    public l25(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        l25 l25Var = (l25) this.c.getValue();
        return l25Var != null ? l25Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("cover_art_snake_enabled", "android-system-cover-art-snake", a()));
    }
}
