package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uey0 {
    public final t6f a;
    public final n5f b;

    public uey0(t6f t6fVar, n5f n5fVar) {
        this.a = t6fVar;
        this.b = n5fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uey0)) {
            return false;
        }
        uey0 uey0Var = (uey0) obj;
        return this.a.equals(uey0Var.a) && u890.j(this.b, uey0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        n5f n5fVar = this.b;
        return iHashCode + (n5fVar == null ? 0 : n5fVar.hashCode());
    }
}
