package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zya {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;

    public zya(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = str4;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zya)) {
            return false;
        }
        zya zyaVar = (zya) obj;
        return this.a.equals(zyaVar.a) && u890.j(this.b, zyaVar.b) && this.c == zyaVar.c && this.d.equals(zyaVar.d) && this.e == zyaVar.e && u890.j(this.f, zyaVar.f);
    }

    public final int f() {
        return this.c;
    }

    public final boolean g(zya zyaVar, int i) {
        return this.a.equals(zyaVar.a) && u890.j(this.b, zyaVar.b) && Math.abs(this.c - zyaVar.c) < i && this.d.equals(zyaVar.d) && this.e == zyaVar.e && u890.j(this.f, zyaVar.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
        String str = this.f;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
