package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l4d {
    public final Function0 a;

    public l4d(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4d) && this.a.equals(((l4d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
