package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ubm {
    public final String a;
    public final String b;
    public final int c;
    public final yrc0 d;
    public final kf81 e;
    public final xd41 f;

    public ubm(String str, String str2, int i, yrc0 yrc0Var, kf81 kf81Var, xd41 xd41Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = yrc0Var;
        this.e = kf81Var;
        this.f = xd41Var;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final yrc0 c() {
        return this.d;
    }

    public final xd41 d() {
        return this.f;
    }

    public final kf81 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubm)) {
            return false;
        }
        ubm ubmVar = (ubm) obj;
        return u890.j(this.a, ubmVar.a) && this.b.equals(ubmVar.b) && this.c == ubmVar.c && u890.j(this.d, ubmVar.d) && this.e.equals(ubmVar.e) && this.f.equals(ubmVar.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        yrc0 yrc0Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iK + (yrc0Var == null ? 0 : yrc0Var.hashCode())) * 31)) * 31);
    }
}
