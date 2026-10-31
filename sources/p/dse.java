package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class dse implements hse {
    public static final cse Companion = new cse();
    public final fsh a;
    public final f461 b;

    public /* synthetic */ dse(int i, fsh fshVar, f461 f461Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, bse.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = f461Var;
    }

    @Override // p.hse
    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dse)) {
            return false;
        }
        dse dseVar = (dse) obj;
        return u890.j(this.a, dseVar.a) && u890.j(this.b, dseVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
