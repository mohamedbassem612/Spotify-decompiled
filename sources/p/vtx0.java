package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vtx0 extends oqn1 {
    public final List c;

    public vtx0(List list) {
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtx0) && u890.j(this.c, ((vtx0) obj).c);
    }

    public final int hashCode() {
        List list = this.c;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
