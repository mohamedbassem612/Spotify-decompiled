package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bsi1 extends dn90 {
    public final Set e;

    public bsi1(Set set) {
        super(1, (byte) 6);
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsi1) && this.e.equals(((bsi1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
