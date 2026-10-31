package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uuu implements wuu {
    public final Set a;
    public final boolean b;

    public uuu(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuu)) {
            return false;
        }
        uuu uuuVar = (uuu) obj;
        return u890.j(this.a, uuuVar.a) && this.b == uuuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
