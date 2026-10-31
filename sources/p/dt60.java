package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dt60 extends jto1 {
    public final ArrayList b;
    public final vr60 c;

    public dt60(ArrayList arrayList, vr60 vr60Var) {
        this.b = arrayList;
        this.c = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt60)) {
            return false;
        }
        dt60 dt60Var = (dt60) obj;
        return this.b.equals(dt60Var.b) && this.c.equals(dt60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
