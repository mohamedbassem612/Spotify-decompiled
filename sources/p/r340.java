package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r340 {
    public final zy9 a;
    public final m360 b;
    public final zam c;

    public r340(zy9 zy9Var, m360 m360Var, zam zamVar) {
        this.a = zy9Var;
        this.b = m360Var;
        this.c = zamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r340)) {
            return false;
        }
        r340 r340Var = (r340) obj;
        return this.a.equals(r340Var.a) && this.b.equals(r340Var.b) && this.c.equals(r340Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
