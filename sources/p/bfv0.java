package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bfv0 {
    public final String a;
    public final int b;
    public final String c;

    public bfv0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfv0)) {
            return false;
        }
        bfv0 bfv0Var = (bfv0) obj;
        return this.a.equals(bfv0Var.a) && this.b == bfv0Var.b && this.c.equals(bfv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
