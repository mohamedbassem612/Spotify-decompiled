package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mlz0 {
    public final long a;
    public final long b;
    public final b5p1 c;
    public final Date d;
    public final Date e;

    public mlz0(long j, long j2, b5p1 b5p1Var, Date date, Date date2) {
        this.a = j;
        this.b = j2;
        this.c = b5p1Var;
        this.d = date;
        this.e = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlz0)) {
            return false;
        }
        mlz0 mlz0Var = (mlz0) obj;
        return this.a == mlz0Var.a && this.b == mlz0Var.b && this.c.equals(mlz0Var.c) && this.d.equals(mlz0Var.d) && this.e.equals(mlz0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31);
    }
}
