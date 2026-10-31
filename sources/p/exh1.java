package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class exh1 {
    public final ArrayList a;
    public final rmh0 b;
    public final int c;

    public exh1(ArrayList arrayList, rmh0 rmh0Var, int i) {
        this.a = arrayList;
        this.b = rmh0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exh1)) {
            return false;
        }
        exh1 exh1Var = (exh1) obj;
        return this.a.equals(exh1Var.a) && this.b == exh1Var.b && this.c == exh1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
