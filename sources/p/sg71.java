package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sg71 extends tg71 {
    public final List a;

    public sg71(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg71) && this.a.equals(((sg71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
