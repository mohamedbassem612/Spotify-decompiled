package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mhf1 implements aik1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final sgf1 h;

    public mhf1(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, sgf1 sgf1Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = sgf1Var;
    }

    @Override // p.aik1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhf1)) {
            return false;
        }
        mhf1 mhf1Var = (mhf1) obj;
        return u890.j(this.a, mhf1Var.a) && u890.j(this.b, mhf1Var.b) && this.c == mhf1Var.c && this.d == mhf1Var.d && this.e == mhf1Var.e && this.f == mhf1Var.f && this.g == mhf1Var.g && u890.j(this.h, mhf1Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g);
    }
}
