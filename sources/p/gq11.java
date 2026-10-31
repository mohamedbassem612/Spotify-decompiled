package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gq11 implements hq11 {
    public final List a;

    public gq11(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq11) && this.a.equals(((gq11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
