package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ulh {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final int e;
    public final Throwable f;
    public final int g;

    public ulh(String str, String str2, c380 c380Var, String str3, int i, Throwable th, int i2) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = i;
        this.f = th;
        this.g = i2;
    }

    public static ulh a(ulh ulhVar, c380 c380Var, String str, int i, Exception exc, int i2, int i3) {
        String str2 = ulhVar.a;
        String str3 = ulhVar.b;
        if ((i3 & 4) != 0) {
            c380Var = ulhVar.c;
        }
        c380 c380Var2 = c380Var;
        if ((i3 & 8) != 0) {
            str = ulhVar.d;
        }
        String str4 = str;
        if ((i3 & 16) != 0) {
            i = ulhVar.e;
        }
        int i4 = i;
        Throwable th = exc;
        if ((i3 & 32) != 0) {
            th = ulhVar.f;
        }
        Throwable th2 = th;
        if ((i3 & 64) != 0) {
            i2 = ulhVar.g;
        }
        return new ulh(str2, str3, c380Var2, str4, i4, th2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulh)) {
            return false;
        }
        ulh ulhVar = (ulh) obj;
        return u890.j(this.a, ulhVar.a) && this.b.equals(ulhVar.b) && u890.j(this.c, ulhVar.c) && u890.j(this.d, ulhVar.d) && this.e == ulhVar.e && u890.j(this.f, ulhVar.f) && this.g == ulhVar.g;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iK = ab80.k(this.e, (iF + (str == null ? 0 : str.hashCode())) * 31, 31);
        Throwable th = this.f;
        return Integer.hashCode(this.g) + ((iK + (th != null ? th.hashCode() : 0)) * 31);
    }
}
