package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d5z0 extends ajo1 {
    public final List d;

    public d5z0(List list) {
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5z0) && this.d.equals(((d5z0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
