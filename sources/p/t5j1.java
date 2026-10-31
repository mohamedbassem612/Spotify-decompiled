package p;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t5j1 implements xlb0 {
    public final r6e1 a;
    public final int b;
    public final cgg1 c;
    public final Function0 d;

    public t5j1(r6e1 r6e1Var, int i, cgg1 cgg1Var, Function0 function0) {
        this.a = r6e1Var;
        this.b = i;
        this.c = cgg1Var;
        this.d = function0;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7));
        int iMin = Math.min(q5t0VarH.b, hjl.h(j));
        return ifh0Var.S(q5t0VarH.a, iMin, b7x.a, new g311(this, q5t0VarH, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t5j1) {
            t5j1 t5j1Var = (t5j1) obj;
            if (this.a == t5j1Var.a && this.b == t5j1Var.b && this.c.equals(t5j1Var.c) && u890.j(this.d, t5j1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
