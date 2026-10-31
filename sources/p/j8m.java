package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j8m {
    public final String a;
    public final l7c1 b;
    public final boolean c;
    public final boolean d;
    public final iu30 e;
    public final Function0 f;
    public final int g;
    public final int h;
    public final Function0 i;

    public j8m(String str, l7c1 l7c1Var, boolean z, boolean z2, iu30 iu30Var, Function0 function0, int i, int i2, Function0 function1) {
        this.a = str;
        this.b = l7c1Var;
        this.c = z;
        this.d = z2;
        this.e = iu30Var;
        this.f = function0;
        this.g = i;
        this.h = i2;
        this.i = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8m)) {
            return false;
        }
        j8m j8mVar = (j8m) obj;
        return this.a.equals(j8mVar.a) && this.b.equals(j8mVar.b) && this.c == j8mVar.c && this.d == j8mVar.d && u890.j(this.e, j8mVar.e) && u890.j(this.f, j8mVar.f) && this.g == j8mVar.g && this.h == j8mVar.h && u890.j(this.i, j8mVar.i);
    }

    public final int hashCode() {
        int iG = ktd.g(this.e, xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
        Function0 function0 = this.f;
        int iF = kaa0.f(this.h, kaa0.f(this.g, (iG + (function0 == null ? 0 : function0.hashCode())) * 31, 31), 31);
        Function0 function1 = this.i;
        return iF + (function1 != null ? function1.hashCode() : 0);
    }
}
