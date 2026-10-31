package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ed00 {
    public final Function0 a;

    public ed00(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed00) && this.a.equals(((ed00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
