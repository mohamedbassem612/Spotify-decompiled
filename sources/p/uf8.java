package p;

import java.util.Date;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uf8 extends zxo1 {
    public final String c;
    public final int d;
    public final int e;
    public final Date f;
    public final long g;
    public final cg8 h;
    public final rr6 i;
    public final yf8 j;
    public final bg8 k;

    public uf8(String str, int i, int i2, Date date, long j, cg8 cg8Var, rr6 rr6Var, yf8 yf8Var, bg8 bg8Var) {
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = date;
        this.g = j;
        this.h = cg8Var;
        this.i = rr6Var;
        this.j = yf8Var;
        this.k = bg8Var;
    }

    public final Function0 E() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uf8) {
            uf8 uf8Var = (uf8) obj;
            return this.c.equals(uf8Var.c) && this.d == uf8Var.d && this.e == uf8Var.e && this.f.equals(uf8Var.f) && this.g == uf8Var.g && this.h == uf8Var.h && this.i == uf8Var.i && this.j == uf8Var.j && this.k == uf8Var.k;
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + cy30.f((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, this.c.hashCode() * 31, 31), 31)) * 31, this.g, 31)) * 31)) * 31)) * 31);
    }
}
