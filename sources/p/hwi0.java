package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hwi0 {
    public final Function0 a;

    public hwi0(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwi0) && u890.j(this.a, ((hwi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(2131961436) * 31);
    }
}
