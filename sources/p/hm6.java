package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hm6 {
    public final String a;
    public final String b;
    public final u7h c;

    public hm6(String str, String str2, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm6)) {
            return false;
        }
        hm6 hm6Var = (hm6) obj;
        return u890.j(this.a, hm6Var.a) && u890.j(this.b, hm6Var.b) && u890.j(this.c, hm6Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        u7h u7hVar = this.c;
        return iHashCode2 + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
