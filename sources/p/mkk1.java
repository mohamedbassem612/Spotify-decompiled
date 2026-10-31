package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mkk1 {
    public final int a;
    public final int b;
    public final String c;

    public mkk1(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkk1)) {
            return false;
        }
        mkk1 mkk1Var = (mkk1) obj;
        return this.a == mkk1Var.a && this.b == mkk1Var.b && this.c.equals(mkk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
