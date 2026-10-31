package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zs0 {
    public final Date a;
    public final boolean b;
    public final Date c;

    public zs0(Date date, boolean z, Date date2) {
        this.a = date;
        this.b = z;
        this.c = date2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs0)) {
            return false;
        }
        zs0 zs0Var = (zs0) obj;
        return this.a.equals(zs0Var.a) && this.b == zs0Var.b && this.c.equals(zs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
