package p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v4i extends hab0 implements bv30 {
    public static final v4i N0;
    public static final v4i O0;
    public static final v4i P0;
    public static final v4i Q0;
    public static final v4i R0;
    public static final v4i S0;
    public static final v4i T0;
    public static final v4i U0;
    public static final v4i V0;
    public static final v4i W0;
    public static final v4i X;
    public static final v4i X0;
    public static final v4i Y;
    public static final v4i Y0;
    public static final v4i Z;
    public static final v4i Z0;
    public static final v4i a1;
    public static final v4i b;
    public static final v4i b1;
    public static final v4i c;
    public static final v4i c1;
    public static final v4i d;
    public static final v4i d1;
    public static final v4i e;
    public static final v4i e1;
    public static final v4i f;
    public static final v4i g;
    public static final v4i h;
    public static final v4i i;
    public static final v4i t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new v4i(i2, (byte) 0);
        c = new v4i(i2, (byte) 1);
        d = new v4i(i2, (byte) 2);
        e = new v4i(i2, (byte) 3);
        f = new v4i(i2, (byte) 4);
        g = new v4i(i2, (byte) 5);
        h = new v4i(i2, (byte) 6);
        i = new v4i(i2, (byte) 7);
        t = new v4i(i2, (byte) 8);
        X = new v4i(i2, (byte) 9);
        Y = new v4i(i2, (byte) 10);
        Z = new v4i(i2, (byte) 11);
        N0 = new v4i(i2, (byte) 12);
        O0 = new v4i(i2, (byte) 13);
        P0 = new v4i(i2, (byte) 14);
        Q0 = new v4i(i2, (byte) 15);
        R0 = new v4i(i2, (byte) 16);
        S0 = new v4i(i2, (byte) 17);
        T0 = new v4i(i2, (byte) 18);
        U0 = new v4i(i2, (byte) 19);
        V0 = new v4i(i2, (byte) 20);
        W0 = new v4i(i2, (byte) 21);
        X0 = new v4i(i2, (byte) 22);
        Y0 = new v4i(i2, (byte) 23);
        Z0 = new v4i(i2, (byte) 24);
        a1 = new v4i(i2, (byte) 25);
        b1 = new v4i(i2, (byte) 26);
        c1 = new v4i(i2, (byte) 27);
        d1 = new v4i(i2, (byte) 28);
        e1 = new v4i(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4i(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c27 c27Var = (c27) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        c380 c380Var = c27Var.a;
        int i2 = c27Var.b;
        boolean z = c27Var.c;
        int i3 = (iIntValue & 896) ^ 384;
        boolean z2 = (i3 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new sm(iu30Var, (byte) 23);
            x340Var2.s0(objT);
        }
        vu30 vu30Var = (vu30) objT;
        boolean z3 = (i3 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z3 || objT2 == m4cVar) {
            objT2 = new wqf(iu30Var, (byte) 19);
            x340Var2.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        boolean z4 = (i3 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z4 || objT3 == m4cVar) {
            objT3 = new a6i(iu30Var, (byte) 8);
            x340Var2.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean z5 = (i3 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var2.T();
        if (z5 || objT4 == m4cVar) {
            objT4 = new a6i(iu30Var, (byte) 9);
            x340Var2.s0(objT4);
        }
        foo1.b(c380Var, i2, z, vu30Var, iu30Var2, function0, (Function0) objT4, (qim0) null, 16.0f, x340Var2, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        e87 e87Var = (e87) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = e87Var.a;
        boolean z = e87Var.c;
        qim0 qim0VarN = anm1.N("ac_chip_" + e87Var.b, nim0.a);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new a6i(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        wpo1.a(0, 0, str, (Function0) objT, x340Var2, qim0VarN, z);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0159  */
    /* JADX WARN: Code duplicated, block: B:37:0x019b  */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        int i3;
        Integer num;
        nim0 nim0Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var;
        boolean z;
        x340 x340Var2;
        b0k b0kVar;
        float f2;
        b0k b0kVar2;
        boolean z2;
        b0k b0kVar3 = (b0k) obj4;
        ((Number) obj5).intValue();
        ja7 ja7Var = ((ia7) obj2).a;
        int iOrdinal = ja7Var.ordinal();
        if (iOrdinal != 2) {
            i2 = iOrdinal != 3 ? 2131955487 : 2131955489;
        } else {
            i2 = 2131955490;
        }
        int iOrdinal2 = ja7Var.ordinal();
        if (iOrdinal2 == 0) {
            i3 = 2131955486;
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    num = null;
                } else {
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return null;
                    }
                    i3 = 2131955488;
                }
                nim0Var = nim0.a;
                qim0 qim0VarY = uyn1.y(u291.d(nim0Var, 1.0f), 32.0f, 16.0f);
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                mbhVarA = jbh.a(new d36(16.0f, false, new g21(een.N0, (byte) 28)), eraVar, b0kVar3, 0);
                x340 x340Var3 = (x340) b0kVar3;
                iHashCode = Long.hashCode(x340Var3.T);
                xos0VarM = x340Var3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarY);
                hzj.A.getClass();
                x340Var = (x340) b0kVar3;
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                if (ja7Var == ja7.c) {
                    x340Var.i0(-2122278046);
                    znx znxVar = znx.c;
                    zov0 zov0Var = cbx.b(b0kVar3).g;
                    z = false;
                    x340Var2 = x340Var;
                    b0kVar = b0kVar3;
                    f2 = 1.0f;
                    w0h1.a(znxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar, znx.d | 48, 56);
                    x340Var2.r(false);
                } else {
                    z = false;
                    x340Var2 = x340Var;
                    b0kVar = b0kVar3;
                    f2 = 1.0f;
                    x340Var2.i0(-2122087768);
                    x340Var2.r(false);
                }
                b0kVar2 = b0kVar;
                z2 = z;
                uwo1.e(cwl1.o0(b0kVar, i2), u291.f(nim0Var, f2), cbx.d(b0kVar).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
                if (num == null) {
                    x340Var2.i0(-2121863391);
                    x340Var2.r(z2);
                } else {
                    x340Var2.i0(-2121863390);
                    uwo1.e(cwl1.o0(b0kVar2, num.intValue()), u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                    x340Var2.r(z2);
                }
                x340Var2.r(true);
                return rih1.a;
            }
            i3 = 2131955485;
        }
        num = i3;
        nim0Var = nim0.a;
        qim0 qim0VarY2 = uyn1.y(u291.d(nim0Var, 1.0f), 32.0f, 16.0f);
        era eraVar2 = een.Q0;
        uwr uwrVar2 = cbx.a;
        cvx cvxVar2 = cbx.b(b0kVar3).b;
        mbhVarA = jbh.a(new d36(16.0f, false, new g21(een.N0, (byte) 28)), eraVar2, b0kVar3, 0);
        x340 x340Var4 = (x340) b0kVar3;
        iHashCode = Long.hashCode(x340Var4.T);
        xos0VarM = x340Var4.m();
        qim0VarE = zr7.E(b0kVar3, qim0VarY2);
        hzj.A.getClass();
        x340Var = (x340) b0kVar3;
        if (x340Var.a != null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(mbhVarA, b0kVar3, y580.O0);
        nko1.H(xos0VarM, b0kVar3, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
        nko1.F(b0kVar3);
        nko1.H(qim0VarE, b0kVar3, y580.Y);
        if (ja7Var == ja7.c) {
            x340Var.i0(-2122278046);
            znx znxVar2 = znx.c;
            zov0 zov0Var2 = cbx.b(b0kVar3).g;
            z = false;
            x340Var2 = x340Var;
            b0kVar = b0kVar3;
            f2 = 1.0f;
            w0h1.a(znxVar2, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar, znx.d | 48, 56);
            x340Var2.r(false);
        } else {
            z = false;
            x340Var2 = x340Var;
            b0kVar = b0kVar3;
            f2 = 1.0f;
            x340Var2.i0(-2122087768);
            x340Var2.r(false);
        }
        b0kVar2 = b0kVar;
        z2 = z;
        uwo1.e(cwl1.o0(b0kVar, i2), u291.f(nim0Var, f2), cbx.d(b0kVar).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
        if (num == null) {
            x340Var2.i0(-2121863391);
            x340Var2.r(z2);
        } else {
            x340Var2.i0(-2121863390);
            uwo1.e(cwl1.o0(b0kVar2, num.intValue()), u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            x340Var2.r(z2);
        }
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        co7 co7Var = (co7) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = co7Var.d;
        String str = co7Var.a;
        String str2 = co7Var.b;
        String str3 = co7Var.c;
        int i2 = co7Var.f;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new wqf(iu30Var, (byte) 20);
            x340Var2.s0(objT);
        }
        qro1.b(str, z, str2, str3, (iu30) objT, (qim0) null, i2, x340Var2, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        qq7 qq7Var = (qq7) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = ((iIntValue & 64) == 0 ? x340Var.g(qq7Var) : x340Var.i(qq7Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            qim0 qim0VarR = d7e.r(2.0f, u291.v(nim0.a, 220.0f), false);
            pq7 pq7Var = qq7Var.b;
            if (u890.j(pq7Var, oq7.a)) {
                x340Var2.i0(-362668355);
                dxo1.k(qim0VarR, x340Var2, 0);
                x340Var2.r(false);
            } else if (u890.j(pq7Var, mq7.a)) {
                x340Var2.i0(-362666310);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new a6i(iu30Var, (byte) 11);
                    x340Var2.s0(objT);
                }
                rwo1.h(0, (Function0) objT, x340Var2, qim0VarR);
                x340Var2.r(false);
            } else {
                if (!(pq7Var instanceof nq7)) {
                    throw p3d1.k(x340Var2, -362670062, false);
                }
                x340Var2.i0(-362662783);
                nq7 nq7Var = (nq7) pq7Var;
                cso1.b(nq7Var.a, nq7Var.b, nq7Var.c, nq7Var.d, nq7Var.e, qim0VarR, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                x9p1.a(((qy1) obj2).c, (((Number) obj5).intValue() >> 3) & 112, (b0k) obj4, (iu30) obj3, (qim0) null);
                return rih1Var;
            case 1:
                h02 h02Var = (h02) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i6 = (iIntValue & 896) ^ 384;
                int i7 = (iIntValue & 112) ^ 48;
                boolean z3 = ((i6 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((i7 > 32 && x340Var.i(h02Var)) || (iIntValue & 48) == 32);
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    z = false;
                    objT = new x4i(iu30Var, h02Var, (byte) 0);
                    x340Var2.s0(objT);
                } else {
                    z = false;
                }
                iu30 iu30Var2 = (iu30) objT;
                boolean z4 = (((i6 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) ? z : true) | (((i7 <= 32 || !x340Var2.i(h02Var)) && (iIntValue & 48) != 32) ? z : true);
                Object objT2 = x340Var2.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new x4i(iu30Var, h02Var, (byte) 1);
                    x340Var2.s0(objT2);
                }
                jap1.b(h02Var, (qim0) null, iu30Var2, (iu30) objT2, x340Var2, (iIntValue >> 3) & 14);
                return rih1Var;
            case 2:
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                x340 x340Var3 = (b0k) obj4;
                uvx uvxVar = (uvx) x340Var3.k(vvx.a);
                ogx ogxVar = ogx.e;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                cvx cvxVar2 = cbx.b(x340Var3).b;
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                cvx cvxVar4 = cbx.b(x340Var3).b;
                cvx cvxVar5 = cbx.b(x340Var3).b;
                uvx uvxVarA = uvx.a(uvxVar, ogxVar, 0, zzq0Var, zzq0VarH, new tvx(2.0f, 8.0f, 8.0f), (p3v) null, 453);
                boolean z5 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                Object objT3 = x340Var3.T();
                if (z5 || objT3 == fkj0.X) {
                    objT3 = new yth(iu30Var3, (byte) 26);
                    x340Var3.s0(objT3);
                }
                jto1.b((qim0) null, uvxVarA, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT3), (gbx) null, h5i.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, h5i.b, x340Var3, 100663360, 196608, 32445);
                return rih1Var;
            case 3:
                in2 in2Var = (in2) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                boolean z6 = x340Var6.S;
                n4k n4kVar = hmb0.t1;
                if (z6) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                String strO0 = cwl1.o0(x340Var4, 2131952104);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var4).d;
                Object objT4 = x340Var6.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = ovh.P0;
                    x340Var6.s0(objT4);
                }
                uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT4), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
                cvx cvxVar6 = cbx.b(x340Var4).b;
                op71.g(x340Var4, u291.h(nim0Var, 16.0f));
                int i8 = in2Var.a;
                uwo1.e(cwl1.U(2131820567, i8, new Object[]{Integer.valueOf(i8)}, x340Var4), (qim0) null, cbx.d(x340Var4).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
                op71.g(x340Var4, u291.h(nim0Var, cbx.b(x340Var4).b.a));
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var4, 0);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarF);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                i3a.l(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                boolean z7 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                Object objT5 = x340Var6.T();
                if (z7 || objT5 == m4cVar2) {
                    objT5 = new yth(iu30Var4, (byte) 27);
                    x340Var6.s0(objT5);
                }
                foo1.c(new gbx(z50Var, (Function0) objT5), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, m5i.a, x340Var4, 0, 48, 2044);
                x340Var6.r(true);
                x340Var6.r(true);
                return rih1Var;
            case 4:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var7, 0);
                x340 x340Var8 = x340Var7;
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var7, nim0Var);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                boolean z8 = x340Var9.S;
                n4k n4kVar2 = hmb0.t1;
                if (z8) {
                    x340Var9.l(n4kVar2);
                } else {
                    x340Var9.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA2, x340Var7, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM3, x340Var7, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var7, lljVar7);
                nko1.F(x340Var7);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE3, x340Var7, lljVar8);
                String strO1 = cwl1.o0(x340Var7, 2131952112);
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var7).d;
                Object objT6 = x340Var9.T();
                m4c m4cVar3 = fkj0.X;
                if (objT6 == m4cVar3) {
                    objT6 = ovh.Q0;
                    x340Var9.s0(objT6);
                }
                uwo1.e(strO1, s161.b(nim0Var, false, (iu30) objT6), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2040);
                cvx cvxVar7 = cbx.b(x340Var7).b;
                uwo1.e(eqq.n(nim0Var, 16.0f, x340Var7, 2131952111, x340Var7), (qim0) null, cbx.d(x340Var7).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2042);
                op71.g(x340Var7, u291.h(nim0Var, cbx.b(x340Var7).b.a));
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA2 = ew31.a(h36.e, een.Z, x340Var7, 0);
                int iHashCode4 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM4 = x340Var9.m();
                qim0 qim0VarE4 = zr7.E(x340Var7, qim0VarF2);
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar2);
                } else {
                    x340Var9.v0();
                }
                nko1.H(jw31VarA2, x340Var7, lljVar5);
                nko1.H(xos0VarM4, x340Var7, lljVar6);
                i3a.l(iHashCode4, x340Var7, lljVar7, x340Var7);
                nko1.H(qim0VarE4, x340Var7, lljVar8);
                boolean z9 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var9.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                Object objT7 = x340Var9.T();
                if (z9 || objT7 == m4cVar3) {
                    objT7 = new yth(iu30Var5, (byte) 28);
                    x340Var9.s0(objT7);
                }
                foo1.c(new gbx(z50Var, (Function0) objT7), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, n5i.a, x340Var7, 0, 48, 2044);
                x340Var9.r(true);
                x340Var9.r(true);
                return rih1Var;
            case 5:
                wt2 wt2Var = (wt2) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                int iC = l1d.C(2);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC == 1 || iC == 2 || iC == 3) {
                    i2 = 1;
                } else {
                    if (iC != 4) {
                        eg.o();
                        return null;
                    }
                    i2 = 2;
                }
                k4k.b(null, i2, wt2Var.a, false, null, b0kVar, 0, 25);
                return rih1Var;
            case 6:
                fv2 fv2Var = (fv2) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var10.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var11 = x340Var10;
                Object objT8 = x340Var11.T();
                if (z2 || objT8 == fkj0.X) {
                    objT8 = new ip0(iu30Var6, (byte) 12);
                    x340Var11.s0(objT8);
                }
                e9k.b(fv2Var, (xu30) objT8, (qim0) null, x340Var11, (iIntValue5 >> 3) & 14);
                return rih1Var;
            case 7:
                ox2 ox2Var = (ox2) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                ArrayList arrayList = ox2Var.c;
                String str = ox2Var.d;
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var12.g(iu30Var7)) && (iIntValue6 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var13 = x340Var12;
                Object objT9 = x340Var13.T();
                if (z2 || objT9 == fkj0.X) {
                    objT9 = new wqf(iu30Var7, (byte) 15);
                    x340Var13.s0(objT9);
                }
                sbl.a(arrayList, str, (iu30) objT9, (qim0) null, x340Var13, 0);
                return rih1Var;
            case 8:
                i63 i63Var = (i63) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                int iC2 = l1d.C(i63Var.g);
                if (iC2 == 0) {
                    x340 x340Var15 = x340Var14;
                    x340Var15.i0(-131181198);
                    mp10.a(i63Var, (qim0) null, 0, (idn0) null, iu30Var8, x340Var15, ((iIntValue7 >> 3) & 14) | ((iIntValue7 << 6) & 57344));
                    x340Var15.r(false);
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var14, -419875421, false);
                    }
                    x340 x340Var16 = x340Var14;
                    x340Var16.i0(-131073938);
                    pxd0.t(i63Var, iu30Var8, (qim0) null, x340Var16, (iIntValue7 >> 3) & 126);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 9:
                b0k b0kVar2 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                uwr uwrVar4 = cbx.a;
                cvx cvxVar8 = cbx.b(b0kVar2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                cvx cvxVar9 = cbx.b(b0kVar2).b;
                uwo1.e((String) obj2, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(b0kVar2).b.d, 5), cbx.d(b0kVar2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (iIntValue8 >> 3) & 14, 0, 2040);
                return rih1Var;
            case 10:
                crm0.b((ot3) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 11:
                vt3 vt3Var = (vt3) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                String str2 = vt3Var.a;
                String str3 = vt3Var.b;
                int i9 = (iIntValue9 & 896) ^ 384;
                boolean z10 = (i9 > 256 && x340Var17.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                x340 x340Var18 = x340Var17;
                Object objT10 = x340Var18.T();
                if (z10 || objT10 == m4cVar4) {
                    objT10 = new wqf(iu30Var9, (byte) 16);
                    x340Var18.s0(objT10);
                }
                iu30 iu30Var10 = (iu30) objT10;
                boolean z11 = (i9 > 256 && x340Var18.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                Object objT11 = x340Var18.T();
                if (z11 || objT11 == m4cVar4) {
                    objT11 = new yth(iu30Var9, (byte) 29);
                    x340Var18.s0(objT11);
                }
                Function0 function0 = (Function0) objT11;
                if ((i9 <= 256 || !x340Var18.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z2 = false;
                }
                Object objT12 = x340Var18.T();
                if (z2 || objT12 == m4cVar4) {
                    objT12 = new a6i(iu30Var9, (byte) 0);
                    x340Var18.s0(objT12);
                }
                u7n0.o(str2, str3, iu30Var10, function0, (Function0) objT12, (qim0) null, x340Var18, 0);
                return rih1Var;
            case 12:
                ((Number) obj5).intValue();
                sjo0.b(0, (b0k) obj4, (qim0) null, ((zt3) obj2).a);
                return rih1Var;
            case 13:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                h951 h951Var = ((bu3) obj2).b;
                boolean z12 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var19.g(iu30Var11)) || (iIntValue10 & 384) == 256;
                x340 x340Var20 = x340Var19;
                Object objT13 = x340Var20.T();
                if (z12 || objT13 == fkj0.X) {
                    objT13 = new a6i(iu30Var11, (byte) 1);
                    x340Var20.s0(objT13);
                }
                bwp0.b(h951Var, (Function0) objT13, null, x340Var20, 0);
                return rih1Var;
            case 14:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(1, (wux) null, apo.r(1220660424, new l2i((cv3) obj2, (iu30) obj3, (byte) 3), b0kVar3), b0kVar3, 3078, 6);
                return rih1Var;
            case 15:
                ew3 ew3Var = (ew3) obj2;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= x340Var21.g(ew3Var) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 1041) != 1040)) {
                    hxo1.a(cwl1.o0(x340Var22, 2131961014), mqo1.A(ew3Var.a), (qim0) null, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 16:
                dw3 dw3Var = (dw3) obj2;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= x340Var23.g(dw3Var) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 1041) != 1040)) {
                    zro1.g(cwl1.o0(x340Var24, 2131958477), mqo1.A(dw3Var.a), (qim0) null, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 17:
                fy3 fy3Var = (fy3) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                if ((iIntValue13 & 48) == 0) {
                    i3 = iIntValue13 | (x340Var25.g(fy3Var) ? 32 : 16);
                } else {
                    i3 = iIntValue13;
                }
                if ((iIntValue13 & 384) == 0) {
                    i3 |= x340Var25.i(iu30Var12) ? 256 : 128;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String str4 = fy3Var.a;
                    String str5 = fy3Var.b;
                    int i10 = i3 & 896;
                    boolean z13 = i10 == 256;
                    Object objT14 = x340Var26.T();
                    if (z13 || objT14 == m4cVar5) {
                        objT14 = new wqf(iu30Var12, (byte) 17);
                        x340Var26.s0(objT14);
                    }
                    iu30 iu30Var13 = (iu30) objT14;
                    z2 = i10 == 256;
                    Object objT15 = x340Var26.T();
                    if (z2 || objT15 == m4cVar5) {
                        objT15 = new wqf(iu30Var12, (byte) 18);
                        x340Var26.s0(objT15);
                    }
                    y7y0.b(str4, str5, iu30Var13, (iu30) objT15, x340Var26, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj5).intValue();
                b3o1.a((b0k) obj4, 0);
                return rih1Var;
            case 19:
                ((Number) obj5).intValue();
                b3o1.c(((gz5) obj2).b, (b0k) obj4, 0);
                return rih1Var;
            case 20:
                q16 q16Var = (q16) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                scx scxVarM = pno1.m(x340Var27);
                x340 x340Var28 = x340Var27;
                Object objT16 = x340Var28.T();
                m4c m4cVar6 = fkj0.X;
                if (objT16 == m4cVar6) {
                    objT16 = v8r.q((Object) null);
                    x340Var28.s0(objT16);
                }
                ven0 ven0Var = (ven0) objT16;
                if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var14)) && (iIntValue14 & 384) != 256) {
                    z2 = false;
                }
                boolean zI = x340Var28.i(ven0Var) | z2;
                Object objT17 = x340Var28.T();
                if (zI || objT17 == m4cVar6) {
                    objT17 = new wq9(iu30Var14, ven0Var, (byte) 9);
                    x340Var28.s0(objT17);
                }
                x74.f((Function0) objT17, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-686013995, new nzd(q16Var, ven0Var, scxVarM, (byte) 4), x340Var28), x340Var28, 12582912, 48, 1916);
                return rih1Var;
            case 21:
                cp6 cp6Var = (cp6) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                if ((iIntValue15 & 48) == 0) {
                    i4 = iIntValue15 | (x340Var29.g(cp6Var) ? 32 : 16);
                } else {
                    i4 = iIntValue15;
                }
                if ((iIntValue15 & 384) == 0) {
                    i4 |= x340Var29.i(iu30Var15) ? 256 : 128;
                }
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    int iC3 = l1d.C(cp6Var.c);
                    if (iC3 == 0) {
                        x340Var30.i0(-902624977);
                        nko1.k(x340Var30, 0);
                        x340Var30.r(false);
                    } else if (iC3 == 1) {
                        x340Var30.i0(-902623089);
                        z2 = (i4 & 896) == 256;
                        Object objT18 = x340Var30.T();
                        if (z2 || objT18 == fkj0.X) {
                            objT18 = new a6i(iu30Var15, (byte) 6);
                            x340Var30.s0(objT18);
                        }
                        nko1.a(cp6Var, (Function0) objT18, x340Var30, (i4 >> 3) & 14);
                        x340Var30.r(false);
                    } else {
                        if (iC3 != 2) {
                            throw p3d1.k(x340Var30, -902626735, false);
                        }
                        x340Var30.i0(-902619518);
                        x340Var30.r(false);
                    }
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 22:
                rq6 rq6Var = (rq6) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                String str6 = rq6Var.a;
                String str7 = rq6Var.b;
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var16)) && (iIntValue16 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var32 = x340Var31;
                Object objT19 = x340Var32.T();
                if (z2 || objT19 == fkj0.X) {
                    objT19 = new a6i(iu30Var16, (byte) 7);
                    x340Var32.s0(objT19);
                }
                flo1.a(0, str6, str7, (Function0) objT19, x340Var32);
                return rih1Var;
            case 23:
                return a(obj, obj2, obj3, obj4, obj5);
            case 24:
                return d(obj, obj2, obj3, obj4, obj5);
            case 25:
                return e(obj, obj2, obj3, obj4, obj5);
            case 26:
                pro1.b((((Number) obj5).intValue() >> 6) & 14, (b0k) obj4, (iu30) obj3, (qim0) null);
                return rih1Var;
            case 27:
                return f(obj, obj2, obj3, obj4, obj5);
            case 28:
                return g(obj, obj2, obj3, obj4, obj5);
            default:
                ks7 ks7Var = (ks7) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if ((iIntValue17 & 48) == 0) {
                    i5 = iIntValue17 | ((iIntValue17 & 64) == 0 ? x340Var33.g(ks7Var) : x340Var33.i(ks7Var) ? 32 : 16);
                } else {
                    i5 = iIntValue17;
                }
                if ((iIntValue17 & 384) == 0) {
                    i5 |= x340Var33.i(iu30Var17) ? 256 : 128;
                }
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    qim0 qim0VarR = d7e.r(2.0f, u291.v(nim0Var, 220.0f), false);
                    is7 is7Var = ks7Var.c;
                    if (u890.j(is7Var, hs7.a)) {
                        x340Var34.i0(-855714415);
                        dxo1.k(qim0VarR, x340Var34, 0);
                        x340Var34.r(false);
                    } else if (u890.j(is7Var, fs7.a)) {
                        x340Var34.i0(-855712370);
                        z2 = (i5 & 896) == 256;
                        Object objT20 = x340Var34.T();
                        if (z2 || objT20 == fkj0.X) {
                            objT20 = new a6i(iu30Var17, (byte) 12);
                            x340Var34.s0(objT20);
                        }
                        rwo1.h(0, (Function0) objT20, x340Var34, qim0VarR);
                        x340Var34.r(false);
                    } else {
                        if (!(is7Var instanceof gs7)) {
                            throw p3d1.k(x340Var34, -855716122, false);
                        }
                        x340Var34.i0(-855708843);
                        gs7 gs7Var = (gs7) is7Var;
                        cso1.b(gs7Var.a, gs7Var.b, gs7Var.c, gs7Var.d, gs7Var.e, qim0VarR, x340Var34, 0);
                        x340Var34.r(false);
                    }
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
        }
    }
}
