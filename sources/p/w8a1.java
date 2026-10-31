package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w8a1 {
    public final String a;
    public final String b;
    public final u7h c;

    public w8a1(String str, String str2, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8a1)) {
            return false;
        }
        w8a1 w8a1Var = (w8a1) obj;
        return u890.j(this.a, w8a1Var.a) && u890.j(this.b, w8a1Var.b) && u890.j(this.c, w8a1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        u7h u7hVar = this.c;
        return iD + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a));
    }
}
