package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gyj {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;

    public /* synthetic */ gyj(String str, int i) {
        this(0, 0, (i & 64) != 0 ? 1 : 3, str, "", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyj)) {
            return false;
        }
        gyj gyjVar = (gyj) obj;
        return u890.j(this.a, gyjVar.a) && u890.j(this.b, gyjVar.b) && u890.j(this.c, gyjVar.c) && this.d == gyjVar.d && this.e == gyjVar.e && this.f == gyjVar.f && this.g == gyjVar.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + xcg1.g(kaa0.f(this.e, kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public gyj(int i, int i2, int i3, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = i3;
    }
}
