package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uj51 {
    public final List a;

    public uj51(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj51) && this.a.equals(((uj51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
