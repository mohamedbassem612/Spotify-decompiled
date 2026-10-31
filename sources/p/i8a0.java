package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i8a0 {
    public final heg a;
    public final heg b;
    public final heg c;

    public i8a0(heg hegVar, heg hegVar2, heg hegVar3) {
        this.a = hegVar;
        this.b = hegVar2;
        this.c = hegVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8a0)) {
            return false;
        }
        i8a0 i8a0Var = (i8a0) obj;
        return this.a.equals(i8a0Var.a) && this.b.equals(i8a0Var.b) && this.c.equals(i8a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
