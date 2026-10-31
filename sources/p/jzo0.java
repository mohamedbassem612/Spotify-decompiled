package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jzo0 {
    public final s3g1 a;
    public final v7u0 b;
    public final hzo0 c;
    public final boolean d;
    public final Function0 e;

    public jzo0(s3g1 s3g1Var, v7u0 v7u0Var, hzo0 hzo0Var, boolean z, Function0 function0) {
        this.a = s3g1Var;
        this.b = v7u0Var;
        this.c = hzo0Var;
        this.d = z;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzo0)) {
            return false;
        }
        jzo0 jzo0Var = (jzo0) obj;
        return this.a.equals(jzo0Var.a) && this.b.equals(jzo0Var.b) && this.c == jzo0Var.c && this.d == jzo0Var.d && u890.j(this.e, jzo0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Function0 function0 = this.e;
        return iG + (function0 == null ? 0 : function0.hashCode());
    }
}
