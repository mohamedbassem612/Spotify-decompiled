package p;

import android.net.Uri;
import app.rive.Result;
import app.rive.RiveFile;
import app.rive.ViewModelInstance;
import com.spotify.scrollsita.v1.Section;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nk31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk31(int i, res resVar, aj81 aj81Var, iu30 iu30Var, li81 li81Var) {
        super(2);
        this.a = (byte) 15;
        this.d = i;
        this.e = resVar;
        this.f = aj81Var;
        this.b = iu30Var;
        this.c = li81Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        boolean z;
        boolean z2;
        byte b = this.a;
        int i = this.d;
        Object obj3 = this.b;
        Object obj4 = this.f;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ok31.b((v8e0) obj6, (ViewModelInstance) obj4, (jk31) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ok31.c((RiveFile) obj6, (Result) obj4, (jk31) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ok31.d((v8e0) obj6, (Result) obj4, (jk31) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((er60) obj6).e(czo1.p(i | 1), this.b, (b0k) obj, (ksw) obj5, (iu30) obj4);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ob51.c((String) obj6, (Function0) obj4, (h9n) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((kzt) obj6).a((xtb0) obj4, (qim0) obj5, (Integer) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                nyn1.t((ru41) obj6, (yqg) obj4, (qim0) obj5, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                z351.a(czo1.p(i | 1), (String) obj6, (String) obj4, (b0k) obj, (iu30) obj3, (qim0) obj5);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                mgo1.f((uj51) obj6, (j2i) obj4, (qim0) obj5, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((tk71) obj6).e((dl71) obj4, (c380) obj3, (iu30) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                f2p1.k((ug71) obj6, (zg71) obj4, (c380) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((sm71) obj6).a((zg71) obj4, (iu30) obj3, (ksw) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                x2p1.d((dp71) obj6, (z6q) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                n3p1.f((os71) obj6, (Function0) obj4, (ls71) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                u4p1.F((xx71) obj6, (ze71) obj4, (lte) obj3, (iu30) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                iu30 iu30Var = (iu30) obj3;
                aj81 aj81Var = (aj81) obj4;
                res resVar = (res) obj6;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                li81 li81Var = (li81) obj5;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                int iC = l1d.C(i);
                nim0 nim0Var = nim0.a;
                if (iC == 0) {
                    x340Var2.i0(-834806388);
                    resVar.n(aj81Var, iu30Var, u291.f(nim0Var, 1.0f), x340Var2, 8);
                    x340Var2.r(false);
                    return rih1Var;
                }
                n4k n4kVar = hmb0.t1;
                if (iC != 1) {
                    if (iC != 2) {
                        throw p3d1.k(x340Var2, -834806803, false);
                    }
                    x340Var2.i0(-834772990);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar4);
                    nko1.H(xos0VarM, x340Var2, lljVar3);
                    x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE, x340Var2, lljVar);
                    resVar.n(aj81Var, iu30Var, u291.f(nim0Var, 1.0f), x340Var2, 8);
                    if (li81Var == null) {
                        x340Var2.i0(-2102576526);
                        z2 = false;
                        x340Var2.r(false);
                    } else {
                        z2 = false;
                        x340Var2.i0(-2102576525);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        resVar.e(li81Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), x340Var2, 8);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    x340Var2.r(z2);
                    return rih1Var;
                }
                x340Var2.i0(-834802136);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                vvx.a(xi81.c, apo.r(1080440601, new yi81(resVar, aj81Var, iu30Var), x340Var2), x340Var2, 48);
                if (li81Var == null) {
                    x340Var2.i0(-1625262139);
                    z = false;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1625262138);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    resVar.e(li81Var, uyn1.B(nim0Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), x340Var2, 8);
                    z = false;
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                x340Var2.r(z);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((nr00) obj6).e((vw81) obj4, (o0i) obj3, (qim0) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                sap1.b((hy81) obj6, (gw70) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((j2a) obj6).e((jy81) obj4, (o0i) obj3, (qim0) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((w0o) obj6).e((wt91) obj4, (o0i) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                men1.h(czo1.p(i | 1), (String) obj6, (Function0) obj4, (Function0) obj3, (b0k) obj, (qim0) obj5);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((lz9) obj6).l((bhb1) obj4, (iu30) obj3, (ksw) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((f70) obj6).r((nhb1) obj4, (iu30) obj3, (ksw) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 23:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    otw.c((maa) obj6, this.f, (qim0) obj5, (ipb1) obj3, x340Var4, (8 & (i >> 3)) << 3, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((orb1) obj6).d((i2c) obj4, (rk41) obj3, (Function0) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                y4o1.n((Uri) obj6, (String) obj4, (cwb1) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                f6o1.g((xwb1) obj6, (tyq) obj4, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1572865);
                gho1.j((c380) obj6, (String) obj4, this.d, (j2i) obj3, (qim0) obj5, (b0k) obj, iP);
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((wbc1) obj6).c((ubc1) obj4, (o0i) obj3, (qim0) obj5, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((kkc1) obj6).c((jkc1) obj4, (o0i) obj3, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk31(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk31(byte b, int i, Object obj, Object obj2, Object obj3, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = qim0Var;
        this.b = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk31(c380 c380Var, String str, int i, j2i j2iVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 27;
        this.e = c380Var;
        this.f = str;
        this.d = i;
        this.b = j2iVar;
        this.c = qim0Var;
    }
}
