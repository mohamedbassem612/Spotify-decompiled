package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class txm implements wxm {
    public final String a;
    public final String b;
    public final c380 c;
    public final rwm d;
    public final Integer e;
    public final String f;
    public final boolean g;
    public final u7h h;

    public txm(String str, String str2, c380 c380Var, rwm rwmVar, Integer num, String str3, boolean z, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = rwmVar;
        this.e = num;
        this.f = str3;
        this.g = z;
        this.h = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txm)) {
            return false;
        }
        txm txmVar = (txm) obj;
        return u890.j(this.a, txmVar.a) && this.b.equals(txmVar.b) && this.c.equals(txmVar.c) && this.d == txmVar.d && u890.j(this.e, txmVar.e) && u890.j(this.f, txmVar.f) && this.g == txmVar.g && u890.j(this.h, txmVar.h);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        rwm rwmVar = this.d;
        int iHashCode = (iF + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int iG = xcg1.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        u7h u7hVar = this.h;
        return iG + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
