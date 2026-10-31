package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bmu0 {
    public final String a;
    public final String b;
    public final int c;

    public bmu0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmu0)) {
            return false;
        }
        bmu0 bmu0Var = (bmu0) obj;
        return this.a.equals(bmu0Var.a) && this.b.equals(bmu0Var.b) && this.c == bmu0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
