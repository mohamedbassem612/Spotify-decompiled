package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j2m1 extends sgc1 {
    public final String b;
    public final String c;

    public j2m1(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2m1)) {
            return false;
        }
        j2m1 j2m1Var = (j2m1) obj;
        return u890.j(this.b, j2m1Var.b) && u890.j(this.c, j2m1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
