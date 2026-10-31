package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nhm {
    public final jhm a;
    public final ihm b;
    public final vrv0 c;
    public final Function0 d;

    public nhm(jhm jhmVar, ihm ihmVar, vrv0 vrv0Var, Function0 function0) {
        this.a = jhmVar;
        this.b = ihmVar;
        this.c = vrv0Var;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhm)) {
            return false;
        }
        nhm nhmVar = (nhm) obj;
        return this.a.equals(nhmVar.a) && this.b.equals(nhmVar.b) && u890.j(this.c, nhmVar.c) && u890.j(this.d, nhmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vrv0 vrv0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (vrv0Var == null ? 0 : vrv0Var.hashCode())) * 31);
    }
}
