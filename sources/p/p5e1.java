package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p5e1 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:143:0x02e4  */
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        pae1 pae1VarB;
        zma1 zma1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                n6e1 n6e1Var = (n6e1) obj;
                String str = n6e1Var.g.b;
                long j = n6e1Var.f;
                int i = nbe1.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > 0) {
                    a4x a4xVarY = mmo1.y();
                    if (a4xVarY != null) {
                        int iB = a4xVarY.b(i2 - 1, str);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i2 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                        }
                    } else if (i2 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new f9t(((int) (n6e1Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 1:
                n6e1 n6e1Var2 = (n6e1) obj;
                String str2 = n6e1Var2.g.b;
                long j2 = n6e1Var2.f;
                int i3 = nbe1.c;
                int iU = mmo1.u((int) (j2 & 4294967295L), str2);
                if (iU != -1) {
                    return new f9t(0, iU - ((int) (n6e1Var2.f & 4294967295L)));
                }
                return null;
            case 2:
                n6e1 n6e1Var3 = (n6e1) obj;
                Integer numE = n6e1Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = n6e1Var3.f;
                int i4 = nbe1.c;
                return new f9t(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 3:
                n6e1 n6e1Var4 = (n6e1) obj;
                Integer numD = n6e1Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = n6e1Var4.f;
                int i5 = nbe1.c;
                return new f9t(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 4:
                n6e1 n6e1Var5 = (n6e1) obj;
                Integer numC = n6e1Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = n6e1Var5.f;
                int i6 = nbe1.c;
                return new f9t(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 5:
                n6e1 n6e1Var6 = (n6e1) obj;
                Integer numB = n6e1Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = n6e1Var6.f;
                int i7 = nbe1.c;
                return new f9t(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 6:
                List list = (List) obj;
                return new r6e1(((Boolean) list.get(1)).booleanValue() ? qqq0.a : qqq0.b, ((Float) list.get(0)).floatValue());
            case 7:
                return rih1Var;
            case 8:
                return Boolean.valueOf(((n511) obj) == null);
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                ze5 ze5Var = (ze5) obj;
                Object obj2 = ze5Var.a;
                if (!(obj2 instanceof mjc0) || (pae1VarB = ((mjc0) obj2).b()) == null || (pae1VarB.a == null && pae1VarB.b == null && pae1VarB.c == null && pae1VarB.d == null)) {
                    return p7h.H(new ze5[]{ze5Var});
                }
                pae1 pae1VarB2 = ((mjc0) ze5Var.a).b();
                if (pae1VarB2 == null || (zma1Var = pae1VarB2.a) == null) {
                    zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535);
                }
                return p7h.H(new ze5[]{ze5Var, new ze5(ze5Var.b, ze5Var.c, zma1Var)});
            case 14:
                ((e261) obj).b(z161.B, rih1Var);
                return rih1Var;
            case 15:
                List list2 = (List) obj;
                return new b8f1(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 16:
                return Boolean.valueOf(((d441) obj).f1());
            case 17:
                hav0 hav0Var = (hav0) obj;
                return Boolean.valueOf(hav0Var.d && hav0Var.h);
            case 18:
                return Boolean.TRUE;
            case 19:
                jo51 jo51Var = (jo51) obj;
                long j7 = jo51Var.g;
                gw91 gw91Var = jo51Var.i;
                if (gw91Var != null) {
                    gw91Var.d(jo51Var, bno1.a, jo51Var.h);
                }
                long j8 = jo51Var.g;
                if (j7 != j8) {
                    co51 co51Var = jo51Var.P0;
                    if (co51Var != null) {
                        if (co51Var.a > j8) {
                            jo51Var.w1();
                        } else {
                            co51Var.g = j8;
                            if (co51Var.b == null) {
                                co51Var.h = jch0.a0((1.0d - ((double) co51Var.e.a(0))) * jo51Var.g);
                            }
                        }
                    } else if (j8 != 0) {
                        jo51Var.B1();
                    }
                }
                return rih1Var;
            case 20:
                d441 d441Var = (d441) obj;
                xj61 xj61Var = new xj61();
                while (d441Var.f1()) {
                    xj61Var.add(Integer.valueOf((int) d441Var.getLong(0)));
                }
                return cwl1.j(xj61Var);
            case 21:
                tma0 tma0Var = (tma0) obj;
                int i8 = tma0Var.a;
                if (i8 == 0) {
                    return "*";
                }
                g1h1 g1h1Var = tma0Var.b;
                g1h1 g1h1Var2 = g1h1Var instanceof g1h1 ? g1h1Var : null;
                String strE = g1h1Var2 != null ? g1h1Var2.e(true) : String.valueOf(g1h1Var);
                int iC = l1d.C(i8);
                if (iC == 0) {
                    return strE;
                }
                if (iC == 1) {
                    return "in ".concat(strE);
                }
                if (iC == 2) {
                    return "out ".concat(strE);
                }
                eg.o();
                return null;
            case 22:
                return rih1Var;
            case 23:
                return new ke5(((Float) obj).floatValue());
            case 24:
                return new ke5(((Integer) obj).intValue());
            case 25:
                return Integer.valueOf((int) ((ke5) obj).a);
            case 26:
                return new ke5(((p3v) obj).a);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new p3v(((ke5) obj).a);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                r3v r3vVar = (r3v) obj;
                return new le5(r3v.a(r3vVar.a), r3v.b(r3vVar.a));
            default:
                le5 le5Var = (le5) obj;
                return new r3v((((long) Float.floatToRawIntBits(le5Var.a)) << 32) | (((long) Float.floatToRawIntBits(le5Var.b)) & 4294967295L));
        }
    }

    public /* synthetic */ p5e1(byte b) {
        this.a = b;
    }
}
