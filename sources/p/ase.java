package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ase implements hse {
    public static final zre Companion = new zre();
    public final fsh a;
    public final n8t b;

    public /* synthetic */ ase(int i, fsh fshVar, n8t n8tVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, yre.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = n8tVar;
    }

    @Override // p.hse
    public final fsh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ase)) {
            return false;
        }
        ase aseVar = (ase) obj;
        return u890.j(this.a, aseVar.a) && u890.j(this.b, aseVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
