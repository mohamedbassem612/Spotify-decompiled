package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mqf0 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ tyq c;
    public final /* synthetic */ iu30 d;

    public mqf0(List list, tyq tyqVar, iu30 iu30Var) {
        this.b = list;
        this.c = tyqVar;
        this.d = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        List list = this.b;
        iu30 iu30Var = this.d;
        switch (b) {
            case 0:
                gpb0 gpb0Var = (gpb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(gpb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    String str = (String) list.get(iIntValue);
                    x340Var2.i0(977753881);
                    qim0 qim0VarN = anm1.N("stickers-picker-item", u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3));
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new are(iu30Var, str, (byte) 10);
                        x340Var2.s0(objT);
                    }
                    otw.c(this.c, new bwb1(str), bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), (ipb1) null, x340Var2, 0, 8);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    String str2 = (String) list.get(iIntValue3);
                    x340Var4.i0(-931911277);
                    bwb1 bwb1Var = new bwb1(str2);
                    qim0 qim0VarV = u291.v(nim0Var, 130.0f);
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.g(str2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new are(iu30Var, str2, (byte) 13);
                        x340Var4.s0(objT2);
                    }
                    otw.c(this.c, bwb1Var, bin.x(qim0VarV, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), (ipb1) null, x340Var4, 0, 8);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }

    public mqf0(List list, iu30 iu30Var, tyq tyqVar) {
        this.b = list;
        this.d = iu30Var;
        this.c = tyqVar;
    }
}
