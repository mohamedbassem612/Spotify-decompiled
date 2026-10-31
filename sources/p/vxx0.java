package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vxx0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public vxx0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxx0)) {
            return false;
        }
        vxx0 vxx0Var = (vxx0) obj;
        return this.a.equals(vxx0Var.a) && this.b.equals(vxx0Var.b) && this.c.equals(vxx0Var.c) && this.d == vxx0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
