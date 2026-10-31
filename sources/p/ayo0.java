package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ayo0 implements eyo0 {
    public final String a;
    public final ArrayList b;

    public ayo0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return z6x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayo0)) {
            return false;
        }
        ayo0 ayo0Var = (ayo0) obj;
        if (!this.a.equals(ayo0Var.a) || !this.b.equals(ayo0Var.b)) {
            return false;
        }
        z6x z6xVar = z6x.a;
        return z6xVar.equals(z6xVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1;
    }
}
