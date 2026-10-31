package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wqe0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final pap1 d;

    public wqe0(String str, String str2, ArrayList arrayList, pap1 pap1Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = pap1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqe0)) {
            return false;
        }
        wqe0 wqe0Var = (wqe0) obj;
        return this.a.equals(wqe0Var.a) && this.b.equals(wqe0Var.b) && this.c.equals(wqe0Var.c) && this.d.equals(wqe0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
