package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tpm1 {
    public final String a;
    public final boolean b;
    public final int c;

    public tpm1(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpm1)) {
            return false;
        }
        tpm1 tpm1Var = (tpm1) obj;
        return this.a.equals(tpm1Var.a) && this.b == tpm1Var.b && this.c == tpm1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
