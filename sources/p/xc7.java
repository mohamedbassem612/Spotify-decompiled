package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xc7 extends fqo1 {
    public final List e;

    public xc7(List list) {
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc7) && u890.j(this.e, ((xc7) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
