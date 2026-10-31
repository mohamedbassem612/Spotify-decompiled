package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pmb1 extends aob1 {
    public final ArrayList a;
    public final String b;
    public final x360 c;

    public pmb1(String str, ArrayList arrayList, x360 x360Var) {
        this.a = arrayList;
        this.b = str;
        this.c = x360Var;
    }

    @Override // p.aob1
    public final x360 a() {
        return this.c;
    }

    @Override // p.aob1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmb1)) {
            return false;
        }
        pmb1 pmb1Var = (pmb1) obj;
        return this.a.equals(pmb1Var.a) && u890.j(this.b, pmb1Var.b) && u890.j(this.c, pmb1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return iD + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
