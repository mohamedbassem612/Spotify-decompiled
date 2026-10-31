package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class spc {
    public final ArrayList a;
    public final ArrayList b;
    public final q5k c;
    public final int d;
    public final mia1 e;
    public final boolean f;

    public spc(ArrayList arrayList, ArrayList arrayList2, q5k q5kVar, int i, mia1 mia1Var, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = q5kVar;
        this.d = i;
        this.e = mia1Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spc)) {
            return false;
        }
        spc spcVar = (spc) obj;
        return this.a.equals(spcVar.a) && this.b.equals(spcVar.b) && u890.j(this.c, spcVar.c) && this.d == spcVar.d && u890.j(this.e, spcVar.e) && this.f == spcVar.f;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        q5k q5kVar = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + kaa0.f(this.d, (iF + (q5kVar == null ? 0 : q5kVar.hashCode())) * 31, 31)) * 31);
    }
}
