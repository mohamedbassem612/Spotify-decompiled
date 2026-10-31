package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class txt0 implements zxt0 {
    public final y6b1 a;
    public final y6b1 b;
    public final y6b1 c;
    public final long d;
    public final long e;
    public final ArrayList f;
    public final long g;
    public final Long h;
    public final String i;

    public txt0(y6b1 y6b1Var, y6b1 y6b1Var2, y6b1 y6b1Var3, long j, long j2, ArrayList arrayList, long j3, Long l, String str) {
        this.a = y6b1Var;
        this.b = y6b1Var2;
        this.c = y6b1Var3;
        this.d = j;
        this.e = j2;
        this.f = arrayList;
        this.g = j3;
        this.h = l;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txt0)) {
            return false;
        }
        txt0 txt0Var = (txt0) obj;
        return this.a.equals(txt0Var.a) && this.b.equals(txt0Var.b) && u890.j(this.c, txt0Var.c) && this.d == txt0Var.d && this.e == txt0Var.e && this.f.equals(txt0Var.f) && this.g == txt0Var.g && u890.j(this.h, txt0Var.h) && u890.j(this.i, txt0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        y6b1 y6b1Var = this.c;
        int iF = cy30.f(p3d1.f(this.f, cy30.f(cy30.f((iHashCode + (y6b1Var == null ? 0 : y6b1Var.hashCode())) * 31, this.d, 31), this.e, 31), 31), this.g, 31);
        Long l = this.h;
        return this.i.hashCode() + ((iF + (l != null ? l.hashCode() : 0)) * 31);
    }
}
