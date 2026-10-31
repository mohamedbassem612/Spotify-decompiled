package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dz3 implements f1r {
    public static final i1r c = new i1r(rih1.a, (Integer) null);
    public final f1r a;
    public final int b;

    public dz3(f1r f1rVar) {
        this.a = f1rVar;
        this.b = f1rVar.getItems().hashCode();
    }

    public final k1r a(Map map) {
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f1r) && this.b == obj.hashCode()) {
            return u890.j(this.a.getItems(), ((f1r) obj).getItems());
        }
        return false;
    }

    public final List getItems() {
        return this.a.getItems();
    }

    public final int hashCode() {
        return this.b;
    }
}
