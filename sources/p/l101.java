package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l101 implements m101 {
    public final k101 a;
    public final String b;
    public final Throwable c;

    public l101(k101 k101Var, String str, Throwable th) {
        this.a = k101Var;
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l101)) {
            return false;
        }
        l101 l101Var = (l101) obj;
        return this.a.equals(l101Var.a) && this.b.equals(l101Var.b) && this.c.equals(l101Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
