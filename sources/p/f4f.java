package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f4f {
    public final Function0 a;

    public f4f(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4f) && u890.j(this.a, ((f4f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
