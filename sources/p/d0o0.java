package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d0o0 implements j0o0 {
    public final Set a;

    public d0o0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0o0) && u890.j(this.a, ((d0o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
