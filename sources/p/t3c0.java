package p;

import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t3c0 extends y3c0 {
    public final boolean a;
    public final boolean b;
    public final Calendar c;
    public final Calendar d;

    public t3c0(boolean z, boolean z2, Calendar calendar, Calendar calendar2) {
        this.a = z;
        this.b = z2;
        this.c = calendar;
        this.d = calendar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3c0)) {
            return false;
        }
        t3c0 t3c0Var = (t3c0) obj;
        return this.a == t3c0Var.a && this.b == t3c0Var.b && this.c.equals(t3c0Var.c) && u890.j(this.d, t3c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Calendar calendar = this.d;
        return iHashCode + (calendar == null ? 0 : calendar.hashCode());
    }
}
