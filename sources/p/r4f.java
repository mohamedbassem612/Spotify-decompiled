package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4f {
    public final boolean a;
    public final ztb b;
    public final gob c;

    public r4f(boolean z, ztb ztbVar, gob gobVar) {
        this.a = z;
        this.b = ztbVar;
        this.c = gobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r4f) {
            r4f r4fVar = (r4f) obj;
            return this.a == r4fVar.a && this.b == r4fVar.b && this.c == r4fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
