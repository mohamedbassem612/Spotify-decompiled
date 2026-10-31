package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fs1 implements bt1 {
    public final Set a;

    public fs1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs1) && u890.j(this.a, ((fs1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
