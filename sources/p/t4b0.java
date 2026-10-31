package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t4b0 {
    public final String a;
    public final u7h b;
    public final u7h c;
    public final String d;

    public t4b0(String str, u7h u7hVar, u7h u7hVar2, String str2) {
        this.a = str;
        this.b = u7hVar;
        this.c = u7hVar2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4b0)) {
            return false;
        }
        t4b0 t4b0Var = (t4b0) obj;
        return u890.j(this.a, t4b0Var.a) && u890.j(this.b, t4b0Var.b) && u890.j(this.c, t4b0Var.c) && this.d.equals(t4b0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u7h u7hVar = this.b;
        int iHashCode2 = (iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0)) * 31);
    }
}
