package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dib1 {
    public final String a;
    public final String b;
    public final int c;

    public dib1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dib1)) {
            return false;
        }
        dib1 dib1Var = (dib1) obj;
        return this.a.equals(dib1Var.a) && this.b.equals(dib1Var.b) && this.c == dib1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
