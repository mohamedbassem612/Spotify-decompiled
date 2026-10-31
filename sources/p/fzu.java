package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fzu {
    public final Function0 a;
    public final long b;

    public fzu(Function0 function0, long j, int i) {
        function0 = (i & 1) != 0 ? null : function0;
        j = (i & 2) != 0 ? mzu.a : j;
        this.a = function0;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzu)) {
            return false;
        }
        fzu fzuVar = (fzu) obj;
        return u890.j(this.a, fzuVar.a) && jfv.f(this.b, fzuVar.b);
    }

    public final int hashCode() {
        Function0 function0 = this.a;
        int iHashCode = function0 == null ? 0 : function0.hashCode();
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + (iHashCode * 31);
    }
}
