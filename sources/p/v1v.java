package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v1v {
    public final boolean a;
    public final boolean b;
    public final List c;

    public v1v(List list, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1v)) {
            return false;
        }
        v1v v1vVar = (v1v) obj;
        return this.a == v1vVar.a && this.b == v1vVar.b && this.c.equals(v1vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
