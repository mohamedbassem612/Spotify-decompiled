package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oig1 {
    public final qg10 a;
    public final eb91 b;
    public final cfe c;
    public final eg41 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ oig1(qg10 qg10Var, eb91 eb91Var, cfe cfeVar, eg41 eg41Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : qg10Var, (i & 2) != 0 ? null : eb91Var, (i & 4) != 0 ? null : cfeVar, (i & 8) != 0 ? null : eg41Var, (i & 32) == 0, (i & 64) != 0 ? b7x.a : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oig1)) {
            return false;
        }
        oig1 oig1Var = (oig1) obj;
        return u890.j(this.a, oig1Var.a) && u890.j(this.b, oig1Var.b) && u890.j(this.c, oig1Var.c) && u890.j(this.d, oig1Var.d) && this.e == oig1Var.e && u890.j(this.f, oig1Var.f);
    }

    public final int hashCode() {
        qg10 qg10Var = this.a;
        int iHashCode = (qg10Var == null ? 0 : qg10Var.hashCode()) * 31;
        eb91 eb91Var = this.b;
        int iHashCode2 = (iHashCode + (eb91Var == null ? 0 : eb91Var.hashCode())) * 31;
        cfe cfeVar = this.c;
        int iHashCode3 = (iHashCode2 + (cfeVar == null ? 0 : cfeVar.hashCode())) * 31;
        eg41 eg41Var = this.d;
        return this.f.hashCode() + xcg1.g((iHashCode3 + (eg41Var != null ? eg41Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public oig1(qg10 qg10Var, eb91 eb91Var, cfe cfeVar, eg41 eg41Var, boolean z, Map map) {
        this.a = qg10Var;
        this.b = eb91Var;
        this.c = cfeVar;
        this.d = eg41Var;
        this.e = z;
        this.f = map;
    }
}
