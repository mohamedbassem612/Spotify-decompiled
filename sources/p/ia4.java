package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ia4 implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ia4(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) throws Throwable {
        u7h u7hVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zma1Var = null;
        zma1 zma1Var = null;
        switch (b) {
            case 0:
                return Boolean.valueOf(zko1.m((v161) obj));
            case 1:
                xos0 xos0Var = (xos0) obj;
                kiv kivVar = AndroidCompositionLocals_androidKt.a;
                xos0Var.getClass();
                d7e.x(xos0Var, kivVar);
                return ((Context) d7e.x(xos0Var, AndroidCompositionLocals_androidKt.b)).getResources();
            case 2:
                return rih1Var;
            case 3:
                return (mi7) obj;
            case 4:
                xos0 xos0Var2 = (xos0) obj;
                kiv kivVar2 = AndroidCompositionLocals_androidKt.b;
                xos0Var2.getClass();
                if (((Context) d7e.x(xos0Var2, kivVar2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return r5c.b;
                }
                p5c.a.getClass();
                return o5c.c;
            case 5:
                hzj hzjVar = (hzj) obj;
                hmb0 hmb0Var = hzjVar instanceof hmb0 ? (hmb0) hzjVar : null;
                if (hmb0Var != null && hmb0Var.p1) {
                    qf80.c("Apply is called on deactivated node " + hzjVar);
                }
                return rih1Var;
            case 6:
                xos0 xos0Var3 = (xos0) obj;
                kiv kivVar3 = t4k.o;
                xos0Var3.getClass();
                return (ehe0) o7h.p0((Iterable) d7e.x(xos0Var3, kivVar3));
            case 7:
                List list = (List) obj;
                return new kes(((Integer) list.get(0)).intValue(), ((Float) list.get(1)).floatValue(), new jes(list, (byte) 0));
            case 8:
                return rih1Var;
            case 9:
                neg negVar = (neg) obj;
                neg.b(negVar, "JsonPrimitive", dem1.q(new el70((byte) 5)), 12);
                neg.b(negVar, "JsonNull", dem1.q(new el70((byte) 6)), 12);
                neg.b(negVar, "JsonLiteral", dem1.q(new el70((byte) 7)), 12);
                neg.b(negVar, "JsonObject", dem1.q(new el70((byte) 8)), 12);
                neg.b(negVar, "JsonArray", dem1.q(new el70((byte) 9)), 12);
                return rih1Var;
            case 10:
                List list2 = (List) obj;
                return new xtb0(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 11:
                ndo0 ndo0Var = (ndo0) obj;
                hmb0 hmb0Var2 = ndo0Var.U0;
                try {
                    if (ndo0Var.B0()) {
                        ndo0Var.N1(true);
                        break;
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    hmb0Var2.Z(th);
                    throw null;
                }
            case 12:
                mxq0 mxq0Var = ((ndo0) obj).v1;
                if (mxq0Var != null) {
                    ((ge50) mxq0Var).c();
                }
                return rih1Var;
            case 13:
                xos0 xos0Var4 = (xos0) obj;
                int i = gw4.a;
                kiv kivVar4 = AndroidCompositionLocals_androidKt.b;
                xos0Var4.getClass();
                Context context = (Context) d7e.x(xos0Var4, kivVar4);
                wat watVar = (wat) d7e.x(xos0Var4, t4k.h);
                fxq0 fxq0Var = (fxq0) d7e.x(xos0Var4, gxq0.a);
                if (fxq0Var == null) {
                    return null;
                }
                return new ce4(context, watVar, fxq0Var.a, fxq0Var.b);
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return new ld41((Map) obj);
            case 17:
                return obj;
            case 18:
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                iu30 iu30Var = jf41.i.b;
                Boolean bool = Boolean.FALSE;
                zma1 zma1Var2 = (u890.j(obj2, bool) || obj2 == null) ? null : (zma1) iu30Var.invoke(obj2);
                Object obj3 = list3.get(1);
                zma1 zma1Var3 = (u890.j(obj3, bool) || obj3 == null) ? null : (zma1) iu30Var.invoke(obj3);
                Object obj4 = list3.get(2);
                zma1 zma1Var4 = (u890.j(obj4, bool) || obj4 == null) ? null : (zma1) iu30Var.invoke(obj4);
                Object obj5 = list3.get(3);
                if (!u890.j(obj5, bool) && obj5 != null) {
                    zma1Var = (zma1) iu30Var.invoke(obj5);
                }
                return new pae1(zma1Var2, zma1Var3, zma1Var4, zma1Var);
            case 19:
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                List list5 = (u890.j(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) jf41.b.b.invoke(obj6);
                Object obj7 = list4.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new af5(list5, str);
            case 20:
                return new TextDecoration(((Integer) obj).intValue());
            case 21:
                List list6 = (List) obj;
                return new TextGeometricTransform(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 22:
                List list7 = (List) obj;
                Object obj8 = list7.get(0);
                wee1[] wee1VarArr = TextUnit.b;
                iu30 iu30Var2 = jf41.x.b;
                Boolean bool2 = Boolean.FALSE;
                u890.j(obj8, bool2);
                TextUnit textUnit = obj8 != null ? (TextUnit) iu30Var2.invoke(obj8) : null;
                textUnit.getClass();
                long j = textUnit.a;
                Object obj9 = list7.get(1);
                u890.j(obj9, bool2);
                TextUnit textUnit2 = obj9 != null ? (TextUnit) iu30Var2.invoke(obj9) : null;
                textUnit2.getClass();
                return new u8e1(j, textUnit2.a);
            case 23:
                return new FontWeight(((Integer) obj).intValue());
            case 24:
                return new BaselineShift(((Float) obj).floatValue());
            case 25:
                List list8 = (List) obj;
                Object obj10 = list8.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list8.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new nbe1(e6p1.e(iIntValue, num2.intValue()));
            case 26:
                List list9 = (List) obj;
                Object obj12 = list9.get(0);
                int i2 = u7h.l;
                Boolean bool3 = Boolean.FALSE;
                u890.j(obj12, bool3);
                if (obj12 == null) {
                    u7hVar = null;
                } else if (obj12.equals(bool3)) {
                    int i3 = u7h.l;
                    u7hVar = new u7h(nfb.p());
                } else {
                    u7hVar = new u7h(z4p1.e(((Integer) obj12).intValue()));
                }
                u7hVar.getClass();
                long j2 = u7hVar.a;
                Object obj13 = list9.get(1);
                if41 if41Var = jf41.z;
                u890.j(obj13, bool3);
                Offset offset = obj13 != null ? (Offset) if41Var.b.invoke(obj13) : null;
                offset.getClass();
                long j3 = offset.a;
                Object obj14 = list9.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new Shadow(f.floatValue(), j2, j3);
            case 27:
                return new a0e1(((Integer) obj).intValue());
            case 28:
                List list10 = (List) obj;
                Object obj15 = list10.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list10.get(1);
                return new ljc0(str2, (u890.j(obj16, Boolean.FALSE) || obj16 == null) ? null : (pae1) jf41.j.b.invoke(obj16), (rjc0) null, 4);
            default:
                return z3e1.a(((Integer) obj).intValue());
        }
    }
}
