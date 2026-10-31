package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x7f {
    public final String a;
    public final v7f b;
    public final u7f c;

    public x7f(String str, v7f v7fVar, u7f u7fVar) {
        this.a = str;
        this.b = v7fVar;
        this.c = u7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7f)) {
            return false;
        }
        x7f x7fVar = (x7f) obj;
        return this.a.equals(x7fVar.a) && u890.j(this.b, x7fVar.b) && this.c.equals(x7fVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v7f v7fVar = this.b;
        return this.c.hashCode() + ((iHashCode + (v7fVar == null ? 0 : v7fVar.hashCode())) * 31);
    }
}
