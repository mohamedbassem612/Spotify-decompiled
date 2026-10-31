package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x9e1 {
    public final af5 a;
    public final lee1 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final wat g;
    public final flb0 h;
    public final f930 i;
    public final long j;

    public x9e1(af5 af5Var, lee1 lee1Var, List list, int i, boolean z, int i2, wat watVar, flb0 flb0Var, f930 f930Var, long j) {
        this.a = af5Var;
        this.b = lee1Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = watVar;
        this.h = flb0Var;
        this.i = f930Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9e1)) {
            return false;
        }
        x9e1 x9e1Var = (x9e1) obj;
        return u890.j(this.a, x9e1Var.a) && u890.j(this.b, x9e1Var.b) && u890.j(this.c, x9e1Var.c) && this.d == x9e1Var.d && this.e == x9e1Var.e && this.f == x9e1Var.f && u890.j(this.g, x9e1Var.g) && this.h == x9e1Var.h && u890.j(this.i, x9e1Var.i) && hjl.c(this.j, x9e1Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + kaa0.f(this.f, xcg1.g((f4i1.b(p3d1.h(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + eqr0.U(this.f) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + hjl.m(this.j) + ")";
    }
}
