package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mq20 {
    public final cb90 a;
    public final ArrayList b;
    public final ArrayList c;

    public mq20(cb90 cb90Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = cb90Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mq20) {
            mq20 mq20Var = (mq20) obj;
            if (this.a == mq20Var.a && this.b.equals(mq20Var.b) && this.c.equals(mq20Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
