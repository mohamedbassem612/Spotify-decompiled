package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z66 implements m86 {
    public final List a;

    public z66(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z66) && u890.j(this.a, ((z66) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
