package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cd9 implements ed9 {
    public final Set a;

    public cd9(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd9) && u890.j(this.a, ((cd9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
