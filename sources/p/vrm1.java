package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vrm1 {
    public final kqm1 a;
    public final kqm1 b;
    public final kqm1 c;
    public final ArrayList d;
    public final ArrayList e;

    public vrm1(kqm1 kqm1Var, kqm1 kqm1Var2, kqm1 kqm1Var3, ArrayList arrayList, ArrayList arrayList2) {
        this.a = kqm1Var;
        this.b = kqm1Var2;
        this.c = kqm1Var3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrm1)) {
            return false;
        }
        vrm1 vrm1Var = (vrm1) obj;
        return this.a.equals(vrm1Var.a) && this.b.equals(vrm1Var.b) && this.c.equals(vrm1Var.c) && this.d.equals(vrm1Var.d) && this.e.equals(vrm1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
