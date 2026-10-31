package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dsi1 extends dn90 {
    public final Set e;

    public dsi1(Set set) {
        super(4, (byte) 6);
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsi1) && this.e.equals(((dsi1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
