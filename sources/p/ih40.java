package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ih40 implements lh40 {
    public final Instant a;
    public final Instant b;

    public ih40(Instant instant, Instant instant2) {
        this.a = instant;
        this.b = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih40)) {
            return false;
        }
        ih40 ih40Var = (ih40) obj;
        return u890.j(this.a, ih40Var.a) && u890.j(this.b, ih40Var.b);
    }

    public final int hashCode() {
        Instant instant = this.a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.b;
        return iHashCode + (instant2 != null ? instant2.hashCode() : 0);
    }
}
