package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyb1 {
    public final Function0 a;
    public final boolean b;

    public zyb1(Function0 function0, boolean z) {
        this.a = function0;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyb1)) {
            return false;
        }
        zyb1 zyb1Var = (zyb1) obj;
        return u890.j(this.a, zyb1Var.a) && this.b == zyb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
