package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q0w0 {
    public final String a;
    public final String b;
    public final String c;
    public final LocalDate d;
    public final long e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public q0w0(String str, String str2, String str3, LocalDate localDate, long j, int i, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = localDate;
        this.e = j;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0w0)) {
            return false;
        }
        q0w0 q0w0Var = (q0w0) obj;
        return u890.j(this.a, q0w0Var.a) && u890.j(this.b, q0w0Var.b) && this.c.equals(q0w0Var.c) && this.d.equals(q0w0Var.d) && this.e == q0w0Var.e && this.f == q0w0Var.f && this.g == q0w0Var.g && this.h == q0w0Var.h && this.i == q0w0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(kaa0.f(this.f, cy30.f((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, this.e, 31), 31), 31, this.g), 31, this.h);
    }
}
