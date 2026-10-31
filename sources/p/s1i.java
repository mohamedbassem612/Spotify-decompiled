package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s1i {
    public final qzh a;
    public final int b;
    public final Object c;

    public s1i(qzh qzhVar, int i, Object obj) {
        this.a = qzhVar;
        this.b = i;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1i)) {
            return false;
        }
        s1i s1iVar = (s1i) obj;
        return this.a.equals(s1iVar.a) && this.b == s1iVar.b && this.c.equals(s1iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
