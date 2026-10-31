package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cz21 {
    public final Duration a;
    public final bz21 b;

    public cz21(Duration duration, bz21 bz21Var) {
        this.a = duration;
        this.b = bz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz21)) {
            return false;
        }
        cz21 cz21Var = (cz21) obj;
        return this.a.equals(cz21Var.a) && u890.j(this.b, cz21Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bz21 bz21Var = this.b;
        return iHashCode + (bz21Var == null ? 0 : bz21Var.hashCode());
    }
}
