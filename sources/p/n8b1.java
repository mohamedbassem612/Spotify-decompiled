package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n8b1 implements ni20 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ n8b1(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // p.fe5
    public final fui1 a(tzg1 tzg1Var) {
        return new owf1(this.a, this.b, irn1.H(tzg1Var, this.c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n8b1) {
            n8b1 n8b1Var = (n8b1) obj;
            if (n8b1Var.a == this.a && n8b1Var.b == this.b && u890.j(n8b1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + x0d.f((obj != null ? obj.hashCode() : 0) * 31, 31, this.a);
    }

    public n8b1(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
