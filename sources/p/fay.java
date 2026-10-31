package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fay implements gay {
    public final List a;

    public fay(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fay) && this.a.equals(((fay) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
