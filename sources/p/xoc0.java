package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xoc0 extends zoc0 {
    public final Set a;

    public xoc0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoc0) && this.a.equals(((xoc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
