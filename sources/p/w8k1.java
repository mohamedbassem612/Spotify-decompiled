package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w8k1 extends d7p1 {
    public final List c;

    public w8k1(List list) {
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8k1) && this.c.equals(((w8k1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
