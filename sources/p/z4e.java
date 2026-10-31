package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z4e {
    public final List a;
    public final int b;
    public final int c;

    public z4e(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4e)) {
            return false;
        }
        z4e z4eVar = (z4e) obj;
        return this.a.equals(z4eVar.a) && this.b == z4eVar.b && this.c == z4eVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
