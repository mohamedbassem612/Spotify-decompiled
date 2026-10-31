package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rl11 {
    public final List a;

    public rl11(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl11) && this.a.equals(((rl11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
