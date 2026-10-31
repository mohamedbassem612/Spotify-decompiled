package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xfw implements agw {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public xfw(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    @Override // p.agw
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfw)) {
            return false;
        }
        xfw xfwVar = (xfw) obj;
        if (!u890.j(this.a, xfwVar.a) || !u890.j(this.b, xfwVar.b) || this.c != xfwVar.c) {
            return false;
        }
        String str = xfwVar.d;
        nl7 nl7Var = bp21.b;
        return this.d.equals(str);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        nl7 nl7Var = bp21.b;
        return this.d.hashCode() + iF;
    }

    @Override // p.agw
    public final String q() {
        return this.a;
    }

    @Override // p.agw
    public final String r() {
        return this.b;
    }

    @Override // p.agw
    public final String s() {
        return this.d;
    }
}
