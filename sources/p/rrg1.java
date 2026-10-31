package p;

import j$.time.ZonedDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rrg1 {
    public final ZonedDateTime a;
    public final boolean b;
    public final Integer c;

    public rrg1(ZonedDateTime zonedDateTime, boolean z, Integer num) {
        this.a = zonedDateTime;
        this.b = z;
        this.c = num;
    }

    public final ZonedDateTime a() {
        return this.a;
    }

    public final Integer b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrg1)) {
            return false;
        }
        rrg1 rrg1Var = (rrg1) obj;
        return u890.j(this.a, rrg1Var.a) && this.b == rrg1Var.b && u890.j(this.c, rrg1Var.c);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.a;
        int iG = xcg1.g((zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num != null ? num.hashCode() : 0);
    }
}
