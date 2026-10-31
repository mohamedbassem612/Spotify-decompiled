package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l8k implements z8k {
    public final u7h a;
    public final u7h b;

    public l8k(u7h u7hVar, u7h u7hVar2) {
        this.a = u7hVar;
        this.b = u7hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8k)) {
            return false;
        }
        l8k l8kVar = (l8k) obj;
        return u890.j(this.a, l8kVar.a) && u890.j(this.b, l8kVar.b);
    }

    public final int hashCode() {
        u7h u7hVar = this.a;
        int iHashCode = (u7hVar == null ? 0 : Long.hashCode(u7hVar.a)) * 31;
        u7h u7hVar2 = this.b;
        return iHashCode + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0);
    }
}
