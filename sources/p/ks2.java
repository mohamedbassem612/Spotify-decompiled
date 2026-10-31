package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks2 {
    public final js2 a;
    public final ArrayList b;

    public ks2(js2 js2Var, ArrayList arrayList) {
        this.a = js2Var;
        this.b = arrayList;
    }

    public final js2 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks2)) {
            return false;
        }
        ks2 ks2Var = (ks2) obj;
        return u890.j(this.a, ks2Var.a) && this.b.equals(ks2Var.b);
    }

    public final int hashCode() {
        js2 js2Var = this.a;
        return this.b.hashCode() + ((js2Var == null ? 0 : js2Var.hashCode()) * 31);
    }
}
