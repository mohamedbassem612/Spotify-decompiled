package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e6h extends x3p1 {
    public final List c;
    public final int d;
    public final int e;

    public e6h(int i, int i2, List list) {
        this.c = list;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6h)) {
            return false;
        }
        e6h e6hVar = (e6h) obj;
        return u890.j(this.c, e6hVar.c) && this.d == e6hVar.d && this.e == e6hVar.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + kaa0.f(this.d, this.c.hashCode() * 31, 31);
    }
}
