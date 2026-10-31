package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mh1 {
    public final String a;
    public final ArrayList b;
    public final p10 c;

    public mh1(String str, ArrayList arrayList, p10 p10Var) {
        this.a = str;
        this.b = arrayList;
        this.c = p10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh1)) {
            return false;
        }
        mh1 mh1Var = (mh1) obj;
        return this.a.equals(mh1Var.a) && this.b.equals(mh1Var.b) && this.c.equals(mh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
