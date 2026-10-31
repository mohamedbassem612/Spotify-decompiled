package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        boolean z;
        Object obj;
        m4c m4cVar = fkj0.X;
        diu diuVar = ziuVar.f;
        List list = diuVar.e;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1726449702);
        int i2 = i | (b0kVar2.i(ziuVar) ? 4 : 2) | (b0kVar2.i(qim0Var) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2.i0(1260793438);
            String strO0 = diuVar.c.a;
            if (ihc1.y0(strO0)) {
                strO0 = cwl1.o0(b0kVar2, 2131951993);
            }
            b0kVar2.r(false);
            String str = strO0;
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, b0kVar2, box.d, 30);
            Float fS = aym.s(list);
            float fFloatValue = fS != null ? fS.floatValue() : 1.0f;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarThen = u291.d(nim0Var, 1.0f).then(fFloatValue > 1.0f ? u291.f(nim0Var, 1.0f) : u291.c(nim0Var, 1.0f));
            boolean zB = diuVar.d.b.b();
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = b0kVar2.T();
            Object obj2 = objT;
            if (z2 || objT == m4cVar) {
                p1 p1Var = new p1(iu30Var, (byte) 24);
                b0kVar2.s0(p1Var);
                obj2 = p1Var;
            }
            qim0 qim0VarX = bin.x(qim0VarThen, zB, null, null, null, (Function0) obj2, 14);
            String strR = ila0.r(list);
            if (strR == null) {
                strR = "";
            }
            Uri uri = Uri.parse(strR);
            boolean z3 = i3 == 256;
            Object objT2 = b0kVar2.T();
            Object obj3 = objT2;
            if (z3 || objT2 == m4cVar) {
                qj qjVar = new qj(iu30Var, (byte) 11);
                b0kVar2.s0(qjVar);
                obj3 = qjVar;
            }
            iu30 iu30Var2 = (iu30) obj3;
            boolean zI = b0kVar2.i(ziuVar) | (i3 == 256);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                z = true;
                hq0 hq0Var = new hq0(ziuVar, iu30Var, (byte) 1);
                b0kVar2.s0(hq0Var);
                obj = hq0Var;
            } else {
                z = true;
                obj = objT3;
            }
            iu30 iu30Var3 = (iu30) obj;
            boolean z4 = i3 == 256 ? z : false;
            Object objT4 = b0kVar2.T();
            Object obj4 = objT4;
            if (z4 || objT4 == m4cVar) {
                qj qjVar2 = new qj(iu30Var, (byte) 12);
                b0kVar2.s0(qjVar2);
                obj4 = qjVar2;
            }
            boolean z5 = z;
            float f = fFloatValue;
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, iu30Var2, iu30Var3, (iu30) obj4, 0L, b0kVar2, 2359296, 0, 102302);
            cbx.a.getClass();
            eso1.h(ni7VarA, new jsl(str), qim0VarX, (p3v) null, (zvx) null, new ecx(f), mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 24576, 392);
            b0kVar2 = b0kVar2;
            gfx.b(18, apo.r(-1899609205, new iq0(ziuVar, iu30Var, z5 ? (byte) 1 : (byte) 0), b0kVar2), b0kVar2, 54);
            b0kVar2.r(z5);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1677976599);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(4.0f));
            Uri uri = Uri.parse(str);
            mrx mrxVar = mrx.c;
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(mrxVar, mrxVar), false, false, x340Var, 1073941552, 0, 3536);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 20);
        }
    }

    public static final void c(int i, int i2, xtb0 xtb0Var, b0k b0kVar, int i3) {
        Object fl9Var;
        lnm lnmVar;
        Object fl9Var2;
        int i4 = i;
        int i5 = i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(520630920);
        int i6 = (x340Var.e(i4) ? 4 : 2) | i3 | (x340Var.e(i5) ? 32 : 16) | (x340Var.i(xtb0Var) ? 256 : 128);
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(i4);
            int i7 = i6 & 112;
            int i8 = i6 & 14;
            boolean zI = (i8 == 4) | (i7 == 32) | x340Var.i(xtb0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                lnmVar = null;
                fl9Var = new fl9(i4, i5, xtb0Var, lnmVar, (byte) 0);
                x340Var.s0(fl9Var);
            } else {
                fl9Var = objT;
                lnmVar = null;
            }
            qxd0.t(numValueOf, x340Var, (vu30) fl9Var);
            Integer numValueOf2 = Integer.valueOf(i);
            boolean zI2 = (i7 == 32) | (i8 == 4) | x340Var.i(xtb0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                i4 = i;
                i5 = i2;
                fl9Var2 = new fl9(i4, i5, xtb0Var, lnmVar, (byte) 1);
                x340Var.s0(fl9Var2);
            } else {
                i5 = i2;
                fl9Var2 = objT2;
                i4 = i;
            }
            qxd0.s(xtb0Var, numValueOf2, (vu30) fl9Var2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9(i4, i5, xtb0Var, i3);
        }
    }

    public static final void d(jl9 jl9Var, j2i j2iVar, al9 al9Var, d0r d0rVar, yqg yqgVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        List list = jl9Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-475869696);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(jl9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(al9Var) : b0kVar3.i(al9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(d0rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(yqgVar) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            int iD = b2p1.D(jl9Var, yqgVar, b0kVar3, ((i2 >> 9) & 112) | i3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).d.b;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF = dug.f(qim0VarZ, j, er31.b(16.0f));
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            b0kVar2 = b0kVar3;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarJ = u291.j(0.0f, 260.0f, 1, u291.f(nim0Var, 1.0f));
            cua cuaVar2 = cbx.b(b0kVar2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, er31.b(16.0f));
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarQ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 8.0f, 16.0f, 0.0f, 8);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            dv20.l((i2 >> 3) & 14, j2iVar, b0kVar2, true);
            xtb0 xtb0VarA = aub0.a(iD < 0 ? 0 : iD, b0kVar2, 2);
            c(iD, list.size(), xtb0VarA, b0kVar2, 0);
            int size = list.size();
            m4c m4cVar = fkj0.X;
            boolean zE = b0kVar2.e(size);
            Object objT = b0kVar2.T();
            if (zE || objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0VarA, (byte) 8));
                b0kVar2.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            boolean zE2 = b0kVar2.e(size);
            Object objT2 = b0kVar2.T();
            if (zE2 || objT2 == m4cVar) {
                objT2 = yv91.a(new il9(xtb0VarA, size, (byte) 0));
                b0kVar2.s0(objT2);
            }
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ((tob1) objT2).getValue()).booleanValue();
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarD);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            tv80 tv80Var = al9.i;
            z1p1.a(jl9Var, iD, al9Var, d0rVar, qim0VarD2, xtb0VarA, false, b0kVar2, i3 | 1573376 | (i2 & 896) | (i2 & 7168), 0);
            h2c h2cVar = h2c.a;
            if (zBooleanValue) {
                b0kVar2.i0(583226391);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                zov0 zov0Var = cbx.b(b0kVar2).g;
                f(1, 6, b0kVar2, h2cVar.a(u291.h(qim0VarF2, 32.0f), graVar));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(583491627);
                b0kVar2.r(false);
            }
            if (zBooleanValue2) {
                b0kVar2.i0(583547985);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                f(2, 6, b0kVar2, h2cVar.a(u291.h(qim0VarF3, 32.0f), een.t));
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(583818987);
                b0kVar2.r(false);
            }
            us71.m(b0kVar2, true, true, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 12, i, jl9Var, j2iVar, al9Var, d0rVar, yqgVar);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        ldx ldxVar = ldx.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(771036059);
        int i2 = (x340Var.i(ldxVar) ? 4 : 2) | i | 48 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(qim0Var3, false, null, null, null, function0, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N(zyd1.g, uyn1.x(qim0VarX, 6.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            wro1.h(new gbx(z50.c, function0), ldxVar, null, null, yla.s(x340Var), null, false, null, null, edi.a, x340Var, (i2 << 3) & 112, 6, 988);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i);
        }
    }

    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        List listM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1638873068);
        int i3 = (x340Var.i(qim0Var) ? 32 : 16) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            int iC = l1d.C(i);
            if (iC == 0) {
                listM = p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))});
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                listM = p7h.M(new u7h[]{new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)});
            }
            t1c.a(dug.e(qim0Var, v9c.s(listM, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 2, i, i2, qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01a3  */
    public static final void g(float f, int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        nux nuxVar;
        iu30 iu30Var2 = iu30Var;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-950675928);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(c380Var) ? 4 : 2) | (b0kVar3.d(f) ? 32 : 16) | (b0kVar3.i(iu30Var2) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                b0kVar3.l(function0);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar3);
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            x0d.q(iHashCode, b0kVar3, lljVar, b0kVar3);
            Iterator itN = kk0.n(b0kVar3, qim0VarE, vu30Var, -1992165004, c380Var);
            while (itN.hasNext()) {
                s3t0 s3t0Var = (s3t0) itN.next();
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                qim0 qim0VarZ = u291.z(u291.v(i1p1.q(qim0Var3, er31.b(8.0f)), f), (fra) null, 3);
                boolean zI = b0kVar3.i(s3t0Var);
                Object objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    objT = new ux70(s3t0Var, (byte) 0);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
                boolean zI2 = ((i2 & 896) == 256) | b0kVar3.i(s3t0Var);
                Object objT2 = b0kVar3.T();
                if (zI2 || objT2 == m4cVar) {
                    z = false;
                    objT2 = new vx70(iu30Var2, s3t0Var, (byte) 0);
                    b0kVar3.s0(objT2);
                } else {
                    z = false;
                }
                qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT2, 15);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarX);
                hzj.A.getClass();
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(function0);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(gfh0VarC, b0kVar3, lljVar3);
                nko1.H(xos0VarM2, b0kVar3, lljVar2);
                x0d.q(iHashCode2, b0kVar3, lljVar, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, vu30Var);
                Uri uri = Uri.parse(s3t0Var.e.a);
                String str = s3t0Var.e.b;
                int iHashCode3 = str.hashCode();
                if (iHashCode3 != -1409097913) {
                    if (iHashCode3 != 92896879) {
                        if (iHashCode3 == 1879474642 && str.equals("playlist")) {
                            grx grxVar = grx.c;
                            nuxVar = new nux(grxVar, grxVar);
                        } else {
                            box boxVar = box.c;
                            nuxVar = new nux(boxVar, boxVar);
                        }
                    } else if (str.equals("album")) {
                        akx akxVar = akx.c;
                        nuxVar = new nux(akxVar, akxVar);
                    } else {
                        box boxVar2 = box.c;
                        nuxVar = new nux(boxVar2, boxVar2);
                    }
                } else if (str.equals("artist")) {
                    nkx nkxVar = nkx.c;
                    nuxVar = new nux(nkxVar, nkxVar);
                } else {
                    box boxVar3 = box.c;
                    nuxVar = new nux(boxVar3, boxVar3);
                }
                cbx.a.getClass();
                ecx ecxVar = (ecx) uwr.k.getValue();
                qim0 qim0VarV = u291.v(qim0Var3, f);
                Object objT3 = b0kVar3.T();
                if (objT3 == m4cVar) {
                    objT3 = vu70.P0;
                    b0kVar3.s0(objT3);
                }
                qim0 qim0VarS = exd0.s(qim0VarV, (iu30) objT3);
                Function0 function1 = function0;
                qim0 qim0Var4 = qim0Var3;
                int i3 = i2;
                b0k b0kVar4 = b0kVar3;
                eso1.e(uri, isl.a, qim0VarS, (p3v) null, (zvx) null, ecxVar, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar4, 3120, 0, 3536);
                String str2 = s3t0Var.b;
                lee1 lee1Var = cbx.d(b0kVar4).k;
                long j = cbx.a(b0kVar4).b.a;
                cjc0 cjc0Var = new cjc0(2);
                qim0 qim0VarA = h2c.a.a(qim0Var4, een.t);
                cvx cvxVar2 = cbx.b(b0kVar4).b;
                cvx cvxVar3 = cbx.b(b0kVar4).b;
                cvx cvxVar4 = cbx.b(b0kVar4).b;
                uwo1.e(str2, uyn1.B(qim0VarA, 4.0f, 0.0f, 4.0f, 4.0f, 2), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, b0kVar4, 1572864, 0, 1712);
                b0kVar4.r(true);
                b0kVar3 = b0kVar4;
                qim0Var3 = qim0Var4;
                function0 = function1;
                vu30Var = vu30Var;
                i2 = i3;
                iu30Var2 = iu30Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.r(false);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m340(c380Var, f, iu30Var, qim0Var2, i);
        }
    }

    public static final void h(String str, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2043020993);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            m((i2 & 14) | ((i2 >> 3) & 112), str, function0, x340Var, anm1.N("reflection_text_input", new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)));
            fq7.f(z, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(2046748677, new oa5(function1, (byte) 20), x340Var), x340Var, 1572870 | (i2 & 112), 30);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) str, z, (Object) function0, (Object) function1, i, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01f5  */
    public static final void i(dd11 dd11Var, vu30 vu30Var, qim0 qim0Var, Set set, b0k b0kVar, int i) {
        vu30 vu30Var2;
        qim0 qim0Var2;
        Set set2;
        boolean z;
        m4c m4cVar = fkj0.X;
        String str = dd11Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1868679396);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(dd11Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | 28032;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = {str};
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new opg(0, (byte) 14);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 0);
            ArrayList arrayList = new ArrayList();
            d7 d7Var = new d7(sc11.b, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (((List) ven0Var.getValue()).contains(((sc11) next).name())) {
                    arrayList.add(next);
                }
            }
            Object[] objArr2 = {str};
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new opg(0, (byte) 13);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var, 0);
            Object[] objArr3 = {str};
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ijz0.X0;
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) k5p1.s(objArr3, (Function0) objT3, x340Var, 48);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarZ, er31.b(16.0f)), ((vex) zex.a.e).i, d4o1.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            String str2 = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j(dd11Var, x340Var, i2 & 14);
            Set setP1 = o7h.p1(arrayList);
            boolean zI = x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new r9y0(ven0Var, (byte) 6);
                x340Var.s0(objT4);
            }
            z1p1.f(setP1, (iu30) objT4, u291.f(qim0Var3, 1.0f), x340Var, 0);
            x340Var.r(true);
            String str3 = (String) ven0Var2.getValue();
            String str4 = (String) ven0Var2.getValue();
            if (arrayList.isEmpty()) {
                if (str4 != null && !ihc1.y0(str4)) {
                    str2 = str4;
                }
                if (str2 != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            boolean zI2 = x340Var.i(ven0Var3);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new g8y0(ven0Var3, (byte) 7);
                x340Var.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            boolean zG = ((i2 & 112) == 32) | x340Var.g(arrayList) | x340Var.i(ven0Var2);
            Object objT6 = x340Var.T();
            if (zG || objT6 == m4cVar) {
                vu30Var2 = vu30Var;
                objT6 = new d4v0(vu30Var2, arrayList, ven0Var2, (byte) 17);
                x340Var.s0(objT6);
            } else {
                vu30Var2 = vu30Var;
            }
            h(str3, z, function0, (Function0) objT6, x340Var, 0);
            x340Var.r(true);
            if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                x340Var.i0(1539925297);
                String str5 = (String) ven0Var2.getValue();
                if (str5 == null) {
                    str5 = "";
                }
                boolean zI3 = x340Var.i(ven0Var2) | x340Var.i(ven0Var3);
                Object objT7 = x340Var.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new xs3(ven0Var2, ven0Var3, (byte) 16);
                    x340Var.s0(objT7);
                }
                ud11.d(0, str5, x340Var, (iu30) objT7);
                x340Var.r(false);
            } else {
                x340Var.i0(1540129990);
                x340Var.r(false);
            }
            set2 = w7x.a;
            qim0Var2 = qim0Var3;
        } else {
            vu30Var2 = vu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
            set2 = set;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, dd11Var, vu30Var2, qim0Var2, set2, (byte) 8);
        }
    }

    public static final void j(dd11 dd11Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0VarR;
        String str = dd11Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-796373095);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dd11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str2 = str == null ? dd11Var.d : str;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (str2 != null) {
                x340Var.i0(-1246623698);
                if (str != null) {
                    qim0 qim0VarH = u291.h(nim0Var, 56.0f);
                    cbx.a.getClass();
                    qim0VarR = d7e.r(uwr.d().a, qim0VarH, true);
                } else {
                    qim0VarR = u291.r(nim0Var, 56.0f);
                }
                b(0, str2, x340Var, qim0VarR);
                x340Var.r(false);
            } else {
                x340Var.i0(-1246286387);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(dd11Var.e, u291.f(nim0Var, 1.0f), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1712);
            uwo1.e(dd11Var.f, u291.f(nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(dd11Var, i, (byte) 23);
        }
    }

    public static final void k(ug71 ug71Var, zg71 zg71Var, c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        ela1 ela1Var = ug71Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-69885859);
        int i2 = (i & 6) == 0 ? (b0kVar3.g(ug71Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(zg71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            Integer numValueOf = Integer.valueOf(es41VarC.f.s());
            boolean zG = b0kVar3.g(es41VarC);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new uqf(es41VarC, (lnm) null, (byte) 1);
                b0kVar3.s0(objT);
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT);
            qim0 qim0VarH = l6o1.H(qim0Var, es41VarC, false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            String str = ela1Var.c;
            va71 va71Var = zg71Var.g;
            if (va71Var == null) {
                va71Var = new va71();
            }
            String str2 = ela1Var.a;
            String str3 = ela1Var.b;
            hl71 hl71Var = zg71Var.a;
            te71 te71Var = zg71Var.d;
            cmt cmtVar = va71Var.a;
            wa71 wa71Var = ug71Var.b.a;
            wl71 wl71Var = new wl71(str2, str3, str, wa71Var != null ? wa71Var.a : null, cmtVar, va71Var, te71Var, hl71Var);
            b0kVar3.i0(1181305131);
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                z70 z70Var = (z70) obj;
                b0k b0kVar4 = b0kVar3;
                b0kVar3 = b0kVar4;
                otw.c(z70Var, wl71Var, (qim0) null, wpb1.C(f4i1.c(i3, "slot_"), z70Var, wl71Var, b0kVar4, 0, 8), b0kVar3, 0, 4);
                i3 = i4;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.r(false);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, ug71Var, zg71Var, c380Var, qim0Var, (byte) 10);
        }
    }

    public static final void l(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-705799291);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960991);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), new idx(4), u291.j(40.0f, 0.0f, 2, qim0Var), null, yla.s(x340Var), null, null, null, null, null, apo.r(-1729913916, new p9y0(strO0, (byte) 11), x340Var), x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var, i, (byte) 29);
        }
    }

    public static final void m(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-664868055);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131961005);
            String str2 = null;
            if (str != null && !ihc1.y0(str)) {
                str2 = str;
            }
            boolean z = str2 != null;
            if (str2 == null) {
                str2 = strO0;
            }
            if (z) {
                x340Var.i0(1011938125);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(1011939120);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.b;
            }
            x340Var.r(false);
            gbx gbxVar = new gbx(z50.c, function0);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = h211.h;
                x340Var.s0(objT);
            }
            foo1.c(gbxVar, new hdx(1, (vu30) null, (vu30) objT, (vu30) null, (hw61) null, 26), s161.b(u291.j(40.0f, 0.0f, 2, qim0Var), false, new os(strO0, str, (byte) 26)), null, yla.s(x340Var), null, null, null, null, null, apo.r(-32757592, new icc((byte) 7, j, str2), x340Var), x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hd11(str, function0, qim0Var, i);
        }
    }

    public static final void n(g2c g2cVar, adj1 adj1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-398615278);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = adj1Var instanceof ycj1;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z2 = ((Boolean) ven0Var.getValue()).booleanValue() || z;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = x340Var.h(z) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new y72(z, ven0Var, (byte) 4);
                x340Var.s0(objT2);
            }
            qxd0.C(boolValueOf, (Function0) objT2, x340Var);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI = x340Var.i(ven0Var) | x340Var.h(z);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new wsh(z, ven0Var, (lnm) null, (byte) 8);
                x340Var.s0(objT3);
            }
            qxd0.t(bool, x340Var, (vu30) objT3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = g2cVar.b(nim0Var);
            boolean zI2 = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new rc21(iu30Var, ven0Var, (byte) 16);
                x340Var.s0(objT4);
            }
            t1c.a(bin.x(qim0VarB, false, null, null, null, (Function0) objT4, 15), x340Var, 0);
            fq7.g(z2, g2cVar.b(nim0Var), xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-765651142, new sgi1(adj1Var, iu30Var, (byte) 8), x340Var), x340Var, 196608, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(g2cVar, adj1Var, iu30Var, i, (byte) 7);
        }
    }

    public static final i1u0 o(pug pugVar) {
        p2o0 p2o0Var = new p2o0(pugVar);
        Scheduler scheduler = (Scheduler) pugVar.h;
        c8o.l(scheduler);
        Flowable flowable = (Flowable) pugVar.a;
        c8o.l(flowable);
        tau0 tau0Var = (tau0) pugVar.b;
        c8o.l(tau0Var);
        Context context = (Context) pugVar.g;
        c8o.l(context);
        rd30 rd30Var = (rd30) pugVar.i;
        c8o.l(rd30Var);
        gw70 gw70Var = (gw70) pugVar.j;
        c8o.l(gw70Var);
        yxp yxpVar = (yxp) ((jly0) p2o0Var.c).get();
        c8o.l(context);
        tbu0 s62Var = new s62(yxpVar, context);
        jcs jcsVarX = p2o0Var.x();
        zxp zxpVar = (zxp) ((jly0) p2o0Var.e).get();
        zo5 zo5Var = (zo5) pugVar.n;
        c8o.l(zo5Var);
        tbu0 a1yVar = new a1y(jcsVarX, zxpVar, new h0y(zo5Var, (byte) 0), (yxp) ((jly0) p2o0Var.c).get());
        tbu0 t5v0Var = new t5v0(p2o0Var.x(), (yxp) ((jly0) p2o0Var.c).get());
        jcs jcsVarX2 = p2o0Var.x();
        c9c c9cVar = new c9c(false);
        ywp ywpVar = (ywp) p2o0Var.f;
        tbu0 a1yVar2 = new a1y(jcsVarX2, context, new s6z0(new hod0(c9cVar, new x5u(ywpVar, (byte) 9)), (byte) 14), new ruc0(new khc((byte) 13, false), new hod0(new c9c(false), new x5u(ywpVar, (byte) 9))));
        jcs jcsVarX3 = p2o0Var.x();
        zxp zxpVar2 = (zxp) ((jly0) p2o0Var.e).get();
        yxp yxpVar2 = (yxp) ((jly0) p2o0Var.c).get();
        o241 o241Var = (o241) pugVar.u;
        c8o.l(o241Var);
        tbu0 a1yVar3 = new a1y(jcsVarX3, zxpVar2, yxpVar2, o241Var);
        jcs jcsVarX4 = p2o0Var.x();
        yxp yxpVar3 = (yxp) ((jly0) p2o0Var.c).get();
        zxp zxpVar3 = (zxp) ((jly0) p2o0Var.e).get();
        wm70 wm70Var = (wm70) pugVar.f;
        c8o.l(wm70Var);
        b3h b3hVar = new b3h(p7h.M(new tbu0[]{s62Var, a1yVar, a1yVar2, t5v0Var, a1yVar3, new ww10(jcsVarX4, yxpVar3, zxpVar3, wm70Var), p2o0Var.x()}));
        xs80 xs80Var = (xs80) pugVar.l;
        c8o.l(xs80Var);
        d6b1 d6b1Var = (d6b1) pugVar.m;
        c8o.l(d6b1Var);
        yxp yxpVar4 = (yxp) ((jly0) p2o0Var.c).get();
        ez11 ez11Var = (ez11) pugVar.d;
        c8o.l(ez11Var);
        s880 s880Var = new s880(context, b3hVar, xs80Var, d6b1Var, zo5Var, yxpVar4, new i35(false, false, false, false, ez11Var));
        inr inrVar = (g0l) pugVar.c;
        c8o.l(inrVar);
        Flowable flowable2 = inrVar.d().filter(wdu0.c1).map(zi20.V0).toFlowable(BackpressureStrategy.d);
        cor corVar = (cor) pugVar.k;
        c8o.l(corVar);
        ynb0 ynb0VarA = xqu.a((ywp) p2o0Var.g);
        g7h g7hVar = (g7h) pugVar.o;
        c8o.l(g7hVar);
        oo70 oo70Var = (oo70) pugVar.p;
        c8o.l(oo70Var);
        uu00 uu00Var = (uu00) pugVar.r;
        c8o.l(uu00Var);
        q0i0 q0i0Var = (q0i0) pugVar.s;
        c8o.l(q0i0Var);
        c8o.l(ez11Var);
        i35 i35Var = new i35(false, false, false, false, ez11Var);
        vbs vbsVar = (vbs) pugVar.v;
        c8o.l(vbsVar);
        e6u0 e6u0Var = (e6u0) pugVar.w;
        c8o.l(e6u0Var);
        fns fnsVar = igu.a;
        c8o.m(fnsVar);
        return new i1u0(scheduler, flowable, tau0Var, new g1u0(context, rd30Var, gw70Var, s880Var, flowable, flowable2, corVar, ynb0VarA, scheduler, g7hVar, oo70Var, uu00Var, q0i0Var, i35Var, vbsVar, e6u0Var, fnsVar), inrVar, e6u0Var, (dpb) ((ywp) p2o0Var.g).get());
    }

    public static poy0 p(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, iu30 iu30Var3, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var3 = ecd0.a1;
        }
        qtr qtrVar = new qtr();
        iu30Var3.invoke(qtrVar);
        return new poy0(new jwa0(iu30Var, (byte) 17), iu30Var2, vu30Var, qtrVar, true, bhh1Var);
    }

    public static poy0 q(iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 8) != 0) {
            iu30Var2 = ecd0.c1;
        }
        qtr qtrVar = new qtr();
        iu30Var2.invoke(qtrVar);
        return new poy0(new jwa0(iu30Var, (byte) 18), new zmd0(vu30Var, iu30Var, (byte) 0), vu30Var, qtrVar, true, bhh1Var);
    }

    public static final boolean r(af5 af5Var) {
        return af5Var.d(af5Var.b.length());
    }

    public static final io80 s(klm klmVar, gdp0 gdp0Var, hdp0 hdp0Var, hdp0 hdp0Var2, gdp0 gdp0Var2, gdp0 gdp0Var3, idp0 idp0Var) {
        return klmVar.b("PlayedReceiptTrackerService", new dy7(gdp0Var, hdp0Var, hdp0Var2, gdp0Var2, gdp0Var3, idp0Var, (byte) 25));
    }

    public static f661 t(Executor executor) {
        return new f661(executor);
    }

    public static final int u(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 8;
            case 1:
                return 5;
            case 2:
                return 13;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 17;
            case 6:
                return 2;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return 15;
            case 10:
                return 6;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 7;
            case grn1.d /* 12 */:
                return 3;
            case 13:
                return 12;
            case 14:
                return 14;
            case 15:
                return 1;
            case 16:
                return 16;
            default:
                eg.o();
                return 0;
        }
    }
}
