package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n6w {
    public final List a;

    public n6w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6w) && this.a.equals(((n6w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
