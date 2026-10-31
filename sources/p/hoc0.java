package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hoc0 implements f1r {
    public final List a;
    public final boolean b;
    public final int c;

    public hoc0(List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = list.hashCode();
    }

    @Override // p.f1r
    public final k1r a(Map map) {
        return acq0.H(this.a, map, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1r) || this.c != obj.hashCode()) {
            return false;
        }
        return u890.j(this.a, ((f1r) obj).getItems());
    }

    @Override // p.f1r
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        return this.c;
    }
}
