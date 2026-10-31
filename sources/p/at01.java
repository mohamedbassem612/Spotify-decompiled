package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class at01 extends ct01 {
    public final int a;
    public final m9m b;
    public final br01 c;

    public at01(int i, m9m m9mVar, br01 br01Var) {
        this.a = i;
        this.b = m9mVar;
        this.c = br01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at01)) {
            return false;
        }
        at01 at01Var = (at01) obj;
        return this.a == at01Var.a && this.b == at01Var.b && this.c == at01Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
