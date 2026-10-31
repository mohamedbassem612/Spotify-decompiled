package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class say extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public say(int i, adj1 adj1Var, Function0 function0) {
        super(2);
        this.a = (byte) 10;
        this.b = i;
        this.c = adj1Var;
        this.d = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        qim0 qim0VarY;
        lee1 lee1Var;
        idx idxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xay.a((mhg1) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                xdy.c((zdy) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((lz9) obj4).g((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                oon1.h((a4z) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((imm1) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                guo1.z((String) obj4, (u7h) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                o820 o820Var = (o820) obj4;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(o820Var) | x340Var2.g(vu30Var) | x340Var2.e(i);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new wv1(o820Var, vu30Var, i, (byte) 11);
                        x340Var2.s0(objT);
                    }
                    h0p1.d(o820Var, (Function0) objT, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                ((h8x0) obj4).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 8:
                ((h8x0) obj4).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 9:
                ((h8x0) obj4).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 10:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                j06 j06Var = x340Var4.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    int iC = l1d.C(i);
                    nim0 nim0Var = nim0.a;
                    if (iC == 0) {
                        qim0VarY = uyn1.y(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), 16.0f, 8.0f);
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        qim0VarY = uyn1.x(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), 16.0f);
                    }
                    int iC2 = l1d.C(i);
                    if (iC2 == 0) {
                        x340Var4.i0(-1879485432);
                        lee1Var = cbx.d(x340Var4).h;
                        x340Var4.r(false);
                    } else {
                        if (iC2 != 1) {
                            throw p3d1.k(x340Var4, -1879487744, false);
                        }
                        x340Var4.i0(-1879483195);
                        lee1Var = cbx.d(x340Var4).d;
                        x340Var4.r(false);
                    }
                    lee1 lee1Var2 = lee1Var;
                    int iC3 = l1d.C(i);
                    if (iC3 == 0) {
                        idxVar = jdx.c;
                    } else {
                        if (iC3 != 1) {
                            eg.o();
                            return null;
                        }
                        idxVar = new idx(8);
                    }
                    adj1 adj1Var = (adj1) obj4;
                    Function0 function0 = (Function0) obj3;
                    mbh mbhVarA = jbh.a(h36.d, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    boolean z = x340Var4.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
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
                    uwo1.e(adj1Var.a().c.a, (qim0) null, lee1Var2, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var4, 0, 0, 1722);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarF);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA, x340Var4, lljVar);
                    nko1.H(xos0VarM2, x340Var4, lljVar2);
                    x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                    nko1.H(qim0VarE2, x340Var4, lljVar4);
                    String str = adj1Var.a().c.b;
                    if (str == null) {
                        str = "";
                    }
                    uwo1.e(str, uyn1.B(new wnb0(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var4, 0, 0, 1712);
                    cpn1.a(adj1Var.a().d.a, czd1.c, adj1Var.a().d.b.b() ? function0 : null, (qim0) null, idxVar, (djc0) null, x340Var4, 0, 40);
                    x340Var4.r(true);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                e9p1.d((lee1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                i9p1.e((fb30) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                v9p1.j((pc30) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                fae1.c((ym90) obj4, (gw70) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((ko30) obj4).V0.J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                lyg.c((lz30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                d1u.f(czo1.p(i | 1), (b0k) obj, (iu30) obj3, (ic40) obj4);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                d1u.o((k1u) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                s110.d((yxa0) obj4, (j2i) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((ng20) obj4).h((uf40) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                lnn1.a((ro30) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                eqn1.b((tf50) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                hqn1.b((jg50) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                crn1.b((kl50) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                nyn1.o((zv31) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                l0o1.b((ku50) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((cx0) obj4).e((b460) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((Number) obj2).intValue();
                rno1.c((q960) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                boo1.c((hd60) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ say(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public say(kl50 kl50Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 24;
        this.c = kl50Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public say(zv31 zv31Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 25;
        this.c = zv31Var;
        this.d = function0;
        this.b = i;
    }
}
