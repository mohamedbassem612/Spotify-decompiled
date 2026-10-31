package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u9z {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final pk1 g;
    public final bjw0 h;
    public final k4m i;

    public u9z(String str, String str2, String str3, String str4, String str5, boolean z, pk1 pk1Var, bjw0 bjw0Var, k4m k4mVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = pk1Var;
        this.h = bjw0Var;
        this.i = k4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9z)) {
            return false;
        }
        u9z u9zVar = (u9z) obj;
        return u890.j(this.a, u9zVar.a) && this.b.equals(u9zVar.b) && u890.j(this.c, u9zVar.c) && u890.j(this.d, u9zVar.d) && u890.j(this.e, u9zVar.e) && this.f == u9zVar.f && this.g.equals(u9zVar.g) && this.h.equals(u9zVar.h) && this.i == u9zVar.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f)) * 31)) * 31);
    }
}
