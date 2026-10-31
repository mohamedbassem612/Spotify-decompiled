package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v53 {
    public final List a;

    public v53(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v53) && u890.j(this.a, ((v53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
