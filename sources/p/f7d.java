package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f7d {
    public final af5 a;
    public final u7h b;
    public final u7h c;

    public f7d(af5 af5Var, u7h u7hVar, u7h u7hVar2) {
        this.a = af5Var;
        this.b = u7hVar;
        this.c = u7hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7d)) {
            return false;
        }
        f7d f7dVar = (f7d) obj;
        return u890.j(this.a, f7dVar.a) && u890.j(this.b, f7dVar.b) && u890.j(this.c, f7dVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u7h u7hVar = this.b;
        int iHashCode2 = (iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.c;
        return iHashCode2 + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0);
    }
}
