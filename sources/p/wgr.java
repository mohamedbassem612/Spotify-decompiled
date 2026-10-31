package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wgr {
    public final ie30 a;
    public final ie30 b;
    public final int c;
    public final int d;
    public final px7 e;
    public final b18 f;
    public final sqe1 g;
    public final Object h;

    public wgr(ie30 ie30Var, ie30 ie30Var2, int i, int i2, px7 px7Var, b18 b18Var, sqe1 sqe1Var, Object obj) {
        this.a = ie30Var;
        this.b = ie30Var2;
        this.c = i;
        this.d = i2;
        this.e = px7Var;
        this.f = b18Var;
        this.g = sqe1Var;
        this.h = obj;
    }

    public final wgr a(px7 px7Var) {
        return new wgr(this.a, this.b, this.c, this.d, px7Var, this.f, this.g, this.h);
    }

    public final boolean b() {
        return Objects.equals(this.a.f66p, "audio/raw");
    }
}
