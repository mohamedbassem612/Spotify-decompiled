package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b1v {
    public final List a;
    public final boolean b;

    public b1v(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1v)) {
            return false;
        }
        b1v b1vVar = (b1v) obj;
        return this.a.equals(b1vVar.a) && this.b == b1vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
