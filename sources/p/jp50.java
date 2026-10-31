package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jp50 {
    public final boolean a;
    public final Function0 b;

    public jp50(Function0 function0, boolean z) {
        this.a = z;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp50)) {
            return false;
        }
        jp50 jp50Var = (jp50) obj;
        return this.a == jp50Var.a && u890.j(this.b, jp50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
