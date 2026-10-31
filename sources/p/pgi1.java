package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgi1 implements qgi1 {
    public final String a;
    public final hux b;
    public final Function0 c;

    public pgi1(String str, hux huxVar, Function0 function0) {
        this.a = str;
        this.b = huxVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgi1)) {
            return false;
        }
        pgi1 pgi1Var = (pgi1) obj;
        return u890.j(this.a, pgi1Var.a) && u890.j(this.b, pgi1Var.b) && u890.j(this.c, pgi1Var.c);
    }

    public final int hashCode() {
        int iK = eqq.k(this.a.hashCode() * 31, 31, this.b);
        Function0 function0 = this.c;
        return iK + (function0 == null ? 0 : function0.hashCode());
    }
}
