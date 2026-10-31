package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lz30 extends qtg {
    public final List d;

    public lz30(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz30) && this.d.equals(((lz30) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
