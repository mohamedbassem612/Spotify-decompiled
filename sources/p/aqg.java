package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aqg {
    public final List a;
    public final Set b;

    public aqg(List list, Set set) {
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqg)) {
            return false;
        }
        aqg aqgVar = (aqg) obj;
        return u890.j(this.a, aqgVar.a) && u890.j(this.b, aqgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
