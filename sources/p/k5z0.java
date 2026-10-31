package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k5z0 extends ajo1 {
    public final List d;

    public k5z0(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5z0) && this.d.equals(((k5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
