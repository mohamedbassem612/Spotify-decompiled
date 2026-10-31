package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class erv implements irv {
    public final List a;
    public final arv b;

    public erv(List list, arv arvVar) {
        this.a = list;
        this.b = arvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erv)) {
            return false;
        }
        erv ervVar = (erv) obj;
        return u890.j(this.a, ervVar.a) && this.b.equals(ervVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
