package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p2m1 extends sgc1 {
    public final String b;
    public final String c;

    public p2m1(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2m1)) {
            return false;
        }
        p2m1 p2m1Var = (p2m1) obj;
        return u890.j(this.b, p2m1Var.b) && u890.j(this.c, p2m1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
