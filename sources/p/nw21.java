package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nw21 extends jm5 {
    public final List d;

    public nw21(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw21) && this.d.equals(((nw21) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
