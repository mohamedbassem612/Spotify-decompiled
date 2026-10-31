package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pio extends two1 {
    public final List c;

    public pio(List list) {
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pio) && this.c.equals(((pio) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
