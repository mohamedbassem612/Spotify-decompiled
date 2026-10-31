package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class n0b0 {
    public static final m0b0 Companion = new m0b0();
    public final String a;
    public final String b;
    public final k0b0 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Long g;
    public final Long h;

    public /* synthetic */ n0b0(int i, String str, String str2, k0b0 k0b0Var, String str3, String str4, boolean z, Long l, Long l2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, l0b0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k0b0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0b0)) {
            return false;
        }
        n0b0 n0b0Var = (n0b0) obj;
        return u890.j(this.a, n0b0Var.a) && u890.j(this.b, n0b0Var.b) && u890.j(this.c, n0b0Var.c) && u890.j(this.d, n0b0Var.d) && u890.j(this.e, n0b0Var.e) && this.f == n0b0Var.f && u890.j(this.g, n0b0Var.g) && u890.j(this.h, n0b0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        k0b0 k0b0Var = this.c;
        int iHashCode = (iD + (k0b0Var == null ? 0 : k0b0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG = xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Long l = this.g;
        int iHashCode3 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public n0b0(String str, String str2, k0b0 k0b0Var, String str3, String str4, boolean z, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = k0b0Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = l;
        this.h = l2;
    }
}
