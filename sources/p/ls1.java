package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ls1 implements bt1 {
    public final Set a;

    public ls1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls1) && u890.j(this.a, ((ls1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
