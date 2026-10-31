package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fuc {
    public static final fuc f;
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;

    static {
        z6x z6xVar = z6x.a;
        f = new fuc(z6xVar, z6xVar, 0, 0, false);
    }

    public fuc(List list, List list2, int i, int i2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuc)) {
            return false;
        }
        fuc fucVar = (fuc) obj;
        return this.a.equals(fucVar.a) && this.b.equals(fucVar.b) && this.c == fucVar.c && this.d == fucVar.d && this.e == fucVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
