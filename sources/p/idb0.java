package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idb0 extends mdb0 {
    public final List a;

    public idb0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idb0) && u890.j(this.a, ((idb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
