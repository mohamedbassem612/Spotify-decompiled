package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l921 {
    public final k921 a;
    public final String b;
    public final String c;

    public l921(k921 k921Var, String str, String str2) {
        this.a = k921Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l921)) {
            return false;
        }
        l921 l921Var = (l921) obj;
        return this.a.equals(l921Var.a) && this.b.equals(l921Var.b) && this.c.equals(l921Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
