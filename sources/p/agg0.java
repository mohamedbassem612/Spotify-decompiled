package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agg0 implements bgg0 {
    public final List a;

    public agg0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agg0) && u890.j(this.a, ((agg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
