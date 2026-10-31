package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dw20 {
    public final fso a;
    public final ArrayList b;

    public dw20(fso fsoVar, ArrayList arrayList) {
        this.a = fsoVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw20)) {
            return false;
        }
        dw20 dw20Var = (dw20) obj;
        return u890.j(this.a, dw20Var.a) && this.b.equals(dw20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
