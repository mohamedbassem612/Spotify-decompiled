package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class f291 {
    public static final e291 Companion = new e291();
    public static final znb0[] l = {null, null, dm5.S(2, gr81.f), null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final ci8 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ f291(int i, String str, String str2, ci8 ci8Var, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (23 != (i & 23)) {
            o6p1.t(i, 23, d291.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = ci8Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = z;
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z3;
        }
        if ((i & 128) == 0) {
            this.h = true;
        } else {
            this.h = z4;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z5;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z6;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z7;
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f291)) {
            return false;
        }
        f291 f291Var = (f291) obj;
        return u890.j(this.a, f291Var.a) && u890.j(this.b, f291Var.b) && this.c == f291Var.c && u890.j(this.d, f291Var.d) && this.e == f291Var.e && this.f == f291Var.f && this.g == f291Var.g && this.h == f291Var.h && this.i == f291Var.i && this.j == f291Var.j && this.k == f291Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.k) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
