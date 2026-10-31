package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class lrc1 {
    public static final krc1 Companion = new krc1();
    public static final znb0[] g = {null, null, null, dm5.S(2, l4b1.c1), dm5.S(2, l4b1.d1), dm5.S(2, l4b1.e1)};
    public final String a;
    public final String b;
    public final boolean c;
    public final hrc1 d;
    public final vqc1 e;
    public final zpc1 f;

    public /* synthetic */ lrc1(int i, String str, String str2, boolean z, hrc1 hrc1Var, vqc1 vqc1Var, zpc1 zpc1Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, jrc1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hrc1Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vqc1Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = zpc1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrc1)) {
            return false;
        }
        lrc1 lrc1Var = (lrc1) obj;
        return u890.j(this.a, lrc1Var.a) && u890.j(this.b, lrc1Var.b) && this.c == lrc1Var.c && this.d == lrc1Var.d && this.e == lrc1Var.e && this.f == lrc1Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        hrc1 hrc1Var = this.d;
        int iHashCode = (iG + (hrc1Var == null ? 0 : hrc1Var.hashCode())) * 31;
        vqc1 vqc1Var = this.e;
        int iHashCode2 = (iHashCode + (vqc1Var == null ? 0 : vqc1Var.hashCode())) * 31;
        zpc1 zpc1Var = this.f;
        return iHashCode2 + (zpc1Var != null ? zpc1Var.hashCode() : 0);
    }

    public lrc1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
