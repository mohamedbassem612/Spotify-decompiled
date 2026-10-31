package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7e {
    public final u7h a;
    public final u7h b;

    public e7e(u7h u7hVar, u7h u7hVar2) {
        this.a = u7hVar;
        this.b = u7hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7e)) {
            return false;
        }
        e7e e7eVar = (e7e) obj;
        return u890.j(this.a, e7eVar.a) && u890.j(this.b, e7eVar.b);
    }

    public final int hashCode() {
        u7h u7hVar = this.a;
        int iHashCode = (u7hVar == null ? 0 : Long.hashCode(u7hVar.a)) * 31;
        u7h u7hVar2 = this.b;
        return iHashCode + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0);
    }
}
