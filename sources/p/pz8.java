package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pz8 extends jin {
    public final List a;
    public final fin b;
    public final xhn c;
    public final gin d;
    public final List e;

    public pz8(List list, tz8 tz8Var, xhn xhnVar, vz8 vz8Var, List list2) {
        this.a = list;
        this.b = tz8Var;
        this.c = xhnVar;
        this.d = vz8Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jin) {
            jin jinVar = (jin) obj;
            List list = this.a;
            if (list != null ? list.equals(((pz8) jinVar).a) : ((pz8) jinVar).a == null) {
                fin finVar = this.b;
                if (finVar != null ? finVar.equals(((pz8) jinVar).b) : ((pz8) jinVar).b == null) {
                    xhn xhnVar = this.c;
                    if (xhnVar != null ? xhnVar.equals(((pz8) jinVar).c) : ((pz8) jinVar).c == null) {
                        pz8 pz8Var = (pz8) jinVar;
                        if (this.d.equals(pz8Var.d) && this.e.equals(pz8Var.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        fin finVar = this.b;
        int iHashCode2 = (iHashCode ^ (finVar == null ? 0 : finVar.hashCode())) * 1000003;
        xhn xhnVar = this.c;
        return this.e.hashCode() ^ (((((xhnVar != null ? xhnVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
