package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a1 implements b1 {
    public final String a;
    public final x0 b;

    public a1(String str, x0 x0Var) {
        this.a = str;
        this.b = x0Var;
    }

    @Override // p.b1
    public final x0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a.equals(a1Var.a) && this.b == a1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
