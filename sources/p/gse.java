package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class gse implements hse {
    public static final fse Companion = new fse();
    public final fsh a;
    public final vjh1 b;

    public /* synthetic */ gse(int i, fsh fshVar, vjh1 vjh1Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ese.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = vjh1Var;
    }

    @Override // p.hse
    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gse)) {
            return false;
        }
        gse gseVar = (gse) obj;
        return u890.j(this.a, gseVar.a) && u890.j(this.b, gseVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
