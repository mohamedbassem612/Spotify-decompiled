package p;

import app.p000rive.semantics.SemanticState;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4v0 {
    public final long a;
    public final long b;
    public final boolean c;
    public final Date d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final iix0 j;
    public final int k;
    public final String l;
    public final int m;

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    public m4v0(long j, long j2, boolean z, Date date, boolean z2, boolean z3, boolean z4, boolean z5, String str, iix0 iix0Var, int i, String str2, int i2) {
        int i3 = 0;
        boolean z6 = (i2 & 16) != 0 ? false : z2;
        boolean z7 = (i2 & SemanticState.Focused) != 0 ? false : z5;
        String str3 = (i2 & SemanticState.Hidden) != 0 ? null : str;
        iix0 iix0Var2 = (i2 & 512) != 0 ? null : iix0Var;
        String str4 = (i2 & SemanticState.Modal) != 0 ? null : str2;
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = date;
        this.e = z6;
        this.f = z3;
        this.g = z4;
        this.h = z7;
        this.i = str3;
        this.j = iix0Var2;
        this.k = i;
        this.l = str4;
        if (iix0Var2 != null) {
            if (iix0Var2.g()) {
                i3 = 2;
            } else if (iix0Var2 instanceof gix0) {
                i3 = 1;
            } else if (!(iix0Var2 instanceof hix0)) {
                eg.o();
                throw null;
            }
        } else if (z || j2 == 0) {
            i3 = 2;
        } else {
            long j3 = j - j2;
            if (j2 >= 0 && (z6 || j3 > 0)) {
                i3 = 1;
            }
        }
        this.m = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4v0)) {
            return false;
        }
        m4v0 m4v0Var = (m4v0) obj;
        return this.a == m4v0Var.a && this.b == m4v0Var.b && this.c == m4v0Var.c && this.d.equals(m4v0Var.d) && this.e == m4v0Var.e && this.f == m4v0Var.f && this.g == m4v0Var.g && this.h == m4v0Var.h && u890.j(this.i, m4v0Var.i) && u890.j(this.j, m4v0Var.j) && this.k == m4v0Var.k && u890.j(this.l, m4v0Var.l);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + xcg1.g(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        iix0 iix0Var = this.j;
        int iK = ab80.k(this.k, (iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31, 31);
        String str2 = this.l;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }
}
