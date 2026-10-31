package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class syv0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final LocalDate e;
    public final long f;
    public final int g;
    public final int h;

    public syv0(boolean z, String str, String str2, String str3, LocalDate localDate, long j, int i, int i2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = localDate;
        this.f = j;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syv0)) {
            return false;
        }
        syv0 syv0Var = (syv0) obj;
        return this.a == syv0Var.a && u890.j(this.b, syv0Var.b) && u890.j(this.c, syv0Var.c) && this.d.equals(syv0Var.d) && lrn1.o(this.e, syv0Var.e) && this.f == syv0Var.f && this.g == syv0Var.g && this.h == syv0Var.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + kaa0.f(this.g, cy30.f((lrn1.r(this.e) + cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, this.f, 31), 31);
    }
}
