package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m6i1 implements tyq {
    public final ihd0 a;
    public final xho b;
    public final q8n c;
    public final q8n d;
    public final f4r e;
    public final e7m0 f;
    public final psw g;
    public final ia00 h;

    public m6i1(hlw hlwVar, ihd0 ihd0Var, xho xhoVar, q8n q8nVar, q8n q8nVar2) {
        this.a = ihd0Var;
        this.b = xhoVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(osh1.R0, pjj0.a));
        arrayList.add(new i4r(new yvf1(this, (byte) 4), ibm.a));
        arrayList.add(new i4r(new yvf1(this, (byte) 5), nxc0.a));
        this.e = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        h6i1 h6i1Var = new h6i1(0L, "", x5i1.a, false);
        gp71 gp71Var = gp71.t;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        hjw hjwVar = new hjw(hlwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n9w.class), runSequentially.a(hjwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ydw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new skw(hlwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bjw(hlwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new ekw(hlwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ibw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new kkw(hlwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mjw(hlwVar)));
        this.f = sbl.B(h6i1Var, gp71Var, new a(hlwVar.g, coroutinesSubtypeEffectHandlerBuilderI), new rvd1(this, (byte) 23), new k6i1(this));
        j2i j2iVar = new j2i(1440502499, new l6i1(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(ruh1.t, ruh1.X);
    }

    public static String h(e6i1 e6i1Var) {
        d6i1 d6i1Var = e6i1Var.b;
        c6i1 c6i1Var = d6i1Var instanceof c6i1 ? (c6i1) d6i1Var : null;
        if (c6i1Var != null) {
            return c6i1Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public static i6i1 i(i6i1 i6i1Var, e6i1 e6i1Var) {
        y5i1 y5i1Var;
        z5i1 u5i1Var;
        z5i1 z5i1VarA = i6i1Var.a();
        d6i1 d6i1Var = e6i1Var.b;
        String str = e6i1Var.a;
        if (d6i1Var instanceof b6i1) {
            u5i1Var = x5i1.a;
        } else if (d6i1Var instanceof a6i1) {
            u5i1Var = v5i1.a;
        } else {
            if (!(d6i1Var instanceof c6i1)) {
                eg.o();
                return null;
            }
            String str2 = ((c6i1) d6i1Var).a;
            if (z5i1VarA instanceof y5i1) {
                y5i1Var = (y5i1) z5i1VarA;
                if (!u890.j(y5i1Var.getUri(), str2)) {
                    u5i1Var = y5i1Var;
                    u5i1Var = new u5i1(str2);
                }
            } else {
                u5i1Var = y5i1Var;
                u5i1Var = new u5i1(str2);
            }
        }
        u5i1Var = y5i1Var;
        z5i1 z5i1Var = u5i1Var;
        if (i6i1Var instanceof h6i1) {
            return new h6i1(e6i1Var.c, str, z5i1Var, e6i1Var.d);
        }
        if (i6i1Var instanceof g6i1) {
            return g6i1.b((g6i1) i6i1Var, e6i1Var.c, e6i1Var.a, z5i1Var, e6i1Var.d, null, null, null, null, null, 496);
        }
        if (i6i1Var instanceof f6i1) {
            return new f6i1(e6i1Var.c, str, z5i1Var, e6i1Var.d);
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.g;
    }

    public final void f(int i, String str, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(763875523);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uyh1(iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            otw.c(this.b, new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) objT, 190), (qim0) null, (ipb1) null, x340Var, 8, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1(this, str, iu30Var, i, (byte) 12);
        }
    }

    public final void g(String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1896783052);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(this) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = ((u7h) b0kVar3.k(xrl.a)).a;
            if (((bbh) b0kVar3.k(cbh.a)).d()) {
                z4p1.B(j);
            } else {
                z4p1.B(j);
            }
            qim0 qim0VarK = d9y0.k(nim0.a, 0.38f);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = vbh1.X;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarK, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 14);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar2 = b0kVar3;
            otw.c(this.b, new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), (qim0) null, (ipb1) null, b0kVar2, 8, 12);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(this, str, i, (byte) 25);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final f4r getData() {
        return this.e;
    }
}
