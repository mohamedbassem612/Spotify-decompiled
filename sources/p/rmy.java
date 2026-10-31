package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rmy {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final kk3 e;

    public rmy(String str, String str2, String str3, int i, kk3 kk3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = kk3Var;
    }

    public static rmy a(rmy rmyVar, kk3 kk3Var) {
        return new rmy(rmyVar.a, rmyVar.b, rmyVar.c, rmyVar.d, kk3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmy)) {
            return false;
        }
        rmy rmyVar = (rmy) obj;
        return u890.j(this.a, rmyVar.a) && u890.j(this.b, rmyVar.b) && u890.j(this.c, rmyVar.c) && this.d == rmyVar.d && u890.j(this.e, rmyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public /* synthetic */ rmy(String str, String str2, int i, String str3) {
        this(str, str2, str3, i, gk3.a);
    }
}
