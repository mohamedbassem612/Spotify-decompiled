package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wef1 implements qq60 {
    public final oef1 a;
    public final String b;
    public final op80 c;

    public wef1(oef1 oef1Var, String str, op80 op80Var) {
        this.a = oef1Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wef1)) {
            return false;
        }
        wef1 wef1Var = (wef1) obj;
        return this.a.equals(wef1Var.a) && this.b.equals(wef1Var.b) && this.c.equals(wef1Var.c);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
