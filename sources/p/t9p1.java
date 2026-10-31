package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Objects;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t9p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1693637030);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | 3072 | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("compact_creator_info", qim0Var3);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarN, (tl3) null, d4o1.a, (pgx) null, uzq0.b, (max) null, false, (idn0) null, (ga80) null, function0 != null ? new gbx(z50.c, function0) : null, (gbx) null, apo.r(425731203, new go7(str3, str, str2, (byte) 1), b0kVar3), b0kVar2, 0, 48, 1514);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new duh(str, str2, str3, qim0Var2, function0, i, (byte) 0);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1499712457);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(qim0Var) ? 4 : 2);
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function1 = hmb0.t1;
            if (z) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            smx smxVar = smx.c;
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            long j = ((vex) zscVar.b).j;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(smxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, b0kVar2, smx.d | 48, 48);
            String strO0 = cwl1.o0(b0kVar2, 2131956707);
            long j2 = cbx.a(b0kVar2).b.b;
            lee1 lee1Var = cbx.d(b0kVar2).j;
            cvx cvxVar = cbx.b(b0kVar2).b;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j2, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(h36.b, fraVar, b0kVar2, 54);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function0 = function1;
                b0kVar2.l(function0);
            } else {
                function0 = function1;
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            gra graVar = een.h;
            long j3 = ((vex) zscVar.b).j;
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarF3 = dug.f(nim0Var, j3, er31.b(2.0f));
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF3);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function0);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            uwo1.e(cwl1.o0(b0kVar2, 2131956705), h2c.a.a(nim0Var, een.i), cbx.d(b0kVar2).n, cbx.a(b0kVar2).a.c, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            us71.m(b0kVar2, true, true, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 12);
        }
    }

    public static final void c(aoe0 aoe0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-734370141);
        byte b2 = 2;
        int i2 = i | (b0kVar3.i(aoe0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952890);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).e.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 2, new zzq0(f, 8.0f, f, 8.0f), (vzq0) null, (tvx) null, (p3v) null, 499);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 29);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVarA, null, false, null, null, new gbx(new y50(strO0), function1), null, null, null, null, apo.r(683566699, new fje0(aoe0Var, b2), b0kVar3), nxi.a, null, null, apo.r(187630311, new fje0(aoe0Var, (byte) 3), b0kVar3), b0kVar2, 64, 197040, 26556);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(aoe0Var, function0, qim0Var2, i, (byte) 5);
        }
    }

    public static final void d(lqs0 lqs0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1699942066);
        int i2 = (x340Var.g(lqs0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new n601(iu30Var, (byte) 13);
                x340Var.s0(objT);
            }
            q0o1.a(qim0Var, new tt9((iu30) objT), pdj.a, apo.r(1016920175, new rt11(lqs0Var, iu30Var, (byte) 4), x340Var), x340Var, ((i2 >> 3) & 14) | 3456);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(lqs0Var, qim0Var, iu30Var, i, (byte) 10);
        }
    }

    public static final void e(ow1 ow1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1351746040);
        int i2 = i | (x340Var.g(ow1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            qim0 qim0VarF = dug.f(u291.f(qim0Var, 1.0f), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, true);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y1(function0, (byte) 15);
                x340Var.s0(objT);
            }
            s9p1.l(0, (Function0) objT, x340Var, wnb0VarQ);
            f(ow1Var, x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) ow1Var, (Object) function0, (Object) qim0Var, i, (byte) 23);
        }
    }

    public static final void f(ow1 ow1Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-988464904);
        char c = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ow1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = false;
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            qim0 qim0VarN = anm1.N("sort_button", nim0.a);
            String strO0 = cwl1.o0(x340Var, 2131951957);
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new pv1(ow1Var, b2);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            cr31 cr31VarB = er31.b(4.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ah1.N0;
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ah1.O0;
                x340Var.s0(objT3);
            }
            foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) objT3, (vu30) null, cr31VarB, 9), qim0VarN, null, gdxVarS, zzq0Var, null, null, null, null, s4i.a, x340Var, 384, 48, 1944);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) ow1Var, i, (byte) c);
        }
    }

    public static final void g(Bitmap bitmap, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(480194472);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tob1 tob1VarB = z95.b(z ? 1.0f : 0.0f, irn1.l0(0.0f, 200.0f, null, 5), "thumbnailAlpha", (iu30) null, x340Var, 3120, 20);
            cr31 cr31VarB = er31.b(12.0f);
            mmr0 mmr0Var = z2 ? new mmr0(new p3v(170.0f), new p3v(96.0f)) : new mmr0(new p3v(96.0f), new p3v(170.0f));
            float f = ((p3v) mmr0Var.a).a;
            float f2 = ((p3v) mmr0Var.b).a;
            boolean zG = x340Var.g(tob1VarB);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new ctd1(tob1VarB, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = i1p1.q(u291.n(i541.C(qim0Var, (iu30) objT), f, f2), cr31VarB);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, ((vex) zex.a.e).g, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            eso1.h(new pxa(new yk4(bitmap)), isl.a, u291.d(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 1797560, 384);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gie1(bitmap, z, z2, qim0Var, i, (byte) 0);
        }
    }

    public static final int h(kru kruVar) {
        Integer numValueOf = kruVar != null ? Integer.valueOf(kruVar.b) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 3;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 4;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return 5;
        }
        return (numValueOf != null && numValueOf.intValue() == 4) ? 6 : 1;
    }

    public static final boolean i(kru kruVar) {
        return kruVar != null && kruVar.b == 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    public static final String j(Context context, String str) {
        String string;
        switch (str) {
            case "SINGLE":
                string = context.getString(2131952199);
                break;
            case "AUDIOBOOK":
                string = context.getString(2131952195);
                break;
            case "EP":
                string = context.getString(2131952197);
                break;
            case "ALBUM":
                string = context.getString(2131952194);
                break;
            case "COMPILATION":
                string = context.getString(2131952196);
                break;
            case "PODCAST":
                string = context.getString(2131952198);
                break;
            default:
                string = context.getString(2131952194);
                break;
        }
        string.getClass();
        return string;
    }

    public static final zyp0 k(zyp0 zyp0Var, Optional optional) {
        return (zyp0) optional.map(new d4k(zyp0Var, (byte) 2)).orElseGet(new zb30(zyp0Var));
    }

    public static ksk0 l(String str) {
        return new ksk0(str, (byte) 15);
    }

    public static boolean m(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean n(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void o(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof r6o0) {
            ((r6o0) viewParent).g(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void p(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof s6o0) {
            ((s6o0) viewParent).j(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof r6o0) {
            ((r6o0) viewParent).k(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void q(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof r6o0) {
            ((r6o0) viewParent).d(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean r(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof r6o0) {
            return ((r6o0) viewParent).l(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void s(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof r6o0) {
            ((r6o0) viewParent).e(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static final lhg1 t(lhg1 lhg1Var, Float f, Float f2) {
        ruq0 ruq0Var = lhg1Var.b;
        return lhg1.a(lhg1Var, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, jch0.t(ruq0Var, f), jch0.t(ruq0Var, f2), 0.0d, 0.0d, 425983), false, false, 13);
    }
}
