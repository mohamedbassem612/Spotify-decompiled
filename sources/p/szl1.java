package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class szl1 implements g0m1 {
    public final String a;
    public final int b;
    public final int c;

    public szl1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szl1)) {
            return false;
        }
        szl1 szl1Var = (szl1) obj;
        return u890.j(this.a, szl1Var.a) && this.b == szl1Var.b && this.c == szl1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        int i2 = this.c;
        return iC + (i2 != 0 ? l1d.C(i2) : 0);
    }
}
