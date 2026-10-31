package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzn0 implements hzn0 {
    public final Function0 a;

    public fzn0(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzn0) && this.a.equals(((fzn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
