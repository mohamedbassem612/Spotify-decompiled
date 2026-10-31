package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t6p0 implements v6p0 {
    public final Function0 a;
    public final Integer b;

    public t6p0(mzf0 mzf0Var, Integer num) {
        this.a = mzf0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6p0)) {
            return false;
        }
        t6p0 t6p0Var = (t6p0) obj;
        return u890.j(this.a, t6p0Var.a) && u890.j(this.b, t6p0Var.b);
    }

    public final int hashCode() {
        Function0 function0 = this.a;
        int iHashCode = (function0 == null ? 0 : function0.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
