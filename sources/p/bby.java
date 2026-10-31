package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bby {
    public static final bby b = new bby(new oig1((qg10) null, (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 127));
    public final oig1 a;

    public bby(oig1 oig1Var) {
        this.a = oig1Var;
    }

    public final bby a(bby bbyVar) {
        oig1 oig1Var = bbyVar.a;
        qg10 qg10Var = oig1Var.a;
        oig1 oig1Var2 = this.a;
        if (qg10Var == null) {
            qg10Var = oig1Var2.a;
        }
        eb91 eb91Var = oig1Var.b;
        if (eb91Var == null) {
            eb91Var = oig1Var2.b;
        }
        cfe cfeVar = oig1Var.c;
        if (cfeVar == null) {
            cfeVar = oig1Var2.c;
        }
        eg41 eg41Var = oig1Var.d;
        if (eg41Var == null) {
            eg41Var = oig1Var2.d;
        }
        return new bby(new oig1(qg10Var, eb91Var, cfeVar, eg41Var, sqg0.O(oig1Var2.f, oig1Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bby) && ((bby) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        oig1 oig1Var = this.a;
        qg10 qg10Var = oig1Var.a;
        String string = qg10Var != null ? qg10Var.toString() : null;
        eb91 eb91Var = oig1Var.b;
        String string2 = eb91Var != null ? eb91Var.toString() : null;
        cfe cfeVar = oig1Var.c;
        String string3 = cfeVar != null ? cfeVar.toString() : null;
        eg41 eg41Var = oig1Var.d;
        return rjx.o(gvg.n("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", eg41Var != null ? eg41Var.toString() : null, ", Veil - null");
    }
}
