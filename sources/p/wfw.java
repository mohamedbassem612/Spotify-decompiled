package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wfw implements agw {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final cqs0 e;
    public final String f;

    public wfw(String str, String str2, String str3, int i, cqs0 cqs0Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = cqs0Var;
        this.f = str4;
    }

    @Override // p.agw
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfw)) {
            return false;
        }
        wfw wfwVar = (wfw) obj;
        if (!u890.j(this.a, wfwVar.a) || !u890.j(this.b, wfwVar.b) || !u890.j(this.c, wfwVar.c) || this.d != wfwVar.d || !u890.j(this.e, wfwVar.e)) {
            return false;
        }
        String str = wfwVar.f;
        nl7 nl7Var = bp21.b;
        return this.f.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31;
        nl7 nl7Var = bp21.b;
        return this.f.hashCode() + iHashCode;
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
        return this.f;
    }
}
