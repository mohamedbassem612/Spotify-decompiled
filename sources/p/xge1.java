package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xge1 {
    public final ArrayList a;
    public final int b;

    public xge1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xge1)) {
            return false;
        }
        xge1 xge1Var = (xge1) obj;
        return this.a.equals(xge1Var.a) && this.b == xge1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
