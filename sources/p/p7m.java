package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p7m {
    public final Function0 a;

    public p7m(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7m) && u890.j(this.a, ((p7m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
