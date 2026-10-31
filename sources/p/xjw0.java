package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xjw0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final vu30 f;
    public final n6n0 g = n6n0.MusicIdentifier;
    public final boolean h;
    public final Function0 i;

    public xjw0(String str, boolean z, int i, int i2, String str2, vu30 vu30Var, boolean z2, Function0 function0) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = vu30Var;
        this.h = z2;
        this.i = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjw0)) {
            return false;
        }
        xjw0 xjw0Var = (xjw0) obj;
        return u890.j(this.a, xjw0Var.a) && this.b == xjw0Var.b && this.c == xjw0Var.c && this.d == xjw0Var.d && u890.j(this.e, xjw0Var.e) && u890.j(this.f, xjw0Var.f) && this.g == xjw0Var.g && this.h == xjw0Var.h && this.i.equals(xjw0Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        return this.i.hashCode() + xcg1.g((this.g.hashCode() + hrt.g(cy30.d(kaa0.f(this.d, kaa0.f(this.c, xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }
}
