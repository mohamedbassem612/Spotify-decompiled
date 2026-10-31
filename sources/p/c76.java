package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c76 implements m86 {
    public final List a;

    public c76(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c76) && u890.j(this.a, ((c76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
