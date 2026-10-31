package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sf8 extends zxo1 {
    public final String c;
    public final int d;
    public final int e;
    public final Date f;
    public final long g;
    public final cg8 h;
    public final ag8 i;
    public final yf8 j;

    public sf8(String str, int i, int i2, Date date, long j, cg8 cg8Var, ag8 ag8Var, yf8 yf8Var) {
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = date;
        this.g = j;
        this.h = cg8Var;
        this.i = ag8Var;
        this.j = yf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sf8) {
            sf8 sf8Var = (sf8) obj;
            return this.c.equals(sf8Var.c) && this.d == sf8Var.d && this.e == sf8Var.e && this.f.equals(sf8Var.f) && this.g == sf8Var.g && this.h == sf8Var.h && this.i == sf8Var.i && this.j == sf8Var.j;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + cy30.f((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, this.c.hashCode() * 31, 31), 31)) * 31, this.g, 31)) * 31)) * 31);
    }
}
