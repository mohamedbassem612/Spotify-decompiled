package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pir {
    public final Date a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public pir(Date date, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = date;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public static pir a(pir pirVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        Date date = pirVar.a;
        if ((i7 & 2) != 0) {
            i8 = pirVar.b;
        }
        if ((i7 & 4) != 0) {
            i2 = pirVar.c;
        }
        if ((i7 & 8) != 0) {
            i3 = pirVar.d;
        }
        if ((i7 & 16) != 0) {
            i4 = pirVar.e;
        }
        pirVar.getClass();
        pirVar.getClass();
        if ((i7 & 128) != 0) {
            i5 = pirVar.f;
        }
        if ((i7 & 256) != 0) {
            i6 = pirVar.g;
        }
        int i9 = i6;
        pirVar.getClass();
        int i10 = i5;
        int i11 = i4;
        int i12 = i3;
        return new pir(date, i8, i2, i12, i11, i10, i9);
    }

    public final boolean b() {
        return this.b > 0 || this.c > 0 || this.d > 0 || this.e > 0 || this.f > 0 || this.g > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pir)) {
            return false;
        }
        pir pirVar = (pir) obj;
        return u890.j(this.a, pirVar.a) && this.b == pirVar.b && this.c == pirVar.c && this.d == pirVar.d && this.e == pirVar.e && this.f == pirVar.f && this.g == pirVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, kaa0.f(0, kaa0.f(0, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public pir(Date date) {
        this(date, 0, 0, 0, 0, 0, 0);
    }
}
