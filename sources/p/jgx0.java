package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jgx0 implements kgx0 {
    public final Set a;

    public jgx0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgx0) && u890.j(this.a, ((jgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
