package p;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/pkc1;", "Lp/uim0;", "Lp/qkc1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class pkc1 extends uim0 {
    public final Function0 a;

    public pkc1(Function0 function0) {
        this.a = function0;
    }

    public final pim0 a() {
        return new qkc1(this.a);
    }

    public final void b(pim0 pim0Var) {
        ((qkc1) pim0Var).Q0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkc1) {
            return this.a == ((pkc1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
