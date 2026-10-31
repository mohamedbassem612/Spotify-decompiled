package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u820 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u820(tm tmVar, byte b) {
        super(4);
        this.a = b;
        this.b = tmVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                s820 s820Var = (s820) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(93599700);
                r620 r620Var = s820Var.b;
                boolean zI = x340Var.i(tmVar);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new vd2(tmVar, (lnm) null, (byte) 16);
                    x340Var.s0(objT);
                }
                jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
                boolean z2 = r620Var != null;
                List<r620> list = s820Var.a;
                smc0 smc0VarN = k4p1.n();
                for (r620 r620Var2 : list) {
                    if (r620Var2 == r620Var) {
                        z = true;
                    } else if (r620Var2 == (r620Var != null ? r620Var.b : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (r620Var == null || z) {
                        smc0VarN.add(new o820(tmVar.i(r620Var2), r620Var2, z, false, false));
                    }
                    if (z) {
                        r620Var2.getClass();
                        ArrayList<r620> arrayList = new ArrayList();
                        for (Object obj5 : r620.Y) {
                            if (((r620) obj5).b == r620Var2) {
                                arrayList.add(obj5);
                            }
                        }
                        for (r620 r620Var3 : arrayList) {
                            boolean z3 = r620Var3 == r620Var;
                            smc0VarN.add(new o820(tmVar.i(r620Var3), r620Var3, z3, true, z3));
                        }
                    }
                }
                t820 t820Var = new t820(k4p1.k(smc0VarN), z2);
                x340Var.r(false);
                return t820Var;
            default:
                ((Number) obj3).intValue();
                return new lsk0((bqk0) tmVar.d);
        }
    }
}
