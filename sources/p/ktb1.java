package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ktb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final ArrayList c;
    public final String d;
    public final ArrayList e;
    public final xxh f;
    public final String g;
    public final String h;
    public final boolean i;

    public ktb1(String str, d761 d761Var, ArrayList arrayList, String str2, ArrayList arrayList2, xxh xxhVar, String str3, String str4, boolean z) {
        this.a = str;
        this.b = d761Var;
        this.c = arrayList;
        this.d = str2;
        this.e = arrayList2;
        this.f = xxhVar;
        this.g = str3;
        this.h = str4;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktb1)) {
            return false;
        }
        ktb1 ktb1Var = (ktb1) obj;
        return this.a.equals(ktb1Var.a) && u890.j(this.b, ktb1Var.b) && this.c.equals(ktb1Var.c) && this.d.equals(ktb1Var.d) && this.e.equals(ktb1Var.e) && this.f.equals(ktb1Var.f) && this.g.equals(ktb1Var.g) && this.h.equals(ktb1Var.h) && this.i == ktb1Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d761 d761Var = this.b;
        return Boolean.hashCode(this.i) + cy30.d(cy30.d((this.f.hashCode() + p3d1.f(this.e, cy30.d(p3d1.f(this.c, (iHashCode + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31, 31), 31, this.d), 31)) * 31, 31, this.g), 31, this.h);
    }
}
