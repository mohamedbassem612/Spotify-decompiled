package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wf50 {
    public final List a;
    public final List b;

    public wf50(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf50)) {
            return false;
        }
        wf50 wf50Var = (wf50) obj;
        return u890.j(this.a, wf50Var.a) && u890.j(this.b, wf50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
