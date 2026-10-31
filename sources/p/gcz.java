package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcz {
    public final ah40 a;
    public final Instant b;
    public final String c;

    public gcz(ah40 ah40Var, Instant instant, String str) {
        this.a = ah40Var;
        this.b = instant;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcz)) {
            return false;
        }
        gcz gczVar = (gcz) obj;
        return this.a.equals(gczVar.a) && this.b.equals(gczVar.b) && u890.j(this.c, gczVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
