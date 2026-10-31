package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kak1 {
    public final Function0 a;

    public kak1(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kak1) && u890.j(this.a, ((kak1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
