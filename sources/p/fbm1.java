package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbm1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbm1(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wbm1 wbm1Var;
        long j;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                bbm1 bbm1Var = (bbm1) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                rwj rwjVar = (rwj) obj6;
                x340 x340Var = (b0k) obj4;
                boolean zI = x340Var.i(rwjVar);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new ebm1(rwjVar, (byte) 2);
                    x340Var.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                boolean zI2 = x340Var.i(bbm1Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new f2m1(bbm1Var, iu30Var, (byte) 11);
                    x340Var.s0(objT2);
                }
                dm5.a(iu30Var2, qim0VarF, (iu30) objT2, x340Var, 0, 0);
                break;
            case 1:
                x340 x340Var2 = (b0k) obj4;
                ((Number) obj5).intValue();
                l7e0 l7e0Var = ((hwq) obj2).g;
                String strY0 = "";
                if (l7e0Var instanceof j7e0) {
                    zuc0 zuc0Var = ((j7e0) l7e0Var).a;
                    lkj0 lkj0Var = zuc0Var.p;
                    Map map = zuc0Var.g;
                    fjf1 fjf1Var = lkj0Var instanceof fjf1 ? (fjf1) lkj0Var : null;
                    if (fjf1Var != null) {
                        List list = fjf1Var.b;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((yif1) it.next()).a);
                        }
                        strY0 = o7h.y0(arrayList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    }
                    String str = (String) map.get("playCount");
                    wbm1Var = new wbm1(strY0, str != null ? Integer.parseInt(str) : 0, u890.j(map.get("isFirstStreamedTrack"), "true"));
                } else {
                    wbm1Var = new wbm1("", 0, false);
                }
                frl1 frl1Var = (frl1) ((lna0) obj6).d;
                x340 x340Var3 = x340Var2;
                x340Var3.i0(-1939482736);
                le30 le30Var = (le30) f4p1.j(new vlj1(((roc0) ((koc0) frl1Var.b)).d(), frl1Var, (byte) 17), (Object) null, (iac0) null, x340Var3, 48, 14).getValue();
                int i = le30Var == null ? -1 : sem1.a[le30Var.ordinal()];
                if (i == -1) {
                    j = u7h.j;
                } else if (i == 1) {
                    uwr uwrVar = cbx.a;
                    j = ((vex) zex.a.b).m;
                } else if (i != 2) {
                    uwr uwrVar2 = cbx.a;
                    j = ((xex) ((gmt) zex.a.c).b).A;
                } else {
                    j = uem1.a;
                }
                x340Var3.r(false);
                don1.j(wbm1Var, j, x340Var2, 0);
                break;
            case 2:
                gym1 gym1Var = (gym1) obj2;
                ((Number) obj5).intValue();
                x340 x340Var4 = (b0k) obj4;
                wat watVar = (wat) x340Var4.k(t4k.h);
                yae1 yae1VarQ = d5p1.q(0, x340Var4, 1);
                x340Var4.i0(2024317998);
                x340Var4.r(false);
                String strConcat = "ff".concat(ihc1.H0(gym1Var.b, "#").toLowerCase(Locale.ROOT));
                eth.h(16);
                w2g0.c(u291.f(nim0Var, 1.0f), (tl3) null, apo.r(-86309826, new jna(gym1Var, watVar, yae1VarQ, (iu30) obj3, (hym1) obj6, z4p1.g(Long.parseLong(strConcat, 16))), x340Var4), x340Var4, 3072, 6);
                break;
            case 3:
                uzm1 uzm1Var = (uzm1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var5 = (b0k) obj4;
                View view = (View) x340Var5.k(AndroidCompositionLocals_androidKt.f);
                String str2 = uzm1Var.a;
                String str3 = uzm1Var.b;
                String str4 = uzm1Var.c;
                vzm1 vzm1Var = (vzm1) obj6;
                boolean zBooleanValue = ((Boolean) vzm1Var.e.getValue()).booleanValue();
                boolean z = (((iIntValue2 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT3 = x340Var5.T();
                if (z || objT3 == m4cVar2) {
                    objT3 = new wel1(iu30Var3, (byte) 18);
                    x340Var5.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean zI3 = x340Var5.i(vzm1Var) | x340Var5.i(view);
                Object objT4 = x340Var5.T();
                if (zI3 || objT4 == m4cVar2) {
                    objT4 = new f2m1(vzm1Var, view, (byte) 19);
                    x340Var5.s0(objT4);
                }
                crn1.e(str2, str3, str4, zBooleanValue, function0, ern1.x(nim0Var, (iu30) objT4), x340Var5, 0);
                break;
            case 4:
                xzm1 xzm1Var = (xzm1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                es41 es41Var = xzm1Var.c;
                x340 x340Var6 = (b0k) obj4;
                float fX0 = ((wat) x340Var6.k(t4k.h)).X0(48.0f);
                yzm1 yzm1Var = (yzm1) obj6;
                boolean zI4 = x340Var6.i(yzm1Var);
                Object objT5 = x340Var6.T();
                if (zI4 || objT5 == m4cVar3) {
                    objT5 = new vbc1(yzm1Var, (lnm) null, (byte) 28);
                    x340Var6.s0(objT5);
                }
                qxd0.t(rih1Var, x340Var6, (vu30) objT5);
                String str5 = xzm1Var.a;
                String str6 = xzm1Var.b;
                int iS = es41Var.a.s();
                float fMin = Math.min(fX0, es41Var.f.s());
                float fO = fMin > 0.0f ? yoi1.o(iS / fMin, 0.0f, 1.0f) : 0.0f;
                boolean zBooleanValue2 = ((Boolean) yzm1Var.e.getValue()).booleanValue();
                j2i j2iVar = dtj.a;
                boolean z2 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                Object objT6 = x340Var6.T();
                if (z2 || objT6 == m4cVar3) {
                    objT6 = new wel1(iu30Var4, (byte) 19);
                    x340Var6.s0(objT6);
                }
                i1p1.m(str5, str6, fO, zBooleanValue2, (Function0) objT6, (qim0) null, x340Var6, 24576);
                break;
            default:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                bzn1.e((qim0) null, (vu30) null, false, apo.r(-1904742524, new z2n1((e3n1) obj6, (iu30) obj3), b0kVar), (sgr0) null, (ngr0) null, (ygr0) null, (Function0) null, b0kVar, 3072, 247);
                break;
        }
        return rih1Var;
    }
}
