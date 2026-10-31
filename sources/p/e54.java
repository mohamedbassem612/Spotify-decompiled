package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 13));

    public e54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        e54 e54Var = (e54) this.c.getValue();
        return e54Var != null ? e54Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("enable_biography_page", "android-artist-creatorartist", a()));
    }
}
