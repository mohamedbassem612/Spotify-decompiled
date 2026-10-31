package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zvv implements awv {
    public final Set a;

    public zvv(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvv) && u890.j(this.a, ((zvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
