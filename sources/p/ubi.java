package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ubi extends hab0 implements bv30 {
    public static final ubi N0;
    public static final ubi O0;
    public static final ubi P0;
    public static final ubi Q0;
    public static final ubi R0;
    public static final ubi S0;
    public static final ubi T0;
    public static final ubi U0;
    public static final ubi V0;
    public static final ubi W0;
    public static final ubi X;
    public static final ubi X0;
    public static final ubi Y;
    public static final ubi Y0;
    public static final ubi Z;
    public static final ubi Z0;
    public static final ubi a1;
    public static final ubi b;
    public static final ubi b1;
    public static final ubi c;
    public static final ubi c1;
    public static final ubi d;
    public static final ubi d1;
    public static final ubi e;
    public static final ubi e1;
    public static final ubi f;
    public static final ubi g;
    public static final ubi h;
    public static final ubi i;
    public static final ubi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new ubi(i2, (byte) 0);
        c = new ubi(i2, (byte) 1);
        d = new ubi(i2, (byte) 2);
        e = new ubi(i2, (byte) 3);
        f = new ubi(i2, (byte) 4);
        g = new ubi(i2, (byte) 5);
        h = new ubi(i2, (byte) 6);
        i = new ubi(i2, (byte) 7);
        t = new ubi(i2, (byte) 8);
        X = new ubi(i2, (byte) 9);
        Y = new ubi(i2, (byte) 10);
        Z = new ubi(i2, (byte) 11);
        N0 = new ubi(i2, (byte) 12);
        O0 = new ubi(i2, (byte) 13);
        P0 = new ubi(i2, (byte) 14);
        Q0 = new ubi(i2, (byte) 15);
        R0 = new ubi(i2, (byte) 16);
        S0 = new ubi(i2, (byte) 17);
        T0 = new ubi(i2, (byte) 18);
        U0 = new ubi(i2, (byte) 19);
        V0 = new ubi(i2, (byte) 20);
        W0 = new ubi(i2, (byte) 21);
        X0 = new ubi(i2, (byte) 22);
        Y0 = new ubi(i2, (byte) 23);
        Z0 = new ubi(i2, (byte) 24);
        a1 = new ubi(i2, (byte) 25);
        b1 = new ubi(i2, (byte) 26);
        c1 = new ubi(i2, (byte) 27);
        d1 = new ubi(i2, (byte) 28);
        e1 = new ubi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = true;
        boolean z2 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new tbi(iu30Var, (byte) 28);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if ((i2 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        Object objT2 = x340Var2.T();
        if (z || objT2 == m4cVar) {
            objT2 = new tbi(iu30Var, (byte) 29);
            x340Var2.s0(objT2);
        }
        pxd0.c(function0, (Function0) objT2, x340Var2, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((l1l) obj2).a;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new xei(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        m1l.a(0, (Function0) objT, x340Var2, (qim0) null, z);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        g7l g7lVar = (g7l) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(g7lVar) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            gto1.f(cwl1.o0(x340Var2, 2131958470), cwl1.o0(x340Var2, 2131958469), null, g7lVar.a, false, iu30Var, x340Var2, (i2 << 9) & 458752, 20);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        kdl kdlVar = ((hdl) obj2).a;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new xei(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new xei(iu30Var, (byte) 2);
            x340Var2.s0(objT2);
        }
        Function0 function1 = (Function0) objT2;
        boolean z3 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z3 || objT3 == m4cVar) {
            objT3 = new cci(iu30Var, (byte) 3);
            x340Var2.s0(objT3);
        }
        c921.b(kdlVar, function0, function1, (iu30) objT3, (qim0) null, x340Var2, 8);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ikl iklVar = (ikl) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        p60 p60Var = iklVar.b;
        boolean z = true;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.i(iklVar)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new dfi(iu30Var, iklVar, (byte) 0);
            x340Var2.s0(objT);
        }
        kln1.c(p60Var, null, (Function0) objT, x340Var2, 8, 10);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        xrd xrdVar = ((jkl) obj2).c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new cci(iu30Var, (byte) 6);
            x340Var2.s0(objT);
        }
        vpb1.a(xrdVar, (qim0) null, (iu30) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strN0;
        cll cllVar = (cll) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        long j = cllVar.b;
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.g;
        long jL0 = fdg1.l0(jfv.u(j, ngvVar), ngvVar);
        long jP = jfv.p(j, jL0);
        ngv ngvVar2 = ngv.f;
        long jL1 = fdg1.l0(jfv.u(jP, ngvVar2), ngvVar2);
        long jP2 = jfv.p(jfv.p(j, jL0), jL1);
        ngv ngvVar3 = ngv.e;
        long jL2 = fdg1.l0(jfv.u(jP2, ngvVar3), ngvVar3);
        if (jfv.u(jL0, ngvVar) > 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-210110994);
            strN0 = cwl1.n0(2131956637, new Object[]{Long.valueOf(jfv.u(jL0, ngvVar)), Long.valueOf(jfv.u(jL1, ngvVar2))}, x340Var2);
            x340Var2.r(false);
        } else if (jfv.u(jL1, ngvVar2) > 0) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-209971928);
            strN0 = cwl1.n0(2131958598, new Object[]{Long.valueOf(jfv.u(jL1, ngvVar2))}, x340Var3);
            x340Var3.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-209889592);
            strN0 = cwl1.n0(2131961574, new Object[]{Long.valueOf(jfv.u(jL2, ngvVar3))}, x340Var4);
            x340Var4.r(false);
        }
        int i2 = cllVar.a;
        String strU = cwl1.U(2131820568, i2, new Object[]{Integer.valueOf(i2), strN0}, x340Var);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        uwo1.e(strU, uyn1.x(nim0.a, 16.0f), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        Function0 function0;
        Function0 function1;
        Function0 function2;
        iu30 iu30Var;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        int i2;
        byte b2 = this.a;
        byte b3 = 4;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                hox hoxVar = hox.c;
                String strO0 = cwl1.o0(x340Var, 2131957480);
                if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var2)) && (iIntValue & 384) != 256) {
                    z = false;
                }
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new tbi(iu30Var2, (byte) 0);
                    x340Var2.s0(objT);
                }
                cto1.f(hoxVar, strO0, (Function0) objT, x340Var2, hox.d);
                return rih1Var;
            case 1:
                emf emfVar = (emf) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                boolean z2 = emfVar.f;
                boolean z3 = emfVar.q;
                ctf ctfVar = emfVar.a;
                int i3 = (iIntValue2 & 896) ^ 384;
                boolean z4 = (i3 > 256 && x340Var3.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                x340 x340Var4 = x340Var3;
                Object objT2 = x340Var4.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new tbi(iu30Var3, (byte) 1);
                    x340Var4.s0(objT2);
                }
                Function0 function9 = (Function0) objT2;
                boolean z5 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT3 = x340Var4.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new tbi(iu30Var3, (byte) 9);
                    x340Var4.s0(objT3);
                }
                Function0 function10 = (Function0) objT3;
                boolean z6 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT4 = x340Var4.T();
                if (z6 || objT4 == m4cVar) {
                    objT4 = new tbi(iu30Var3, (byte) 10);
                    x340Var4.s0(objT4);
                }
                Function0 function11 = (Function0) objT4;
                if (emfVar.l) {
                    x340Var4.i0(-271393485);
                    boolean z7 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT5 = x340Var4.T();
                    if (z7 || objT5 == m4cVar) {
                        objT5 = new tbi(iu30Var3, (byte) 11);
                        x340Var4.s0(objT5);
                    }
                    x340Var4.r(false);
                    function0 = (Function0) objT5;
                } else {
                    x340Var4.i0(-271326060);
                    x340Var4.r(false);
                    function0 = null;
                }
                boolean z8 = ctfVar instanceof btf;
                if (z8 || emfVar.d.isEmpty()) {
                    x340Var4.i0(-271125676);
                    x340Var4.r(false);
                    function1 = null;
                } else {
                    x340Var4.i0(-271194062);
                    boolean z9 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT6 = x340Var4.T();
                    if (z9 || objT6 == m4cVar) {
                        objT6 = new tbi(iu30Var3, (byte) 12);
                        x340Var4.s0(objT6);
                    }
                    x340Var4.r(false);
                    function1 = (Function0) objT6;
                }
                if (z8) {
                    x340Var4.i0(-271028212);
                    boolean z10 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT7 = x340Var4.T();
                    if (z10 || objT7 == m4cVar) {
                        objT7 = new tbi(iu30Var3, (byte) 13);
                        x340Var4.s0(objT7);
                    }
                    x340Var4.r(false);
                    function2 = (Function0) objT7;
                } else {
                    x340Var4.i0(-270954060);
                    x340Var4.r(false);
                    function2 = null;
                }
                boolean z11 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT8 = x340Var4.T();
                if (z11 || objT8 == m4cVar) {
                    objT8 = new tbi(iu30Var3, (byte) 14);
                    x340Var4.s0(objT8);
                }
                Function0 function12 = (Function0) objT8;
                if (z8) {
                    x340Var4.i0(-270666380);
                    x340Var4.r(false);
                    iu30Var = null;
                } else {
                    x340Var4.i0(-270764557);
                    boolean z12 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT9 = x340Var4.T();
                    if (z12 || objT9 == m4cVar) {
                        objT9 = new cci(iu30Var3, (byte) 0);
                        x340Var4.s0(objT9);
                    }
                    x340Var4.r(false);
                    iu30Var = (iu30) objT9;
                }
                boolean z13 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT10 = x340Var4.T();
                if (z13 || objT10 == m4cVar) {
                    objT10 = new tbi(iu30Var3, (byte) 15);
                    x340Var4.s0(objT10);
                }
                Function0 function13 = (Function0) objT10;
                boolean z14 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT11 = x340Var4.T();
                if (z14 || objT11 == m4cVar) {
                    objT11 = new tbi(iu30Var3, (byte) 2);
                    x340Var4.s0(objT11);
                }
                Function0 function14 = (Function0) objT11;
                if (emfVar.m) {
                    x340Var4.i0(-270382637);
                    boolean z15 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT12 = x340Var4.T();
                    if (z15 || objT12 == m4cVar) {
                        objT12 = new tbi(iu30Var3, (byte) 3);
                        x340Var4.s0(objT12);
                    }
                    x340Var4.r(false);
                    function3 = (Function0) objT12;
                } else {
                    x340Var4.i0(-270315212);
                    x340Var4.r(false);
                    function3 = null;
                }
                if (emfVar.n) {
                    x340Var4.i0(-270219856);
                    boolean z16 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT13 = x340Var4.T();
                    if (z16 || objT13 == m4cVar) {
                        objT13 = new tbi(iu30Var3, (byte) 4);
                        x340Var4.s0(objT13);
                    }
                    x340Var4.r(false);
                    function4 = (Function0) objT13;
                } else {
                    x340Var4.i0(-270149548);
                    x340Var4.r(false);
                    function4 = null;
                }
                if (emfVar.o) {
                    x340Var4.i0(-270052177);
                    boolean z17 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT14 = x340Var4.T();
                    if (z17 || objT14 == m4cVar) {
                        objT14 = new tbi(iu30Var3, (byte) 5);
                        x340Var4.s0(objT14);
                    }
                    x340Var4.r(false);
                    function5 = (Function0) objT14;
                } else {
                    x340Var4.i0(-269980908);
                    x340Var4.r(false);
                    function5 = null;
                }
                if (emfVar.f6p) {
                    x340Var4.i0(-269867417);
                    boolean z18 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT15 = x340Var4.T();
                    if (z18 || objT15 == m4cVar) {
                        objT15 = new tbi(iu30Var3, (byte) 6);
                        x340Var4.s0(objT15);
                    }
                    x340Var4.r(false);
                    function6 = (Function0) objT15;
                } else {
                    x340Var4.i0(-269788460);
                    x340Var4.r(false);
                    function6 = null;
                }
                if (!z3 || z2) {
                    x340Var4.i0(-269602956);
                    x340Var4.r(false);
                    function7 = null;
                } else {
                    x340Var4.i0(-269673264);
                    boolean z19 = (i3 > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                    Object objT16 = x340Var4.T();
                    if (z19 || objT16 == m4cVar) {
                        objT16 = new tbi(iu30Var3, (byte) 7);
                        x340Var4.s0(objT16);
                    }
                    x340Var4.r(false);
                    function7 = (Function0) objT16;
                }
                if (z3 && z2) {
                    x340Var4.i0(-269486706);
                    if ((i3 <= 256 || !x340Var4.g(iu30Var3)) && (iIntValue2 & 384) != 256) {
                        z = false;
                    }
                    Object objT17 = x340Var4.T();
                    if (z || objT17 == m4cVar) {
                        objT17 = new tbi(iu30Var3, (byte) 8);
                        x340Var4.s0(objT17);
                    }
                    x340Var4.r(false);
                    function8 = (Function0) objT17;
                } else {
                    x340Var4.i0(-269414476);
                    x340Var4.r(false);
                    function8 = null;
                }
                flf flfVar = new flf(function9, function10, function11, function0, function1, function2, function12, iu30Var, function13, function14, function3, function4, function5, function6, function7, function8);
                jwm jwmVar = emfVar.c;
                if (jwmVar == null) {
                    x340Var4.i0(-269325135);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-269325134);
                    buo1.d(emfVar.a, emfVar.b, jwmVar, emfVar.d, emfVar.e, emfVar.f, emfVar.g, emfVar.h, flfVar, null, emfVar.i, emfVar.j, emfVar.k, x340Var4, 0);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                fsx fsxVar = fsx.c;
                String strO1 = cwl1.o0(x340Var5, 2131957481);
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var4)) && (iIntValue3 & 384) != 256) {
                    z = false;
                }
                x340 x340Var6 = x340Var5;
                Object objT18 = x340Var6.T();
                if (z || objT18 == fkj0.X) {
                    objT18 = new tbi(iu30Var4, (byte) 16);
                    x340Var6.s0(objT18);
                }
                cto1.f(fsxVar, strO1, (Function0) objT18, x340Var6, fsx.d);
                return rih1Var;
            case 3:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if ((iIntValue4 & 384) == 0) {
                    iIntValue4 |= x340Var7.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 1153) != 1152)) {
                    String strO2 = cwl1.o0(x340Var8, 2131958468);
                    String strO3 = cwl1.o0(x340Var8, 2131958467);
                    pm31 pm31Var = new pm31(0);
                    z = (iIntValue4 & 896) == 256;
                    Object objT19 = x340Var8.T();
                    if (z || objT19 == fkj0.X) {
                        objT19 = new tbi(iu30Var5, (byte) 17);
                        x340Var8.s0(objT19);
                    }
                    cto1.h(strO2, strO3, anm1.N("choose-video-settings-row", bin.x(nim0.a, false, null, pm31Var, null, (Function0) objT19, 11)), true, x340Var8, 3072, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj5).intValue();
                h0p1.c(((agg) obj2).a, (b0k) obj4, 0);
                return rih1Var;
            case 5:
                int iIntValue5 = ((Number) obj5).intValue();
                j0p1.a((qat) obj2, null, (iu30) obj3, (b0k) obj4, (iIntValue5 & 896) | ((iIntValue5 >> 3) & 14));
                return rih1Var;
            case 6:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                String strO4 = cwl1.o0(b0kVar, 2131964005);
                qim0 qim0VarN = anm1.N("clips_empty_section_tag", u291.d(nim0Var, 1.0f));
                uwr uwrVar = cbx.a;
                jap1.l(uyn1.y(qim0VarN, cbx.b(b0kVar).b.b, cbx.b(b0kVar).b.f), null, strO4, null, null, null, null, null, b0kVar, 0, 506);
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj4;
                ((Number) obj5).intValue();
                enx enxVar = enx.c;
                String strO5 = cwl1.o0(x340Var9, 2131953942);
                x340 x340Var10 = x340Var9;
                Object objT20 = x340Var10.T();
                if (objT20 == fkj0.X) {
                    objT20 = nyf.c1;
                    x340Var10.s0(objT20);
                }
                kyo1.c(strO5, enxVar, (Function0) objT20, null, false, null, null, null, x340Var10, (enx.d << 3) | 384, 248);
                return rih1Var;
            case 8:
                ((Number) obj5).intValue();
                z1p1.b((b0k) obj4, 0);
                return rih1Var;
            case 9:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var11.g(iu30Var6)) && (iIntValue6 & 384) != 256) {
                    z = false;
                }
                x340 x340Var12 = x340Var11;
                Object objT21 = x340Var12.T();
                if (z || objT21 == fkj0.X) {
                    objT21 = new tbi(iu30Var6, (byte) 18);
                    x340Var12.s0(objT21);
                }
                c2p1.c(0, (Function0) objT21, x340Var12, null);
                return rih1Var;
            case 10:
                iyg iygVar = (iyg) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 48) == 0) {
                    i2 = ((iIntValue7 & 64) == 0 ? x340Var13.g(iygVar) : x340Var13.i(iygVar) ? 32 : 16) | iIntValue7;
                } else {
                    i2 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i2 |= x340Var13.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    x2p1.c(iygVar, iu30Var7, x340Var14, (i2 >> 3) & 126);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if (((gzg) obj2) instanceof fzg) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(-1573632678);
                    String strO6 = cwl1.o0(x340Var16, 2131959239);
                    if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var8)) && (iIntValue8 & 384) != 256) {
                        z = false;
                    }
                    Object objT22 = x340Var16.T();
                    if (z || objT22 == fkj0.X) {
                        objT22 = new tbi(iu30Var8, (byte) 19);
                        x340Var16.s0(objT22);
                    }
                    wro1.h(new gbx(new y50(strO6), (Function0) objT22), ldx.c, null, null, yla.r(x340Var16).a(), null, false, null, null, jdi.a, x340Var16, 0, 6, 988);
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(-1573297289);
                    x340Var17.r(false);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                mzg mzgVar = (mzg) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                String str = mzgVar.b;
                boolean z20 = mzgVar.c;
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z = false;
                }
                x340 x340Var19 = x340Var18;
                Object objT23 = x340Var19.T();
                if (z || objT23 == fkj0.X) {
                    objT23 = new tbi(iu30Var9, (byte) 20);
                    x340Var19.s0(objT23);
                }
                l3p1.g(str, z20, (Function0) objT23, null, mzgVar.d, x340Var19, 0);
                return rih1Var;
            case 13:
                zfh zfhVar = (zfh) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i4 = (iIntValue10 & 896) ^ 384;
                boolean z21 = (i4 > 256 && x340Var20.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var21 = x340Var20;
                Object objT24 = x340Var21.T();
                if (z21 || objT24 == m4cVar2) {
                    objT24 = new cci(iu30Var10, (byte) 1);
                    x340Var21.s0(objT24);
                }
                iu30 iu30Var11 = (iu30) objT24;
                if ((i4 <= 256 || !x340Var21.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                    z = false;
                }
                Object objT25 = x340Var21.T();
                if (z || objT25 == m4cVar2) {
                    objT25 = new cci(iu30Var10, (byte) 2);
                    x340Var21.s0(objT25);
                }
                p6p1.d(zfhVar, iu30Var11, (iu30) objT25, x340Var21, (iIntValue10 >> 3) & 14);
                return rih1Var;
            case 14:
                d7p1.b((akh) obj2, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 15:
                guh guhVar = (guh) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if (guhVar instanceof fuh) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(1782574798);
                    x340Var23.r(false);
                } else {
                    if (!(guhVar instanceof euh)) {
                        throw p3d1.k(x340Var22, -773783104, false);
                    }
                    x340 x340Var24 = x340Var22;
                    x340Var24.i0(-773779607);
                    euh euhVar = (euh) guhVar;
                    String str2 = euhVar.a;
                    String str3 = euhVar.b;
                    String str4 = euhVar.c;
                    if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var24.g(iu30Var12)) && (iIntValue11 & 384) != 256) {
                        z = false;
                    }
                    Object objT26 = x340Var24.T();
                    if (z || objT26 == fkj0.X) {
                        objT26 = new tbi(iu30Var12, (byte) 24);
                        x340Var24.s0(objT26);
                    }
                    t9p1.a(0, str2, str3, str4, (Function0) objT26, x340Var24, null);
                    x340Var24.r(false);
                }
                return rih1Var;
            case 16:
                kvh kvhVar = (mvh) obj2;
                x340 x340Var25 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (kvhVar instanceof lvh) {
                    x340 x340Var26 = x340Var25;
                    x340Var26.i0(-1060286733);
                    svh.b(null, x340Var26, 0);
                    x340Var26.r(false);
                } else {
                    if (!(kvhVar instanceof kvh)) {
                        throw p3d1.k(x340Var25, -1060287755, false);
                    }
                    x340 x340Var27 = x340Var25;
                    x340Var27.i0(-1060284475);
                    kvh kvhVar2 = kvhVar;
                    svh.a(kvhVar2.e, 0, kvhVar2.b, kvhVar2.c, kvhVar2.d, x340Var27, null);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 17:
                nb51.m((q9g1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 18:
                o9k o9kVar = (o9k) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                boolean z22 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var28.g(iu30Var13)) || (iIntValue12 & 384) == 256;
                x340 x340Var29 = x340Var28;
                Object objT27 = x340Var29.T();
                if (z22 || objT27 == fkj0.X) {
                    objT27 = new tbi(iu30Var13, (byte) 25);
                    x340Var29.s0(objT27);
                }
                mqo1.e((Function0) objT27, new i3u(7, false, false, false), null, apo.r(-972882525, new fei(o9kVar, (byte) 0), x340Var29), apo.r(1190419684, new fei(o9kVar, (byte) 1), x340Var29), apo.r(-941245403, new l2i(iu30Var13, o9kVar, b3), x340Var29), apo.r(1222056806, new sm(iu30Var13, (byte) 24), x340Var29), x340Var29, 1797120, 4);
                return rih1Var;
            case 19:
                h7w.e((pqk) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126, 4);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                String str5 = ((nrk) obj2).a;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar2).m;
                long j = cbx.a(b0kVar2).b.b;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                uwo1.e(str5, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
                return rih1Var;
            case 21:
                return a(obj, obj2, obj3, obj4, obj5);
            case 22:
                return d(obj, obj2, obj3, obj4, obj5);
            case 23:
                return e(obj, obj2, obj3, obj4, obj5);
            case 24:
                return f(obj, obj2, obj3, obj4, obj5);
            case 25:
                return g(obj, obj2, obj3, obj4, obj5);
            case 26:
                return h(obj, obj2, obj3, obj4, obj5);
            case 27:
                return i(obj, obj2, obj3, obj4, obj5);
            case 28:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                String strO7 = cwl1.o0(b0kVar3, 2131952177);
                qim0 qim0VarN2 = anm1.N("ContentEmpty", u291.f(uyn1.y(nim0Var, 16.0f, 16.0f), 1.0f));
                uwr uwrVar3 = cbx.a;
                uwo1.e(strO7, qim0VarN2, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
                return rih1Var;
            default:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar4 = cbx.a;
                qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var30).b.c, 0.0f, 2, qim0VarF2);
                boolean z23 = ((psl) obj2).a;
                z50 z50Var = z50.c;
                if (z23) {
                    x340 x340Var31 = x340Var30;
                    x340Var31.i0(-1357125379);
                    String strO8 = cwl1.o0(x340Var31, 2131959937);
                    if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var14)) && (iIntValue13 & 384) != 256) {
                        z = false;
                    }
                    Object objT28 = x340Var31.T();
                    if (z || objT28 == m4cVar3) {
                        objT28 = new xei(iu30Var14, (byte) 3);
                        x340Var31.s0(objT28);
                    }
                    jap1.l(qim0VarZ2, null, null, null, strO8, new gbx(z50Var, (Function0) objT28), new idx(), ifi.a, x340Var31, 12582912, 270);
                    x340Var31.r(false);
                } else {
                    x340 x340Var32 = x340Var30;
                    x340Var32.i0(-1356684528);
                    String strO9 = cwl1.o0(x340Var32, 2131959939);
                    String strO10 = cwl1.o0(x340Var32, 2131959938);
                    if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var32.g(iu30Var14)) && (iIntValue13 & 384) != 256) {
                        z = false;
                    }
                    Object objT29 = x340Var32.T();
                    if (z || objT29 == m4cVar3) {
                        objT29 = new xei(iu30Var14, (byte) 4);
                        x340Var32.s0(objT29);
                    }
                    jap1.l(qim0VarZ2, null, null, strO9, strO10, new gbx(z50Var, (Function0) objT29), new idx(), null, x340Var32, 0, 390);
                    x340Var32.r(false);
                }
                return rih1Var;
        }
    }
}
