package p;

import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wz31 {
    public final gzl1 a;
    public final Integer b;
    public final c380 c;
    public final c380 d;
    public final c380 e;
    public final String f;
    public final long g;
    public final TimeZone h;

    public wz31(gzl1 gzl1Var, Integer num, c380 c380Var, c380 c380Var2, c380 c380Var3, String str, long j, TimeZone timeZone) {
        this.a = gzl1Var;
        this.b = num;
        this.c = c380Var;
        this.d = c380Var2;
        this.e = c380Var3;
        this.f = str;
        this.g = j;
        this.h = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz31)) {
            return false;
        }
        wz31 wz31Var = (wz31) obj;
        return this.a == wz31Var.a && u890.j(this.b, wz31Var.b) && u890.j(this.c, wz31Var.c) && u890.j(this.d, wz31Var.d) && u890.j(this.e, wz31Var.e) && this.f.equals(wz31Var.f) && this.g == wz31Var.g && this.h.equals(wz31Var.h);
    }

    public final int hashCode() {
        gzl1 gzl1Var = this.a;
        int iHashCode = (gzl1Var == null ? 0 : gzl1Var.hashCode()) * 31;
        Integer num = this.b;
        return this.h.hashCode() + cy30.f(cy30.d(kk0.f(this.e, kk0.f(this.d, kk0.f(this.c, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31, this.f), this.g, 31);
    }
}
