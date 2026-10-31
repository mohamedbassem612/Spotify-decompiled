package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sf1 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ sf1(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        List list = this.b;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    avc0 avc0Var = (avc0) list.get(iIntValue);
                    x340Var2.i0(-330614800);
                    g6p1.a(avc0Var, (qim0) null, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    String str = (String) list.get(iIntValue3);
                    x340Var4.i0(1797795208);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    uwo1.e(str, uyn1.w(nim0Var, new zzq0(16.0f, 16.0f, 16.0f, 16.0f)), cbx.d(x340Var4).g, cbx.a(x340Var4).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2016);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    yq60 yq60Var = (yq60) list.get(iIntValue5);
                    x340Var6.i0(854956653);
                    otw.c(yq60Var.a, yq60Var.b, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    UnmatchedItem unmatchedItem = (UnmatchedItem) list.get(iIntValue7);
                    x340Var8.i0(-2047486980);
                    r4o1.w(unmatchedItem, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(i5 & 1, (i5 & 147) != 146);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    xpw xpwVar = (xpw) list.get(iIntValue9);
                    x340Var10.i0(2102472217);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var10).b;
                    otw.c(xpwVar, rih1Var2, j9k1.x(nim0Var, new kk11(3, (byte) 13)), (ipb1) null, x340Var10, 48, 8);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
        }
    }
}
