package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wi9 implements bj9 {
    public final Set a;

    public wi9(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi9) && u890.j(this.a, ((wi9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
