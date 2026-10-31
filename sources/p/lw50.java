package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lw50 implements nw50 {
    public final Function0 a;

    public lw50(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw50) && u890.j(this.a, ((lw50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
