package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vjv0 implements bkv0 {
    public final Set a;

    public vjv0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjv0) && this.a.equals(((vjv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
