package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class im2 implements mm2 {
    public final t2j1 a;
    public final s2j1 b;
    public final String c;

    public im2(t2j1 t2j1Var, s2j1 s2j1Var, String str) {
        this.a = t2j1Var;
        this.b = s2j1Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return this.a == im2Var.a && this.b == im2Var.b && u890.j(this.c, im2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
