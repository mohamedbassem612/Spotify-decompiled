package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u4z0 extends ajo1 {
    public final List d;

    public u4z0(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4z0) && this.d.equals(((u4z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
