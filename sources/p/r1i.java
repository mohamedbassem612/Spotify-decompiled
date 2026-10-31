package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r1i {
    public final qzh a;
    public final int b;
    public final Object c;
    public final Object d;

    public r1i(qzh qzhVar, int i, Object obj, Object obj2) {
        this.a = qzhVar;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1i)) {
            return false;
        }
        r1i r1iVar = (r1i) obj;
        return this.a.equals(r1iVar.a) && this.b == r1iVar.b && this.c.equals(r1iVar.c) && this.d.equals(r1iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
