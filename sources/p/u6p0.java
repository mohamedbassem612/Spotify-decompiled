package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6p0 implements v6p0 {
    public final Function0 a;

    public u6p0(mzf0 mzf0Var) {
        this.a = mzf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6p0) && u890.j(this.a, ((u6p0) obj).a);
    }

    public final int hashCode() {
        Function0 function0 = this.a;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }
}
