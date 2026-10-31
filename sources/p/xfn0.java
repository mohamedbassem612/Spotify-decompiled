package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xfn0 {
    public final Function0 a;

    public xfn0(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfn0) && u890.j(this.a, ((xfn0) obj).a);
    }

    public final int hashCode() {
        Function0 function0 = this.a;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }
}
