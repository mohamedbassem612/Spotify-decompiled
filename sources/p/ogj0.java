package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ogj0 extends pgj0 {
    public final Set a;

    public ogj0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogj0) && this.a.equals(((ogj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
