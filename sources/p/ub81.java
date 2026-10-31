package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ub81 extends zb81 {
    public final String a;
    public final ArrayList b;

    public ub81(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub81)) {
            return false;
        }
        ub81 ub81Var = (ub81) obj;
        return this.a.equals(ub81Var.a) && this.b.equals(ub81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
