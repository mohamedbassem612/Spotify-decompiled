package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class omx0 implements qq60 {
    public final String a;
    public final op80 b;
    public final tmx0 c;

    public omx0(String str, op80 op80Var, tmx0 tmx0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = tmx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omx0)) {
            return false;
        }
        omx0 omx0Var = (omx0) obj;
        return this.a.equals(omx0Var.a) && this.b.equals(omx0Var.b) && this.c.equals(omx0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
