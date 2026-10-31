package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ziv0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public ziv0(String str, int i, int i2, int i3, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziv0)) {
            return false;
        }
        ziv0 ziv0Var = (ziv0) obj;
        return this.a == ziv0Var.a && this.b.equals(ziv0Var.b) && u890.j(this.c, ziv0Var.c) && this.d == ziv0Var.d && this.e == ziv0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.e) + ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
