package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bt01 extends ct01 {
    public final int a;
    public final m9m b;
    public final br01 c;

    public bt01(int i, m9m m9mVar, br01 br01Var) {
        this.a = i;
        this.b = m9mVar;
        this.c = br01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt01)) {
            return false;
        }
        bt01 bt01Var = (bt01) obj;
        return this.a == bt01Var.a && this.b == bt01Var.b && this.c == bt01Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
