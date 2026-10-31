package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mpy {
    public final lpy a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public mpy(lpy lpyVar, boolean z, boolean z2, String str, boolean z3, boolean z4, int i) {
        this.a = lpyVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = z4;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpy)) {
            return false;
        }
        mpy mpyVar = (mpy) obj;
        return this.a.equals(mpyVar.a) && this.b == mpyVar.b && this.c == mpyVar.c && u890.j(this.d, mpyVar.d) && this.e == mpyVar.e && this.f == mpyVar.f && this.g == mpyVar.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return l1d.C(this.g) + xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
