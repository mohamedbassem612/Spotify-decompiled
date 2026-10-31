package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class s9c0 implements t9c0 {
    public static final r9c0 Companion = new r9c0();
    public final fsh a;
    public final jy40 b;

    public /* synthetic */ s9c0(int i, fsh fshVar, jy40 jy40Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, q9c0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = jy40Var;
    }

    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9c0)) {
            return false;
        }
        s9c0 s9c0Var = (s9c0) obj;
        return u890.j(this.a, s9c0Var.a) && u890.j(this.b, s9c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
