package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kiq0 implements aik1 {
    public final int a;
    public final int b;
    public final Date c;
    public final Date d;

    public kiq0(int i, int i2, Date date, Date date2) {
        this.a = i;
        this.b = i2;
        this.c = date;
        this.d = date2;
    }

    @Override // p.aik1
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiq0)) {
            return false;
        }
        kiq0 kiq0Var = (kiq0) obj;
        return this.a == kiq0Var.a && this.b == kiq0Var.b && this.c.equals(kiq0Var.c) && this.d.equals(kiq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }
}
