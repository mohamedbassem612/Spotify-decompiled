package p;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.accountswitching.v1.Account;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i43 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i43(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dy6 dy6Var = (dy6) obj2;
        ((Number) obj5).intValue();
        idm idmVar = ((ey6) this.b).a;
        String str = dy6Var.a;
        String str2 = dy6Var.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = ng5.X0;
            x340Var.s0(objT);
        }
        otw.c(idmVar, new wcm(str, str2, (String) null, (ucm) null, (Function0) null, (Function0) objT, dy6Var.c, (String) null, (String) null, 924), (qim0) null, (ipb1) null, x340Var, 0, 12);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strN0;
        y27 y27Var = (y27) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = y27Var.a;
        if (str == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1577658114);
            x340Var2.r(false);
            strN0 = null;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1577658113);
            strN0 = cwl1.n0(2131959478, new Object[]{str}, x340Var3);
            x340Var3.r(false);
        }
        if (strN0 == null) {
            x340 x340Var4 = x340Var;
            strN0 = x0d.k(x340Var4, 226205204, 2131959477, x340Var4, false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(226202011);
            x340Var5.r(false);
        }
        String str2 = y27Var.b;
        if (str2 == null) {
            str2 = "";
        }
        Uri uri = Uri.parse(str2);
        jsl jslVar = new jsl(strN0);
        pkx pkxVar = pkx.c;
        nux nuxVar = new nux(pkxVar, pkxVar);
        qim0 qim0Var = (qim0) this.b;
        uwr uwrVar = cbx.a;
        qim0 qim0VarK = xcg1.k(cbx.a, qim0Var);
        cua cuaVar = cbx.b(x340Var).f;
        eso1.e(uri, jslVar, anm1.N("artwork_image", i1p1.q(qim0VarK, er31.b(6.0f))), null, null, null, null, null, null, nuxVar, false, false, x340Var, 1073741824, 0, 3576);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u77 u77Var = (u77) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        b87 b87Var = (b87) this.b;
        yrd yrdVar = u77Var.a;
        xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = yv91.a(new ih1(xtb0VarA, (byte) 6));
            x340Var2.s0(objT);
        }
        tob1 tob1Var = (tob1) objT;
        boolean z = u77Var.b;
        List list = u77Var.c;
        String str = yrdVar.e;
        int i = (iIntValue & 896) ^ 384;
        boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new sm(iu30Var, (byte) 11);
            x340Var2.s0(objT2);
        }
        b87Var.i(z, list, str, xtb0VarA, (vu30) objT2, x340Var2, 0);
        boolean z3 = yrdVar.h;
        int i2 = b87Var.d.a;
        boolean z4 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z4 || objT3 == m4cVar) {
            objT3 = new ge3(iu30Var, (byte) 20);
            x340Var2.s0(objT3);
        }
        b87Var.g(i2, z3, (Function0) objT3, xtb0VarA, x340Var2, 0);
        uwr uwrVar = cbx.a;
        cwx cwxVarC = cbx.c(x340Var2);
        Object objT4 = x340Var2.T();
        if (objT4 == m4cVar) {
            xpv0 xpv0Var = cwxVarC.c;
            objT4 = irn1.l0(pto1.q(144, 1, 20.0f), 144.0f, (Object) null, 4);
            x340Var2.s0(objT4);
        }
        n8b1 n8b1Var = (n8b1) objT4;
        cvx cvxVar = cbx.b(x340Var2).b;
        uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495);
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        axq0 axq0Var = u77Var.d;
        boolean zI = x340Var2.i(u77Var) | x340Var2.i(b87Var) | x340Var2.i(n8b1Var) | x340Var2.i(tob1Var);
        Object objT5 = x340Var2.T();
        if (zI || objT5 == m4cVar) {
            objT5 = new db(u77Var, b87Var, n8b1Var, tob1Var, (byte) 20);
            x340Var2.s0(objT5);
        }
        j2h1.d(qim0VarD, xtb0VarA, uvxVar, 0, axq0Var, (g36) null, (iu30) objT5, x340Var2, 512, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h87 h87Var = (h87) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        i87 i87Var = (i87) this.b;
        xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
        if (h87Var.a.isEmpty()) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-778586695);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-778736611);
            i87Var.e(h87Var.c, xtb0VarA, h87Var.a, x340Var3, 0);
            x340Var3.r(false);
        }
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
        x340 x340Var4 = x340Var;
        boolean zI = x340Var4.i(i87Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(h87Var)) || (iIntValue & 48) == 32);
        Object objT = x340Var4.T();
        if (zI || objT == fkj0.X) {
            objT = new xg6(h87Var, i87Var, (byte) 21);
            x340Var4.s0(objT);
        }
        too1.b(qim0VarF, xtb0VarA, zzq0VarH, (iu30) objT, x340Var4, 0, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function0 function0;
        lc7 lc7Var = (lc7) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        mc7 mc7Var = (mc7) this.b;
        i iVar = lc7Var.a;
        if (lc7Var.d || lc7Var.f) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-728003840);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new ge3(iu30Var, (byte) 21);
                x340Var2.s0(objT);
            }
            x340Var2.r(false);
            function0 = (Function0) objT;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-727942988);
            x340Var3.r(false);
            function0 = null;
        }
        String imageUri = iVar.getImageUri();
        hux huxVarG = mc7Var.g();
        String name = iVar.getName();
        boolean z2 = lc7Var.b;
        boolean z3 = lc7Var.c;
        boolean z4 = lc7Var.d;
        boolean z5 = lc7Var.j;
        int iH = mc7Var.h();
        j2i j2iVarM = mc7Var.m(lc7Var, x340Var);
        vu30 vu30VarN = mc7Var.n(lc7Var, x340Var);
        vu30 vu30VarE = mc7Var.e(lc7Var, x340Var);
        boolean z6 = lc7Var.e;
        boolean z7 = lc7Var.f;
        sfu0 sfu0Var = lc7Var.h;
        int i = (iIntValue & 896) ^ 384;
        boolean z8 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var4 = x340Var;
        Object objT2 = x340Var4.T();
        if (z8 || objT2 == m4cVar) {
            objT2 = new ge3(iu30Var, (byte) 22);
            x340Var4.s0(objT2);
        }
        Function0 function1 = (Function0) objT2;
        boolean z9 = (i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var4.T();
        if (z9 || objT3 == m4cVar) {
            objT3 = new ge3(iu30Var, (byte) 23);
            x340Var4.s0(objT3);
        }
        aqo1.d(function1, (Function0) objT3, function0, imageUri, huxVarG, name, z2, z3, z4, (qim0) null, iH, j2iVarM, vu30VarN, vu30VarE, z6, z7, sfu0Var, z5, x340Var4, 32768);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tg7 tg7Var = (tg7) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (tg7Var.b) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1919473843);
            umf0 umf0Var = (umf0) this.b;
            i1o1.e((jd6) umf0Var.e, new r7k0(tg7Var.a), (d0r) umf0Var.d, (qim0) null, (ipb1) null, l7i.a, (xu30) null, 0, (xu30) null, x340Var2, 196672, 236);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1919310287);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        x4p1 x4p1Var;
        gbx gbxVar;
        q08 q08Var = (q08) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        y08 y08Var = (y08) this.b;
        x4p1 x4p1Var2 = q08Var.e;
        qtt0 qtt0Var = q08Var.d;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(q08Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            yqg yqgVar = y08Var.a;
            Object objT = x340Var2.T();
            Object obj6 = fkj0.X;
            if (objT == obj6) {
                objT = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var = (drr0) objT;
            boolean zG = x340Var2.g(x4p1Var2) | x340Var2.g(yqgVar);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj6) {
                objT2 = new wc5(x4p1Var2, yqgVar, drr0Var, (lnm) null, (byte) 18);
                x4p1Var = x4p1Var2;
                x340Var2.s0(objT2);
            } else {
                x4p1Var = x4p1Var2;
            }
            qxd0.t(x4p1Var, x340Var2, (vu30) objT2);
            float fS = drr0Var.s();
            boolean zE = x340Var2.e(qtt0Var == null ? -1 : qtt0Var.ordinal());
            Object objT3 = x340Var2.T();
            if (zE || objT3 == obj6) {
                objT3 = Boolean.valueOf((qtt0Var == null || qtt0Var == qtt0.b || qtt0Var == qtt0.a) ? false : true);
                x340Var2.s0(objT3);
            }
            boolean zBooleanValue = ((Boolean) objT3).booleanValue();
            boolean z = q08Var.c != null && (qtt0Var != null || (x4p1Var instanceof qfu0) || (x4p1Var instanceof jfu0));
            String strO0 = cwl1.o0(x340Var2, 2131961350);
            String strO1 = cwl1.o0(x340Var2, 2131961349);
            qim0 qim0VarH = pqo.h(nim0.a, zBooleanValue);
            int i2 = i & 112;
            boolean zG2 = (i2 == 32) | x340Var2.g(strO1) | x340Var2.g(strO0);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == obj6) {
                objT4 = new oo6(q08Var, strO1, strO0, (byte) 2);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarN = anm1.N("audio-preview-row-leading", s161.b(qim0VarH, true, (iu30) objT4));
            if (z) {
                x340Var2.i0(-188244716);
                boolean zI = (i2 == 32) | x340Var2.i(y08Var) | ((i & 896) == 256);
                Object objT5 = x340Var2.T();
                if (zI || objT5 == obj6) {
                    objT5 = new hh(q08Var, y08Var, iu30Var, (byte) 23);
                    x340Var2.s0(objT5);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT5);
                x340Var2.r(false);
                gbxVar = gbxVar2;
            } else {
                x340Var2.i0(-187743043);
                x340Var2.r(false);
                gbxVar = null;
            }
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(4.0f);
            Object objT6 = x340Var2.T();
            if (objT6 == obj6) {
                objT6 = c37.U0;
                x340Var2.s0(objT6);
            }
            kgx kgxVar = new kgx(0, (vu30) objT6, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            cwl1.b(qim0VarN, (tl3) null, cr31VarB, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(-1359708158, new x08(y08Var, q08Var, z, fS), x340Var2), x340Var2, 100687872, 48, 1250);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ib8 ib8Var = (ib8) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(ib8Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            fqg0 fqg0VarU = q1o1.u((jpg0) ((qj0) this.b).d, u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new ge3(iu30Var, (byte) 29);
                x340Var2.s0(objT);
            }
            dxo1.c(ib8Var, fqg0VarU, (qim0) null, (Function0) objT, x340Var2, (i >> 3) & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        mc8 mc8Var = (mc8) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(mc8Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean z = mc8Var.a;
            String str = mc8Var.b;
            maa maaVar = (maa) ((ldo) this.b).d;
            boolean z2 = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new nc8(iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            hxo1.d(z, str, maaVar, (qim0) null, (Function0) objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        qim0 qim0VarL = bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null);
        umf0 umf0Var = (umf0) this.b;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        syo1.b((cnc0) umf0Var.d, (itk0) umf0Var.e, x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ep8 ep8Var = (ep8) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ix7 ix7Var = (ix7) this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(ep8Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.b(oi7.a.a((gw70) ix7Var.b), apo.r(307136468, new zt6(ep8Var, iu30Var, ix7Var, (byte) 11), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strK;
        c9 c9VarS;
        lbt0 lbt0Var = (lbt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        wpv0 wpv0Var = ((d99) this.b).a;
        if (wpv0Var.b.h()) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, 221952863, 2131959789, x340Var2, false);
        } else {
            x340 x340Var3 = x340Var;
            strK = x0d.k(x340Var3, 222041120, 2131959767, x340Var3, false);
        }
        String str = strK;
        if (wpv0Var.b.h()) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(222174544);
            Object objT = x340Var4.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var4.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean bool = Boolean.TRUE;
            boolean zI = x340Var4.i(wpv0Var) | x340Var4.i(ven0Var);
            Object objT2 = x340Var4.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ry5(wpv0Var, ven0Var, (lnm) null, (byte) 13);
                x340Var4.s0(objT2);
            }
            qxd0.t(bool, x340Var4, (vu30) objT2);
            String strE = f4i1.e(nik1.R1.a, "?tab=1");
            String strO0 = cwl1.o0(x340Var4, 2131959786);
            String strO1 = cwl1.o0(x340Var4, 2131959785);
            if (lbt0Var.i) {
                strE = oon1.l(strE);
            }
            c9VarS = mqo1.s(new c10[]{new c10(strO0, 73, strO1, (String) null, ((Boolean) ven0Var.getValue()).booleanValue(), strE), d99.e(lbt0Var, x340Var4)});
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(222276658);
            c9VarS = mqo1.s(new c10[]{d99.e(lbt0Var, x340Var5)});
            x340Var5.r(false);
        }
        c9 c9Var = c9VarS;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var6 = x340Var;
        Object objT3 = x340Var6.T();
        if (z || objT3 == m4cVar) {
            objT3 = new ib2(iu30Var, (byte) 24);
            x340Var6.s0(objT3);
        }
        z5p1.c(str, (qim0) null, (String) null, (c380) null, c9Var, (iu30) objT3, x340Var6, 0, 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:306:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:318:0x0cfb  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        boolean z2;
        lzn hznVar;
        float f;
        lzn lznVar;
        x340 x340Var;
        boolean zI;
        Object objT;
        boolean zI2;
        Object objT2;
        qim0 qim0Var;
        String string;
        boolean z3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                boolean z4 = true;
                g43 g43Var = (g43) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                tm tmVar = (tm) obj6;
                ven0 ven0VarH = rwq.h((bpb1) ((u961) tmVar.c).d, x340Var2, 0);
                Object value = ven0VarH.getValue();
                x340 x340Var3 = x340Var2;
                int i = (iIntValue & 896) ^ 384;
                boolean zI3 = x340Var3.i(ven0VarH) | ((i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256);
                Object objT3 = x340Var3.T();
                if (zI3 || objT3 == m4cVar) {
                    z = false;
                    objT3 = new h43(ven0VarH, iu30Var, (lnm) null, (byte) 0);
                    x340Var3.s0(objT3);
                } else {
                    z = false;
                }
                qxd0.t(value, x340Var3, (vu30) objT3);
                String str = g43Var.a.b;
                if ((i <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                    z4 = z;
                }
                boolean zI4 = x340Var3.i(tmVar) | z4;
                Object objT4 = x340Var3.T();
                if (zI4 || objT4 == m4cVar) {
                    objT4 = new cc2(iu30Var, tmVar, (byte) 3);
                    x340Var3.s0(objT4);
                }
                lvx.a(str, (iu30) objT4, ven0VarH, g43Var.c, (qim0) null, x340Var3, 0);
                return rih1Var;
            case 1:
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                res resVar = (res) obj6;
                List list = ((t93) obj2).a;
                if (!list.isEmpty()) {
                    if (list.size() == 1) {
                        if (((r93) o7h.q0(list)).a.equals("spotify:artist:0LyfQWJT6nXafLPZqxe9Of")) {
                            r93 r93Var = (r93) o7h.q0(list);
                            String str2 = r93Var.b;
                            lznVar = new lzn(new bzn(str2, new td10(r93Var.c, str2, (String) null, (sd10) null), false));
                        } else {
                            r93 r93Var2 = (r93) o7h.q0(list);
                            String str3 = r93Var2.b;
                            lznVar = new lzn(new bzn(str3, new td10(r93Var2.c, str3, (String) null, (sd10) null), true));
                        }
                        hznVar = lznVar;
                    } else {
                        List<r93> list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        for (r93 r93Var3 : list2) {
                            String str4 = r93Var3.b;
                            arrayList.add(new bzn(str4, new td10(r93Var3.c, str4, (String) null, (sd10) null), true));
                        }
                        z2 = true;
                        hznVar = new hzn(arrayList);
                        f = 1.0f;
                    }
                    qim0 qim0VarN = anm1.N("creatorButton", u291.f(nim0Var, f));
                    x340Var = x340Var4;
                    zI = x340Var.i(resVar);
                    objT = x340Var.T();
                    if (zI || objT == m4cVar2) {
                        objT = new y93(resVar, (byte) 2);
                        x340Var.s0(objT);
                    }
                    iu30 iu30Var3 = (iu30) objT;
                    if ((((iIntValue2 & 896) ^ 384) > 256 || !x340Var.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    }
                    zI2 = x340Var.i(hznVar) | z2;
                    objT2 = x340Var.T();
                    if (zI2 || objT2 == m4cVar2) {
                        objT2 = new cc2(hznVar, iu30Var2, (byte) 9);
                        x340Var.s0(objT2);
                    }
                    dm5.a(iu30Var3, qim0VarN, (iu30) objT2, x340Var, 0, 0);
                    return rih1Var;
                }
                hznVar = new lzn(new bzn("", (td10) null, 6));
                f = 1.0f;
                z2 = true;
                qim0 qim0VarN2 = anm1.N("creatorButton", u291.f(nim0Var, f));
                x340Var = x340Var4;
                zI = x340Var.i(resVar);
                objT = x340Var.T();
                if (zI) {
                    objT = new y93(resVar, (byte) 2);
                    x340Var.s0(objT);
                } else {
                    objT = new y93(resVar, (byte) 2);
                    x340Var.s0(objT);
                }
                iu30 iu30Var4 = (iu30) objT;
                z2 = ((iIntValue2 & 896) ^ 384) > 256 ? false : false;
                zI2 = x340Var.i(hznVar) | z2;
                objT2 = x340Var.T();
                if (zI2) {
                    objT2 = new cc2(hznVar, iu30Var2, (byte) 9);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new cc2(hznVar, iu30Var2, (byte) 9);
                    x340Var.s0(objT2);
                }
                dm5.a(iu30Var4, qim0VarN2, (iu30) objT2, x340Var, 0, 0);
                return rih1Var;
            case 2:
                ia3 ia3Var = (ia3) obj2;
                x340 x340Var5 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                iz0 iz0Var = (iz0) obj6;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var5, qim0VarF);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(jw31VarA, x340Var5, y580.O0);
                nko1.H(xos0VarM, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE, x340Var5, y580.Y);
                int iC = l1d.C(ia3Var.c);
                if (iC == 0) {
                    qim0Var = qim0Var2;
                    x340Var7.i0(545143150);
                    x340Var7.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var7, 1264509828, false);
                    }
                    x340Var7.i0(1264512486);
                    qim0Var = qim0Var2;
                    xap1.f(0, 0, x340Var5, uyn1.B(qim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var7.r(false);
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var5).j;
                long j = cbx.a(x340Var5).b.b;
                Context context = (Context) x340Var7.k(AndroidCompositionLocals_androidKt.b);
                ArrayList arrayList2 = new ArrayList();
                da3 da3Var = ia3Var.a;
                if (da3Var != null) {
                    if (da3Var instanceof da3) {
                        string = context.getResources().getString(da3Var.a);
                    } else {
                        if (!(da3Var instanceof ea3)) {
                            eg.o();
                            return null;
                        }
                        string = ((ea3) da3Var).a;
                    }
                    string.getClass();
                    arrayList2.add(string);
                }
                String str5 = ia3Var.b;
                if (str5 != null) {
                    arrayList2.add(str5);
                }
                if (iz0Var.b) {
                    Collections.reverse(arrayList2);
                }
                uwo1.e(o7h.y0(arrayList2, " • ", (String) null, (String) null, (iu30) null, 62), anm1.N("album_header_metadata_text", qim0Var), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                x340Var7.r(true);
                return rih1Var;
            case 3:
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var8 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var8).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                br0 br0Var = (br0) obj6;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(gfh0VarC, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                ((luj) br0Var.c).a(new hvl1(cwl1.o0(x340Var8, iIntValue3), 254, (String) null, (String) null, false, (String) null), x340Var8, 0);
                x340Var10.r(true);
                return rih1Var;
            case 4:
                b0k b0kVar = (b0k) obj4;
                w2g0.a((((Number) obj5).intValue() >> 3) & 112, b0kVar, (iu30) obj3, (qim0) null, ((Boolean) rwq.g(((ov20) ((tm) obj6).c).a("publish-activity", false), Boolean.FALSE, (o8n) null, b0kVar, 48, 2).getValue()).booleanValue());
                return rih1Var;
            case 5:
                hb51 hb51Var = (hb51) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                ft3 ft3Var = (ft3) obj6;
                ft3Var.e = iu30Var5;
                List list3 = hb51Var.e;
                x340 x340Var11 = (b0k) obj4;
                boolean zI5 = x340Var11.i(ft3Var) | x340Var11.i(hb51Var);
                Object objT5 = x340Var11.T();
                if (zI5 || objT5 == m4cVar3) {
                    objT5 = new k2(ft3Var, hb51Var, (lnm) null, (byte) 22);
                    x340Var11.s0(objT5);
                }
                qxd0.t(list3, x340Var11, (vu30) objT5);
                boolean zI6 = x340Var11.i(hb51Var) | ((((iIntValue4 & 896) ^ 384) > 256 && x340Var11.g(iu30Var5)) || (iIntValue4 & 384) == 256);
                Object objT6 = x340Var11.T();
                if (zI6 || objT6 == m4cVar3) {
                    objT6 = new k2(hb51Var, iu30Var5, (lnm) null, (byte) 23);
                    x340Var11.s0(objT6);
                }
                qxd0.t(rih1Var, x340Var11, (vu30) objT6);
                i1k0.a(hb51Var, ft3Var.f, ft3Var.b, ft3Var.c, ft3Var.g, iu30Var5, (qim0) null, x340Var11, ((iIntValue4 >> 3) & 14) | ((iIntValue4 << 9) & 458752));
                return rih1Var;
            case 6:
                ksw kswVar = (ksw) obj;
                ld5 ld5Var = (ld5) obj2;
                int iIntValue5 = ((Number) obj5).intValue();
                br0 br0Var2 = (br0) obj6;
                x340 x340Var12 = (b0k) obj4;
                Object objT7 = x340Var12.T();
                m4c m4cVar4 = fkj0.X;
                if (objT7 == m4cVar4) {
                    objT7 = v8r.q(Boolean.TRUE);
                    x340Var12.s0(objT7);
                }
                ven0 ven0Var = (ven0) objT7;
                boolean zI7 = x340Var12.i(ven0Var) | x340Var12.i(br0Var2) | x340Var12.i(ld5Var);
                Object objT8 = x340Var12.T();
                if (zI7 || objT8 == m4cVar4) {
                    objT8 = new t6(br0Var2, ld5Var, ven0Var, (byte) 24);
                    x340Var12.s0(objT8);
                }
                n9p1.e(kswVar, (iu30) objT8, x340Var12, iIntValue5 & 14);
                s110.b(ld5Var, (qim0) null, x340Var12, (iIntValue5 >> 3) & 14);
                return rih1Var;
            case 7:
                gh5 gh5Var = (gh5) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                hh5 hh5Var = gh5Var.a;
                if (hh5Var == null) {
                    throw p3d1.k(x340Var13, 2089415332, false);
                }
                x340 x340Var14 = x340Var13;
                x340Var14.i0(347439665);
                boolean z5 = gh5Var.b;
                boolean z6 = gh5Var.c;
                boolean zI8 = x340Var14.i(gh5Var) | ((((iIntValue6 & 896) ^ 384) > 256 && x340Var14.g(iu30Var6)) || (iIntValue6 & 384) == 256);
                Object objT9 = x340Var14.T();
                if (zI8 || objT9 == m4cVar5) {
                    objT9 = new cc2(gh5Var, iu30Var6, (byte) 21);
                    x340Var14.s0(objT9);
                }
                cxm0 cxm0Var = new cxm0(hh5Var, z5, z6, (iu30) objT9);
                boolean zG = x340Var14.g(hh5Var);
                ah5 ah5Var = (ah5) obj6;
                Object objT10 = x340Var14.T();
                if (zG || objT10 == m4cVar5) {
                    objT10 = new hxm0(cxm0Var, (zja1) ((ojq) ah5Var.a.a.c).f.get());
                    x340Var14.s0(objT10);
                }
                otw.c((hxm0) objT10, cxm0Var, (qim0) null, (ipb1) null, x340Var14, 72, 12);
                x340Var14.r(false);
                return rih1Var;
            case 8:
                ez5 ez5Var = (ez5) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                rz5 rz5Var = ez5Var.b;
                pt ptVar = (pt) obj6;
                yfr yfrVar = (yfr) ptVar.d;
                x340 x340Var15 = (b0k) obj4;
                boolean zI9 = x340Var15.i(ptVar);
                Object objT11 = x340Var15.T();
                if (zI9 || objT11 == m4cVar6) {
                    objT11 = new ve3(ptVar, (byte) 15);
                    x340Var15.s0(objT11);
                }
                qxd0.i(yfrVar, (iu30) objT11, x340Var15);
                los losVar = (los) ptVar.f;
                boolean zI10 = x340Var15.i(ptVar) | ((((iIntValue7 & 896) ^ 384) > 256 && x340Var15.g(iu30Var7)) || (iIntValue7 & 384) == 256);
                Object objT12 = x340Var15.T();
                if (zI10 || objT12 == m4cVar6) {
                    objT12 = new cc2(ptVar, iu30Var7, (byte) 25);
                    x340Var15.s0(objT12);
                }
                qxd0.i(losVar, (iu30) objT12, x340Var15);
                Boolean boolValueOf = Boolean.valueOf(rz5Var.d);
                boolean zI11 = ((((iIntValue7 & 112) ^ 48) > 32 && x340Var15.g(ez5Var)) || (iIntValue7 & 48) == 32) | x340Var15.i(ptVar);
                Object objT13 = x340Var15.T();
                if (zI11 || objT13 == m4cVar6) {
                    objT13 = new ry5(ez5Var, ptVar, (lnm) null, (byte) 1);
                    x340Var15.s0(objT13);
                }
                qxd0.t(boolValueOf, x340Var15, (vu30) objT13);
                b3o1.b(rz5Var, iu30Var7, (los) ptVar.f, apo.r(524937994, new wf(ptVar, ez5Var, (byte) 17), x340Var15), apo.r(-536501935, new xy5(ptVar, ez5Var), x340Var15), x340Var15, ((iIntValue7 >> 3) & 112) | 27648);
                return rih1Var;
            case 9:
                bd6 bd6Var = (bd6) obj2;
                x340 x340Var16 = (b0k) obj4;
                ((Number) obj5).intValue();
                m4c m4cVar7 = fkj0.X;
                cd6 cd6Var = (cd6) obj6;
                d0r d0rVar = (d0r) cd6Var.e;
                if (bd6Var instanceof ad6) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(-343984270);
                    x340Var17.r(false);
                } else if (bd6Var instanceof yc6) {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(-343932624);
                    if (cd6Var.b) {
                        x340Var18.i0(-343910118);
                        Object objT14 = x340Var18.T();
                        if (objT14 == m4cVar7) {
                            wzn wznVar = (wzn) ((xzo) cd6Var.g).a.c;
                            lzn0 lzn0Var = (lzn0) ((yu3) wznVar.a).d;
                            c8o.l(lzn0Var);
                            gw70 gw70Var = (gw70) ((yu3) wznVar.a).b;
                            c8o.l(gw70Var);
                            objT14 = new tp6(d0rVar, gw70Var, lzn0Var);
                            x340Var18.s0(objT14);
                        }
                        i1o1.e((tp6) objT14, new wp6(((yc6) bd6Var).a), (d0r) cd6Var.e, (qim0) null, (ipb1) null, t6i.a, (xu30) null, 0, (xu30) null, x340Var18, 196608, 236);
                        z3 = false;
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(-343627274);
                        Object objT15 = x340Var18.T();
                        if (objT15 == m4cVar7) {
                            vzo vzoVar = (vzo) cd6Var.f;
                            zob1 zob1Var = (zob1) cd6Var.d;
                            vzoVar.getClass();
                            wzn wznVar2 = (wzn) vzoVar.a.c;
                            lzn0 lzn0Var2 = (lzn0) ((yu3) wznVar2.a).d;
                            c8o.l(lzn0Var2);
                            gw70 gw70Var2 = (gw70) ((yu3) wznVar2.a).b;
                            c8o.l(gw70Var2);
                            bq6 bq6Var = new bq6(lzn0Var2, gw70Var2, zob1Var);
                            x340Var18.s0(bq6Var);
                            objT15 = bq6Var;
                        }
                        otw.c((bq6) objT15, new wp6(((yc6) bd6Var).a), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                        z3 = false;
                        x340Var18.r(false);
                    }
                    x340Var18.r(z3);
                } else {
                    if (!(bd6Var instanceof zc6)) {
                        throw p3d1.k(x340Var16, -1258022112, false);
                    }
                    x340 x340Var19 = x340Var16;
                    x340Var19.i0(-343378406);
                    Object objT16 = x340Var19.T();
                    if (objT16 == m4cVar7) {
                        objT16 = ((mmr) cd6Var.h).a(d0rVar);
                        x340Var19.s0(objT16);
                    }
                    tyq tyqVar = (tyq) objT16;
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var19).b;
                    cvx cvxVar3 = cbx.b(x340Var19).b;
                    cvx cvxVar4 = cbx.b(x340Var19).b;
                    cvx cvxVar5 = cbx.b(x340Var19).b;
                    qim0 qim0VarA = uyn1.A(nim0Var, 16.0f, 16.0f, 16.0f, 2.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM3 = x340Var19.m();
                    qim0 qim0VarE3 = zr7.E(x340Var19, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var19.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var19, y580.O0);
                    nko1.H(xos0VarM3, x340Var19, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var19, y580.R0);
                    nko1.F(x340Var19);
                    nko1.H(qim0VarE3, x340Var19, y580.Y);
                    i1o1.e(tyqVar, new udk(((zc6) bd6Var).a, (String) null, 2, (gnw) null, 106), (d0r) cd6Var.e, (qim0) null, (ipb1) null, t6i.b, (xu30) null, 0, (xu30) null, x340Var19, 196608, 236);
                    x340Var19.r(true);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 10:
                hd6 hd6Var = (hd6) obj2;
                ((Number) obj5).intValue();
                m4c m4cVar8 = fkj0.X;
                String str6 = hd6Var.b;
                String str7 = hd6Var.a;
                Integer num = hd6Var.c;
                x340 x340Var20 = (b0k) obj4;
                boolean zG2 = x340Var20.g(hd6Var.d);
                j06 j06Var = x340Var20.a;
                jd6 jd6Var = (jd6) obj6;
                d0r d0rVar2 = (d0r) jd6Var.b;
                mjm mjmVar = (mjm) jd6Var.f;
                Object objT17 = x340Var20.T();
                if (zG2 || objT17 == m4cVar8) {
                    objT17 = new tza(mjmVar, d0rVar2, new ia00(tza.class.getName(), oy5.i, oy5.t));
                    x340Var20.s0(objT17);
                }
                tza tzaVar = (tza) objT17;
                boolean zG3 = x340Var20.g(hd6Var.e);
                Object objT18 = x340Var20.T();
                if (zG3 || objT18 == m4cVar8) {
                    objT18 = new tza(mjmVar, d0rVar2, new ia00(tza.class.getName(), oy5.X, oy5.Y));
                    x340Var20.s0(objT18);
                }
                tza tzaVar2 = (tza) objT18;
                String strC = gg.C(mqo1.s(new String[]{str7, str6}), x340Var20, 48, 0);
                era eraVar = een.Q0;
                qim0 qim0VarN3 = anm1.N("artist-blend-view-header-row", u291.f(nim0Var, 1.0f));
                Object objT19 = x340Var20.T();
                if (objT19 == m4cVar8) {
                    objT19 = t16.T0;
                    x340Var20.s0(objT19);
                }
                qim0 qim0VarB = s161.b(qim0VarN3, true, (iu30) objT19);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var20).b;
                qim0 qim0VarZ2 = uyn1.z(0.0f, 12.0f, 1, qim0VarB);
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var20, 0);
                int iHashCode4 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM4 = x340Var20.m();
                qim0 qim0VarE4 = zr7.E(x340Var20, qim0VarZ2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var20, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM4, x340Var20, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode4);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var20, lljVar3);
                nko1.F(x340Var20);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE4, x340Var20, lljVar4);
                jw31 jw31VarA2 = ew31.a(new d36(-16.0f, true, new g21(eraVar, (byte) 29)), een.N0, x340Var20, 0);
                int iHashCode5 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM5 = x340Var20.m();
                qim0 qim0VarE5 = zr7.E(x340Var20, nim0Var);
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(jw31VarA2, x340Var20, lljVar);
                nko1.H(xos0VarM5, x340Var20, lljVar2);
                x0d.q(iHashCode5, x340Var20, lljVar3, x340Var20);
                nko1.H(qim0VarE5, x340Var20, lljVar4);
                dgo1.a(384, 2, apo.r(-1740566300, new id6(tzaVar, hd6Var, jd6Var, (byte) 0), x340Var20), x340Var20, anm1.N("artist-blend-view-header-artist-avatar", lrn1.x(nim0Var, 1.0f)), false);
                dgo1.a(432, 0, apo.r(958454733, new id6(tzaVar2, hd6Var, jd6Var, (byte) 1), x340Var20), x340Var20, anm1.N("artist-blend-view-header-collaborator-avatar", nim0Var), true);
                x340Var20.r(true);
                cvx cvxVar7 = cbx.b(x340Var20).b;
                op71.g(x340Var20, u291.h(nim0Var, 8.0f));
                qim0 qim0VarN4 = anm1.N("artist-blend-view-header-title", nim0Var);
                boolean zG4 = x340Var20.g(strC);
                Object objT20 = x340Var20.T();
                if (zG4 || objT20 == m4cVar8) {
                    objT20 = new wk3(strC, (byte) 9);
                    x340Var20.s0(objT20);
                }
                uwo1.e(f4i1.f(str7, " • ", str6), s161.b(qim0VarN4, false, (iu30) objT20), cbx.d(x340Var20).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2040);
                if (num != 0) {
                    x340Var20.i0(-1212599270);
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale(upn1.m()));
                    cvx cvxVar8 = cbx.b(x340Var20).b;
                    op71.g(x340Var20, u291.h(nim0Var, 2.0f));
                    uwo1.e(cwl1.U(2131820906, num.intValue(), new Object[]{numberInstance.format(num)}, x340Var20), anm1.N("artist-blend-view-header-subtitle", nim0Var), cbx.d(x340Var20).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2040);
                    x340Var20.r(false);
                } else {
                    x340Var20.i0(-1212063993);
                    x340Var20.r(false);
                }
                x340Var20.r(true);
                return rih1Var;
            case 11:
                ((hw2) obj6).h((el6) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 12:
                zp6 zp6Var = (zp6) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (zp6Var instanceof xp6) {
                    x340 x340Var22 = x340Var21;
                    x340Var22.i0(-533904174);
                    x340Var22.r(false);
                } else {
                    if (!(zp6Var instanceof yp6)) {
                        throw p3d1.k(x340Var21, -709960208, false);
                    }
                    x340 x340Var23 = x340Var21;
                    x340Var23.i0(-709957889);
                    mod.b(oi7.a.a(((tp6) obj6).b), apo.r(-781748403, new sp6(zp6Var, iu30Var8, (byte) 1), x340Var23), x340Var23, 56);
                    x340Var23.r(false);
                }
                return rih1Var;
            case 13:
                zp6 zp6Var2 = (zp6) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (zp6Var2 instanceof xp6) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(-1215248302);
                    x340Var25.r(false);
                } else {
                    if (!(zp6Var2 instanceof yp6)) {
                        throw p3d1.k(x340Var24, -1978865040, false);
                    }
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(-1978862721);
                    mod.b(oi7.a.a(((bq6) obj6).b), apo.r(1569344077, new sp6(zp6Var2, iu30Var9, (byte) 3), x340Var26), x340Var26, 56);
                    x340Var26.r(false);
                }
                return rih1Var;
            case 14:
                qr6 qr6Var = (qr6) obj2;
                x340 x340Var27 = (b0k) obj4;
                ((Number) obj5).intValue();
                sr6 sr6Var = (sr6) obj6;
                if (qr6Var instanceof pr6) {
                    x340 x340Var28 = x340Var27;
                    x340Var28.i0(679174989);
                    mod.b(oi7.a.a(sr6Var.b), apo.r(-1906770131, new pp5(sr6Var, qr6Var, (byte) 12), x340Var28), x340Var28, 56);
                    x340Var28.r(false);
                } else {
                    if (!qr6Var.equals(or6.a)) {
                        throw p3d1.k(x340Var27, -1640660325, false);
                    }
                    x340 x340Var29 = x340Var27;
                    x340Var29.i0(679427515);
                    x340Var29.r(false);
                }
                return rih1Var;
            case 15:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((qx6) obj6).a), apo.r(-1084959738, new pp5((iu30) obj3, (mx6) obj2, (byte) 14), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5);
            case 19:
                return f(obj, obj2, obj3, obj4, obj5);
            case 20:
                return g(obj, obj2, obj3, obj4, obj5);
            case 21:
                return h(obj, obj2, obj3, obj4, obj5);
            case 22:
                return i(obj, obj2, obj3, obj4, obj5);
            case 23:
                return j(obj, obj2, obj3, obj4, obj5);
            case 24:
                return k(obj, obj2, obj3, obj4, obj5);
            case 25:
                return m(obj, obj2, obj3, obj4, obj5);
            case 26:
                return n(obj, obj2, obj3, obj4, obj5);
            case 27:
                ((rwj) obj6).e(((lv8) obj2).a, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 112);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return o(obj, obj2, obj3, obj4, obj5);
            default:
                mb9 mb9Var = (mb9) obj2;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= x340Var30.g(mb9Var) ? 32 : 16;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue8 & 1, (iIntValue8 & 1041) != 1040)) {
                    String strO0 = cwl1.o0(x340Var31, 2131958485);
                    qim0 qim0VarZ3 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar9 = cbx.b(x340Var31).b;
                    qim0 qim0VarX = uyn1.x(qim0VarZ3, 16.0f);
                    boolean zG5 = x340Var31.g(strO0);
                    Object objT21 = x340Var31.T();
                    if (zG5 || objT21 == fkj0.X) {
                        objT21 = new nb9(strO0, (byte) 0);
                        x340Var31.s0(objT21);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarX, true, (iu30) objT21);
                    ob9 ob9Var = (ob9) obj6;
                    gfh0 gfh0VarC3 = t1c.c(een.h, false);
                    int iHashCode6 = Long.hashCode(x340Var31.T);
                    xos0 xos0VarM6 = x340Var31.m();
                    qim0 qim0VarE6 = zr7.E(x340Var31, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var31.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var31.m0();
                    if (x340Var31.S) {
                        x340Var31.l(n4kVar);
                    } else {
                        x340Var31.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var31, y580.O0);
                    nko1.H(xos0VarM6, x340Var31, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var31, y580.R0);
                    nko1.F(x340Var31);
                    nko1.H(qim0VarE6, x340Var31, y580.Y);
                    ob9Var.e(new td10(mb9Var.a, mb9Var.b, mb9Var.c, (sd10) null), u291.r(anm1.N("avatar-row-element", nim0Var), 112.0f), x340Var31, 48);
                    x340Var31.r(true);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
        }
    }
}
