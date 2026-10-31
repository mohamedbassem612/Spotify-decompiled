package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class p9c0 implements t9c0 {
    public static final o9c0 Companion = new o9c0();
    public final fsh a;
    public final csg b;

    public /* synthetic */ p9c0(int i, fsh fshVar, csg csgVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, n9c0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = csgVar;
    }

    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9c0)) {
            return false;
        }
        p9c0 p9c0Var = (p9c0) obj;
        return u890.j(this.a, p9c0Var.a) && u890.j(this.b, p9c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
