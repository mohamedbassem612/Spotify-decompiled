package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zby0 implements qq60 {
    public final ncy0 a;
    public final String b;
    public final op80 c;

    public zby0(ncy0 ncy0Var, String str, op80 op80Var) {
        this.a = ncy0Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zby0)) {
            return false;
        }
        zby0 zby0Var = (zby0) obj;
        return this.a.equals(zby0Var.a) && this.b.equals(zby0Var.b) && this.c.equals(zby0Var.c);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
