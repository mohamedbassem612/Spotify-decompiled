package p;

import android.R;
import android.net.Uri;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b5j extends hab0 implements bv30 {
    public static final b5j N0;
    public static final b5j O0;
    public static final b5j P0;
    public static final b5j Q0;
    public static final b5j R0;
    public static final b5j S0;
    public static final b5j T0;
    public static final b5j U0;
    public static final b5j V0;
    public static final b5j W0;
    public static final b5j X;
    public static final b5j X0;
    public static final b5j Y;
    public static final b5j Y0;
    public static final b5j Z;
    public static final b5j Z0;
    public static final b5j a1;
    public static final b5j b;
    public static final b5j b1;
    public static final b5j c;
    public static final b5j c1;
    public static final b5j d;
    public static final b5j d1;
    public static final b5j e;
    public static final b5j e1;
    public static final b5j f;
    public static final b5j g;
    public static final b5j h;
    public static final b5j i;
    public static final b5j t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new b5j(i2, (byte) 0);
        c = new b5j(i2, (byte) 1);
        d = new b5j(i2, (byte) 2);
        e = new b5j(i2, (byte) 3);
        f = new b5j(i2, (byte) 4);
        g = new b5j(i2, (byte) 5);
        h = new b5j(i2, (byte) 6);
        i = new b5j(i2, (byte) 7);
        t = new b5j(i2, (byte) 8);
        X = new b5j(i2, (byte) 9);
        Y = new b5j(i2, (byte) 10);
        Z = new b5j(i2, (byte) 11);
        N0 = new b5j(i2, (byte) 12);
        O0 = new b5j(i2, (byte) 13);
        P0 = new b5j(i2, (byte) 14);
        Q0 = new b5j(i2, (byte) 15);
        R0 = new b5j(i2, (byte) 16);
        S0 = new b5j(i2, (byte) 17);
        T0 = new b5j(i2, (byte) 18);
        U0 = new b5j(i2, (byte) 19);
        V0 = new b5j(i2, (byte) 20);
        W0 = new b5j(i2, (byte) 21);
        X0 = new b5j(i2, (byte) 22);
        Y0 = new b5j(i2, (byte) 23);
        Z0 = new b5j(i2, (byte) 24);
        a1 = new b5j(i2, (byte) 25);
        b1 = new b5j(i2, (byte) 26);
        c1 = new b5j(i2, (byte) 27);
        d1 = new b5j(i2, (byte) 28);
        e1 = new b5j(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5j(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        vcl vclVar = ((prs0) obj2).a;
        String strO0 = cwl1.o0(x340Var, vclVar.e ? 2131952923 : 2131952919);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new q4j(iu30Var, (byte) 23);
            x340Var2.s0(objT);
        }
        fn31.c(vclVar, strO0, (Function0) objT, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new q4j(iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        gto1.h(0, (Function0) objT, x340Var2, (qim0) null);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yus0 yus0Var = (yus0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = yus0Var.a;
        String str2 = yus0Var.b;
        String str3 = yus0Var.c;
        String str4 = yus0Var.d;
        String str5 = yus0Var.e;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(yus0Var)) || (iIntValue & 48) == 32) | ((i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new dfi((Object) iu30Var, (Object) yus0Var, (byte) 18);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new q4j(iu30Var, (byte) 25);
            x340Var2.s0(objT2);
        }
        sto1.f(str, str2, str3, str4, str5, function0, (Function0) objT2, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fuo1.i((vws0) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fuo1.j((bxs0) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strU;
        k1t0 k1t0Var = (k1t0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? x340Var.g(k1t0Var) : x340Var.i(k1t0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cnx cnxVar = cnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.d;
            cvx cvxVar = cbx.b(x340Var2).b;
            w0h1.a(cnxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var2, cnx.d | 48, 48);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.r(nim0Var, 8.0f));
            if (k1t0Var instanceof h1t0) {
                strU = x0d.k(x340Var2, -81539562, 2131959738, x340Var2, false);
            } else if (k1t0Var instanceof j1t0) {
                strU = x0d.k(x340Var2, -81536968, 2131959742, x340Var2, false);
            } else {
                if (!(k1t0Var instanceof i1t0)) {
                    throw p3d1.k(x340Var2, -81540234, false);
                }
                x340Var2.i0(1767424613);
                ytw0 ytw0Var = jfv.b;
                int i2 = ((i1t0) k1t0Var).a;
                int iU = (int) jfv.u(fdg1.k0(i2, ngv.e), ngv.f);
                if (iU != 0) {
                    x340Var2.i0(1767504779);
                    strU = cwl1.U(2131820792, iU, new Object[]{Integer.valueOf(iU)}, x340Var2);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1767661794);
                    strU = cwl1.U(2131820793, i2, new Object[]{Integer.valueOf(i2)}, x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            }
            uwo1.e(strU, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q2t0 q2t0Var = (q2t0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        a3t0 a3t0Var = q2t0Var.b;
        boolean z = q2t0Var.a;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new k4j(iu30Var, (byte) 4);
            x340Var2.s0(objT);
        }
        rwo1.g(a3t0Var, z, (iu30) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e6t0 e6t0Var = (e6t0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(e6t0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var2).a.b.c();
            cr31 cr31VarA = e6t0Var.a ? er31.a : er31.a(0);
            wat watVar = (wat) x340Var2.k(t4k.h);
            x340Var2.i0(1451031152);
            float fY = watVar.y(cbx.b(x340Var2).a.d);
            x340Var2.r(false);
            x340Var2.i0(1451033939);
            float fY2 = watVar.y(cbx.b(x340Var2).a.c);
            x340Var2.r(false);
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(6.0f);
            qim0 qim0VarN = anm1.N("PlaceholderCardElementTestTag", u291.f(nim0.a, 1.0f));
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            ioo1.c(qim0VarN, (pgx) null, new ydx(2.0f, 12.0f, 8.0f, new zzq0(8.0f, 8.0f, 8.0f, 8.0f)), (hw61) null, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(622382609, new r7j(cr31VarA, jC, (byte) 0), x340Var2), (xu30) null, (xu30) null, apo.r(-314751409, new s7j(fY2, jC, cr31VarB, (byte) 0), x340Var2), (xu30) null, (xu30) null, (xu30) null, apo.r(-1361279029, new s7j(fY, jC, cr31VarB, (byte) 1), x340Var2), x340Var2, 805306886, 1573248, 60922);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        p7t0 p7t0Var = ((f7t0) obj2).a;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
        wxo1.h(p7t0Var, qim0VarZ, (iu30) obj3, (b0k) obj4, 8 | (iIntValue & 896), 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i7t0 i7t0Var = (i7t0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        p7t0 p7t0Var = new p7t0(i7t0Var.a, i7t0Var.b, i7t0Var.c, huj.e(i7t0Var.d), i7t0Var.e, i7t0Var.f, i7t0Var.g, i7t0Var.h, i7t0Var.i, i7t0Var.j, i7t0Var.k, i7t0Var.l, i7t0Var.m);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new k4j(iu30Var, (byte) 5);
            x340Var2.s0(objT);
        }
        wxo1.h(p7t0Var, (qim0) null, (iu30) objT, x340Var2, 8, 2);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kct0 kct0Var = (kct0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        int i3 = (iIntValue & 112) ^ 48;
        boolean z = ((i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((i3 > 32 && x340Var.i(kct0Var)) || (iIntValue & 48) == 32);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new x7j(iu30Var, kct0Var, (byte) 0);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = ((i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | ((i3 > 32 && x340Var2.i(kct0Var)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new puh(iu30Var, kct0Var, (byte) 13);
            x340Var2.s0(objT2);
        }
        nyo1.g(kct0Var, (qim0) null, function0, (iu30) objT2, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        azo1.h((bft0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4;
        mmr0 mmr0Var;
        boolean z;
        int i5;
        String strK;
        int i6;
        int i7;
        byte b2 = this.a;
        byte b3 = 2;
        nim0 nim0Var = nim0.a;
        tms0 gbxVar = null;
        rih1 rih1Var = rih1.a;
        byte b4 = 1;
        switch (b2) {
            case 0:
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj4;
                x340Var.i0(812927052);
                String strO0 = ((agq0) obj2).b.a;
                if (strO0.length() == 0) {
                    strO0 = cwl1.o0(x340Var, 2131961092);
                }
                x340Var.r(false);
                int i8 = (iIntValue & 896) ^ 384;
                boolean z2 = (i8 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new q4j(iu30Var, (byte) 5);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean z3 = (i8 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new q4j(iu30Var, (byte) 6);
                    x340Var.s0(objT2);
                }
                w6p1.e(strO0, false, function0, (Function0) objT2, x340Var, 48);
                return rih1Var;
            case 1:
                lp61 lp61Var = (lp61) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue2 & 48) == 0) {
                    i2 = iIntValue2 | (x340Var2.g(lp61Var) ? 32 : 16);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var2.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    String str = (String) lp61Var.c;
                    String strB = lp61Var.b(x340Var3);
                    if5 if5Var = (if5) lp61Var.g.getValue();
                    if (str == null) {
                        x340Var3.i0(-1992995940);
                    } else {
                        x340Var3.i0(-1992995939);
                        boolean z4 = (i2 & 896) == 256;
                        Object objT3 = x340Var3.T();
                        if (z4 || objT3 == m4cVar2) {
                            objT3 = new q4j(iu30Var2, (byte) 7);
                            x340Var3.s0(objT3);
                        }
                        Function0 function1 = (Function0) objT3;
                        if (ihc1.y0(str)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbxVar = new gbx(new y50(str), function1);
                    }
                    x340Var3.r(false);
                    tms0 tms0Var = gbxVar;
                    lax laxVar = lp61Var.b;
                    if5 if5Var2 = (if5) lp61Var.h.getValue();
                    boolean z5 = (i2 & 896) == 256;
                    Object objT4 = x340Var3.T();
                    if (z5 || objT4 == m4cVar2) {
                        objT4 = new k4j(iu30Var2, (byte) 1);
                        x340Var3.s0(objT4);
                    }
                    i0p1.a(strB, if5Var, str, tms0Var, (iu30) objT4, if5Var2, (qim0) null, laxVar, x340Var3, 262208);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                gsr0 gsr0Var = (hsr0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                if (gsr0Var instanceof gsr0) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-1130976518);
                    gsr0 gsr0Var2 = gsr0Var;
                    String str2 = gsr0Var2.a;
                    Uri uri = gsr0Var2.b;
                    long j = gsr0Var2.c;
                    if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                        b4 = 0;
                    }
                    Object objT5 = x340Var5.T();
                    if (b4 != 0 || objT5 == m4cVar3) {
                        objT5 = new q4j(iu30Var3, (byte) 8);
                        x340Var5.s0(objT5);
                    }
                    who1.j(str2, uri, j, (String) null, (Function0) objT5, x340Var5, 0, 8);
                    x340Var5.r(false);
                } else {
                    if (!gsr0Var.equals(fsr0.a)) {
                        throw p3d1.k(x340Var4, -1130977682, false);
                    }
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-1130968419);
                    String strO1 = cwl1.o0(x340Var6, 2131961930);
                    Uri uri2 = Uri.EMPTY;
                    long j2 = u7h.k;
                    if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var6.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                        b4 = 0;
                    }
                    Object objT6 = x340Var6.T();
                    if (b4 != 0 || objT6 == m4cVar3) {
                        objT6 = new q4j(iu30Var3, (byte) 9);
                        x340Var6.s0(objT6);
                    }
                    who1.j(strO1, uri2, j2, "", (Function0) objT6, x340Var6, 3072, 0);
                    x340Var6.r(false);
                }
                return rih1Var;
            case 3:
                iu30 iu30Var4 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                c10 c10Var = (c10) ((lbt0) obj2).c.getOrDefault(t80.R0, null);
                x340 x340Var7 = (b0k) obj4;
                if (c10Var == null) {
                    x340Var7.i0(-1164792256);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-1164792255);
                    if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var7.g(iu30Var4)) && (iIntValue4 & 384) != 256) {
                        b4 = 0;
                    }
                    Object objT7 = x340Var7.T();
                    if (b4 != 0 || objT7 == fkj0.X) {
                        objT7 = new k4j(iu30Var4, (byte) 2);
                        x340Var7.s0(objT7);
                    }
                    hap1.d(c10Var, (qim0) null, (iu30) objT7, x340Var7, 0);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 4:
                kxr0 kxr0Var = (kxr0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    i3 = iIntValue5 | (x340Var8.g(kxr0Var) ? 32 : 16);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i3 |= x340Var8.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    Object objT8 = x340Var9.T();
                    if (objT8 == fkj0.X) {
                        objT8 = oqi.Q0;
                        x340Var9.s0(objT8);
                    }
                    byte b5 = 0;
                    jto1.b(s161.b(nim0Var, true, (iu30) objT8), new uvx(1, (pgx) null, 3, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(373853214, new d6j(kxr0Var, b5), x340Var9), (xu30) null, apo.r(-1260828065, new d6j(kxr0Var, b4), x340Var9), apo.r(-2097623008, new e6j(kxr0Var, iu30Var5, b5), x340Var9), (xu30) null, (xu30) null, apo.r(-313040541, new d6j(kxr0Var, b3), x340Var9), x340Var9, 805306432, 197040, 26108);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 5:
                pxr0 pxr0Var = (pxr0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    i4 = iIntValue6 | (x340Var10.g(pxr0Var) ? 32 : 16);
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i4 |= x340Var10.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    int iOrdinal = pxr0Var.b.ordinal();
                    if (iOrdinal == 0) {
                        x340Var11.i0(-683291406);
                        mmr0Var = new mmr0(cwl1.o0(x340Var11, 2131958061), cwl1.o0(x340Var11, 2131958067));
                        x340Var11.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw p3d1.k(x340Var11, -683293498, false);
                        }
                        x340Var11.i0(-683284237);
                        mmr0Var = new mmr0(cwl1.o0(x340Var11, 2131958065), cwl1.o0(x340Var11, 2131958068));
                        x340Var11.r(false);
                    }
                    String str3 = (String) mmr0Var.a;
                    String str4 = (String) mmr0Var.b;
                    era eraVar = een.Q0;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var11, 54);
                    int iHashCode = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM = x340Var11.m();
                    qim0 qim0VarE = zr7.E(x340Var11, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var11.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(hmb0.t1);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(mbhVarA, x340Var11, y580.O0);
                    nko1.H(xos0VarM, x340Var11, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var11, y580.R0);
                    nko1.F(x340Var11);
                    nko1.H(qim0VarE, x340Var11, y580.Y);
                    uwr uwrVar = cbx.a;
                    uwo1.e(str3, u291.f(nim0Var, 1.0f), cbx.d(x340Var11).j, cbx.a(x340Var11).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 48, 0, 2016);
                    cvx cvxVar = cbx.b(x340Var11).b;
                    op71.g(x340Var11, u291.h(nim0Var, 16.0f));
                    if (ihc1.y0(str4)) {
                        hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        return null;
                    }
                    y50 y50Var = new y50(str4);
                    boolean z6 = (i4 & 896) == 256;
                    Object objT9 = x340Var11.T();
                    if (z6 || objT9 == fkj0.X) {
                        objT9 = new q4j(iu30Var6, (byte) 10);
                        x340Var11.s0(objT9);
                    }
                    foo1.c(new gbx(y50Var, (Function0) objT9), new idx(), (qim0) null, (max) null, yla.s(x340Var11), (vzq0) null, (idn0) null, (ga80) null, g6j.a, (vu30) null, apo.r(1372928369, new pji(str4, (byte) 6), x340Var11), x340Var11, 805306368, 48, 1500);
                    x340Var11.r(true);
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
                    String strO2 = cwl1.o0(x340Var13, 2131958484);
                    String strO3 = cwl1.o0(x340Var13, 2131958483);
                    pm31 pm31Var = new pm31(0);
                    z = (iIntValue7 & 896) == 256;
                    Object objT10 = x340Var13.T();
                    if (z || objT10 == fkj0.X) {
                        objT10 = new q4j(iu30Var7, (byte) 11);
                        x340Var13.s0(objT10);
                    }
                    cto1.h(strO2, strO3, anm1.N("parental-hub-row", bin.x(nim0.a, false, (String) null, pm31Var, (idn0) null, (Function0) objT10, 11)), true, x340Var13, 3072, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 7:
                myr0 myr0Var = (myr0) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                boolean z7 = myr0Var.b;
                if ((iIntValue8 & 48) == 0) {
                    i5 = iIntValue8 | (x340Var14.g(myr0Var) ? 32 : 16);
                } else {
                    i5 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i5 |= x340Var14.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    if (z7) {
                        x340Var15.i0(-1461829003);
                        strK = myr0Var.c ? x0d.k(x340Var15, -1461790501, 2131958124, x340Var15, false) : x0d.k(x340Var15, -1461695672, 2131958125, x340Var15, false);
                        x340Var15.r(false);
                    } else {
                        strK = x0d.k(x340Var15, -1461575020, 2131958114, x340Var15, false);
                    }
                    String str5 = strK;
                    String strK2 = z7 ? x0d.k(x340Var15, -1461421415, 2131958123, x340Var15, false) : x0d.k(x340Var15, -1461324850, 2131958113, x340Var15, false);
                    pm31 pm31Var2 = new pm31(0);
                    z = (i5 & 896) == 256;
                    Object objT11 = x340Var15.T();
                    if (z || objT11 == fkj0.X) {
                        objT11 = new q4j(iu30Var8, (byte) 12);
                        x340Var15.s0(objT11);
                    }
                    yxo1.a(str5, strK2, bin.x(nim0.a, false, (String) null, pm31Var2, (idn0) null, (Function0) objT11, 11), true, x340Var15, 3072, 0);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 8:
                uyr0 uyr0Var = (uyr0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    i6 = iIntValue9 | (x340Var16.g(uyr0Var) ? 32 : 16);
                } else {
                    i6 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i6 |= x340Var16.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    uvx uvxVar = new uvx(1, (pgx) null, 3, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                    String strO4 = cwl1.o0(x340Var17, 2131959655);
                    boolean z8 = (i6 & 896) == 256;
                    Object objT12 = x340Var17.T();
                    if (z8 || objT12 == fkj0.X) {
                        objT12 = new q4j(iu30Var9, (byte) 13);
                        x340Var17.s0(objT12);
                    }
                    Function0 function2 = (Function0) objT12;
                    if (ihc1.y0(strO4)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    jto1.b(anm1.N("root_test_tag", nim0Var), uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO4), function2), (gbx) null, (xu30) null, apo.r(1708018075, new k6j(uyr0Var, (byte) 0), x340Var17), (xu30) null, apo.r(776709148, new k6j(uyr0Var, (byte) 1), x340Var17), apo.r(-1570527715, new e6j(uyr0Var, iu30Var9, b4), x340Var17), (xu30) null, (xu30) null, apo.r(-22303712, new k6j(uyr0Var, (byte) 2), x340Var17), x340Var17, 805306438, 197040, 26044);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 9:
                u5s0 u5s0Var = (u5s0) obj2;
                ((Number) obj5).intValue();
                x340 x340Var18 = (b0k) obj4;
                boolean zE = x340Var18.e(u5s0Var.b);
                Object objT13 = x340Var18.T();
                if (zE || objT13 == fkj0.X) {
                    objT13 = yv91.a(new vjh(u5s0Var, (byte) 7));
                    x340Var18.s0(objT13);
                }
                mmr0 mmr0Var2 = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
                Float fValueOf = Float.valueOf(0.4f);
                u7h u7hVar = (u7h) ((tob1) objT13).getValue();
                long j3 = u7hVar.a;
                fq7.g(u5s0Var.a, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(1824246843, new okg(v9c.t(new mmr0[]{mmr0Var2, new mmr0(fValueOf, u7hVar)}, 0.0f, 0.0f, 14), (byte) 20), x340Var18), x340Var18, 196608, 30);
                return rih1Var;
            case 10:
                hno1.d((a7s0) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 11:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-1615223410, new l2i((k7s0) obj2, (iu30) obj3, (byte) 15), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 12:
                kfs0 kfs0Var = (kfs0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    i7 = iIntValue10 | (x340Var19.g(kfs0Var) ? 32 : 16);
                } else {
                    i7 = iIntValue10;
                }
                if ((iIntValue10 & 384) == 0) {
                    i7 |= x340Var19.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    int i9 = kfs0Var.c;
                    String strU = cwl1.U(2131820745, i9, new Object[]{kfs0Var.b, Integer.valueOf(i9)}, x340Var20);
                    b4 = (i7 & 896) != 256 ? (byte) 0 : (byte) 1;
                    Object objT14 = x340Var20.T();
                    if (b4 != 0 || objT14 == fkj0.X) {
                        objT14 = new q4j(iu30Var10, (byte) 14);
                        x340Var20.s0(objT14);
                    }
                    vxo1.a(0, strU, (Function0) objT14, x340Var20, (qim0) null);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                mgs0 mgs0Var = (mgs0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                String str6 = mgs0Var.b;
                String str7 = mgs0Var.c;
                int i10 = (iIntValue11 & 896) ^ 384;
                boolean z9 = (i10 > 256 && x340Var21.g(iu30Var11)) || (iIntValue11 & 384) == 256;
                x340 x340Var22 = x340Var21;
                Object objT15 = x340Var22.T();
                if (z9 || objT15 == m4cVar4) {
                    objT15 = new q4j(iu30Var11, (byte) 15);
                    x340Var22.s0(objT15);
                }
                Function0 function3 = (Function0) objT15;
                z = (i10 > 256 && x340Var22.g(iu30Var11)) || (iIntValue11 & 384) == 256;
                Object objT16 = x340Var22.T();
                if (z || objT16 == m4cVar4) {
                    objT16 = new q4j(iu30Var11, (byte) 16);
                    x340Var22.s0(objT16);
                }
                iqo1.g(str6, str7, function3, (Function0) objT16, (qim0) null, x340Var22, 0);
                return rih1Var;
            case 14:
                gls0 gls0Var = (gls0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                fq7.g(gls0Var.a, (qim0) null, xay.d((ni20) null, (fra) null, 15).a(xay.e(3, (ni20) null)), xay.l(15, (ni20) null).a(xay.f(3, (ni20) null)), (String) null, apo.r(-2093930550, new ip0(iu30Var12, (byte) 17), x340Var23), x340Var23, 196608, 18);
                if (gls0Var.b) {
                    x340 x340Var24 = x340Var23;
                    x340Var24.i0(557941000);
                    int i11 = (iIntValue12 & 896) ^ 384;
                    boolean z10 = (i11 > 256 && x340Var24.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                    Object objT17 = x340Var24.T();
                    if (z10 || objT17 == m4cVar5) {
                        objT17 = new q4j(iu30Var12, (byte) 18);
                        x340Var24.s0(objT17);
                    }
                    Function0 function4 = (Function0) objT17;
                    String strO5 = cwl1.o0(x340Var24, 2131957398);
                    String strO6 = cwl1.o0(x340Var24, 2131957397);
                    String strO7 = cwl1.o0(x340Var24, 2131957399);
                    boolean z11 = (i11 > 256 && x340Var24.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                    Object objT18 = x340Var24.T();
                    if (z11 || objT18 == m4cVar5) {
                        objT18 = new q4j(iu30Var12, (byte) 19);
                        x340Var24.s0(objT18);
                    }
                    z50 z50Var = z50.c;
                    zgx zgxVar = new zgx(strO7, new gbx(z50Var, (Function0) objT18));
                    String strO8 = cwl1.o0(x340Var24, R.string.cancel);
                    if ((i11 <= 256 || !x340Var24.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                        b4 = 0;
                    }
                    Object objT19 = x340Var24.T();
                    if (b4 != 0 || objT19 == m4cVar5) {
                        objT19 = new q4j(iu30Var12, (byte) 20);
                        x340Var24.s0(objT19);
                    }
                    mqo1.d(function4, (i3u) null, (hux) null, strO5, strO6, zgxVar, new zgx(strO8, new gbx(z50Var, (Function0) objT19)), x340Var24, 2359296, 6);
                    x340Var24.r(false);
                } else {
                    x340 x340Var25 = x340Var23;
                    x340Var25.i0(559055760);
                    x340Var25.r(false);
                }
                return rih1Var;
            case 15:
                oms0 oms0Var = (pms0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                if (!oms0Var.equals(mms0.a)) {
                    if (oms0Var instanceof nms0) {
                        gbxVar = rms0.a;
                    } else {
                        if (!(oms0Var instanceof oms0)) {
                            eg.o();
                            return null;
                        }
                        gbxVar = new sms0(oms0Var.b);
                    }
                }
                if (gbxVar != null) {
                    int i12 = (iIntValue13 & 896) ^ 384;
                    boolean z12 = (i12 > 256 && x340Var26.g(iu30Var13)) || (iIntValue13 & 384) == 256;
                    x340 x340Var27 = x340Var26;
                    Object objT20 = x340Var27.T();
                    if (z12 || objT20 == m4cVar6) {
                        objT20 = new q4j(iu30Var13, (byte) 21);
                        x340Var27.s0(objT20);
                    }
                    Function0 function5 = (Function0) objT20;
                    z = (i12 > 256 && x340Var27.g(iu30Var13)) || (iIntValue13 & 384) == 256;
                    Object objT21 = x340Var27.T();
                    if (z || objT21 == m4cVar6) {
                        objT21 = new q4j(iu30Var13, (byte) 22);
                        x340Var27.s0(objT21);
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var27).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                    cvx cvxVar3 = cbx.b(x340Var27).b;
                    tro1.g(gbxVar, function5, (Function0) objT21, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7), x340Var27, 0);
                }
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5);
            case 19:
                yto1.k((wvs0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                return h(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case 24:
                return j(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return k(obj, obj2, obj3, obj4, obj5);
            case 26:
                return m(obj, obj2, obj3, obj4, obj5);
            case 27:
                return n(obj, obj2, obj3, obj4, obj5);
            case 28:
                return o(obj, obj2, obj3, obj4, obj5);
            default:
                uet0 uet0Var = (uet0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z13 = uet0Var.c;
                boolean z14 = uet0Var.b;
                z = (((iIntValue14 & 896) ^ 384) > 256 && x340Var28.g(iu30Var14)) || (iIntValue14 & 384) == 256;
                x340 x340Var29 = x340Var28;
                Object objT22 = x340Var29.T();
                if (z || objT22 == fkj0.X) {
                    objT22 = new q4j(iu30Var14, (byte) 26);
                    x340Var29.s0(objT22);
                }
                czo1.d(z13, z14, (Function0) objT22, null, x340Var29, 0, 8);
                return rih1Var;
        }
    }
}
