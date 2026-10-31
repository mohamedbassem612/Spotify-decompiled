package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ihz implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final jhz d;

    public ihz(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, jhz jhzVar) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = jhzVar;
    }

    public final jhz a() {
        return this.d;
    }

    public final n900 b() {
        return this.c;
    }

    public final i3i0 c() {
        return this.a;
    }

    public final xcu0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihz)) {
            return false;
        }
        ihz ihzVar = (ihz) obj;
        return this.a.equals(ihzVar.a) && this.b.equals(ihzVar.b) && this.c.equals(ihzVar.c) && this.d.equals(ihzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
