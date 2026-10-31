package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aff0 {
    public final a9h a;
    public final String b;
    public final String c;
    public final bff0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final zef0 i;
    public final boolean j;
    public final int k;

    static {
        a860.e("FF353535");
        a860.e("FF565656");
        a860.e("FFFFFFFF");
        a860.e("FFCDCDCD");
        a860.e("FF1ED760");
        a860.e("FF353535");
        a860.e("FF565656");
        a860.e("FFFFFFFF");
        a860.e("FFCDCDCD");
        a860.e("FF1ED760");
    }

    public aff0(a9h a9hVar, String str, String str2, bff0 bff0Var, boolean z, boolean z2, boolean z3, boolean z4, zef0 zef0Var, boolean z5, int i) {
        this.a = a9hVar;
        this.b = str;
        this.c = str2;
        this.d = bff0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = zef0Var;
        this.j = z5;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aff0)) {
            return false;
        }
        aff0 aff0Var = (aff0) obj;
        return this.a.equals(aff0Var.a) && this.b.equals(aff0Var.b) && this.c.equals(aff0Var.c) && u890.j(this.d, aff0Var.d) && this.e == aff0Var.e && this.f == aff0Var.f && this.g == aff0Var.g && this.h == aff0Var.h && this.i.equals(aff0Var.i) && this.j == aff0Var.j && this.k == aff0Var.k;
    }

    public final int hashCode() {
        return l1d.C(this.k) + xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + ((dhf0.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }
}
