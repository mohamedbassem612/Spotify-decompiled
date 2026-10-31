package p;

import android.content.res.Resources;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xyh extends hab0 implements bv30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyh(Object obj, byte b) {
        super(5);
        this.a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        zzq0 zzq0Var;
        s7k0 s7k0Var = (s7k0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = s7k0Var.f;
        Float f = s7k0Var.a;
        gbx gbxVar = null;
        if (f != null) {
            str = jch0.U(f.floatValue()) + " bpm";
        } else {
            str = null;
        }
        String str2 = s7k0Var.b;
        jfv jfvVar = s7k0Var.e;
        x340 x340Var2 = x340Var;
        Resources resources = (Resources) x340Var2.k(AndroidCompositionLocals_androidKt.c);
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        boolean z2 = true;
        if (objT == m4cVar) {
            objT = new ogv(resources, (byte) 1);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        x340Var2.i0(1243649967);
        smc0 smc0VarN = k4p1.n();
        if (str != null) {
            smc0VarN.add(str);
        }
        if (str2 == null) {
            x340Var2.i0(-246502796);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-246502795);
            smc0VarN.add(cwl1.n0(2131958852, new Object[]{str2}, x340Var2));
            x340Var2.r(false);
        }
        if (jfvVar != null) {
            smc0VarN.add(((rle1) iu30Var2.invoke(jfvVar)).b);
        }
        if (z) {
            x340Var2.i0(-246283501);
            smc0VarN.add(cwl1.o0(x340Var2, 2131958614));
            x340Var2.r(false);
        } else {
            x340Var2.i0(-246178752);
            x340Var2.r(false);
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        x340Var2.r(false);
        String strY0 = o7h.y0(smc0VarK, ", ", (String) null, (String) null, (iu30) null, 62);
        boolean zG = x340Var2.g(strY0);
        Object objT2 = x340Var2.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new fki0(strY0, (byte) 11);
            x340Var2.s0(objT2);
        }
        qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT2);
        if (s7k0Var.c.b == null) {
            x340Var2.i0(-1702627260);
            x340Var2.r(false);
            zzq0Var = uyn1.h(3, 0.0f, 0.0f);
        } else {
            x340Var2.i0(-1702625597);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            zzq0Var = new zzq0(6.0f, 6.0f, 6.0f, 6.0f);
            x340Var2.r(false);
        }
        zzq0 zzq0Var2 = zzq0Var;
        if (z && s7k0Var.g) {
            x340Var2.i0(-1702620036);
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z2 = false;
            }
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new stj0(iu30Var, (byte) 16);
                x340Var2.s0(objT3);
            }
            gbxVar = new gbx(z50.c, (Function0) objT3);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1241526360);
            x340Var2.r(false);
        }
        cwl1.b(qim0VarB, (tl3) null, (hw61) null, (pgx) null, zzq0Var2, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1895520290, new x9g0(str, s7k0Var, (byte) 27), x340Var2), x340Var2, 0, 48, 1518);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qix qixVar;
        xhn0 xhn0Var = (xhn0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        c380 c380Var = xhn0Var.a;
        Enum r0 = xhn0Var.b;
        if (r0 == null || !c380Var.contains(r0)) {
            r0 = null;
        }
        x340 x340Var2 = x340Var;
        x340Var2.i0(-1538217138);
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (true) {
            int i = 2131959083;
            if (!it.hasNext()) {
                x340Var2.r(false);
                if (r0 == null) {
                    x340Var2.i0(-439919125);
                    x340Var2.r(false);
                    qixVar = qix.a;
                } else {
                    x340Var2.i0(-439858737);
                    String strName = r0.name();
                    int iOrdinal = r0.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i = 2131959082;
                    }
                    qix rixVar = new rix(new nix(strName, cwl1.o0(x340Var2, i), (c9) null, (String) null, 12));
                    x340Var2.r(false);
                    qixVar = rixVar;
                }
                tix tixVar = new tix(arrayList, qixVar, false, 60);
                boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new wck0(iu30Var, (byte) 8);
                    x340Var2.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                pro1.f(tixVar, iu30Var2, null, uyn1.h(1, 0.0f, 12.0f), x340Var2, 0, 20);
                return rih1.a;
            }
            shn0 shn0Var = (shn0) it.next();
            int iOrdinal2 = shn0Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                i = 2131959082;
            }
            arrayList.add(new nix(shn0Var.name(), cwl1.o0(x340Var2, i), (c9) null, (String) null, 12));
        }
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object next;
        fpp0 fpp0Var = (fpp0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        List list = fpp0Var.a;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(fpp0Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new j9n0(iu30Var, fpp0Var, (byte) 25);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        if (list.isEmpty()) {
            x340Var2.i0(1376177813);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1375851073);
            List<l820> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (l820 l820Var : list2) {
                arrayList.add(new nix(l820Var.b, l820Var.a, (c9) null, (String) null, 12));
            }
            c9 c9VarF = mqo1.F(arrayList);
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l820) next).c);
            l820 l820Var2 = (l820) next;
            tix tixVar = new tix(c9VarF, l820Var2 != null ? new rix(new nix(l820Var2.b, l820Var2.a, (c9) null, (String) null, 12)) : qix.a, false, 60);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            pro1.f(tixVar, iu30Var2, null, uyn1.j(16.0f, 0.0f, 16.0f, 8.0f, 2), x340Var2, 0, 20);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        lp61 lp61Var = (lp61) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(lp61Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            String strB = lp61Var.b(x340Var2);
            strB.getClass();
            if5 if5Var = (if5) lp61Var.g.getValue();
            mxn0 mxn0Var = lp61Var.f.b;
            if (mxn0Var instanceof nxn0) {
                z = false;
            } else if (mxn0Var instanceof oxn0) {
                z = true;
            } else {
                if (!(mxn0Var instanceof mxn0)) {
                    eg.o();
                    return null;
                }
                z = mxn0Var.a;
            }
            String strO0 = cwl1.o0(x340Var2, 2131961699);
            int i2 = i & 896;
            boolean zI = ((i & 112) == 32) | x340Var2.i(c9nVar) | (i2 == 256);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new pcp0(c9nVar, iu30Var, lp61Var, (byte) 15);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            lax laxVar = lp61Var.b;
            if5 if5Var2 = (if5) lp61Var.h.getValue();
            boolean z2 = i2 == 256;
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new wck0(iu30Var, (byte) 25);
                x340Var2.s0(objT3);
            }
            uyn1.e(strB, if5Var, z, gbxVar, (iu30) objT3, null, if5Var2, laxVar, x340Var2, 2097216, 32);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        lp61 lp61Var = (lp61) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(lp61Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean zU = wxo1.u(lp61Var);
            String strB = lp61Var.b(x340Var2);
            strB.getClass();
            if5 if5Var = (if5) lp61Var.g.getValue();
            String strH0 = d520.h0(zU, x340Var2);
            int i2 = i & 896;
            boolean zH = (i2 == 256) | x340Var2.h(zU);
            Object objT = x340Var2.T();
            if (zH || objT == m4cVar) {
                objT = new z20(iu30Var, zU, (byte) 23);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strH0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(strH0), function0);
            lax laxVar = lp61Var.b;
            if5 if5Var2 = (if5) lp61Var.h.getValue();
            boolean z = i2 == 256;
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new wck0(iu30Var, (byte) 26);
                x340Var2.s0(objT2);
            }
            vxo1.g(strB, if5Var, zU, gbxVar, (iu30) objT2, null, if5Var2, laxVar, x340Var2, 2097216, 32);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c9 c9VarS;
        c9 c9VarS2;
        lbt0 lbt0Var = (lbt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        c10 c10VarE = yas0.e(lbt0Var);
        String strO0 = cwl1.o0(x340Var, 2131959784);
        nk nkVar = lbt0Var.b;
        String str = nkVar.b;
        long j = nkVar.e;
        int i = nkVar.a;
        c9 c9Var = fg91.b;
        if (i == 1) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1213021559);
            c9VarS = mqo1.s(new c10(cwl1.n0(2131959779, new Object[]{DateFormat.getDateInstance(3).format(new Date(j))}, x340Var2), 124, (String) null, (String) null, false, (String) null));
            x340Var2.r(false);
        } else if (i == 2) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1212661401);
            c9VarS = mqo1.s(new c10(cwl1.n0(2131959780, new Object[]{DateFormat.getDateInstance(3).format(new Date(j))}, x340Var3), 124, (String) null, (String) null, false, (String) null));
            x340Var3.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1212369257);
            x340Var4.r(false);
            c9VarS = c9Var;
        }
        c9 c9Var2 = (c10VarE == null || (c9VarS2 = mqo1.s(c10VarE)) == null) ? c9Var : c9VarS2;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var5 = x340Var;
        Object objT = x340Var5.T();
        if (z || objT == fkj0.X) {
            objT = new azr0(iu30Var, (byte) 3);
            x340Var5.s0(objT);
        }
        z5p1.c(strO0, null, str, c9VarS, c9Var2, (iu30) objT, x340Var5, 0, 2);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        w521 w521Var;
        jax haxVar;
        v521 v521Var = (v521) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(v521Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            int iC = l1d.C(v521Var.d);
            String strK = null;
            if (iC == 0) {
                w521Var = new w521(2131958488, 2131958487, (Integer) null);
            } else if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                w521Var = new w521(2131958488, 2131958487, (Integer) null);
            } else {
                w521Var = new w521(2131958490, 2131958486, 2131958489);
            }
            String strO0 = cwl1.o0(x340Var2, w521Var.a);
            String strO1 = cwl1.o0(x340Var2, w521Var.b);
            Integer num = w521Var.c;
            if (num == null) {
                x340Var2.i0(763821720);
                x340Var2.r(false);
            } else {
                strK = kk0.k(x340Var2, 763821721, num, x340Var2, false);
            }
            String str = strK;
            if (v521Var.e) {
                x340Var2.i0(1039750608);
                haxVar = new hax(cwl1.o0(x340Var2, 2131958466));
                x340Var2.r(false);
            } else {
                x340Var2.i0(1039708975);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            jax jaxVar = haxVar;
            qim0 qim0VarN = anm1.N("remove-account-row", nim0.a);
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new n601(iu30Var, (byte) 9);
                x340Var2.s0(objT);
            }
            cso1.o(strO0, strO1, qim0VarN, str, jaxVar, (iu30) objT, x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        jax haxVar;
        n921 n921Var = (n921) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(n921Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            String strO0 = cwl1.o0(x340Var2, 2131951736);
            String strO1 = cwl1.o0(x340Var2, 2131951734);
            String strO2 = cwl1.o0(x340Var2, 2131951735);
            if (n921Var.c) {
                x340Var2.i0(-1166244715);
                haxVar = new hax(cwl1.o0(x340Var2, 2131951728));
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1166286379);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            jax jaxVar = haxVar;
            qim0 qim0VarN = anm1.N("remove-member-button-element", nim0.a);
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new dv11(iu30Var, (byte) 14);
                x340Var2.s0(objT);
            }
            gxo1.a(strO0, strO1, qim0VarN, strO2, jaxVar, (Function0) objT, x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        String strValueOf;
        jo70 jo70Var = (jo70) obj;
        xkk1 xkk1Var = (xkk1) obj2;
        hll hllVar = (hll) obj3;
        qtt0 qtt0Var = (qtt0) obj4;
        zoy0 zoy0Var = (zoy0) obj5;
        int i = 3;
        if (hllVar != null) {
            List list = hllVar.b;
            if (list.contains(ell.d)) {
                i = 1;
            } else if (list.contains(ell.b)) {
                i = 2;
            }
        }
        int i2 = i;
        String str2 = null;
        if (zoy0Var != null) {
            voy0 voy0Var = (yoy0) zoy0Var.b.b;
            if (voy0Var instanceof voy0) {
                strValueOf = String.valueOf(voy0Var.a);
            } else if (voy0Var instanceof woy0) {
                strValueOf = String.valueOf(((woy0) voy0Var).a);
            } else {
                strValueOf = voy0Var instanceof xoy0 ? String.valueOf(((xoy0) voy0Var).a) : null;
            }
            str = strValueOf;
        } else {
            str = null;
        }
        String str3 = jo70Var.a;
        List list2 = jo70Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ho70) it.next()).a);
        }
        if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
            str2 = up70VarA.a.a;
        }
        return new q9a1(str3, arrayList, str2, i2, qtt0Var, str);
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        lp61 lp61Var = (lp61) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(lp61Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean zU = wxo1.u(lp61Var);
            String strH0 = d520.h0(zU, x340Var2);
            int i2 = i & 896;
            boolean zH = (i2 == 256) | x340Var2.h(zU);
            Object objT = x340Var2.T();
            if (zH || objT == m4cVar) {
                objT = new ag21(iu30Var, zU, (byte) 3);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strH0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(strH0), function0);
            jp61 jp61Var = lp61Var.a;
            iox ioxVar = jp61Var.b.b != null ? iox.c : null;
            if (ioxVar == null) {
                ioxVar = ((eez0) jp61Var.d).a;
            }
            iox ioxVar2 = ioxVar;
            String strA = lp61Var.a(x340Var2);
            strA.getClass();
            boolean z = lp61Var.b instanceof iax;
            pm31 pm31Var = new pm31(2);
            boolean zG = x340Var2.g(gbxVar);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new o70(gbxVar, (byte) 5);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarD = qmo1.D(nim0.a, zU, z, pm31Var, (iu30) objT2, 8);
            String strK = zU ? x0d.k(x340Var2, 1579666954, 2131962133, x340Var2, false) : x0d.k(x340Var2, 1579669515, 2131962132, x340Var2, false);
            lax laxVar = lp61Var.b;
            boolean z2 = i2 == 256;
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new b1c1(iu30Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            iko1.m(ioxVar2, strA, qim0VarD, zU, strK, laxVar, gbxVar, (iu30) objT3, x340Var2, 8, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        jax haxVar;
        wkg1 wkg1Var = (wkg1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(wkg1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            String strO0 = cwl1.o0(x340Var2, 2131958497);
            String strO1 = cwl1.o0(x340Var2, 2131958496);
            String strO2 = cwl1.o0(x340Var2, 2131958495);
            if (wkg1Var.b) {
                x340Var2.i0(2134262020);
                haxVar = new hax(cwl1.o0(x340Var2, 2131958466));
                x340Var2.r(false);
            } else {
                x340Var2.i0(2134220387);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            cso1.o(strO0, strO2, null, strO1, haxVar, iu30Var, x340Var2, (i << 9) & 458752, 4);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        jax haxVar;
        vkg1 vkg1Var = (vkg1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(vkg1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            String strO0 = cwl1.o0(x340Var2, 2131961020);
            String strO1 = cwl1.o0(x340Var2, 2131961019);
            String strO2 = cwl1.o0(x340Var2, 2131961018);
            if (vkg1Var.b) {
                x340Var2.i0(1693333537);
                haxVar = new hax(cwl1.o0(x340Var2, 2131961010));
                x340Var2.r(false);
            } else {
                x340Var2.i0(1693290788);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            jax jaxVar = haxVar;
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new fgf1(iu30Var, (byte) 9);
                x340Var2.s0(objT);
            }
            gxo1.a(strO0, strO2, null, strO1, jaxVar, (Function0) objT, x340Var2, 0, 4);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:145:0x02eb  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        long j;
        int i3;
        jax haxVar;
        String strK;
        m4c m4cVar;
        yvg1 yvg1Var;
        int i4;
        int i5;
        int i6;
        ebf0 ebf0Var;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        c380 c380VarValueOf = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, uyn1.z(0.0f, 16.0f, 1, qim0VarF));
                int i7 = iIntValue >> 6;
                m4c m4cVar2 = fkj0.X;
                String strO0 = cwl1.o0(x340Var, 2131953562);
                String strO1 = cwl1.o0(x340Var, 2131953563);
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                int i8 = (i7 & 14) ^ 6;
                boolean z2 = (i8 > 4 && x340Var.g(iu30Var)) || (i7 & 6) == 4;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar2) {
                    objT = new wqf(iu30Var, (byte) 11);
                    x340Var2.s0(objT);
                }
                hhg hhgVar = new hhg(strO1, "https://www.spotify.com/platform-rules/plain", zma1Var, (iu30) objT);
                String strO2 = cwl1.o0(x340Var2, 2131953564);
                String strO3 = cwl1.o0(x340Var2, 2131963149);
                zma1 zma1Var2 = new zma1(cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                if ((i8 <= 4 || !x340Var2.g(iu30Var)) && (i7 & 6) != 4) {
                    z = false;
                }
                Object objT2 = x340Var2.T();
                if (z || objT2 == m4cVar2) {
                    objT2 = new wqf(iu30Var, (byte) 12);
                    x340Var2.s0(objT2);
                }
                uwo1.d(ot11.w(strO0, new hhg[]{hhgVar, new hhg(strO2, strO3, zma1Var2, (iu30) objT2)}), cbx.a(x340Var).b.b, qim0VarZ, cbx.d(x340Var).m, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, 0, 0, 4064);
                return rih1Var;
            case 1:
                ksw kswVar = (ksw) obj;
                lp61 lp61Var = (lp61) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var3.g(kswVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var3.g(lp61Var) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= x340Var3.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i & 1, (i & 1171) != 1170)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                lp61Var.b(x340Var4);
                Object obj6 = lp61Var.a.d;
                bhn0.d();
                return null;
            case 2:
                ksw kswVar2 = (ksw) obj;
                lp61 lp61Var2 = (lp61) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (x340Var5.g(kswVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= x340Var5.g(lp61Var2) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i2 |= x340Var5.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                wxo1.u(lp61Var2);
                lp61Var2.b(x340Var6);
                Object obj7 = lp61Var2.a.d;
                bhn0.d();
                return null;
            case 3:
                a691 a691Var = (a691) obj2;
                ((Number) obj5).intValue();
                x340 x340Var7 = (b0k) obj4;
                cir0 cir0Var = (cir0) x340Var7.k(k2r0.a);
                Object objT3 = x340Var7.T();
                Object obj8 = fkj0.X;
                if (objT3 == obj8) {
                    objT3 = qxd0.M(o6x.a, x340Var7);
                    x340Var7.s0(objT3);
                }
                c9n c9nVar = (c9n) objT3;
                ven0 ven0VarS = v8r.s(a691Var.b, x340Var7);
                boolean zG = x340Var7.g(cir0Var);
                Object objT4 = x340Var7.T();
                if (zG || objT4 == obj8) {
                    objT4 = new fqs(new m3n(c9nVar, ven0VarS, cir0Var, (byte) 12));
                    x340Var7.s0(objT4);
                }
                fqs fqsVar = (fqs) objT4;
                Object objT5 = x340Var7.T();
                if (objT5 == obj8) {
                    objT5 = p7h.M(new qpq0[]{new qpq0(r591.b, 2131962547, 2131962546, new p591(ksx.c)), new qpq0(r591.c, 2131962550, 2131962549, new o591())});
                    x340Var7.s0(objT5);
                }
                List list = (List) objT5;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var7).b;
                zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                WeakHashMap weakHashMap = osl1.x;
                hdh hdhVarN = lnn1.n(zzq0Var, hqq0.C(lhc.g(x340Var7).g, x340Var7));
                cvx cvxVar3 = cbx.b(x340Var7).b;
                d36 d36Var = new d36(4.0f, true, new um5(false));
                boolean zI = x340Var7.i(list) | x340Var7.i(fqsVar) | x340Var7.i(a691Var);
                Object objT6 = x340Var7.T();
                if (zI || objT6 == obj8) {
                    objT6 = new m3n(list, fqsVar, a691Var, (byte) 11);
                    x340Var7.s0(objT6);
                }
                s3o1.d(qim0VarF2, null, hdhVarN, d36Var, null, null, false, null, (iu30) objT6, x340Var7, 0, 490);
                return rih1Var;
            case 4:
                ttk1 ttk1Var = (ttk1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                ke71 ke71Var = ttk1Var.d;
                x340 x340Var8 = (b0k) obj4;
                int i9 = (iIntValue4 & 896) ^ 384;
                boolean zI2 = x340Var8.i(ttk1Var) | ((i9 > 256 && x340Var8.g(iu30Var4)) || (iIntValue4 & 384) == 256);
                Object objT7 = x340Var8.T();
                if (zI2 || objT7 == m4cVar3) {
                    objT7 = new n5s(ttk1Var, iu30Var4, (lnm) null, (byte) 13);
                    x340Var8.s0(objT7);
                }
                qxd0.t(ke71Var, x340Var8, (vu30) objT7);
                float f = ttk1Var.a;
                String str2 = ttk1Var.b;
                int iC = l1d.C(ttk1Var.c);
                if (iC == 0) {
                    x340Var8.i0(883115205);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var8).b.a;
                    x340Var8.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var8, 883113224, false);
                    }
                    x340Var8.i0(883117000);
                    uwr uwrVar4 = cbx.a;
                    j = cbx.a(x340Var8).b.b;
                    x340Var8.r(false);
                }
                long j2 = j;
                boolean z3 = (i9 > 256 && x340Var8.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT8 = x340Var8.T();
                if (z3 || objT8 == m4cVar3) {
                    objT8 = new hws(iu30Var4, (byte) 2);
                    x340Var8.s0(objT8);
                }
                iu30 iu30Var5 = (iu30) objT8;
                boolean z4 = (i9 > 256 && x340Var8.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT9 = x340Var8.T();
                if (z4 || objT9 == m4cVar3) {
                    objT9 = new hbs(iu30Var4, (byte) 12);
                    x340Var8.s0(objT9);
                }
                Function0 function0 = (Function0) objT9;
                if ((i9 <= 256 || !x340Var8.g(iu30Var4)) && (iIntValue4 & 384) != 256) {
                    z = false;
                }
                Object objT10 = x340Var8.T();
                if (z || objT10 == m4cVar3) {
                    objT10 = new hbs(iu30Var4, (byte) 13);
                    x340Var8.s0(objT10);
                }
                foo1.n(f, str2, j2, iu30Var5, function0, (Function0) objT10, null, ttk1Var.e, ttk1Var.f, x340Var8, 0);
                return rih1Var;
            case 5:
                j6t j6tVar = (j6t) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    i3 = iIntValue5 | (x340Var9.g(j6tVar) ? 32 : 16);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i3 |= x340Var9.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String strO4 = cwl1.o0(x340Var10, 2131958102);
                    String strO5 = cwl1.o0(x340Var10, 2131958100);
                    String str3 = j6tVar.c;
                    if (j6tVar.b) {
                        x340Var10.i0(-562266927);
                        x340Var10.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var10.i0(-562223961);
                        if (str3 == null) {
                            strK = x0d.k(x340Var10, -156681681, 2131958099, x340Var10, false);
                        } else {
                            x340Var10.i0(-156682394);
                            x340Var10.r(false);
                            strK = str3;
                        }
                        haxVar = new hax(strK);
                        x340Var10.r(false);
                    }
                    jax jaxVar = haxVar;
                    qim0 qim0VarN = anm1.N("delete-account-row", nim0Var);
                    z = (i3 & 896) == 256;
                    Object objT11 = x340Var10.T();
                    if (z || objT11 == fkj0.X) {
                        objT11 = new hbs(iu30Var6, (byte) 15);
                        x340Var10.s0(objT11);
                    }
                    gxo1.a(strO4, strO5, qim0VarN, str3, jaxVar, (Function0) objT11, x340Var10, 384, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj5).intValue();
                String str4 = ((s7u) obj2).a;
                x340 x340Var11 = (b0k) obj4;
                boolean zG2 = x340Var11.g(rc11.a.b(wna0.class));
                Object objT12 = x340Var11.T();
                if (zG2 || objT12 == (m4cVar = fkj0.X)) {
                    eg.m("Stub implementation - element should not be created when shouldShow returns false");
                    return null;
                }
                xpw xpwVar = (xpw) objT12;
                boolean zG3 = x340Var11.g(str4);
                Object objT13 = x340Var11.T();
                if (zG3 || objT13 == m4cVar) {
                    objT13 = new jf71(str4);
                    x340Var11.s0(objT13);
                }
                jf71 jf71Var = (jf71) objT13;
                otw.c(xpwVar, jf71Var, (qim0) null, wpb1.C("disclosure_section_element", xpwVar, jf71Var, x340Var11, 6, 8), x340Var11, 0, 4);
                return rih1Var;
            case 7:
                xp00 xp00Var = (yp00) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                x340 x340Var13 = x340Var12;
                x340Var13.i0(877848731);
                z47.j(xp00Var instanceof xp00, x340Var13, 0);
                x340Var13.r(false);
                if (xp00Var instanceof xp00) {
                    x340 x340Var14 = x340Var12;
                    x340Var14.i0(877975738);
                    xp00 xp00Var2 = xp00Var;
                    int iC2 = l1d.C(xp00Var2.a);
                    if (iC2 == 0) {
                        yvg1Var = new yvg1(ppx.c, 2131954283, up00.a);
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        yvg1Var = new yvg1(opx.c, 2131954281, tp00.a);
                    }
                    hux huxVar = (hux) yvg1Var.a;
                    int iIntValue7 = ((Number) yvg1Var.b).intValue();
                    vp00 vp00Var = (vp00) yvg1Var.c;
                    String strO6 = cwl1.o0(x340Var14, iIntValue7);
                    if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var7)) && (iIntValue6 & 384) != 256) {
                        z = false;
                    }
                    boolean zI3 = x340Var14.i(vp00Var) | z;
                    Object objT14 = x340Var14.T();
                    if (zI3 || objT14 == fkj0.X) {
                        objT14 = new t3x(iu30Var7, vp00Var, (byte) 23);
                        x340Var14.s0(objT14);
                    }
                    wro1.h(new gbx(new y50(strO6), (Function0) objT14), ldx.c, null, xp00Var2.b ? jax.a : new hax(strO6), yla.p(x340Var14).a(), null, false, null, null, apo.r(1202064451, new f90(huxVar, (byte) 11), x340Var14), x340Var14, 0, 6, 972);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var12;
                    x340Var15.i0(878757992);
                    x340Var15.r(false);
                }
                return rih1Var;
            case 8:
                sr00 sr00Var = (sr00) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 48) == 0) {
                    i4 = iIntValue8 | (x340Var16.g(sr00Var) ? 32 : 16);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i4 |= x340Var16.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    uwr uwrVar5 = cbx.a;
                    long j3 = cbx.d(x340Var17).j.a.b;
                    long j4 = cbx.d(x340Var17).j.a.b;
                    Object objT15 = x340Var17.T();
                    m4c m4cVar4 = fkj0.X;
                    if (objT15 == m4cVar4) {
                        objT15 = mqo1.t(new mmr0("explicit-badge-inline-content", new gh80(new d6t0(4, j3, j4), kni.a)));
                        x340Var17.s0(objT15);
                    }
                    cqs0 cqs0Var = (cqs0) objT15;
                    String strO7 = cwl1.o0(x340Var17, 2131951730);
                    String strN0 = cwl1.n0(2131951729, new Object[]{"placeholder"}, x340Var17);
                    int iW0 = ihc1.w0(strN0, "placeholder", 0, false, 6);
                    String strO8 = cwl1.o0(x340Var17, 2131955842);
                    boolean zG4 = x340Var17.g(strN0) | x340Var17.g(strO8);
                    Object objT16 = x340Var17.T();
                    if (zG4 || objT16 == m4cVar4) {
                        ye5 ye5Var = new ye5();
                        ye5Var.g(strN0.substring(0, iW0));
                        z6p1.r(ye5Var, "explicit-badge-inline-content", strO8);
                        ye5Var.f(strN0.subSequence(iW0 + 11, strN0.length()));
                        objT16 = ye5Var.p();
                        x340Var17.s0(objT16);
                    }
                    af5 af5Var = (af5) objT16;
                    boolean z5 = sr00Var.a;
                    boolean z6 = !sr00Var.b;
                    qim0 qim0VarN2 = anm1.N("explicit-content-element", nim0Var);
                    z = (i4 & 896) == 256;
                    Object objT17 = x340Var17.T();
                    if (z || objT17 == m4cVar4) {
                        objT17 = new v2y(iu30Var8, (byte) 19);
                        x340Var17.s0(objT17);
                    }
                    zxo1.b(strO7, af5Var, cqs0Var, qim0VarN2, z5, z6, (iu30) objT17, x340Var17, 3456);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 9:
                ds00 ds00Var = (ds00) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    i5 = iIntValue9 | (x340Var18.g(ds00Var) ? 32 : 16);
                } else {
                    i5 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i5 |= x340Var18.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    uwr uwrVar6 = cbx.a;
                    long j5 = cbx.d(x340Var19).j.a.b;
                    long j6 = cbx.d(x340Var19).j.a.b;
                    Object objT18 = x340Var19.T();
                    m4c m4cVar5 = fkj0.X;
                    if (objT18 == m4cVar5) {
                        objT18 = mqo1.t(new mmr0("explicit-badge-inline-content", new gh80(new d6t0(4, j5, j6), lni.a)));
                        x340Var19.s0(objT18);
                    }
                    cqs0 cqs0Var2 = (cqs0) objT18;
                    String strO9 = cwl1.o0(x340Var19, 2131958472);
                    String strN1 = cwl1.n0(2131958471, new Object[]{"placeholder"}, x340Var19);
                    int iW1 = ihc1.w0(strN1, "placeholder", 0, false, 6);
                    String strO10 = cwl1.o0(x340Var19, 2131955842);
                    Object objT19 = x340Var19.T();
                    if (objT19 == m4cVar5) {
                        ye5 ye5Var2 = new ye5();
                        ye5Var2.g(strN1.substring(0, iW1));
                        z6p1.r(ye5Var2, "explicit-badge-inline-content", strO10);
                        ye5Var2.f(strN1.subSequence(iW1 + 11, strN1.length()));
                        objT19 = ye5Var2.p();
                        x340Var19.s0(objT19);
                    }
                    gto1.g(strO9, (af5) objT19, cqs0Var2, anm1.N("explicit-toggle-row", nim0Var), ds00Var.b, !ds00Var.c, iu30Var9, x340Var19, (3670016 & (i5 << 12)) | 3456);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 10:
                oq30 oq30Var = (oq30) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    i6 = iIntValue10 | (x340Var20.g(oq30Var) ? 32 : 16);
                } else {
                    i6 = iIntValue10;
                }
                if ((iIntValue10 & 384) == 0) {
                    i6 |= x340Var20.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    Object objT20 = x340Var21.T();
                    m4c m4cVar6 = fkj0.X;
                    if (objT20 == m4cVar6) {
                        objT20 = new xwa();
                        x340Var21.s0(objT20);
                    }
                    xwa xwaVar = (xwa) objT20;
                    wkt wktVar = oq30Var.X;
                    boolean z7 = ((i6 & 112) == 32) | ((i6 & 896) == 256);
                    Object objT21 = x340Var21.T();
                    if (z7 || objT21 == m4cVar6) {
                        objT21 = new lqv(oq30Var, iu30Var10, xwaVar, (lnm) null, (byte) 16, (byte) 0);
                        xwaVar = xwaVar;
                        x340Var21.s0(objT21);
                    }
                    qxd0.t(wktVar, x340Var21, (vu30) objT21);
                    b2p1.s(new qij1(oq30Var.b, oq30Var.c, oq30Var.d, oq30Var.e, oq30Var.f, oq30Var.g, oq30Var.h, (String) null), xwaVar, null, null, null, x340Var21, 432, 24);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                zaf0 zaf0Var = (zaf0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                boolean z8 = zaf0Var.b;
                ebf0 ebf0Var2 = dbf0.d;
                if (z8) {
                    ArrayList arrayListA = v7f0.a(zaf0Var);
                    if (arrayListA.isEmpty()) {
                        ebf0Var = ebf0Var2;
                    } else {
                        ebf0Var = new ebf0(mqo1.A(arrayListA));
                    }
                } else {
                    ebf0Var = ebf0Var2;
                }
                if (ebf0Var.equals(ebf0Var2)) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(-1354335705);
                    x340Var23.r(false);
                } else {
                    if (!(ebf0Var instanceof ebf0)) {
                        throw p3d1.k(x340Var22, -1354339071, false);
                    }
                    x340 x340Var24 = x340Var22;
                    x340Var24.i0(-1354333406);
                    b2u.f(ebf0Var, iu30Var11, (qim0) null, x340Var24, (iIntValue11 >> 3) & 112);
                    x340Var24.r(false);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                idh0 idh0Var = (idh0) obj2;
                x340 x340Var25 = (b0k) obj4;
                ((Number) obj5).intValue();
                wch0 wch0Var = idh0Var.a;
                boolean z9 = wch0Var instanceof vch0;
                zfc1 zfc1Var = zfc1.a;
                if (z9) {
                    numValueOf = 2131957745;
                } else {
                    if (!(wch0Var instanceof wch0)) {
                        eg.o();
                        return null;
                    }
                    zfc1 zfc1Var2 = wch0Var.a;
                    numValueOf = zfc1Var2 != zfc1Var ? Integer.valueOf(pob.h(zfc1Var2)) : null;
                }
                if (z9) {
                    numValueOf2 = null;
                } else {
                    if (!(wch0Var instanceof wch0)) {
                        eg.o();
                        return null;
                    }
                    zfc1 zfc1Var3 = wch0Var.a;
                    if (zfc1Var3 != zfc1Var) {
                        numValueOf2 = Integer.valueOf(pob.g(zfc1Var3));
                    } else {
                        numValueOf2 = null;
                    }
                }
                zfc1 zfc1Var4 = idh0Var.b;
                if (zfc1Var4 != null) {
                    if (wch0Var instanceof wch0) {
                        zfc1 zfc1Var5 = wch0Var.a;
                        if (zfc1Var5 == zfc1Var || zfc1Var4.ordinal() < zfc1Var5.ordinal()) {
                            c380VarValueOf = Integer.valueOf(pob.h(zfc1Var4));
                        }
                    } else if (!z9) {
                        eg.o();
                        return null;
                    }
                }
                kdh0 kdh0Var = jdh0.m;
                kdh0 kdh0Var2 = (numValueOf == null && c380VarValueOf == null) ? kdh0Var : new kdh0(numValueOf, numValueOf2, c380VarValueOf);
                if (kdh0Var2.equals(kdh0Var)) {
                    x340 x340Var26 = x340Var25;
                    x340Var26.i0(-1285275316);
                    x340Var26.r(false);
                } else {
                    if (!(kdh0Var2 instanceof kdh0)) {
                        throw p3d1.k(x340Var25, -1285277814, false);
                    }
                    x340 x340Var27 = x340Var25;
                    x340Var27.i0(-1285273852);
                    gho1.f(kdh0Var2, x340Var27, 0);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 13:
                return a(obj, obj2, obj3, obj4, obj5);
            case 14:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                kvm0 kvm0Var = ((lbt0) obj2).j;
                if (kvm0Var != null) {
                    x340 x340Var29 = x340Var28;
                    x340Var29.i0(-383593852);
                    String str5 = kvm0Var.a;
                    String str6 = kvm0Var.b;
                    String str7 = kvm0Var.c.b;
                    boolean z10 = kvm0Var.d;
                    Long l = kvm0Var.e;
                    if (l == null) {
                        x340Var29.i0(-383269376);
                        x340Var29.r(false);
                        str = null;
                    } else {
                        x340Var29.i0(-383269375);
                        String strN2 = cwl1.n0(2131958984, new Object[]{DateFormat.getDateInstance(3).format(new Date(l.longValue()))}, x340Var29);
                        x340Var29.r(false);
                        str = strN2;
                    }
                    List list2 = kvm0Var.f;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 != null) {
                            c380VarValueOf = mqo1.A(list2);
                        }
                    }
                    c380 c380Var = c380VarValueOf;
                    qim0 qim0VarN3 = anm1.N("multi_user_plan_verification", nim0Var);
                    if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                        z = false;
                    }
                    Object objT22 = x340Var29.T();
                    if (z || objT22 == fkj0.X) {
                        objT22 = new nfk0(iu30Var12, (byte) 10);
                        x340Var29.s0(objT22);
                    }
                    d9y0.g(str5, str6, str7, (Function0) objT22, qim0VarN3, z10, str, c380Var, x340Var29, 0);
                    x340Var29.r(false);
                } else {
                    x340 x340Var30 = x340Var28;
                    x340Var30.i0(-382865228);
                    x340Var30.r(false);
                }
                return rih1Var;
            case 15:
                return d(obj, obj2, obj3, obj4, obj5);
            case 16:
                return e(obj, obj2, obj3, obj4, obj5);
            case 17:
                return f(obj, obj2, obj3, obj4, obj5);
            case 18:
                return g(obj, obj2, obj3, obj4, obj5);
            case 19:
                return h(obj, obj2, obj3, obj4, obj5);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case 21:
                return j(obj, obj2, obj3, obj4, obj5);
            case 22:
                xkk1 xkk1Var = (xkk1) obj2;
                hll hllVar = (hll) obj3;
                a7q0 a7q0Var = (a7q0) obj4;
                return new h641((jo70) obj, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a, hllVar != null ? hllVar.b : null, a7q0Var != null ? Long.valueOf(a7q0Var.c) : null, (d7u0) obj5);
            case 23:
                return k(obj, obj2, obj3, obj4, obj5);
            case 24:
                return m(obj, obj2, obj3, obj4, obj5);
            case 25:
                return o(obj, obj2, obj3, obj4, obj5);
            case 26:
                return n(obj, obj2, obj3, obj4, obj5);
            case 27:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((Number) obj5).intValue();
                throw null;
            default:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                boolean z11 = ((rpj1) obj2).a;
                x340 x340Var32 = x340Var31;
                x340Var32.i0(-797480401);
                z47.j(z11, x340Var32, 0);
                x340Var32.r(false);
                if (z11) {
                    x340 x340Var33 = x340Var31;
                    x340Var33.i0(-797372614);
                    String strO11 = cwl1.o0(x340Var33, 2131963759);
                    String strO12 = cwl1.o0(x340Var33, 2131963758);
                    if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var33.g(iu30Var13)) && (iIntValue13 & 384) != 256) {
                        z = false;
                    }
                    Object objT23 = x340Var33.T();
                    if (z || objT23 == fkj0.X) {
                        objT23 = new y0j1(iu30Var13, (byte) 27);
                        x340Var33.s0(objT23);
                    }
                    g3p1.l(0, strO11, strO12, (Function0) objT23, x340Var33);
                    x340Var33.r(false);
                } else {
                    x340 x340Var34 = x340Var31;
                    x340Var34.i0(-797125637);
                    x340Var34.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyh(int i, byte b) {
        super(i);
        this.a = b;
    }
}
