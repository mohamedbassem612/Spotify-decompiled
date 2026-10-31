package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n3a0 implements q3a0 {
    public final Set a;

    public n3a0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3a0) && this.a.equals(((n3a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
