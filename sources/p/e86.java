package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e86 implements m86 {
    public final List a;

    public e86(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e86) && u890.j(this.a, ((e86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
