package p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ebe implements lqm0 {
    public final /* synthetic */ float a;

    public ebe(float f) {
        this.a = f;
    }

    @Override // p.lqm0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo604measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        q5t0 q5t0VarH;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = hjl.i(j);
        long j2 = j & (-8589934589L);
        afh0 afh0Var = (afh0) o7h.s0(list4);
        q5t0 q5t0VarH2 = null;
        q5t0 q5t0VarH3 = afh0Var != null ? afh0Var.H(j2) : null;
        int i2 = q5t0VarH3 != null ? q5t0VarH3.a : 0;
        afh0 afh0Var2 = (afh0) o7h.s0(list2);
        if (afh0Var2 != null) {
            int i3 = i - i2;
            q5t0VarH = afh0Var2.H(hjl.b(j2, 0, i3 < 0 ? 0 : i3, 0, 0, 13));
        } else {
            q5t0VarH = null;
        }
        int i4 = q5t0VarH != null ? q5t0VarH.a : 0;
        int iMin = (i - i4) - i2;
        if (iMin < 0) {
            iMin = 0;
        }
        afh0 afh0Var3 = (afh0) o7h.s0(list3);
        if (afh0Var3 != null) {
            float f = this.a;
            if ((Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                iMin = Math.min(iMin, ifh0Var.i0(f));
            }
            q5t0VarH2 = afh0Var3.H(hjl.b(j2, 0, iMin, 0, 0, 13));
        }
        q5t0 q5t0Var = q5t0VarH2;
        int iP = yoi1.p(Math.max(q5t0VarH != null ? q5t0VarH.b : 0, Math.max(q5t0Var != null ? q5t0Var.b : 0, q5t0VarH3 != null ? q5t0VarH3.b : 0)), hjl.j(j), hjl.h(j));
        return ifh0Var.S(i, iP, b7x.a, new dbe(q5t0VarH, iP, q5t0VarH3, i, i2, q5t0Var, i4));
    }
}
