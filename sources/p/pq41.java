package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pq41 {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public pq41(Function0 function0, Function0 function1, boolean z) {
        this.a = function0;
        this.b = function1;
        this.c = z;
    }

    public final String toString() {
        Object objInvoke = this.a.invoke();
        Object objInvoke2 = this.b.invoke();
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(objInvoke);
        sb.append(", maxValue=");
        sb.append(objInvoke2);
        sb.append(", reverseScrolling=");
        return l1d.r(sb, this.c, ")");
    }
}
