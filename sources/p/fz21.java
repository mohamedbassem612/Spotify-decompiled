package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fz21 {
    public final String a;
    public final String b;
    public final int c;

    public fz21(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz21)) {
            return false;
        }
        fz21 fz21Var = (fz21) obj;
        return this.a.equals(fz21Var.a) && this.b.equals(fz21Var.b) && this.c == fz21Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
