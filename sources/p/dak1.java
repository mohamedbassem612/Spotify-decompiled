package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dak1 {
    public final Function0 a;

    public dak1(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dak1) && u890.j(this.a, ((dak1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
