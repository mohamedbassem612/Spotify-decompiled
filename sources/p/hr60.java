package p;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hr60 implements xlb0 {
    public final r6e1 a;
    public final int b;
    public final cgg1 c;
    public final Function0 d;

    public hr60(r6e1 r6e1Var, int i, cgg1 cgg1Var, Function0 function0) {
        this.a = r6e1Var;
        this.b = i;
        this.c = cgg1Var;
        this.d = function0;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        long j2;
        if (afh0Var.C(hjl.h(j)) < hjl.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = hjl.b(j2, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13);
        }
        q5t0 q5t0VarH = afh0Var.H(j);
        int iMin = Math.min(q5t0VarH.a, hjl.i(j2));
        return ifh0Var.S(iMin, q5t0VarH.b, b7x.a, new di3(this, ifh0Var, q5t0VarH, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hr60) {
            hr60 hr60Var = (hr60) obj;
            if (this.a == hr60Var.a && this.b == hr60Var.b && this.c.equals(hr60Var.c) && u890.j(this.d, hr60Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
