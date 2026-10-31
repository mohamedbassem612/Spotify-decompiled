package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b8e1 {
    public final mee1 a;
    public final int b;

    public b8e1(mee1 mee1Var, int i) {
        this.a = mee1Var;
        this.b = i;
    }

    public final mee1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8e1)) {
            return false;
        }
        b8e1 b8e1Var = (b8e1) obj;
        return this.b == b8e1Var.b && this.a.equals(b8e1Var.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
