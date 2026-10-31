package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ugo implements vgo {
    public final List a;
    public final boolean b;

    public ugo(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugo)) {
            return false;
        }
        ugo ugoVar = (ugo) obj;
        return u890.j(this.a, ugoVar.a) && this.b == ugoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
