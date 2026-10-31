package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class klb1 {
    public final Map a;
    public final long b;

    public klb1(long j, Map map) {
        this.a = map;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klb1)) {
            return false;
        }
        klb1 klb1Var = (klb1) obj;
        return this.a.equals(klb1Var.a) && this.b == klb1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
