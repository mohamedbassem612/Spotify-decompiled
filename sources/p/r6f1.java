package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r6f1 {
    public final vu30 a;
    public final g6f1 b;
    public final vu30 c;
    public final yj41 d;
    public final h6f1 e;
    public final rx7 f;
    public final boolean g;
    public final String h;
    public final int i;

    public r6f1(j6f1 j6f1Var, g6f1 g6f1Var, i6f1 i6f1Var, yj41 yj41Var, h6f1 h6f1Var, rx7 rx7Var, boolean z, String str, int i) {
        this.a = j6f1Var;
        this.b = g6f1Var;
        this.c = i6f1Var;
        this.d = yj41Var;
        this.e = h6f1Var;
        this.f = rx7Var;
        this.g = z;
        this.h = str;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r6f1) {
            r6f1 r6f1Var = (r6f1) obj;
            if (u890.j(this.a, r6f1Var.a) && this.b == r6f1Var.b && u890.j(this.c, r6f1Var.c) && this.d.equals(r6f1Var.d) && this.e == r6f1Var.e && u890.j(this.f, r6f1Var.f) && this.g == r6f1Var.g && this.h.equals(r6f1Var.h) && this.i == r6f1Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        int iHashCode = (this.b.hashCode() + ((vu30Var == null ? 0 : vu30Var.hashCode()) * 31)) * 31;
        vu30 vu30Var2 = this.c;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (vu30Var2 == null ? 0 : vu30Var2.hashCode())) * 31)) * 31)) * 31;
        rx7 rx7Var = this.f;
        int iD = cy30.d(xcg1.g((iHashCode2 + (rx7Var == null ? 0 : rx7Var.hashCode())) * 31, 31, this.g), 31, this.h);
        int i = this.i;
        return iD + (i != 0 ? l1d.C(i) : 0);
    }
}
