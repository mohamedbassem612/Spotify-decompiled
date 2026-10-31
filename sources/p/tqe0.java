package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tqe0 {
    public final l7h1 a;
    public final iu30 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;

    public tqe0(l7h1 l7h1Var, iu30 iu30Var, Function0 function0, Function0 function1, jgd0 jgd0Var, int i) {
        l7h1Var = (i & 1) != 0 ? null : l7h1Var;
        iu30Var = (i & 2) != 0 ? null : iu30Var;
        function0 = (i & 4) != 0 ? null : function0;
        function1 = (i & 8) != 0 ? null : function1;
        jgd0Var = (i & 16) != 0 ? null : jgd0Var;
        this.a = l7h1Var;
        this.b = iu30Var;
        this.c = function0;
        this.d = function1;
        this.e = jgd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqe0)) {
            return false;
        }
        tqe0 tqe0Var = (tqe0) obj;
        return u890.j(this.a, tqe0Var.a) && u890.j(this.b, tqe0Var.b) && u890.j(this.c, tqe0Var.c) && u890.j(this.d, tqe0Var.d) && u890.j(this.e, tqe0Var.e);
    }

    public final int hashCode() {
        l7h1 l7h1Var = this.a;
        int iHashCode = (l7h1Var == null ? 0 : l7h1Var.e.a.hashCode()) * 31;
        iu30 iu30Var = this.b;
        int iHashCode2 = (iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31;
        Function0 function0 = this.c;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.d;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0 function2 = this.e;
        return iHashCode4 + (function2 != null ? function2.hashCode() : 0);
    }
}
