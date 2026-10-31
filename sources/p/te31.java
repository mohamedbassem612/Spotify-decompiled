package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class te31 implements qq60 {
    public final cf31 a;
    public final String b;

    public te31(cf31 cf31Var, String str) {
        this.a = cf31Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te31)) {
            return false;
        }
        te31 te31Var = (te31) obj;
        return this.a.equals(te31Var.a) && this.b.equals(te31Var.b);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
