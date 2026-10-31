package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yz30 extends d040 {
    public final List a;

    public yz30(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz30) && u890.j(this.a, ((yz30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
