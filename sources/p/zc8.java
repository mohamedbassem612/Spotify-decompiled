package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zc8 implements ez00 {
    public final String a;
    public final String b;
    public final p6o c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public zc8(String str, String str2, p6o p6oVar, String str3, long j, long j2, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = p6oVar;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str3.equals("Unabridged") ? 1 : str3.equals("Abridged") ? 2 : 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return this.a.equals(zc8Var.a) && this.b.equals(zc8Var.b) && this.c.equals(zc8Var.c) && this.d.equals(zc8Var.d) && this.e == zc8Var.e && this.f == zc8Var.f && this.g.equals(zc8Var.g) && this.h.equals(zc8Var.h) && this.i.equals(zc8Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.f(cy30.f(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), this.e, 31), this.f, 31), 31, this.g), 31, this.h);
    }
}
