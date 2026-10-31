package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aba {
    public final wqd a;
    public final Instant b;

    public aba(wqd wqdVar, Instant instant) {
        this.a = wqdVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba abaVar = (aba) obj;
        return this.a.equals(abaVar.a) && this.b.equals(abaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() - 227152026;
    }
}
