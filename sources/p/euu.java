package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class euu {
    public final h2v a;
    public final String b;
    public final String c;
    public final fuu d;
    public final boolean e;
    public final fuu f;
    public final fuu g;

    public euu(h2v h2vVar, String str, String str2, fuu fuuVar, boolean z, fuu fuuVar2, fuu fuuVar3) {
        this.a = h2vVar;
        this.b = str;
        this.c = str2;
        this.d = fuuVar;
        this.e = z;
        this.f = fuuVar2;
        this.g = fuuVar3;
    }

    public final fuu a() {
        return this.d;
    }

    public final fuu b() {
        return this.g;
    }

    public final String c() {
        return this.b;
    }

    public final fuu d() {
        return this.f;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euu)) {
            return false;
        }
        euu euuVar = (euu) obj;
        return this.a.equals(euuVar.a) && u890.j(this.b, euuVar.b) && u890.j(this.c, euuVar.c) && this.d.equals(euuVar.d) && this.e == euuVar.e && this.f.equals(euuVar.f) && this.g.equals(euuVar.g);
    }

    public final h2v f() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + xcg1.g((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e)) * 31);
    }
}
