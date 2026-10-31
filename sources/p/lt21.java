package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class lt21 {
    public static final kt21 Companion = new kt21();
    public final String a;
    public final String b;
    public final String c;
    public final myt0 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ lt21(int i, String str, String str2, String str3, myt0 myt0Var, String str4, boolean z, boolean z2) {
        if (127 != (i & 127)) {
            o6p1.t(i, 127, jt21.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = myt0Var;
        this.e = str4;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt21)) {
            return false;
        }
        lt21 lt21Var = (lt21) obj;
        return u890.j(this.a, lt21Var.a) && u890.j(this.b, lt21Var.b) && u890.j(this.c, lt21Var.c) && u890.j(this.d, lt21Var.d) && u890.j(this.e, lt21Var.e) && this.f == lt21Var.f && this.g == lt21Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }
}
