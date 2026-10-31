package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class m9c0 implements t9c0 {
    public static final l9c0 Companion = new l9c0();
    public final fsh a;
    public final t26 b;

    public /* synthetic */ m9c0(int i, fsh fshVar, t26 t26Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, k9c0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = t26Var;
    }

    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9c0)) {
            return false;
        }
        m9c0 m9c0Var = (m9c0) obj;
        return u890.j(this.a, m9c0Var.a) && u890.j(this.b, m9c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
