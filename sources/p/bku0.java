package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bku0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public bku0(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bku0)) {
            return false;
        }
        bku0 bku0Var = (bku0) obj;
        return u890.j(this.a, bku0Var.a) && u890.j(this.b, bku0Var.b) && u890.j(this.c, bku0Var.c) && this.d == bku0Var.d && this.e == bku0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.e) + ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
