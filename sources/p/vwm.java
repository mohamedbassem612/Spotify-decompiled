package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwm implements ywm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final u7h h;
    public final String i;
    public final boolean j;
    public final u7h k;
    public final c380 l;

    public vwm(String str, String str2, String str3, String str4, int i, String str5, boolean z, u7h u7hVar, String str6, boolean z2, u7h u7hVar2, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = z;
        this.h = u7hVar;
        this.i = str6;
        this.j = z2;
        this.k = u7hVar2;
        this.l = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwm)) {
            return false;
        }
        vwm vwmVar = (vwm) obj;
        return u890.j(this.a, vwmVar.a) && u890.j(this.b, vwmVar.b) && this.c.equals(vwmVar.c) && this.d.equals(vwmVar.d) && this.e == vwmVar.e && u890.j(this.f, vwmVar.f) && this.g == vwmVar.g && u890.j(this.h, vwmVar.h) && u890.j(this.i, vwmVar.i) && this.j == vwmVar.j && u890.j(this.k, vwmVar.k) && this.l.equals(vwmVar.l);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        String str = this.f;
        int iG = xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        u7h u7hVar = this.h;
        int iHashCode = (iG + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        String str2 = this.i;
        int iG2 = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        u7h u7hVar2 = this.k;
        return this.l.hashCode() + ((iG2 + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0)) * 31);
    }
}
