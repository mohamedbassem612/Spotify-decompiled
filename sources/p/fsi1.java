package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fsi1 extends dn90 {
    public final Set e;

    public fsi1(Set set) {
        super(5, (byte) 6);
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsi1) && this.e.equals(((fsi1) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
