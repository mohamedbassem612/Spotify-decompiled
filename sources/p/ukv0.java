package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ukv0 implements clv0 {
    public final Set a;

    public ukv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukv0) && this.a.equals(((ukv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
