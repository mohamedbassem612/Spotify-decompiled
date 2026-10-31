package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ws01 {
    public final m9m a;
    public final List b;

    public ws01(List list, m9m m9mVar) {
        this.a = m9mVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws01)) {
            return false;
        }
        ws01 ws01Var = (ws01) obj;
        return this.a == ws01Var.a && this.b.equals(ws01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
