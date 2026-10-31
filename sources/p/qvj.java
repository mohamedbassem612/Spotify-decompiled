package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qvj implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ fad0 c;
    public final /* synthetic */ vme0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ iu30 f;

    public /* synthetic */ qvj(List list, fad0 fad0Var, vme0 vme0Var, ven0 ven0Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = list;
        this.c = fad0Var;
        this.d = vme0Var;
        this.e = ven0Var;
        this.f = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ine0 ine0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        List list = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    jj40 jj40Var = (jj40) list.get(iIntValue);
                    x340Var2.i0(-1449586266);
                    ine0 ine0VarT = n9p1.t(jj40Var);
                    ine0 ine0Var2 = new ine0(ine0VarT.c, ine0VarT.a, ine0VarT.b, true);
                    fad0 fad0Var = this.c;
                    boolean zI = x340Var2.i(fad0Var) | x340Var2.i(jj40Var);
                    if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zI | z;
                    vme0 vme0Var = this.d;
                    boolean zI2 = z2 | x340Var2.i(vme0Var) | x340Var2.i(ven0Var);
                    iu30 iu30Var = this.f;
                    boolean zG = zI2 | x340Var2.g(iu30Var) | x340Var2.i(ine0Var2);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        ovj ovjVar = new ovj(fad0Var, jj40Var, iIntValue, vme0Var, iu30Var, ine0Var2, this.e);
                        ine0Var = ine0Var2;
                        x340Var2.s0(ovjVar);
                        objT = ovjVar;
                    } else {
                        ine0Var = ine0Var2;
                    }
                    fae1.e(ine0Var, (iu30) objT, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    jj40 jj40Var2 = (jj40) list.get(iIntValue3);
                    x340Var4.i0(950965099);
                    ine0 ine0VarT2 = n9p1.t(jj40Var2);
                    fad0 fad0Var2 = this.c;
                    boolean zI3 = x340Var4.i(fad0Var2) | x340Var4.i(jj40Var2);
                    if ((((i2 & 112) ^ 48) <= 32 || !x340Var4.e(iIntValue3)) && (i2 & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = zI3 | z;
                    vme0 vme0Var2 = this.d;
                    boolean zI4 = z3 | x340Var4.i(vme0Var2) | x340Var4.i(ven0Var);
                    iu30 iu30Var2 = this.f;
                    boolean zG2 = zI4 | x340Var4.g(iu30Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        pvj pvjVar = new pvj(fad0Var2, jj40Var2, iIntValue3, vme0Var2, iu30Var2, this.e);
                        x340Var4.s0(pvjVar);
                        objT2 = pvjVar;
                    }
                    fae1.e(ine0VarT2, (iu30) objT2, x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
