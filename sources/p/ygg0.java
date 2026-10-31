package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ygg0 {
    public final List a;
    public final Map b;

    public ygg0(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygg0)) {
            return false;
        }
        ygg0 ygg0Var = (ygg0) obj;
        return this.a.equals(ygg0Var.a) && u890.j(this.b, ygg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
