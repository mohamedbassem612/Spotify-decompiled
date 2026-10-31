package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q340 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q340(c380 c380Var, e601 e601Var, boolean z) {
        super(4);
        this.c = c380Var;
        this.d = e601Var;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        boolean z;
        int i;
        String str;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        boolean z3 = false;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                zam zamVar = (zam) obj2;
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                r340 r340Var = (r340) obj5;
                m360 m360Var = r340Var.b;
                bjx bjxVar = (bjx) obj6;
                m4c m4cVar = fkj0.X;
                if (zamVar instanceof xam) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1248667948);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar4);
                    nko1.H(xos0VarM, x340Var2, lljVar3);
                    x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE, x340Var2, lljVar);
                    String str2 = ((xam) zamVar).a;
                    boolean zI = x340Var2.i(bjxVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new o340(bjxVar, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var2.i(bjxVar);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new p340(bjxVar, (byte) 0);
                        x340Var2.s0(objT2);
                    }
                    boolean z4 = this.b;
                    sbl.j(str2, z4, function0, (iu30) objT2, x340Var2, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarB = uyn1.B(too1.y(qim0VarF, lhc.g(x340Var2).f), 24.0f, 24.0f, 24.0f, 0.0f, 8);
                    boolean zI3 = x340Var2.i(bjxVar);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        z = true;
                        objT3 = new o340(bjxVar, (byte) 1);
                        x340Var2.s0(objT3);
                    } else {
                        z = true;
                    }
                    sbl.m(m360Var, (Function0) objT3, qim0VarB, z4, x340Var2, 0);
                    x340Var2.r(z);
                    x340Var2.r(false);
                } else if (zamVar instanceof yam) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1247849300);
                    qim0 qim0VarX = u291.x(0.0f, 480.0f, 1, u291.D(u291.d(nim0Var, 1.0f), een.Q0, 2));
                    WeakHashMap weakHashMap2 = osl1.x;
                    w2g0.c(uyn1.z(0.0f, 24.0f, 1, too1.y(qim0VarX, lhc.g(x340Var3).f)), (tl3) null, apo.r(-1323435122, new tf(this.b, (Object) r340Var, (Object) bjxVar, (Object) zamVar, (byte) 12), x340Var3), x340Var3, 3072, 6);
                    x340Var3.r(false);
                } else {
                    if (!(zamVar instanceof wam)) {
                        throw p3d1.k(x340Var, 1345196175, false);
                    }
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-1245788544);
                    Object objT4 = x340Var4.T();
                    if (objT4 == m4cVar) {
                        objT4 = (wam) zamVar;
                        x340Var4.s0(objT4);
                    }
                    wam wamVar = (wam) objT4;
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var4, lljVar4);
                    nko1.H(xos0VarM2, x340Var4, lljVar3);
                    x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
                    nko1.H(qim0VarE2, x340Var4, lljVar);
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    int i2 = m360Var.a;
                    String strE = wamVar.e();
                    boolean z5 = this.b;
                    sbl.d(i2, 0, strE, x340Var4, qim0VarD3, z5);
                    qim0 qim0VarC = u291.c(u291.x(0.0f, 480.0f, 1, nim0Var), 1.0f);
                    WeakHashMap weakHashMap3 = osl1.x;
                    w2g0.c(uyn1.z(0.0f, 24.0f, 1, too1.y(qim0VarC, lhc.g(x340Var4).f)), (tl3) null, apo.r(1404012425, new tf(z5, (Object) r340Var, (Object) bjxVar, (Object) wamVar, (byte) 13), x340Var4), x340Var4, 3072, 6);
                    x340Var4.r(true);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                boolean z6 = (((iIntValue2 & 112) ^ 48) > 32 && x340Var5.e(iIntValue)) || (iIntValue2 & 48) == 32;
                c380 c380Var = (c380) obj6;
                x340 x340Var6 = x340Var5;
                Object objT5 = x340Var6.T();
                if (z6 || objT5 == fkj0.X) {
                    objT5 = yv91.a(new gf6(c380Var, iIntValue, (byte) 7));
                    x340Var6.s0(objT5);
                }
                tob1 tob1Var = (tob1) objT5;
                pkh0 pkh0Var = (pkh0) x340Var6.k(ige0.a);
                qim0 qim0VarN = anm1.N("main_content_item", u291.d(nim0Var, 1.0f));
                vzq0 vzq0Var = (vzq0) obj5;
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarN);
                hzj.A.getClass();
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC3, x340Var6, y580.O0);
                nko1.H(xos0VarM3, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE3, x340Var6, y580.Y);
                String str3 = ((xfh0) tob1Var.getValue()).b;
                int iC = l1d.C(((xfh0) tob1Var.getValue()).e);
                if (iC == 0) {
                    i = 1;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                otw.c(pkh0Var, new nkh0(str3, i, ((xfh0) tob1Var.getValue()).c), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                if (z2 && (str = ((xfh0) tob1Var.getValue()).d) != null && !ihc1.y0(str)) {
                    z3 = true;
                }
                kqn1.b(384, apo.r(2089525631, new lpk(tob1Var, (byte) 5), x340Var6), x340Var6, uyn1.w(h2c.a.a(u291.f(nim0Var, 1.0f), een.t), vzq0Var), z3);
                x340Var6.r(true);
                return rih1Var;
            default:
                int iIntValue3 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                c380 c380Var2 = (c380) obj6;
                x340 x340Var7 = (b0k) obj3;
                Object objT6 = x340Var7.T();
                if (objT6 == fkj0.X) {
                    objT6 = k301.X;
                    x340Var7.s0(objT6);
                }
                hm5.a(c380Var2, (qim0) null, (iu30) objT6, (tl3) null, "reactionsList", (iu30) null, apo.r(1535839710, new c601(iIntValue3, (e601) obj5, z2), x340Var7), x340Var7, 1597824, 42);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q340(c380 c380Var, boolean z, vzq0 vzq0Var) {
        super(4);
        this.c = c380Var;
        this.b = z;
        this.d = vzq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q340(boolean z, bjx bjxVar, r340 r340Var) {
        super(4);
        this.b = z;
        this.c = bjxVar;
        this.d = r340Var;
    }
}
