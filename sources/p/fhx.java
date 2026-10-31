package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fhx {
    public final String a;
    public final String b;
    public final ygx c;
    public final ygx d;
    public final boolean e;
    public final Function0 f;
    public final iu30 g;

    public fhx(String str, String str2, ygx ygxVar, ygx ygxVar2, Function0 function0, v3v0 v3v0Var, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        boolean z = (i & 16) != 0;
        function0 = (i & 32) != 0 ? xzu.b1 : function0;
        v3v0Var = (i & 64) != 0 ? null : v3v0Var;
        this.a = str;
        this.b = str2;
        this.c = ygxVar;
        this.d = ygxVar2;
        this.e = z;
        this.f = function0;
        this.g = v3v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhx)) {
            return false;
        }
        fhx fhxVar = (fhx) obj;
        return u890.j(this.a, fhxVar.a) && u890.j(this.b, fhxVar.b) && this.c.equals(fhxVar.c) && u890.j(this.d, fhxVar.d) && this.e == fhxVar.e && this.f.equals(fhxVar.f) && u890.j(this.g, fhxVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        ygx ygxVar = this.d;
        int iN = rjx.n(xcg1.g((iHashCode2 + (ygxVar == null ? 0 : ygxVar.hashCode())) * 31, 31, this.e), 31, this.f);
        iu30 iu30Var = this.g;
        return iN + (iu30Var != null ? iu30Var.hashCode() : 0);
    }
}
