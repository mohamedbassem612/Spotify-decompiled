package p;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class idz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public idz(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final Date a(Calendar calendar) {
        calendar.set(this.a, this.b - 1, this.c, this.d, this.e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idz)) {
            return false;
        }
        idz idzVar = (idz) obj;
        return this.a == idzVar.a && this.b == idzVar.b && this.c == idzVar.c && this.d == idzVar.d && this.e == idzVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }
}
