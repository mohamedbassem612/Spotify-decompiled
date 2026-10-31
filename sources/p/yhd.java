package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yhd {
    public final List a;
    public final List b;

    public yhd(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhd)) {
            return false;
        }
        yhd yhdVar = (yhd) obj;
        return this.a.equals(yhdVar.a) && this.b.equals(yhdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
