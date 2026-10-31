package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t7x0 {
    public final r7x0 a;
    public final lww0 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final iu30 f;
    public final Function0 g;
    public final iu30 h;
    public final Function0 i;

    public t7x0(r7x0 r7x0Var, lww0 lww0Var, boolean z, boolean z2, String str, iu30 iu30Var, Function0 function0, iu30 iu30Var2, Function0 function1) {
        this.a = r7x0Var;
        this.b = lww0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = iu30Var;
        this.g = function0;
        this.h = iu30Var2;
        this.i = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7x0) {
            t7x0 t7x0Var = (t7x0) obj;
            if (this.a.equals(t7x0Var.a) && this.b == t7x0Var.b && this.c == t7x0Var.c && this.d == t7x0Var.d && u890.j(this.e, t7x0Var.e) && u890.j(this.f, t7x0Var.f) && u890.j(this.g, t7x0Var.g) && u890.j(this.h, t7x0Var.h) && u890.j(this.i, t7x0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.i.hashCode() + ktd.g(this.h, rjx.n(ktd.g(this.f, (iG + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g), 31);
    }
}
