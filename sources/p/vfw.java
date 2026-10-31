package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vfw implements niw {
    public final String a;
    public final String b;
    public final i3g1 c;
    public final String d;
    public final String e;
    public final String f;
    public final cqs0 g;
    public final String h;
    public final String i;

    public vfw(String str, String str2, i3g1 i3g1Var, String str3, String str4, String str5, cqs0 cqs0Var, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = i3g1Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = cqs0Var;
        this.h = str6;
        this.i = str7;
    }

    public final String b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfw)) {
            return false;
        }
        vfw vfwVar = (vfw) obj;
        if (!u890.j(this.a, vfwVar.a) || !u890.j(this.b, vfwVar.b) || !u890.j(this.c, vfwVar.c) || !this.d.equals(vfwVar.d) || !u890.j(this.e, vfwVar.e) || !this.f.equals(vfwVar.f) || !this.g.equals(vfwVar.g) || !u890.j(this.h, vfwVar.h)) {
            return false;
        }
        String str = vfwVar.i;
        nl7 nl7Var = bp21.b;
        return this.i.equals(str);
    }

    public final int hashCode() {
        int iD = cy30.d((this.g.hashCode() + cy30.d(cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        nl7 nl7Var = bp21.b;
        return this.i.hashCode() + iD;
    }
}
