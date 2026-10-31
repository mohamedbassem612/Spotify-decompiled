package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hh40 implements lh40 {
    public final Instant a;
    public final Instant b;
    public final boolean c;

    public hh40(Instant instant, Instant instant2, boolean z) {
        this.a = instant;
        this.b = instant2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh40)) {
            return false;
        }
        hh40 hh40Var = (hh40) obj;
        return u890.j(this.a, hh40Var.a) && u890.j(this.b, hh40Var.b) && this.c == hh40Var.c;
    }

    public final int hashCode() {
        Instant instant = this.a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31);
    }
}
