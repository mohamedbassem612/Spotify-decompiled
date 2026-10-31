package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ndg0 {
    public final boolean a;
    public final boolean b;
    public final Date c;

    public ndg0(boolean z, boolean z2, Date date) {
        this.a = z;
        this.b = z2;
        this.c = date;
    }

    public static ndg0 a(ndg0 ndg0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ndg0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = ndg0Var.b;
        }
        Date date = ndg0Var.c;
        ndg0Var.getClass();
        return new ndg0(z, z2, date);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndg0)) {
            return false;
        }
        ndg0 ndg0Var = (ndg0) obj;
        return this.a == ndg0Var.a && this.b == ndg0Var.b && u890.j(this.c, ndg0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Date date = this.c;
        return iG + (date == null ? 0 : date.hashCode());
    }
}
