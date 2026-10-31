package p;

import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ef41 implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ef41(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        ze5 ze5Var;
        u7h u7hVar;
        u7h u7hVar2;
        int i = 0;
        kjc0 kjc0Var = null;
        switch (this.a) {
            case 0:
                return yf70.a(((Integer) obj).intValue());
            case 1:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    Object obj2 = list.get(i);
                    ze5 ze5Var2 = (u890.j(obj2, Boolean.FALSE) || obj2 == null) ? null : (ze5) jf41.c.b.invoke(obj2);
                    ze5Var2.getClass();
                    arrayList.add(ze5Var2);
                    i++;
                }
                return arrayList;
            case 2:
                return new FontStyle(((Integer) obj).intValue());
            case 3:
                return new FontSynthesis(((Integer) obj).intValue());
            case 4:
                Boolean bool = Boolean.FALSE;
                if (u890.j(obj, bool)) {
                    wee1[] wee1VarArr = TextUnit.b;
                    return new TextUnit(f7p1.k());
                }
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                Float f = obj3 != null ? (Float) obj3 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj4 = list2.get(1);
                if41 if41Var = jf41.y;
                u890.j(obj4, bool);
                kjc0Var = obj4 != null ? (wee1) if41Var.b.invoke(obj4) : null;
                kjc0Var.getClass();
                return new TextUnit(fc11.Y(fFloatValue, kjc0Var.a));
            case 5:
                if (u890.j(obj, 0)) {
                    return new wee1(8589934592L);
                }
                return u890.j(obj, 1) ? new wee1(4294967296L) : new wee1(0L);
            case 6:
                if (u890.j(obj, Boolean.FALSE)) {
                    return new Offset(9205357640488583168L);
                }
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                Float f2 = obj5 != null ? (Float) obj5 : null;
                f2.getClass();
                float fFloatValue2 = f2.floatValue();
                Object obj6 = list3.get(1);
                kjc0Var = obj6 != null ? (Float) obj6 : null;
                kjc0Var.getClass();
                return new Offset((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(kjc0Var.floatValue())) & 4294967295L));
            case 7:
                List list4 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size2 = list4.size();
                while (i < size2) {
                    Object obj7 = list4.get(i);
                    ehe0 ehe0Var = (u890.j(obj7, Boolean.FALSE) || obj7 == null) ? null : (ehe0) jf41.B.b.invoke(obj7);
                    ehe0Var.getClass();
                    arrayList2.add(ehe0Var);
                    i++;
                }
                return new LocaleList(arrayList2);
            case 8:
                return new ehe0(s8p1.e((String) obj));
            case 9:
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                String str = obj8 != null ? (String) obj8 : null;
                str.getClass();
                Object obj9 = list5.get(1);
                return new kjc0(str, (u890.j(obj9, Boolean.FALSE) || obj9 == null) ? null : (pae1) jf41.j.b.invoke(obj9), (rjc0) null);
            case 10:
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                float f3 = phc0.b;
                if41 if41Var2 = jf41.D;
                Boolean bool2 = Boolean.FALSE;
                u890.j(obj10, bool2);
                phc0 phc0Var = obj10 != null ? (phc0) if41Var2.b.invoke(obj10) : null;
                phc0Var.getClass();
                float f4 = phc0Var.a;
                Object obj11 = list6.get(1);
                if41 if41Var3 = jf41.E;
                u890.j(obj11, bool2);
                rhc0 rhc0Var = obj11 != null ? (rhc0) if41Var3.b.invoke(obj11) : null;
                rhc0Var.getClass();
                int iE = rhc0Var.e();
                Object obj12 = list6.get(2);
                if41 if41Var4 = jf41.F;
                u890.j(obj12, bool2);
                kjc0Var = obj12 != null ? (qhc0) if41Var4.b.invoke(obj12) : null;
                kjc0Var.getClass();
                return new shc0(iE, kjc0Var.e(), f4);
            case 11:
                float fFloatValue3 = ((Float) obj).floatValue();
                phc0.a(fFloatValue3);
                return new phc0(fFloatValue3);
            case 12:
                return rhc0.a(((Integer) obj).intValue());
            case 13:
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                yf5 yf5Var = obj13 != null ? (yf5) obj13 : null;
                yf5Var.getClass();
                Object obj14 = list7.get(2);
                Integer num = obj14 != null ? (Integer) obj14 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj15 = list7.get(3);
                Integer num2 = obj15 != null ? (Integer) obj15 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj16 = list7.get(4);
                String str2 = obj16 != null ? (String) obj16 : null;
                str2.getClass();
                switch (yf5Var.ordinal()) {
                    case 0:
                        Object obj17 = list7.get(1);
                        df41 df41Var = jf41.h;
                        if (!u890.j(obj17, Boolean.FALSE) && obj17 != null) {
                            kjc0Var = (cpr0) df41Var.b.invoke(obj17);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 1:
                        Object obj18 = list7.get(1);
                        df41 df41Var2 = jf41.i;
                        if (!u890.j(obj18, Boolean.FALSE) && obj18 != null) {
                            kjc0Var = (zma1) df41Var2.b.invoke(obj18);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 2:
                        Object obj19 = list7.get(1);
                        df41 df41Var3 = jf41.d;
                        if (!u890.j(obj19, Boolean.FALSE) && obj19 != null) {
                            kjc0Var = (uyi1) df41Var3.b.invoke(obj19);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 3:
                        Object obj20 = list7.get(1);
                        df41 df41Var4 = jf41.e;
                        if (!u890.j(obj20, Boolean.FALSE) && obj20 != null) {
                            kjc0Var = (h3i1) df41Var4.b.invoke(obj20);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 4:
                        Object obj21 = list7.get(1);
                        df41 df41Var5 = jf41.f;
                        if (!u890.j(obj21, Boolean.FALSE) && obj21 != null) {
                            kjc0Var = (ljc0) df41Var5.b.invoke(obj21);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 5:
                        Object obj22 = list7.get(1);
                        df41 df41Var6 = jf41.g;
                        if (!u890.j(obj22, Boolean.FALSE) && obj22 != null) {
                            kjc0Var = (kjc0) df41Var6.b.invoke(obj22);
                        }
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, kjc0Var, str2);
                        break;
                    case 6:
                        Object obj23 = list7.get(1);
                        kjc0Var = obj23 != null ? (String) obj23 : null;
                        kjc0Var.getClass();
                        ze5Var = new ze5(iIntValue, iIntValue2, qgc1.a(kjc0Var), str2);
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return ze5Var;
            case 14:
                return qhc0.a(((Integer) obj).intValue());
            case 15:
                kjc0Var = obj != null ? (String) obj : null;
                kjc0Var.getClass();
                return new uyi1(kjc0Var);
            case 16:
                kjc0Var = obj != null ? (String) obj : null;
                kjc0Var.getClass();
                return new h3i1(kjc0Var);
            case 17:
                List list8 = (List) obj;
                Object obj24 = list8.get(0);
                if41 if41Var5 = jf41.s;
                Boolean bool3 = Boolean.FALSE;
                u890.j(obj24, bool3);
                a0e1 a0e1Var = obj24 != null ? (a0e1) if41Var5.b.invoke(obj24) : null;
                a0e1Var.getClass();
                int i2 = a0e1Var.a;
                Object obj25 = list8.get(1);
                if41 if41Var6 = jf41.t;
                u890.j(obj25, bool3);
                z3e1 z3e1Var = obj25 != null ? (z3e1) if41Var6.b.invoke(obj25) : null;
                z3e1Var.getClass();
                int iE2 = z3e1Var.e();
                Object obj26 = list8.get(2);
                wee1[] wee1VarArr2 = TextUnit.b;
                if41 if41Var7 = jf41.x;
                u890.j(obj26, bool3);
                TextUnit textUnit = obj26 != null ? (TextUnit) if41Var7.b.invoke(obj26) : null;
                textUnit.getClass();
                long j = textUnit.a;
                Object obj27 = list8.get(3);
                u8e1 u8e1Var = u8e1.c;
                u8e1 u8e1Var2 = (u890.j(obj27, bool3) || obj27 == null) ? null : (u8e1) jf41.m.b.invoke(obj27);
                Object obj28 = list8.get(4);
                edt0 edt0Var = (u890.j(obj28, bool3) || obj28 == null) ? null : (edt0) f6o1.a.b.invoke(obj28);
                Object obj29 = list8.get(5);
                shc0 shc0Var = shc0.d;
                shc0 shc0Var2 = (u890.j(obj29, bool3) || obj29 == null) ? null : (shc0) jf41.C.b.invoke(obj29);
                Object obj30 = list8.get(6);
                int i3 = mhc0.b;
                mhc0 mhc0Var = (u890.j(obj30, bool3) || obj30 == null) ? null : (mhc0) f6o1.c.b.invoke(obj30);
                mhc0Var.getClass();
                int i4 = mhc0Var.a;
                Object obj31 = list8.get(7);
                if41 if41Var8 = jf41.u;
                u890.j(obj31, bool3);
                yf70 yf70Var = obj31 != null ? (yf70) if41Var8.b.invoke(obj31) : null;
                yf70Var.getClass();
                int iE3 = yf70Var.e();
                Object obj32 = list8.get(8);
                boolean zJ = u890.j(obj32, bool3);
                df41 df41Var7 = f6o1.d;
                if (!zJ && obj32 != null) {
                    kjc0Var = (gbe1) df41Var7.b.invoke(obj32);
                }
                return new cpr0(i2, iE2, j, u8e1Var2, edt0Var, shc0Var2, i4, iE3, kjc0Var);
            case 18:
                List list9 = (List) obj;
                Object obj33 = list9.get(0);
                int i5 = u7h.l;
                Boolean bool4 = Boolean.FALSE;
                u890.j(obj33, bool4);
                if (obj33 == null) {
                    u7hVar = null;
                } else if (obj33.equals(bool4)) {
                    int i6 = u7h.l;
                    u7hVar = new u7h(nfb.p());
                } else {
                    u7hVar = new u7h(z4p1.e(((Integer) obj33).intValue()));
                }
                u7hVar.getClass();
                long j2 = u7hVar.a;
                Object obj34 = list9.get(1);
                wee1[] wee1VarArr3 = TextUnit.b;
                iu30 iu30Var = jf41.x.b;
                u890.j(obj34, bool4);
                TextUnit textUnit2 = obj34 != null ? (TextUnit) iu30Var.invoke(obj34) : null;
                textUnit2.getClass();
                long j3 = textUnit2.a;
                Object obj35 = list9.get(2);
                FontWeight fontWeight = FontWeight.b;
                FontWeight fontWeight2 = (u890.j(obj35, bool4) || obj35 == null) ? null : (FontWeight) jf41.n.b.invoke(obj35);
                Object obj36 = list9.get(3);
                FontStyle fontStyle = (u890.j(obj36, bool4) || obj36 == null) ? null : (FontStyle) jf41.v.b.invoke(obj36);
                Object obj37 = list9.get(4);
                FontSynthesis fontSynthesis = (u890.j(obj37, bool4) || obj37 == null) ? null : (FontSynthesis) jf41.w.b.invoke(obj37);
                Object obj38 = list9.get(6);
                String str3 = obj38 != null ? (String) obj38 : null;
                Object obj39 = list9.get(7);
                u890.j(obj39, bool4);
                TextUnit textUnit3 = obj39 != null ? (TextUnit) iu30Var.invoke(obj39) : null;
                textUnit3.getClass();
                long j4 = textUnit3.a;
                Object obj40 = list9.get(8);
                BaselineShift baselineShift = (u890.j(obj40, bool4) || obj40 == null) ? null : (BaselineShift) jf41.o.b.invoke(obj40);
                Object obj41 = list9.get(9);
                TextGeometricTransform textGeometricTransform = (u890.j(obj41, bool4) || obj41 == null) ? null : (TextGeometricTransform) jf41.l.b.invoke(obj41);
                Object obj42 = list9.get(10);
                LocaleList localeList = LocaleList.c;
                LocaleList localeList2 = (u890.j(obj42, bool4) || obj42 == null) ? null : (LocaleList) jf41.A.b.invoke(obj42);
                Object obj43 = list9.get(11);
                u890.j(obj43, bool4);
                if (obj43 == null) {
                    u7hVar2 = null;
                } else if (obj43.equals(bool4)) {
                    int i7 = u7h.l;
                    u7hVar2 = new u7h(nfb.p());
                } else {
                    u7hVar2 = new u7h(z4p1.e(((Integer) obj43).intValue()));
                }
                u7hVar2.getClass();
                long j5 = u7hVar2.a;
                Object obj44 = list9.get(12);
                TextDecoration textDecoration = (u890.j(obj44, bool4) || obj44 == null) ? null : (TextDecoration) jf41.k.b.invoke(obj44);
                Object obj45 = list9.get(13);
                Shadow shadow = Shadow.d;
                df41 df41Var8 = jf41.q;
                if (!u890.j(obj45, bool4) && obj45 != null) {
                    kjc0Var = (Shadow) df41Var8.b.invoke(obj45);
                }
                return new zma1(j2, j3, fontWeight2, fontStyle, fontSynthesis, (FontFamily) null, str3, j4, baselineShift, textGeometricTransform, localeList2, j5, textDecoration, (Shadow) kjc0Var, (PlatformSpanStyle) null, 49184);
            case 19:
                return rih1.a;
            default:
                List list10 = (List) obj;
                Object obj46 = list10.get(0);
                df41 df41Var9 = jf41.a;
                Boolean bool5 = Boolean.FALSE;
                af5 af5Var = (u890.j(obj46, bool5) || obj46 == null) ? null : (af5) df41Var9.b.invoke(obj46);
                af5Var.getClass();
                Object obj47 = list10.get(1);
                int i8 = nbe1.c;
                nbe1 nbe1Var = (u890.j(obj47, bool5) || obj47 == null) ? null : (nbe1) jf41.f53p.b.invoke(obj47);
                nbe1Var.getClass();
                return new c8e1(af5Var, nbe1Var.a, (nbe1) null);
        }
    }
}
