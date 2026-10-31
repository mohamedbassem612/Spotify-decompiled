package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c27 {
    public final c380 a;
    public final int b;
    public final boolean c;
    public final vu30 d;
    public final iu30 e;
    public final Function0 f;
    public final Function0 g;

    public c27(c380 c380Var, int i, boolean z, vu30 vu30Var, iu30 iu30Var, Function0 function0, Function0 function1) {
        this.a = c380Var;
        this.b = i;
        this.c = z;
        this.d = vu30Var;
        this.e = iu30Var;
        this.f = function0;
        this.g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c27)) {
            return false;
        }
        c27 c27Var = (c27) obj;
        return u890.j(this.a, c27Var.a) && this.b == c27Var.b && this.c == c27Var.c && p3v.c(16.0f, 16.0f) && u890.j(this.d, c27Var.d) && u890.j(this.e, c27Var.e) && u890.j(this.f, c27Var.f) && u890.j(this.g, c27Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rjx.n(ktd.g(this.e, hrt.g(x0d.f(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, 16.0f), 31, this.d), 31), 31, this.f);
    }
}
