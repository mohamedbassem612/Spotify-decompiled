package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m2n0 {
    public final ArrayList a;
    public final String b;

    public m2n0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2n0)) {
            return false;
        }
        m2n0 m2n0Var = (m2n0) obj;
        return this.a.equals(m2n0Var.a) && this.b.equals(m2n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
