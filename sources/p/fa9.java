package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fa9 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ maa d;

    public /* synthetic */ fa9(List list, maa maaVar, boolean z, byte b) {
        this.a = b;
        this.b = list;
        this.d = maaVar;
        this.c = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        q2c1 q2c1Var = this.d;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        List list = this.b;
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
                    p7t0 p7t0Var = (p7t0) list.get(iIntValue);
                    x340Var2.i0(-291864992);
                    otw.c((h7t0) q2c1Var, new f7t0(p7t0Var, iIntValue, z), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                    x340Var2.r(false);
                }
                break;
            case 1:
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
                    s2c1 s2c1Var = (s2c1) list.get(iIntValue3);
                    x340Var4.i0(40033390);
                    otw.c(q2c1Var, new p2c1(s2c1Var, iIntValue3, this.c, false, false), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                }
                break;
            default:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i3 = (iIntValue6 & 6) == 0 ? (x340Var5.g(aqb0Var3) ? 4 : 2) | iIntValue6 : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var6.b0();
                } else {
                    mv70 mv70Var = (ov70) list.get(iIntValue5);
                    x340Var6.i0(-1757632818);
                    if (mv70Var instanceof mv70) {
                        x340Var6.i0(2021514171);
                        otw.c(this.d, mv70Var.a, aqb0.b(aqb0Var3, nim0.a, (pxg1) null, (ni20) null, 5), (ipb1) null, x340Var6, 64, 8);
                        x340Var6.r(false);
                    } else if (mv70Var instanceof nv70) {
                        x340Var6.i0(2021522220);
                        lq01.a(x47.a, z, (qim0) null, x340Var6, 0);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1757167106);
                        x340Var6.r(false);
                    }
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
