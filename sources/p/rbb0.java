package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rbb0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ vu30 c;

    public /* synthetic */ rbb0(ArrayList arrayList, vu30 vu30Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = vu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
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
                    nbb0 nbb0Var = (nbb0) arrayList.get(iIntValue);
                    x340Var2.i0(-1136570038);
                    vu30 vu30Var = this.c;
                    boolean zG = x340Var2.g(vu30Var) | x340Var2.g(nbb0Var);
                    if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG | z;
                    Object objT = x340Var2.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new wv1(vu30Var, nbb0Var, iIntValue, (byte) 12);
                        x340Var2.s0(objT);
                    }
                    f6o1.d(nbb0Var, (Function0) objT, x340Var2, 0);
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
                    okm0 okm0Var = (okm0) arrayList.get(iIntValue3);
                    x340Var4.i0(1836353342);
                    qim0 qim0VarV = u291.v(nim0.a, 172.0f);
                    int i3 = i2 & 112;
                    if (((i3 ^ 48) <= 32 || !x340Var4.e(iIntValue3)) && (i2 & 48) != 32) {
                        z = false;
                    }
                    Object objT2 = x340Var4.T();
                    if (z || objT2 == fkj0.X) {
                        objT2 = new po60(iIntValue3, (byte) 15);
                        x340Var4.s0(objT2);
                    }
                    e130.i(okm0Var, iIntValue3, this.c, s161.b(qim0VarV, false, (iu30) objT2), x340Var4, i3);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
