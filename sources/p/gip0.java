package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gip0 implements piw {
    public final Set a;

    public gip0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gip0) && u890.j(this.a, ((gip0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
