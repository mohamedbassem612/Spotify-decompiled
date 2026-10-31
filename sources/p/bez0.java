package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bez0 {
    public final gu61 a;
    public final ArrayList b;

    public bez0(gu61 gu61Var, ArrayList arrayList) {
        this.a = gu61Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bez0)) {
            return false;
        }
        bez0 bez0Var = (bez0) obj;
        return this.a.equals(bez0Var.a) && this.b.equals(bez0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
