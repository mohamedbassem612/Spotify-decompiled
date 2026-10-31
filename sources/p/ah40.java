package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ah40 {
    public final String a;
    public final dh40 b;
    public final Instant c;

    public ah40(String str, dh40 dh40Var, Instant instant) {
        this.a = str;
        this.b = dh40Var;
        this.c = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah40)) {
            return false;
        }
        ah40 ah40Var = (ah40) obj;
        return this.a.equals(ah40Var.a) && this.b == ah40Var.b && this.c.equals(ah40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
