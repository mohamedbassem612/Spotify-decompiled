package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x4a {
    public final int a;
    public final Function0 b;

    public x4a(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4a)) {
            return false;
        }
        x4a x4aVar = (x4a) obj;
        return this.a == x4aVar.a && u890.j(this.b, x4aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
