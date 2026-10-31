package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qfi extends hab0 implements bv30 {
    public static final qfi N0;
    public static final qfi O0;
    public static final qfi P0;
    public static final qfi Q0;
    public static final qfi R0;
    public static final qfi S0;
    public static final qfi T0;
    public static final qfi U0;
    public static final qfi V0;
    public static final qfi W0;
    public static final qfi X;
    public static final qfi X0;
    public static final qfi Y;
    public static final qfi Y0;
    public static final qfi Z;
    public static final qfi Z0;
    public static final qfi a1;
    public static final qfi b;
    public static final qfi b1;
    public static final qfi c;
    public static final qfi c1;
    public static final qfi d;
    public static final qfi d1;
    public static final qfi e;
    public static final qfi e1;
    public static final qfi f;
    public static final qfi g;
    public static final qfi h;
    public static final qfi i;
    public static final qfi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new qfi(i2, (byte) 0);
        c = new qfi(i2, (byte) 1);
        d = new qfi(i2, (byte) 2);
        e = new qfi(i2, (byte) 3);
        f = new qfi(i2, (byte) 4);
        g = new qfi(i2, (byte) 5);
        h = new qfi(i2, (byte) 6);
        i = new qfi(i2, (byte) 7);
        t = new qfi(i2, (byte) 8);
        X = new qfi(i2, (byte) 9);
        Y = new qfi(i2, (byte) 10);
        Z = new qfi(i2, (byte) 11);
        N0 = new qfi(i2, (byte) 12);
        O0 = new qfi(i2, (byte) 13);
        P0 = new qfi(i2, (byte) 14);
        Q0 = new qfi(i2, (byte) 15);
        R0 = new qfi(i2, (byte) 16);
        S0 = new qfi(i2, (byte) 17);
        T0 = new qfi(i2, (byte) 18);
        U0 = new qfi(i2, (byte) 19);
        V0 = new qfi(i2, (byte) 20);
        W0 = new qfi(i2, (byte) 21);
        X0 = new qfi(i2, (byte) 22);
        Y0 = new qfi(i2, (byte) 23);
        Z0 = new qfi(i2, (byte) 24);
        a1 = new qfi(i2, (byte) 25);
        b1 = new qfi(i2, (byte) 26);
        c1 = new qfi(i2, (byte) 27);
        d1 = new qfi(i2, (byte) 28);
        e1 = new qfi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new xei(iu30Var, (byte) 15);
            x340Var2.s0(objT);
        }
        upo1.f(0, (Function0) objT, x340Var2, (qim0) null);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m3o m3oVar = (m3o) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new cci(iu30Var, (byte) 9);
            x340Var2.s0(objT);
        }
        zro1.c(m3oVar, (iu30) objT, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1025) != 1024)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = x340Var2.i(context) | x340Var2.i(c9nVar);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new dfi(context, c9nVar, (byte) 1);
                x340Var2.s0(objT2);
            }
            cuo1.i(0, (Function0) objT2, x340Var2, (qim0) null);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g9o g9oVar = (g9o) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uqo uqoVar = g9oVar.a;
        String strB = tro1.B(uqoVar, x340Var, 0);
        if5 if5VarO = tro1.o(uqoVar);
        int i2 = g9oVar.b;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new cci(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        fuo1.e(strB, if5VarO, i2, (iu30) objT, (qim0) null, g9oVar.c, x340Var2, 28096);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        sjo sjoVar = (sjo) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.e(sjoVar.ordinal()) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            vjo.a(sjoVar, iu30Var, x340Var2, (i2 >> 3) & 126);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        puo puoVar = (puo) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(puoVar) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new xei(iu30Var, (byte) 16);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i3 == 256;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xei(iu30Var, (byte) 17);
                x340Var2.s0(objT2);
            }
            tyo1.b(puoVar, function0, (Function0) objT2, (qim0) null, x340Var2, (i2 >> 3) & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 384) == 0) {
            iIntValue |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1153) != 1152)) {
            wyo1.c((iIntValue >> 6) & 14, x340Var2, iu30Var, (qim0) null);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x1l x1lVar = (x1l) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        c2l c2lVar = x1lVar.a;
        float f2 = x1lVar.c;
        float f3 = x1lVar.d;
        boolean z = x1lVar.b;
        boolean z2 = x1lVar.e;
        boolean z3 = x1lVar.f;
        int i2 = x1lVar.g;
        boolean z4 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z4 || objT == fkj0.X) {
            objT = new xei(iu30Var, (byte) 23);
            x340Var2.s0(objT);
        }
        rqt0.b(c2lVar, (Function0) objT, i2, (qim0) null, f2, f3, z, z2, z3, (String) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v3l v3lVar = (v3l) obj2;
        ((Number) obj5).intValue();
        qxy0.d(v3lVar.a, (qim0) null, v3lVar.b, v3lVar.c, (lee1) null, 0L, 0L, (String) null, (b0k) obj4, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = (((Number) obj5).intValue() >> 3) & 112;
        b5p1.c(iIntValue, (b0k) obj4, (iu30) obj3, (qim0) null);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = ((t7r) obj2).a;
        uwr uwrVar = cbx.a;
        uwo1.e(str, nim0.a, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 48, 0, 2040);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function0 function0;
        gzu gzuVar = (gzu) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        jfx0 jfx0Var = gzuVar.a;
        long jH = jfv.h(gzuVar.c);
        if (gzuVar.b) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-139327827);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new xei(iu30Var, (byte) 24);
                x340Var2.s0(objT);
            }
            function0 = (Function0) objT;
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-139290008);
            x340Var3.r(false);
            function0 = null;
        }
        gfx0.a(jfx0Var, (qim0) null, jH, function0, x340Var, 0, 2);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rwi0 rwi0Var;
        xwi0 xwi0Var = (xwi0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        zdz0 zdz0Var = xwi0Var.a;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(xwi0Var);
        Object objT = x340Var.T();
        lnm lnmVar = null;
        if (zI || objT == m4cVar) {
            objT = new hzb(xwi0Var, lnmVar, (byte) 13);
            x340Var.s0(objT);
        }
        qxd0.t(zdz0Var, x340Var, (vu30) objT);
        x340Var.f0(1840451805, zdz0Var);
        List list = p110.a;
        fwi0 fwi0Var = zdz0Var.a;
        String str = fwi0Var.c;
        String str2 = fwi0Var.b;
        vvi0 vvi0Var = fwi0Var.d;
        if (vvi0Var.equals(bj20.O0)) {
            rwi0Var = new rwi0(fwi0Var.e, str2, str, true, null);
        } else if (vvi0Var instanceof uvi0) {
            rwi0Var = new rwi0(fwi0Var.e, str2, str, true, ((uvi0) vvi0Var).a);
        } else {
            if (!(vvi0Var instanceof tvi0)) {
                eg.o();
                return null;
            }
            rwi0Var = new rwi0(fwi0Var.e, str2, str, false, ((tvi0) vvi0Var).a);
        }
        rwi0 rwi0Var2 = rwi0Var;
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarF = u291.f(uyn1.x(nim0.a, 8.0f), 1.0f);
        mgx mgxVar = mgx.e;
        boolean z = zdz0Var.a.f;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z2 = true;
        boolean z3 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var.T();
        if (z3 || objT2 == m4cVar) {
            objT2 = new jii(iu30Var, (byte) 4);
            x340Var.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        boolean z4 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var.T();
        if (z4 || objT3 == m4cVar) {
            objT3 = new jii(iu30Var, (byte) 5);
            x340Var.s0(objT3);
        }
        Function0 function1 = (Function0) objT3;
        if ((i2 <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z2 = false;
        }
        Object objT4 = x340Var.T();
        if (z2 || objT4 == m4cVar) {
            objT4 = new jii(iu30Var, (byte) 6);
            x340Var.s0(objT4);
        }
        ouo1.s(1572864, function0, function1, (Function0) objT4, x340Var, mgxVar, rwi0Var2, qim0VarF, true, z);
        x340Var.r(false);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        Object obj6;
        long j;
        hax haxVar;
        Object obj7;
        long j2;
        gdx gdxVarR;
        hax haxVar2;
        Object obj8;
        Object obj9;
        Object obj10;
        String strA;
        String strK;
        Object obj11;
        Object obj12;
        Object obj13;
        qim0 qim0VarX;
        qim0 qim0Var;
        Uri uri;
        int i3;
        Object obj14;
        Object obj15;
        byte b2 = this.a;
        qcm qcmVar = qcm.a;
        tcm tcmVar = tcm.a;
        scm scmVar = scm.a;
        rcm rcmVar = rcm.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        byte b3 = 1;
        byte b4 = 0;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ksw kswVar = (ksw) obj;
                f9m f9mVar = (f9m) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                String str = f9mVar.a;
                boolean z2 = f9mVar.f;
                pe peVarA = ef.a(x340Var);
                boolean z3 = f9mVar.e;
                boolean z4 = z3 || z2;
                boolean z5 = f9mVar.h;
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(str) | x340Var2.h(z4);
                Object objT = x340Var2.T();
                Object obj16 = objT;
                if (zG || objT == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    x340Var2.s0(hrr0VarQ);
                    obj16 = hrr0VarQ;
                }
                ven0 ven0Var = (ven0) obj16;
                if (((Boolean) ven0Var.getValue()).booleanValue() || !z4 || z5) {
                    x340Var2.i0(-1050147643);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1050307169);
                    boolean zI = x340Var2.i(ven0Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        obj6 = objT2;
                        f4g f4gVar = new f4g(ven0Var, (byte) 12);
                        x340Var2.s0(f4gVar);
                        obj6 = f4gVar;
                    }
                    n9p1.e(kswVar, (iu30) obj6, x340Var2, iIntValue & 14);
                    x340Var2.r(false);
                }
                boolean zH = x340Var2.h(((Boolean) ven0Var.getValue()).booleanValue()) | x340Var2.g(str) | x340Var2.h(z4) | x340Var2.h(z5) | x340Var2.g(peVarA);
                Object objT3 = x340Var2.T();
                Object obj17 = objT3;
                if (zH || objT3 == m4cVar) {
                    mdt mdtVarA = yv91.a(new rj6(peVarA, z4, z5, ven0Var));
                    x340Var2.s0(mdtVarA);
                    obj17 = mdtVarA;
                }
                tob1 tob1Var = (tob1) obj17;
                if (z2) {
                    i2 = 2;
                } else {
                    i2 = z3 ? 1 : 0;
                }
                Function0 function0 = f9mVar.j;
                qim0 qim0VarX2 = nim0.a;
                if (function0 != null) {
                    x340Var2.i0(-588042402);
                    boolean z6 = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                    Object objT4 = x340Var2.T();
                    Object obj18 = objT4;
                    if (z6 || objT4 == m4cVar) {
                        xei xeiVar = new xei(iu30Var, (byte) 6);
                        x340Var2.s0(xeiVar);
                        obj18 = xeiVar;
                    }
                    qim0VarX2 = bin.x(qim0VarX2, false, (String) null, (pm31) null, (idn0) null, (Function0) obj18, 15);
                    z = false;
                } else {
                    z = false;
                    x340Var2.i0(-588041179);
                }
                x340Var2.r(z);
                qim0 qim0VarA = qim0VarX2;
                r8v r8vVar = (r8v) tob1Var.getValue();
                String str2 = f9mVar.a;
                boolean z7 = f9mVar.g;
                Integer num = f9mVar.d;
                Function0 function1 = f9mVar.k;
                String str3 = f9mVar.l;
                if (z7) {
                    x340Var2.i0(-1048890531);
                } else {
                    x340Var2.i0(-1048836715);
                    boolean zI2 = x340Var2.i(f9mVar) | ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256);
                    Object objT5 = x340Var2.T();
                    Object obj19 = objT5;
                    if (zI2 || objT5 == m4cVar) {
                        puh puhVar = new puh(f9mVar, iu30Var, (byte) 7);
                        x340Var2.s0(puhVar);
                        obj19 = puhVar;
                    }
                    qim0VarA = s161.a(qim0VarA, (iu30) obj19);
                }
                x340Var2.r(false);
                qim0 qim0Var2 = qim0VarA;
                boolean zI3 = x340Var2.i(f9mVar);
                Object objT6 = x340Var2.T();
                Object obj20 = objT6;
                if (zI3 || objT6 == m4cVar) {
                    mwh mwhVar = new mwh(f9mVar, (byte) 3);
                    x340Var2.s0(mwhVar);
                    obj20 = mwhVar;
                }
                iu30 iu30Var2 = (iu30) obj20;
                boolean z8 = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT7 = x340Var2.T();
                Object obj21 = objT7;
                if (z8 || objT7 == m4cVar) {
                    cci cciVar = new cci(iu30Var, (byte) 7);
                    x340Var2.s0(cciVar);
                    obj21 = cciVar;
                }
                irn1.g(r8vVar, i2, str2, iu30Var2, (iu30) obj21, function1, qim0Var2, z7, num, str3, x340Var2, 0);
                return rih1Var;
            case 1:
                jcm jcmVar = (jcm) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                gcm gcmVar = jcmVar.a;
                if (xzn1.l(gcmVar.a)) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(2025793206);
                    ucm ucmVar = gcmVar.c;
                    if (ucmVar.equals(rcmVar)) {
                        x340Var4.i0(203899249);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var4).b.b;
                        x340Var4.r(false);
                    } else if (ucmVar.equals(scmVar)) {
                        x340Var4.i0(203901688);
                        x340Var4.r(false);
                        uwr uwrVar2 = cbx.a;
                        j = ((vex) zex.a.e).m;
                    } else if (ucmVar.equals(tcmVar)) {
                        x340Var4.i0(203904183);
                        x340Var4.r(false);
                        uwr uwrVar3 = cbx.a;
                        j = ((vex) zex.a.b).b;
                    } else {
                        if (!ucmVar.equals(qcmVar)) {
                            throw p3d1.k(x340Var4, 203896520, false);
                        }
                        x340Var4.i0(203906645);
                        x340Var4.r(false);
                        uwr uwrVar4 = cbx.a;
                        j = ((vex) zex.a.b).a;
                    }
                    long j3 = j;
                    int iC = l1d.C(jcmVar.b);
                    if (iC == 0) {
                        x340Var4.i0(203912254);
                        x340Var4.r(false);
                        haxVar = jax.a;
                    } else {
                        if (iC != 1 && iC != 2) {
                            throw p3d1.k(x340Var4, 203910277, false);
                        }
                        x340Var4.i0(203917550);
                        haxVar = new hax(cwl1.o0(x340Var4, 2131954360));
                        x340Var4.r(false);
                    }
                    hax haxVar3 = haxVar;
                    String str4 = jcmVar.d;
                    if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var4.g(iu30Var3)) && (iIntValue2 & 384) != 256) {
                        b3 = 0;
                    }
                    Object objT8 = x340Var4.T();
                    if (b3 != 0 || objT8 == fkj0.X) {
                        obj7 = objT8;
                        xei xeiVar2 = new xei(iu30Var3, (byte) 7);
                        x340Var4.s0(xeiVar2);
                        obj7 = xeiVar2;
                    }
                    obj7 = objT8;
                    xyn1.c((Function0) obj7, (qim0) null, j3, haxVar3, str4, (gdx) null, x340Var4, 0, 34);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(2026631384);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 2:
                cdm cdmVar = (cdm) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                wcm wcmVar = cdmVar.a;
                if (xzn1.l(wcmVar.a)) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(1669080734);
                    ucm ucmVar2 = wcmVar.d;
                    if (u890.j(ucmVar2, rcmVar)) {
                        x340Var7.i0(-2024365135);
                        uwr uwrVar5 = cbx.a;
                        j2 = cbx.a(x340Var7).b.b;
                        x340Var7.r(false);
                    } else if (u890.j(ucmVar2, scmVar)) {
                        x340Var7.i0(-2024362696);
                        x340Var7.r(false);
                        uwr uwrVar6 = cbx.a;
                        j2 = ((vex) zex.a.e).m;
                    } else if (u890.j(ucmVar2, tcmVar)) {
                        x340Var7.i0(-2024360201);
                        x340Var7.r(false);
                        uwr uwrVar7 = cbx.a;
                        j2 = ((vex) zex.a.b).b;
                    } else {
                        if (!u890.j(ucmVar2, qcmVar)) {
                            throw p3d1.k(x340Var7, -2024367864, false);
                        }
                        x340Var7.i0(-2024357739);
                        x340Var7.r(false);
                        uwr uwrVar8 = cbx.a;
                        j2 = ((vex) zex.a.b).a;
                    }
                    long j4 = j2;
                    pcm pcmVar = wcmVar.i;
                    if (u890.j(pcmVar, ocm.a)) {
                        x340Var7.i0(-2024353009);
                        gdxVarR = yla.s(x340Var7);
                        x340Var7.r(false);
                    } else {
                        if (!u890.j(pcmVar, ncm.a)) {
                            throw p3d1.k(x340Var7, -2024355781, false);
                        }
                        x340Var7.i0(-2024350864);
                        gdxVarR = yla.r(x340Var7);
                        x340Var7.r(false);
                    }
                    gdx gdxVar = gdxVarR;
                    int iC2 = l1d.C(cdmVar.b);
                    if (iC2 == 0) {
                        x340Var7.i0(-2024345410);
                        x340Var7.r(false);
                        haxVar2 = jax.a;
                    } else {
                        if (iC2 != 1 && iC2 != 2) {
                            throw p3d1.k(x340Var7, -2024347387, false);
                        }
                        x340Var7.i0(-2024340114);
                        haxVar2 = new hax(cwl1.o0(x340Var7, 2131954360));
                        x340Var7.r(false);
                    }
                    hax haxVar4 = haxVar2;
                    String str5 = wcmVar.h;
                    if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var7.g(iu30Var4)) && (iIntValue3 & 384) != 256) {
                        b3 = 0;
                    }
                    Object objT9 = x340Var7.T();
                    if (b3 != 0 || objT9 == fkj0.X) {
                        obj8 = objT9;
                        xei xeiVar3 = new xei(iu30Var4, (byte) 8);
                        x340Var7.s0(xeiVar3);
                        obj8 = xeiVar3;
                    }
                    obj8 = objT9;
                    xyn1.c((Function0) obj8, (qim0) null, j4, haxVar4, str5, gdxVar, x340Var7, 0, 2);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(1670126488);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 3:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                ldx ldxVar = ldx.c;
                String strO0 = cwl1.o0(x340Var9, 2131951976);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return null;
                }
                y50 y50Var = new y50(strO0);
                if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var5)) && (iIntValue4 & 384) != 256) {
                    b3 = 0;
                }
                x340 x340Var10 = x340Var9;
                Object objT10 = x340Var10.T();
                if (b3 != 0 || objT10 == fkj0.X) {
                    obj9 = objT10;
                    xei xeiVar4 = new xei(iu30Var5, (byte) 9);
                    x340Var10.s0(xeiVar4);
                    obj9 = xeiVar4;
                }
                obj9 = objT10;
                wro1.h(new gbx(y50Var, (Function0) obj9), ldxVar, (qim0) null, (max) null, yla.r(x340Var10), (vzq0) null, false, (idn0) null, (ga80) null, ufi.a, x340Var10, 0, 6, 988);
                return rih1Var;
            case 4:
                lgm lgmVar = (lgm) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                igm igmVar = lgmVar.a;
                yim yimVar = lgmVar.b;
                if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var11.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                    b3 = 0;
                }
                x340 x340Var12 = x340Var11;
                Object objT11 = x340Var12.T();
                if (b3 != 0 || objT11 == fkj0.X) {
                    obj10 = objT11;
                    cci cciVar2 = new cci(iu30Var6, (byte) 8);
                    x340Var12.s0(cciVar2);
                    obj10 = cciVar2;
                }
                obj10 = objT11;
                dro.f(igmVar, yimVar, (qim0) null, (iu30) obj10, x340Var12, 0);
                return rih1Var;
            case 5:
                aqm aqmVar = (aqm) obj2;
                ((Number) obj5).intValue();
                x340 x340Var13 = (b0k) obj4;
                Object objK = x340Var13.k(AndroidCompositionLocals_androidKt.b);
                j06 j06Var = x340Var13.a;
                Context context = (Context) objK;
                zpm zpmVar = aqmVar.a;
                if (zpmVar instanceof xpm) {
                    strA = x0d.k(x340Var13, -2107364868, 2131962290, x340Var13, false);
                } else if (zpmVar.equals(ypm.a)) {
                    strA = x0d.k(x340Var13, -2107361547, 2131963483, x340Var13, false);
                } else {
                    if (!(zpmVar instanceof wpm)) {
                        throw p3d1.k(x340Var13, -2107367078, false);
                    }
                    x340Var13.i0(-903567509);
                    x340Var13.r(false);
                    idd1 idd1Var = r3f.a;
                    wpm wpmVar = (wpm) zpmVar;
                    strA = r3f.a(context, wpmVar.b, aqmVar.c, wpmVar.a, aqmVar.d, wpmVar.c, false);
                }
                String str6 = strA;
                if (!(zpmVar instanceof wpm)) {
                    strK = null;
                } else if (((wpm) zpmVar).c instanceof kol) {
                    strK = x0d.k(x340Var13, -903127340, 2131953678, x340Var13, false);
                } else {
                    x340Var13.i0(-903039734);
                    x340Var13.r(false);
                    strK = null;
                }
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarT = ltn1.t(u291.f(nim0Var2, 1.0f), aqmVar.b);
                uwr uwrVar9 = cbx.a;
                cvx cvxVar = cbx.b(x340Var13).b;
                era eraVar = een.Q0;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(eraVar, (byte) 29)), een.N0, x340Var13, 0);
                int iHashCode = Long.hashCode(x340Var13.T);
                xos0 xos0VarM = x340Var13.m();
                qim0 qim0VarE = zr7.E(x340Var13, qim0VarT);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var13, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var13, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var13, lljVar3);
                nko1.F(x340Var13);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var13, lljVar4);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarH = u291.h(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
                long j5 = cbx.a(x340Var13).b.b;
                u5j1 u5j1Var = d4o1.a;
                t1c.a(dug.f(qim0VarH, j5, u5j1Var), x340Var13, 0);
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var13, 0);
                int iHashCode2 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM2 = x340Var13.m();
                qim0 qim0VarE2 = zr7.E(x340Var13, nim0Var2);
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA, x340Var13, lljVar);
                nko1.H(xos0VarM2, x340Var13, lljVar2);
                x0d.q(iHashCode2, x340Var13, lljVar3, x340Var13);
                nko1.H(qim0VarE2, x340Var13, lljVar4);
                uwo1.e(str6, (qim0) null, cbx.d(x340Var13).j, cbx.a(x340Var13).b.b, new a0e1(3), (iu30) null, 0, false, new zic0(2), 0, (qx8) null, x340Var13, 0, 0, 1762);
                if (strK != null) {
                    x340Var13.i0(-1210380946);
                    cvx cvxVar2 = cbx.b(x340Var13).b;
                    uwo1.e(strK, uyn1.B(nim0Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var13).m, cbx.a(x340Var13).b.b, new a0e1(3), (iu30) null, 0, false, new zic0(2), 0, (qx8) null, x340Var13, 0, 0, 1760);
                    x340Var13.r(false);
                } else {
                    x340Var13.i0(-1210063506);
                    x340Var13.r(false);
                }
                x340Var13.r(true);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                t1c.a(dug.f(u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), cbx.a(x340Var13).b.b, u5j1Var), x340Var13, 0);
                x340Var13.r(true);
                return rih1Var;
            case 6:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                era eraVar2 = ((eqm) obj2).b;
                boolean z9 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var14.g(iu30Var7)) || (iIntValue6 & 384) == 256;
                x340 x340Var15 = x340Var14;
                Object objT12 = x340Var15.T();
                if (z9 || objT12 == fkj0.X) {
                    obj11 = objT12;
                    xei xeiVar5 = new xei(iu30Var7, (byte) 10);
                    x340Var15.s0(xeiVar5);
                    obj11 = xeiVar5;
                }
                obj11 = objT12;
                qim0 qim0VarX3 = bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) obj11, 15);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var15, 0);
                int iHashCode3 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM3 = x340Var15.m();
                qim0 qim0VarE3 = zr7.E(x340Var15, qim0VarX3);
                hzj.A.getClass();
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA2, x340Var15, y580.O0);
                nko1.H(xos0VarM3, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE3, x340Var15, y580.Y);
                tq60 tq60Var = new tq60(eraVar2);
                String strO1 = cwl1.o0(x340Var15, 2131953614);
                uwr uwrVar10 = cbx.a;
                uwo1.e(strO1, tq60Var, cbx.d(x340Var15).m, cbx.a(x340Var15).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2032);
                uwo1.e(cwl1.o0(x340Var15, 2131953609), new tq60(eraVar2), cbx.d(x340Var15).n, cbx.a(x340Var15).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2032);
                x340Var15.r(true);
                return rih1Var;
            case 7:
                zrm zrmVar = (bsm) obj2;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (zrmVar instanceof asm) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(1012333667);
                    x340Var17.r(false);
                } else {
                    if (!(zrmVar instanceof zrm)) {
                        throw p3d1.k(x340Var16, -1768460609, false);
                    }
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(-1768458476);
                    lgo1.h(zrmVar, x340Var18, (iIntValue7 >> 3) & 14);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 8:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                gox goxVar = gox.c;
                String strO2 = cwl1.o0(x340Var19, 2131954536);
                t2g t2gVar = new t2g(((nsm) obj2).a, false, (qex) null, 6);
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var19.g(iu30Var8)) && (iIntValue8 & 384) != 256) {
                    b3 = 0;
                }
                x340 x340Var20 = x340Var19;
                Object objT13 = x340Var20.T();
                if (b3 != 0 || objT13 == fkj0.X) {
                    obj12 = objT13;
                    xei xeiVar6 = new xei(iu30Var8, (byte) 11);
                    x340Var20.s0(xeiVar6);
                    obj12 = xeiVar6;
                }
                obj12 = objT13;
                kyo1.c(strO2, goxVar, (Function0) obj12, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var20, gox.d << 3, 184);
                return rih1Var;
            case 9:
                yvm yvmVar = (yvm) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                int iIntValue9 = ((Number) obj5).intValue();
                w4i1 w4i1Var = yvmVar.a;
                x340 x340Var21 = (b0k) obj4;
                boolean zA = ((add) x340Var21.k(ade0.c)).a();
                qim0 qim0Var3 = nim0.a;
                if (!(zA && sqe.v(w4i1Var)) && yvmVar.b) {
                    x340Var21.i0(-1812353190);
                    boolean z10 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var21.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                    Object objT14 = x340Var21.T();
                    if (z10 || objT14 == fkj0.X) {
                        obj13 = objT14;
                        xei xeiVar7 = new xei(iu30Var9, (byte) 12);
                        x340Var21.s0(xeiVar7);
                        obj13 = xeiVar7;
                    }
                    obj13 = objT14;
                    qim0VarX = bin.x(qim0Var3, false, (String) null, (pm31) null, (idn0) null, (Function0) obj13, 15);
                    qim0Var = qim0Var3;
                    x340Var21.r(false);
                } else {
                    x340Var21.i0(-1812390235);
                    x340Var21.r(false);
                    qim0VarX = qim0Var3;
                    qim0Var = qim0VarX;
                }
                jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var21, 0);
                int iHashCode4 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM4 = x340Var21.m();
                qim0 qim0VarE4 = zr7.E(x340Var21, qim0VarX);
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
                nko1.H(jw31VarA2, x340Var21, y580.O0);
                nko1.H(xos0VarM4, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE4, x340Var21, y580.Y);
                String str7 = w4i1Var.c;
                if (str7 == null || (uri = Uri.parse(str7)) == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                bmq0.a(uri2, (qim0) null, hcx.b, w4i1Var.a, w4i1Var.b, bro1.q(w4i1Var.d), 0L, false, x340Var21, 384, 194);
                String str8 = w4i1Var.b;
                uwr uwrVar11 = cbx.a;
                uwo1.e(str8, uyn1.B(qim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var21).j, cbx.a(x340Var21).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var21, 0, 0, 2032);
                x340Var21.r(true);
                return rih1Var;
            case 10:
                wxm wxmVar = (wxm) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    i3 = ((iIntValue10 & 64) == 0 ? x340Var22.g(wxmVar) : x340Var22.i(wxmVar) ? 32 : 16) | iIntValue10;
                } else {
                    i3 = iIntValue10;
                }
                if ((iIntValue10 & 384) == 0) {
                    i3 |= x340Var22.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    b3 = (i3 & 896) != 256 ? (byte) 0 : (byte) 1;
                    Object objT15 = x340Var23.T();
                    if (b3 != 0 || objT15 == fkj0.X) {
                        obj14 = objT15;
                        sm smVar = new sm(iu30Var10, (byte) 26);
                        x340Var23.s0(smVar);
                        obj14 = smVar;
                    }
                    obj14 = objT15;
                    dym.c(wxmVar, (vu30) obj14, (qim0) null, x340Var23, (i3 >> 3) & 14);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 11:
                d0n d0nVar = (d0n) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                zzm zzmVar = d0nVar.a;
                int i4 = (iIntValue11 & 896) ^ 384;
                boolean z11 = (i4 > 256 && x340Var24.g(iu30Var11)) || (iIntValue11 & 384) == 256;
                x340 x340Var25 = x340Var24;
                boolean zI4 = z11 | x340Var25.i(d0nVar);
                Object objT16 = x340Var25.T();
                Object obj22 = objT16;
                if (zI4 || objT16 == m4cVar2) {
                    ogi ogiVar = new ogi(iu30Var11, d0nVar, b4);
                    x340Var25.s0(ogiVar);
                    obj22 = ogiVar;
                }
                Function0 function2 = (Function0) obj22;
                int i5 = (x340Var25.i(d0nVar) ? 1 : 0) | (((i4 > 256 && x340Var25.g(iu30Var11)) || (iIntValue11 & 384) == 256) ? (byte) 1 : (byte) 0);
                Object objT17 = x340Var25.T();
                Object obj23 = objT17;
                if (i5 != 0 || objT17 == m4cVar2) {
                    ogi ogiVar2 = new ogi(iu30Var11, d0nVar, b3);
                    x340Var25.s0(ogiVar2);
                    obj23 = ogiVar2;
                }
                dio1.e(zzmVar, function2, (Function0) obj23, (qim0) null, x340Var25, 0);
                return rih1Var;
            case 12:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                String str9 = ((g2n) obj2).b;
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var26.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                    b3 = 0;
                }
                x340 x340Var27 = x340Var26;
                Object objT18 = x340Var27.T();
                if (b3 != 0 || objT18 == fkj0.X) {
                    obj15 = objT18;
                    xei xeiVar8 = new xei(iu30Var12, (byte) 13);
                    x340Var27.s0(xeiVar8);
                    obj15 = xeiVar8;
                }
                obj15 = objT18;
                gio1.a(0, str9, (Function0) obj15, x340Var27, (qim0) null);
                return rih1Var;
            case 13:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-440911711, new l2i((pln) obj2, (iu30) obj3, (byte) 5), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 14:
                return a(obj, obj2, obj3, obj4, obj5);
            case 15:
                ((Number) obj5).intValue();
                op71.g((b0k) obj4, u291.d(nim0Var, 1.0f));
                return rih1Var;
            case 16:
                return d(obj, obj2, obj3, obj4, obj5);
            case 17:
                return e(obj, obj2, obj3, obj4, obj5);
            case 18:
                return f(obj, obj2, obj3, obj4, obj5);
            case 19:
                return g(obj, obj2, obj3, obj4, obj5);
            case 20:
                return h(obj, obj2, obj3, obj4, obj5);
            case 21:
                return i(obj, obj2, obj3, obj4, obj5);
            case 22:
                azo1.b((((Number) obj5).intValue() >> 3) & 112, (b0k) obj4, (iu30) obj3, (qim0) null);
                return rih1Var;
            case 23:
                return j(obj, obj2, obj3, obj4, obj5);
            case 24:
                return k(obj, obj2, obj3, obj4, obj5);
            case 25:
                return m(obj, obj2, obj3, obj4, obj5);
            case 26:
                return n(obj, obj2, obj3, obj4, obj5);
            case 27:
                return o(obj, obj2, obj3, obj4, obj5);
            case 28:
                return p(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                String strO3 = cwl1.o0(b0kVar2, 2131953956);
                uwr uwrVar12 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                uwo1.e(strO3, anm1.N("messaging_slate_footer_element_text_tag", uyn1.x(nim0Var, 16.0f)), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2044);
                return rih1Var;
        }
    }
}
