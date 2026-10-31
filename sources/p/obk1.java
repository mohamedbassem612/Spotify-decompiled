package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class obk1 implements Function0 {
    public final View a;
    public volatile nml b;
    public volatile auw c;
    public final ien0 d = new ien0(q6x.b);

    public obk1(View view) {
        this.a = view;
    }

    public final View a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof obk1) {
            return u890.j(this.a, ((obk1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object invoke() {
        ien0 ien0Var = xhk1.a;
        eq80 eq80VarA = xhk1.a(this.a);
        auw auwVarI = sap1.i(eq80VarA);
        if (auwVarI != null) {
            this.c = auwVarI;
        }
        nml nmlVarH = hap1.h(eq80VarA);
        if (nmlVarH != null) {
            this.b = nmlVarH;
        }
        auw auwVar = this.c;
        eq80 eq80Var = auwVar != null ? new eq80(auwVar) : null;
        nml nmlVar = this.b;
        eq80 jp80Var = nmlVar != null ? new jp80(nmlVar) : null;
        if (eq80Var != null) {
            eq80 wchVar = q6x.b;
            if (eq80Var.equals(wchVar) && eq80VarA.equals(wchVar)) {
                eq80VarA = wchVar;
            } else if (!eq80Var.equals(wchVar)) {
                if (eq80VarA.equals(wchVar)) {
                    eq80VarA = eq80Var;
                } else {
                    wchVar = new wch(eq80Var, eq80VarA);
                    eq80VarA = wchVar;
                }
            }
        }
        if (jp80Var != null) {
            eq80 wchVar2 = q6x.b;
            if (jp80Var.equals(wchVar2) && eq80VarA.equals(wchVar2)) {
                jp80Var = wchVar2;
            } else if (jp80Var.equals(wchVar2)) {
                jp80Var = eq80VarA;
            } else if (!eq80VarA.equals(wchVar2)) {
                wchVar2 = new wch(jp80Var, eq80VarA);
                jp80Var = wchVar2;
            }
            eq80VarA = jp80Var;
        }
        this.d.c(eq80VarA);
        return eq80VarA;
    }
}
