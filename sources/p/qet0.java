package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qet0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final pet0 d;
    public final int e;

    public qet0(String str, boolean z, boolean z2, pet0 pet0Var, int i) {
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 4) != 0 ? false : z2;
        pet0Var = (i & 8) != 0 ? new net0(0, z2) : pet0Var;
        int i2 = (i & 16) == 0 ? 0 : 1;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = pet0Var;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qet0)) {
            return false;
        }
        qet0 qet0Var = (qet0) obj;
        return this.a.equals(qet0Var.a) && this.b == qet0Var.b && this.c == qet0Var.c && this.d.equals(qet0Var.d) && this.e == qet0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        int i = this.e;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
