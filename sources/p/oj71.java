package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oj71 extends pj71 {
    public final List a;

    public oj71(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj71) && this.a.equals(((oj71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
