package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zx00 implements tyq {
    public final psw X;
    public final ia00 Y;
    public final ihd0 a;
    public final y1u0 b;
    public final y1u0 c;
    public final zr00 d;
    public final xho e;
    public final yqg f;
    public final q8n g;
    public final q8n h;
    public final f4r i;
    public final e7m0 t;

    public zx00(glw glwVar, ihd0 ihd0Var, y1u0 y1u0Var, y1u0 y1u0Var2, zr00 zr00Var, xho xhoVar, yqg yqgVar, q8n q8nVar, q8n q8nVar2) {
        this.a = ihd0Var;
        this.b = y1u0Var;
        this.c = y1u0Var2;
        this.d = zr00Var;
        this.e = xhoVar;
        this.f = yqgVar;
        this.g = q8nVar;
        this.h = q8nVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(fa00.Z0, qjj0.a));
        arrayList.add(new i4r(new z5z(this, (byte) 4), jbm.a));
        arrayList.add(new i4r(new z5z(this, (byte) 5), oxc0.a));
        this.i = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        sx00 sx00Var = new sx00(0L, "", cx00.a, false);
        t2m t2mVar = t2m.o;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gjw gjwVar = new gjw(glwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o9w.class), runSequentially.a(gjwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new cjw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(obw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new dkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new jkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ljw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new nkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ojw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pjw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g9w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zkw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qjw(glwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rjw(glwVar)));
        this.t = sbl.B(sx00Var, t2mVar, new a(glwVar.m, coroutinesSubtypeEffectHandlerBuilderI), new htu(this, (byte) 21), new vx00(this));
        j2i j2iVar = new j2i(1164377368, new yhy(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(jq00.t, new wx00(this, (byte) 0));
    }

    public static String h(px00 px00Var) {
        ix00 ix00Var = px00Var.b;
        hx00 hx00Var = ix00Var instanceof hx00 ? (hx00) ix00Var : null;
        if (hx00Var != null) {
            return hx00Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public static tx00 i(tx00 tx00Var, px00 px00Var) {
        dx00 dx00Var;
        ex00 zw00Var;
        ex00 ex00VarA = tx00Var.a();
        ix00 ix00Var = px00Var.b;
        if (ix00Var instanceof gx00) {
            zw00Var = cx00.a;
        } else if (ix00Var instanceof fx00) {
            zw00Var = ax00.a;
        } else {
            if (!(ix00Var instanceof hx00)) {
                eg.o();
                return null;
            }
            String str = ((hx00) ix00Var).a;
            if (ex00VarA instanceof dx00) {
                dx00Var = (dx00) ex00VarA;
                if (!u890.j(dx00Var.getUri(), str)) {
                    zw00Var = dx00Var;
                    zw00Var = new zw00(str);
                }
            } else {
                zw00Var = dx00Var;
                zw00Var = new zw00(str);
            }
        }
        zw00Var = dx00Var;
        ex00 ex00Var = zw00Var;
        if (tx00Var instanceof sx00) {
            return sx00.b((sx00) tx00Var, px00Var.c, px00Var.a, ex00Var, px00Var.d, false, (jx00) null, false, 112);
        }
        if (tx00Var instanceof rx00) {
            return rx00.b((rx00) tx00Var, px00Var.c, px00Var.a, ex00Var, px00Var.d, (ox00) null, false, (jx00) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, 8176);
        }
        if (tx00Var instanceof qx00) {
            return new qx00(px00Var.c, px00Var.a, ex00Var, px00Var.d);
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.X;
    }

    public final void f(int i, String str, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-873538824);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y9y(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            otw.c(this.e, new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) objT, 190), (qim0) null, (ipb1) null, x340Var, 8, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w((byte) 29, i, this, str, iu30Var);
        }
    }

    public final void g(String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2138809343);
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
                objT = oxx.c1;
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
            otw.c(this.e, new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), (qim0) null, (ipb1) null, b0kVar2, 8, 12);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00(this, str, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.t;
    }

    public final f4r getData() {
        return this.i;
    }
}
