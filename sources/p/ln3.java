package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ln3 extends qxd0 {
    public final Set d;

    public ln3(Set set) {
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln3) && this.d.equals(((ln3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
