package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hgf1 {
    public final int a;
    public final int b;
    public final Date c;
    public final Date d;

    public hgf1(int i, int i2, Date date, Date date2) {
        this.a = i;
        this.b = i2;
        this.c = date;
        this.d = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgf1)) {
            return false;
        }
        hgf1 hgf1Var = (hgf1) obj;
        return this.a == hgf1Var.a && this.b == hgf1Var.b && this.c.equals(hgf1Var.c) && this.d.equals(hgf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }
}
