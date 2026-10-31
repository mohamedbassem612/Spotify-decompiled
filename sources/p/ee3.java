package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ee3 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public ee3(String str, String str2, long j, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee3)) {
            return false;
        }
        ee3 ee3Var = (ee3) obj;
        return this.a.equals(ee3Var.a) && this.b.equals(ee3Var.b) && this.c == ee3Var.c && this.d.equals(ee3Var.d) && this.e.equals(ee3Var.e) && this.f.equals(ee3Var.f) && this.g == ee3Var.g && this.h == ee3Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(cy30.d(cy30.d(cy30.d(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
