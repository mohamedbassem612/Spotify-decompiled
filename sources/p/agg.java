package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agg {
    public final Function0 a;

    public agg(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agg) && u890.j(this.a, ((agg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
