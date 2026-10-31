package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vc2 extends wc2 {
    public final List a;

    public vc2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc2) && this.a.equals(((vc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
