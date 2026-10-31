package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qef1 {
    public final oef1 a;
    public final ArrayList b;
    public final String c;
    public final u7h d;
    public final boolean e;

    public qef1(oef1 oef1Var, ArrayList arrayList, String str, u7h u7hVar, boolean z) {
        this.a = oef1Var;
        this.b = arrayList;
        this.c = str;
        this.d = u7hVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qef1)) {
            return false;
        }
        qef1 qef1Var = (qef1) obj;
        return this.a.equals(qef1Var.a) && this.b.equals(qef1Var.b) && u890.j(this.c, qef1Var.c) && u890.j(this.d, qef1Var.d) && this.e == qef1Var.e;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        u7h u7hVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0)) * 31);
    }
}
