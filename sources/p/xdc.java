package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xdc {
    public final int a;
    public final Function0 b;

    public xdc(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdc)) {
            return false;
        }
        xdc xdcVar = (xdc) obj;
        return this.a == xdcVar.a && u890.j(this.b, xdcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
