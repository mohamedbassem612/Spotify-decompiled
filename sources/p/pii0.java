package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pii0 {
    public final String a;
    public final ArrayList b;
    public final x360 c;

    public pii0(String str, ArrayList arrayList, x360 x360Var) {
        this.a = str;
        this.b = arrayList;
        this.c = x360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pii0)) {
            return false;
        }
        pii0 pii0Var = (pii0) obj;
        return this.a.equals(pii0Var.a) && this.b.equals(pii0Var.b) && u890.j(this.c, pii0Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        x360 x360Var = this.c;
        return iF + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
