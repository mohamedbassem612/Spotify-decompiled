package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ln00 {
    public static final ln00 b = new ln00(new oig1((qg10) null, (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 127));
    public static final ln00 c = new ln00(new oig1((qg10) null, (eb91) null, (cfe) null, (eg41) null, (LinkedHashMap) null, 95));
    public final oig1 a;

    public ln00(oig1 oig1Var) {
        this.a = oig1Var;
    }

    public final ln00 a(ln00 ln00Var) {
        oig1 oig1Var = ln00Var.a;
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
        return new ln00(new oig1(qg10Var, eb91Var, cfeVar, eg41Var, oig1Var.e || oig1Var2.e, sqg0.O(oig1Var2.f, oig1Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ln00) && ((ln00) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        oig1 oig1Var = this.a;
        qg10 qg10Var = oig1Var.a;
        String string = qg10Var != null ? qg10Var.toString() : null;
        eb91 eb91Var = oig1Var.b;
        String string2 = eb91Var != null ? eb91Var.toString() : null;
        cfe cfeVar = oig1Var.c;
        String string3 = cfeVar != null ? cfeVar.toString() : null;
        eg41 eg41Var = oig1Var.d;
        String string4 = eg41Var != null ? eg41Var.toString() : null;
        boolean z = oig1Var.e;
        StringBuilder sbN = gvg.n("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        bb00.j(sbN, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbN.append(z);
        return sbN.toString();
    }
}
