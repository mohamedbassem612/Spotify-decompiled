package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ufq0 {
    public final int a;
    public final Function0 b;

    public ufq0(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufq0)) {
            return false;
        }
        ufq0 ufq0Var = (ufq0) obj;
        return this.a == ufq0Var.a && u890.j(this.b, ufq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
