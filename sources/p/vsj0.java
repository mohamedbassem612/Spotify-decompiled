package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vsj0 extends pim0 implements j4k, zlb0 {
    public LinkedHashMap O0;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        float f = ((p3v) lcc.z(this, jw80.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        q5t0 q5t0VarH = afh0Var.H(j);
        boolean z = this.N0 && !Float.isNaN(f) && p3v.b(f, 0.0f) > 0;
        int iI0 = !Float.isNaN(f) ? ifh0Var.i0(f) : 0;
        int iMax = q5t0VarH.a;
        if (z) {
            iMax = Math.max(iMax, iI0);
        }
        int iMax2 = q5t0VarH.b;
        if (z) {
            iMax2 = Math.max(iMax2, iI0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.O0;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.O0 = linkedHashMap;
            }
            k5j1 k5j1Var = jw80.b;
            int iRound = Math.round((iI0 - q5t0VarH.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(k5j1Var, Integer.valueOf(iRound));
            vq60 vq60Var = jw80.a;
            int iRound2 = Math.round((iI0 - q5t0VarH.b) / 2.0f);
            linkedHashMap.put(vq60Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        b7x b7xVar = this.O0;
        if (b7xVar == null) {
            b7xVar = b7x.a;
        }
        return ifh0Var.S(iMax, iMax2, b7xVar, new tk80(iMax, q5t0VarH, iMax2, (byte) 1));
    }
}
