package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pnn {
    public final Integer a;
    public final List b;

    public pnn(Integer num, List list) {
        this.a = num;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnn)) {
            return false;
        }
        pnn pnnVar = (pnn) obj;
        return u890.j(this.a, pnnVar.a) && this.b.equals(pnnVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
