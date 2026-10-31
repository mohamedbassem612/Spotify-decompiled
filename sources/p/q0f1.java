package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class q0f1 {
    public static final l0f1 Companion = new l0f1();
    public static final znb0[] h = {null, null, null, null, dm5.S(2, w0n0.Y0), null, null};
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;
    public final int f;
    public final String g;

    public /* synthetic */ q0f1(int i, int i2, int i3, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = z6x.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0f1)) {
            return false;
        }
        q0f1 q0f1Var = (q0f1) obj;
        return u890.j(this.a, q0f1Var.a) && u890.j(this.b, q0f1Var.b) && this.c == q0f1Var.c && u890.j(this.d, q0f1Var.d) && u890.j(this.e, q0f1Var.e) && this.f == q0f1Var.f && u890.j(this.g, q0f1Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iF = kaa0.f(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        int iF2 = kaa0.f(this.f, f4i1.b((iF + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31);
        String str4 = this.g;
        return iF2 + (str4 != null ? str4.hashCode() : 0);
    }
}
