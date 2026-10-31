package p;

import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r7i extends hab0 implements bv30 {
    public static final r7i N0;
    public static final r7i O0;
    public static final r7i P0;
    public static final r7i Q0;
    public static final r7i R0;
    public static final r7i S0;
    public static final r7i T0;
    public static final r7i U0;
    public static final r7i V0;
    public static final r7i W0;
    public static final r7i X;
    public static final r7i X0;
    public static final r7i Y;
    public static final r7i Y0;
    public static final r7i Z;
    public static final r7i Z0;
    public static final r7i a1;
    public static final r7i b;
    public static final r7i b1;
    public static final r7i c;
    public static final r7i c1;
    public static final r7i d;
    public static final r7i d1;
    public static final r7i e;
    public static final r7i e1;
    public static final r7i f;
    public static final r7i g;
    public static final r7i h;
    public static final r7i i;
    public static final r7i t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new r7i(i2, (byte) 0);
        c = new r7i(i2, (byte) 1);
        d = new r7i(i2, (byte) 2);
        e = new r7i(i2, (byte) 3);
        f = new r7i(i2, (byte) 4);
        g = new r7i(i2, (byte) 5);
        h = new r7i(i2, (byte) 6);
        i = new r7i(i2, (byte) 7);
        t = new r7i(i2, (byte) 8);
        X = new r7i(i2, (byte) 9);
        Y = new r7i(i2, (byte) 10);
        Z = new r7i(i2, (byte) 11);
        N0 = new r7i(i2, (byte) 12);
        O0 = new r7i(i2, (byte) 13);
        P0 = new r7i(i2, (byte) 14);
        Q0 = new r7i(i2, (byte) 15);
        R0 = new r7i(i2, (byte) 16);
        S0 = new r7i(i2, (byte) 17);
        T0 = new r7i(i2, (byte) 18);
        U0 = new r7i(i2, (byte) 19);
        V0 = new r7i(i2, (byte) 20);
        W0 = new r7i(i2, (byte) 21);
        X0 = new r7i(i2, (byte) 22);
        Y0 = new r7i(i2, (byte) 23);
        Z0 = new r7i(i2, (byte) 24);
        a1 = new r7i(i2, (byte) 25);
        b1 = new r7i(i2, (byte) 26);
        c1 = new r7i(i2, (byte) 27);
        d1 = new r7i(i2, (byte) 28);
        e1 = new r7i(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7i(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jax haxVar;
        oq9 oq9Var = (oq9) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131953066);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new a6i(iu30Var, (byte) 27);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        ldx ldxVar = ldx.c;
        zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
        if (oq9Var.a) {
            x340Var2.i0(1974445531);
            x340Var2.r(false);
            haxVar = jax.a;
        } else {
            x340Var2.i0(1974495131);
            haxVar = new hax(cwl1.o0(x340Var2, 2131953077));
            x340Var2.r(false);
        }
        wro1.h(gbxVar, ldxVar, (qim0) null, haxVar, (gdx) null, zzq0Var, false, (idn0) null, (ga80) null, u8i.a, x340Var2, 0, 6, 940);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ss9 ss9Var = (ss9) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = ss9Var.d;
        String str2 = ss9Var.b;
        String str3 = ss9Var.c;
        boolean z = ss9Var.e;
        float f2 = ss9Var.a;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z2 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new wqf(iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        iu30 iu30Var2 = (iu30) objT;
        boolean z3 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z3 || objT2 == m4cVar) {
            objT2 = new wqf(iu30Var, (byte) 25);
            x340Var2.s0(objT2);
        }
        iu30 iu30Var3 = (iu30) objT2;
        boolean z4 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z4 || objT3 == m4cVar) {
            objT3 = new a6i(iu30Var, (byte) 28);
            x340Var2.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean z5 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var2.T();
        if (z5 || objT4 == m4cVar) {
            objT4 = new a6i(iu30Var, (byte) 29);
            x340Var2.s0(objT4);
        }
        n3p1.a(str, str2, str3, z, true, f2, iu30Var2, iu30Var3, function0, (Function0) objT4, (qim0) null, false, x340Var2, 24576, 0, 3072);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c3a c3aVar = (c3a) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        h5p1.b(c3aVar, (Function0) objT, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d5a d5aVar = (d5a) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(d5aVar)) || (iIntValue & 48) == 32);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new puh(iu30Var, d5aVar, (byte) 5);
            x340Var2.s0(objT);
        }
        i6p1.b(d5aVar, (qim0) null, (iu30) objT, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ped0 ped0Var = (ted0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (ped0Var instanceof qed0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1807060144);
            x340Var2.r(false);
        } else if (ped0Var instanceof ped0) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1807096414);
            ped0 ped0Var2 = ped0Var;
            String str = ped0Var2.a;
            String str2 = ped0Var2.d;
            if (str == null || str2 == null) {
                x340Var3.i0(1807476722);
                x340Var3.r(false);
            } else {
                x340Var3.i0(1807241928);
                d0p1.g(ped0Var2.c ? nrt0.a : new irt0(grt0.a), str2, str, (qim0) null, x340Var3, 0);
                x340Var3.r(false);
            }
            x340Var3.r(false);
        } else if (ped0Var instanceof sed0) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-634429104);
            d0p1.d(0, ((sed0) ped0Var).a, x340Var4, (qim0) null);
            x340Var4.r(false);
        } else {
            if (!(ped0Var instanceof red0)) {
                throw p3d1.k(x340Var, -634444968, false);
            }
            x340 x340Var5 = x340Var;
            x340Var5.i0(-634425692);
            d0p1.c(((red0) ped0Var).a, 0, x340Var5, (qim0) null);
            x340Var5.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dka dkaVar = (dka) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = true;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.i(dkaVar)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new e9i(iu30Var, dkaVar, (byte) 0);
            x340Var2.s0(objT);
        }
        x8p1.b(dkaVar, (qim0) null, (Function0) objT, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dka dkaVar = (dka) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(dkaVar)) || (iIntValue & 48) == 32);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new e9i(iu30Var, dkaVar, (byte) 1);
            x340Var2.s0(objT);
        }
        x8p1.b(dkaVar, (qim0) null, (Function0) objT, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kua kuaVar = (kua) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = kuaVar.a;
        String str2 = kuaVar.b;
        boolean z = kuaVar.c;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        xa4.b(str, str2, z, new gbx(z50.c, (Function0) objT), (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ldx ldxVar = ldx.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 2);
            x340Var2.s0(objT);
        }
        wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, i9i.a, x340Var2, 0, 6, 1020);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        slb slbVar = (slb) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var).f;
        cr31 cr31VarB = er31.b(8.0f);
        mgx mgxVar = mgx.e;
        cvx cvxVar = cbx.b(x340Var).b;
        zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
        cvx cvxVar2 = cbx.b(x340Var).b;
        qim0 qim0VarF = u291.f(uyn1.z(0.0f, 6.0f, 1, nim0.a), 1.0f);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (objT == fkj0.X) {
            objT = ovh.R0;
            x340Var2.s0(objT);
        }
        cwl1.b(anm1.N("audiobook_disclaimer_banner", s161.b(qim0VarF, true, (iu30) objT)), (tl3) null, cr31VarB, mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-964488760, new okg(slbVar, (byte) 15), x340Var2), x340Var2, 0, 48, 2018);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strN0;
        tnb tnbVar = (tnb) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = tnbVar.b;
        if (tnbVar.c) {
            String strN1 = cwl1.n0(2131960420, new Object[]{tnbVar.a}, x340Var);
            x340 x340Var2 = x340Var;
            if (str == null) {
                x340Var2.i0(997160688);
                x340Var2.r(false);
                strN0 = null;
            } else {
                x340Var2.i0(997160689);
                strN0 = cwl1.n0(2131960419, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            }
            String strY0 = o7h.y0(f46.i0(new String[]{strN1, strN0}), ", ", (String) null, (String) null, (iu30) null, 62);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.O0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("audiobook_price", uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            x340 x340Var3 = x340Var;
            boolean zG = x340Var3.g(strY0);
            Object objT = x340Var3.T();
            if (zG || objT == fkj0.X) {
                objT = new irf(strY0, (byte) 16);
                x340Var3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
            hzj.A.getClass();
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
            nko1.H(jw31VarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            uwo1.e(tnbVar.a, (qim0) null, cbx.d(x340Var3).e, cbx.a(x340Var3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2034);
            if (str != null) {
                x340Var3.i0(-778229513);
                uwo1.e(tnbVar.b, (qim0) null, lee1.a(cbx.d(x340Var3).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.d, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119), cbx.a(x340Var3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2034);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-778011366);
                x340Var3.r(false);
            }
            x340Var3.r(true);
        }
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jax haxVar;
        float f2;
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                pv7 pv7Var = (pv7) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if (pv7Var.a) {
                    boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                    x340 x340Var2 = x340Var;
                    Object objT = x340Var2.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new a6i(iu30Var, (byte) 13);
                        x340Var2.s0(objT);
                    }
                    jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, s7i.a, (xu30) null, (xu30) null, apo.r(-439501374, new okg(pv7Var, (byte) 14), x340Var2), s7i.b, (xu30) null, (xu30) null, s7i.c, x340Var2, 100663296, 197040, 26303);
                }
                return rih1Var;
            case 1:
                bw7 bw7Var = (bw7) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                x340 x340Var3 = (b0k) obj4;
                wat watVar = (wat) x340Var3.k(t4k.h);
                Object objT2 = x340Var3.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = bb00.h(0, x340Var3);
                }
                err0 err0Var = (hdn0) objT2;
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarO = td6.o(lhc.g(x340Var3).g, 32, nim0Var);
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarO, 0.0f, 0.0f, 0.0f, cbx.b(x340Var3).b.b, 7);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, watVar.M0(err0Var.s()), 7);
                boolean z3 = ((((iIntValue2 & 112) ^ 48) > 32 && x340Var3.g(bw7Var)) || (iIntValue2 & 48) == 32) | ((((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(iu30Var2)) || (iIntValue2 & 384) == 256);
                Object objT3 = x340Var3.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new puh(bw7Var, iu30Var2, (byte) 4);
                    x340Var3.s0(objT3);
                }
                s3o1.d((qim0) null, (xtb0) null, zzq0VarJ, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT3, x340Var3, 0, 507);
                qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarF = u291.f(uyn1.z(16.0f, 0.0f, 2, qim0VarA), 1.0f);
                boolean zI = x340Var3.i(err0Var);
                Object objT4 = x340Var3.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new tu9(err0Var, (byte) 4);
                    x340Var3.s0(objT4);
                }
                vzn1.a(lrn1.u(qim0VarF, (iu30) objT4), x340Var3, 0);
                x340Var3.r(true);
                return rih1Var;
            case 2:
                p60 p60Var = (p60) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                boolean z4 = ((((iIntValue3 & 896) ^ 384) > 256 && x340Var4.g(iu30Var3)) || (iIntValue3 & 384) == 256) | ((((iIntValue3 & 112) ^ 48) > 32 && x340Var4.i(p60Var)) || (iIntValue3 & 48) == 32);
                x340 x340Var5 = x340Var4;
                Object objT5 = x340Var5.T();
                if (z4 || objT5 == fkj0.X) {
                    objT5 = new f02(iu30Var3, p60Var, (byte) 1);
                    x340Var5.s0(objT5);
                }
                kln1.c(p60Var, (qim0) null, (Function0) objT5, x340Var5, ((iIntValue3 >> 3) & 14) | 8, 10);
                return rih1Var;
            case 3:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                boolean z5 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var6.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT6 = x340Var7.T();
                if (z5 || objT6 == fkj0.X) {
                    objT6 = new a6i(iu30Var4, (byte) 15);
                    x340Var7.s0(objT6);
                }
                axo1.a(0, (Function0) objT6, x340Var7, (qim0) null);
                return rih1Var;
            case 4:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                String str = ((yb8) obj2).a;
                boolean z6 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var8.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT7 = x340Var9.T();
                if (z6 || objT7 == fkj0.X) {
                    objT7 = new a6i(iu30Var5, (byte) 16);
                    x340Var9.s0(objT7);
                }
                tro1.b(0, str, (Function0) objT7, x340Var9, (qim0) null);
                return rih1Var;
            case 5:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 384) == 0) {
                    iIntValue6 |= x340Var10.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue6 & 1, (iIntValue6 & 1153) != 1152)) {
                    String strO0 = cwl1.o0(x340Var11, 2131961016);
                    String strO1 = cwl1.o0(x340Var11, 2131961015);
                    pm31 pm31Var = new pm31(0);
                    boolean z7 = (iIntValue6 & 896) == 256;
                    Object objT8 = x340Var11.T();
                    if (z7 || objT8 == fkj0.X) {
                        objT8 = new a6i(iu30Var6, (byte) 17);
                        x340Var11.s0(objT8);
                    }
                    yxo1.a(strO0, strO1, bin.x(nim0.a, false, (String) null, pm31Var, (idn0) null, (Function0) objT8, 11), false, x340Var11, 0, 8);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 6:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 384) == 0) {
                    iIntValue7 |= x340Var12.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue7 & 1, (iIntValue7 & 1153) != 1152)) {
                    String strO2 = cwl1.o0(x340Var13, 2131958479);
                    String strO3 = cwl1.o0(x340Var13, 2131958478);
                    pm31 pm31Var2 = new pm31(0);
                    boolean z8 = (iIntValue7 & 896) == 256;
                    Object objT9 = x340Var13.T();
                    if (z8 || objT9 == fkj0.X) {
                        objT9 = new a6i(iu30Var7, (byte) 18);
                        x340Var13.s0(objT9);
                    }
                    cto1.h(strO2, strO3, bin.x(nim0.a, false, (String) null, pm31Var2, (idn0) null, (Function0) objT9, 11), false, x340Var13, 0, 8);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 7:
                mu8 mu8Var = (mu8) obj2;
                x340 x340Var14 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0VarB2 = u291.b(0.0f, 80.0f, 1, u291.f(nim0Var, 1.0f));
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var14).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarB2);
                zsc zscVar = zex.a;
                long j = ((vex) zscVar.e).b;
                cua cuaVar = cbx.b(x340Var14).f;
                qim0 qim0VarF2 = dug.f(qim0VarZ, j, er31.b(8.0f));
                cvx cvxVar3 = cbx.b(x340Var14).b;
                cvx cvxVar4 = cbx.b(x340Var14).b;
                qim0 qim0VarY = uyn1.y(qim0VarF2, 12.0f, 8.0f);
                mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                int iHashCode2 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM2 = x340Var15.m();
                qim0 qim0VarE2 = zr7.E(x340Var14, qim0VarY);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(mbhVarA, x340Var14, y580.O0);
                nko1.H(xos0VarM2, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE2, x340Var14, y580.Y);
                uwo1.e(cwl1.o0(x340Var14, mu8Var.a), (qim0) null, cbx.d(x340Var14).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2042);
                if (mu8Var.b) {
                    x340Var16.i0(1068709653);
                    uwo1.e(cwl1.o0(x340Var14, 2131951771), anm1.N("accuracy_vary_message", nim0Var), cbx.d(x340Var14).j, ((vex) zscVar.e).k, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2032);
                    x340Var16.r(false);
                } else {
                    x340Var16.i0(1068964566);
                    x340Var16.r(false);
                }
                x340Var16.r(true);
                return rih1Var;
            case 8:
                ma9 ma9Var = (ma9) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                String str2 = ma9Var.a;
                if (str2 == null || ihc1.y0(str2)) {
                    x340 x340Var18 = x340Var17;
                    x340Var18.i0(259215320);
                    x340Var18.r(false);
                } else {
                    x340 x340Var19 = x340Var17;
                    x340Var19.i0(258988524);
                    String str3 = ma9Var.a;
                    String str4 = ma9Var.b;
                    boolean z9 = ma9Var.c;
                    boolean z10 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var19.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                    Object objT10 = x340Var19.T();
                    if (z10 || objT10 == fkj0.X) {
                        objT10 = new a6i(iu30Var8, (byte) 19);
                        x340Var19.s0(objT10);
                    }
                    h1p1.a(str3, str4, z9, new gbx(z50.c, (Function0) objT10), (qim0) null, x340Var19, 0);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 9:
                kb9 kb9Var = (kb9) obj2;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= x340Var20.g(kb9Var) ? 32 : 16;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 1041) != 1040)) {
                    String strO4 = cwl1.o0(x340Var21, 2131951733);
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var21).b;
                    qim0 qim0VarX = uyn1.x(qim0VarZ2, 16.0f);
                    boolean zG = x340Var21.g(strO4);
                    Object objT11 = x340Var21.T();
                    if (zG || objT11 == fkj0.X) {
                        objT11 = new irf(strO4, (byte) 15);
                        x340Var21.s0(objT11);
                    }
                    qim0 qim0VarB3 = s161.b(qim0VarX, true, (iu30) objT11);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var21.T);
                    xos0 xos0VarM3 = x340Var21.m();
                    qim0 qim0VarE3 = zr7.E(x340Var21, qim0VarB3);
                    hzj.A.getClass();
                    if (x340Var21.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var21.m0();
                    if (x340Var21.S) {
                        x340Var21.l(n4kVar);
                    } else {
                        x340Var21.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var21, y580.O0);
                    nko1.H(xos0VarM3, x340Var21, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var21, y580.R0);
                    nko1.F(x340Var21);
                    nko1.H(qim0VarE3, x340Var21, y580.Y);
                    String str5 = kb9Var.b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    Uri uri = Uri.parse(str5);
                    String str6 = kb9Var.c;
                    String str7 = kb9Var.a;
                    Integer num = kb9Var.d;
                    bmq0.a(uri, u291.r(anm1.N("avatar-element", nim0Var), 112.0f), (hcx) null, str6, str7, num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.k, 0L, false, x340Var21, 48, 196);
                    x340Var21.r(true);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 10:
                nk9 nk9Var = (nk9) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if (nk9Var.a) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(426935239);
                    String strO5 = cwl1.o0(x340Var23, nk9Var.b ? 2131953055 : 2131953056);
                    boolean z11 = ((((iIntValue10 & 896) ^ 384) > 256 && x340Var23.g(iu30Var9)) || (iIntValue10 & 384) == 256) | ((((iIntValue10 & 112) ^ 48) > 32 && x340Var23.g(nk9Var)) || (iIntValue10 & 48) == 32);
                    Object objT12 = x340Var23.T();
                    if (z11 || objT12 == fkj0.X) {
                        objT12 = new ame(iu30Var9, nk9Var, (byte) 29);
                        x340Var23.s0(objT12);
                    }
                    Function0 function0 = (Function0) objT12;
                    if (ihc1.y0(strO5)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(strO5), function0), ldx.c, (qim0) null, (max) null, yla.r(x340Var23), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-880131715, new l8i(nk9Var, (byte) 0), x340Var23), x340Var23, 0, 6, 988);
                    x340Var23.r(false);
                } else {
                    x340 x340Var24 = x340Var22;
                    x340Var24.i0(427596407);
                    x340Var24.r(false);
                }
                return rih1Var;
            case 11:
                cm9 cm9Var = (cm9) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str8 = cm9Var.d;
                String str9 = cm9Var.b;
                String str10 = cm9Var.c;
                boolean z12 = cm9Var.e;
                boolean z13 = cm9Var.f;
                float f3 = cm9Var.a;
                int i2 = (iIntValue11 & 896) ^ 384;
                boolean z14 = (i2 > 256 && x340Var25.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                x340 x340Var26 = x340Var25;
                Object objT13 = x340Var26.T();
                if (z14 || objT13 == m4cVar2) {
                    objT13 = new wqf(iu30Var10, (byte) 21);
                    x340Var26.s0(objT13);
                }
                iu30 iu30Var11 = (iu30) objT13;
                boolean z15 = (i2 > 256 && x340Var26.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                Object objT14 = x340Var26.T();
                if (z15 || objT14 == m4cVar2) {
                    objT14 = new wqf(iu30Var10, (byte) 22);
                    x340Var26.s0(objT14);
                }
                iu30 iu30Var12 = (iu30) objT14;
                boolean z16 = (i2 > 256 && x340Var26.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                Object objT15 = x340Var26.T();
                if (z16 || objT15 == m4cVar2) {
                    objT15 = new a6i(iu30Var10, (byte) 20);
                    x340Var26.s0(objT15);
                }
                Function0 function1 = (Function0) objT15;
                boolean z17 = (i2 > 256 && x340Var26.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                Object objT16 = x340Var26.T();
                if (z17 || objT16 == m4cVar2) {
                    objT16 = new a6i(iu30Var10, (byte) 21);
                    x340Var26.s0(objT16);
                }
                n3p1.a(str8, str9, str10, z12, z13, f3, iu30Var11, iu30Var12, function1, (Function0) objT16, (qim0) null, false, x340Var26, 0, 0, 3072);
                return rih1Var;
            case 12:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                boolean z18 = ((ym9) obj2).a;
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var27.g(iu30Var13)) && (iIntValue12 & 384) != 256) {
                    z = false;
                }
                x340 x340Var28 = x340Var27;
                Object objT17 = x340Var28.T();
                if (z || objT17 == fkj0.X) {
                    objT17 = new wqf(iu30Var13, (byte) 23);
                    x340Var28.s0(objT17);
                }
                j2p1.d(z18, (iu30) objT17, x340Var28, 0);
                return rih1Var;
            case 13:
                kn9 kn9Var = (kn9) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                String str11 = kn9Var.c;
                String str12 = kn9Var.b;
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var14)) && (iIntValue13 & 384) != 256) {
                    z = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT18 = x340Var30.T();
                if (z || objT18 == fkj0.X) {
                    objT18 = new a6i(iu30Var14, (byte) 22);
                    x340Var30.s0(objT18);
                }
                c0p1.c("", (qim0) null, (String) null, str11, str12, (k9) null, (qux) null, (Function0) objT18, x340Var30, 6, 462);
                return rih1Var;
            case 14:
                mn9 mn9Var = (mn9) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                String str13 = mn9Var.a;
                ub10 ub10Var = mn9Var.b;
                uwr uwrVar4 = cbx.a;
                long jT = z4p1.t(((vex) zex.a.e).e, z4p1.e(ub10Var.a));
                int i3 = (iIntValue14 & 896) ^ 384;
                boolean z19 = (i3 > 256 && x340Var31.g(iu30Var15)) || (iIntValue14 & 384) == 256;
                x340 x340Var32 = x340Var31;
                Object objT19 = x340Var32.T();
                if (z19 || objT19 == m4cVar3) {
                    objT19 = new a6i(iu30Var15, (byte) 23);
                    x340Var32.s0(objT19);
                }
                Function0 function2 = (Function0) objT19;
                if ((i3 <= 256 || !x340Var32.g(iu30Var15)) && (iIntValue14 & 384) != 256) {
                    z = false;
                }
                Object objT20 = x340Var32.T();
                if (z || objT20 == m4cVar3) {
                    objT20 = new a6i(iu30Var15, (byte) 24);
                    x340Var32.s0(objT20);
                }
                r2p1.b(str13, jT, function2, (Function0) objT20, (qim0) null, x340Var32, 0);
                return rih1Var;
            case 15:
                fp9 fp9Var = (fp9) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                String strO6 = cwl1.o0(x340Var33, fp9Var.a ? 2131953061 : 2131953063);
                boolean z20 = (((iIntValue15 & 896) ^ 384) > 256 && x340Var33.g(iu30Var16)) || (iIntValue15 & 384) == 256;
                x340 x340Var34 = x340Var33;
                Object objT21 = x340Var34.T();
                if (z20 || objT21 == fkj0.X) {
                    objT21 = new a6i(iu30Var16, (byte) 25);
                    x340Var34.s0(objT21);
                }
                Function0 function3 = (Function0) objT21;
                if (ihc1.y0(strO6)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strO6), function3);
                qim0 qim0VarR = u291.r(nim0Var, 64.0f);
                idx idxVar = new idx();
                gdx gdxVarP = yla.p(x340Var34);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var34).b;
                wro1.h(gbxVar, idxVar, qim0VarR, (max) null, gdxVarP, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), false, (idn0) null, (ga80) null, apo.r(1399196187, new l8i(fp9Var, (byte) 1), x340Var34), x340Var34, 0, 6, 920);
                return rih1Var;
            case 16:
                mq9 mq9Var = (mq9) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                String strO7 = cwl1.o0(x340Var35, 2131953065);
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var35.g(iu30Var17)) && (iIntValue16 & 384) != 256) {
                    z = false;
                }
                x340 x340Var36 = x340Var35;
                Object objT22 = x340Var36.T();
                if (z || objT22 == fkj0.X) {
                    objT22 = new a6i(iu30Var17, (byte) 26);
                    x340Var36.s0(objT22);
                }
                Function0 function4 = (Function0) objT22;
                if (ihc1.y0(strO7)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar2 = new gbx(new y50(strO7), function4);
                ldx ldxVar = ldx.c;
                zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                if (mq9Var.a) {
                    x340Var36.i0(946582235);
                    x340Var36.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var36.i0(946631742);
                    haxVar = new hax(cwl1.o0(x340Var36, 2131953076));
                    x340Var36.r(false);
                }
                wro1.h(gbxVar2, ldxVar, (qim0) null, haxVar, (gdx) null, zzq0Var, false, (idn0) null, (ga80) null, t8i.a, x340Var36, 0, 6, 940);
                return rih1Var;
            case 17:
                return a(obj, obj2, obj3, obj4, obj5);
            case 18:
                return d(obj, obj2, obj3, obj4, obj5);
            case 19:
                return e(obj, obj2, obj3, obj4, obj5);
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                return h(obj, obj2, obj3, obj4, obj5);
            case 23:
                return i(obj, obj2, obj3, obj4, obj5);
            case 24:
                return j(obj, obj2, obj3, obj4, obj5);
            case 25:
                return k(obj, obj2, obj3, obj4, obj5);
            case 26:
                plb plbVar = (plb) obj2;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if (plbVar instanceof olb) {
                    x340 x340Var38 = x340Var37;
                    x340Var38.i0(721031216);
                    kkn.b((olb) plbVar, x340Var38, (iIntValue17 >> 3) & 14);
                    x340Var38.r(false);
                } else {
                    x340 x340Var39 = x340Var37;
                    x340Var39.i0(721064851);
                    x340Var39.r(false);
                }
                return rih1Var;
            case 27:
                return m(obj, obj2, obj3, obj4, obj5);
            case 28:
                return n(obj, obj2, obj3, obj4, obj5);
            default:
                aob aobVar = (aob) obj2;
                iu30 iu30Var18 = (iu30) obj3;
                x340 x340Var40 = (b0k) obj4;
                ((Number) obj5).intValue();
                boolean z21 = (ihc1.y0(aobVar.d) || ihc1.y0(aobVar.e)) ? false : true;
                uwr uwrVar6 = cbx.a;
                cua cuaVar2 = cbx.b(x340Var40).f;
                cr31 cr31VarB = er31.b(8.0f);
                mgx mgxVar = mgx.e;
                cvx cvxVar7 = cbx.b(x340Var40).b;
                cvx cvxVar8 = cbx.b(x340Var40).b;
                cvx cvxVar9 = cbx.b(x340Var40).b;
                x340 x340Var41 = x340Var40;
                if (z21) {
                    x340Var41.i0(-523175675);
                    cvx cvxVar10 = cbx.b(x340Var41).b;
                    x340Var41.r(false);
                    f2 = 2.0f;
                } else {
                    x340Var41.i0(-523174367);
                    cvx cvxVar11 = cbx.b(x340Var41).b;
                    x340Var41.r(false);
                    f2 = 16.0f;
                }
                zzq0 zzq0Var2 = new zzq0(16.0f, 16.0f, 16.0f, f2);
                cvx cvxVar12 = cbx.b(x340Var40).b;
                cwl1.b(anm1.N("audiobook_promo_banner", u291.f(uyn1.z(0.0f, 6.0f, 1, nim0Var), 1.0f)), (tl3) null, cr31VarB, mgxVar, zzq0Var2, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-892874138, new o3((byte) 10, aobVar, iu30Var18, z21), x340Var40), x340Var40, 0, 48, 2018);
                return rih1Var;
        }
    }
}
