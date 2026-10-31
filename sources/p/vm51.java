package p;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vm51 implements sm51 {
    public final gw70 a;
    public final cn51 b;
    public final nn51 c;
    public final LinkedHashMap d;

    public vm51(gw70 gw70Var, cn51 cn51Var, nn51 nn51Var) {
        this.a = gw70Var;
        this.b = cn51Var;
        this.c = nn51Var;
        this.d = qgo1.o(nn51Var);
    }

    @Override // p.sm51
    public final rm51 a(int i, long j, int i2) {
        Size size = new Size(i, i2);
        cn51 cn51Var = this.b;
        nn51 nn51Var = this.c;
        jn51 jn51VarA = cn51Var.a(nn51Var, size);
        if (jn51VarA == null) {
            jn51VarA = (jn51) o7h.C0(nn51Var.c);
        }
        if (jn51VarA == null) {
            return null;
        }
        int i3 = jn51VarA.f;
        int i4 = jn51VarA.g;
        mmr0 mmr0VarR = qgo1.r(this.d, j, jn51VarA);
        if (mmr0VarR == null) {
            return null;
        }
        int iIntValue = ((Number) mmr0VarR.a).intValue();
        long jLongValue = ((Number) mmr0VarR.b).longValue();
        String strS = qgo1.s(nn51Var, jn51VarA, iIntValue / (i3 * i4));
        int i5 = iIntValue % (i3 * i4);
        Integer numValueOf = Integer.valueOf(i5 % i4);
        Integer numValueOf2 = Integer.valueOf(i5 / i4);
        int iIntValue2 = numValueOf.intValue();
        int iIntValue3 = numValueOf2.intValue();
        int i6 = i4 * jn51VarA.e;
        int i7 = i3 * jn51VarA.d;
        ixg ixgVarF = this.a.f(strS);
        ixgVarF.b.k = jsc.d;
        ixgVarF.p(i6, i7, 1);
        ixgVarF.s(new p8b1(jn51VarA.g, jn51VarA.f, jn51VarA.e, jn51VarA.d, iIntValue2, iIntValue3, strS));
        return new rm51(jLongValue, ixgVarF);
    }
}
