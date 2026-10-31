package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zuk {
    public final Function0 a;
    public final Function0 b;

    public zuk(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuk)) {
            return false;
        }
        zuk zukVar = (zuk) obj;
        return u890.j(this.a, zukVar.a) && u890.j(this.b, zukVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
