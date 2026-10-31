package p;

import com.spotify.martini.martinidata.model.Mode;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mr10 implements xpw {
    public final psw X;
    public final xw10 a;
    public final ay10 b;
    public final q8n c;
    public final lik1 d;
    public final blc0 e;
    public final bpb1 f;
    public final bpb1 g;
    public final dt71 h;
    public final e7m0 i;
    public final ia00 t;

    public mr10(uq10 uq10Var, xw10 xw10Var, ay10 ay10Var, q8n q8nVar, lik1 lik1Var, boolean z, Mode mode) {
        this.a = xw10Var;
        this.b = ay10Var;
        this.c = q8nVar;
        this.d = lik1Var;
        Set set = s4b1.f;
        this.e = uic.x(lik1Var.a).c;
        this.f = gio1.b(Boolean.FALSE);
        this.g = gio1.b((Object) null);
        this.h = mgo1.e(0, 1, 0, 5);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        tq10 tq10Var = new tq10(uq10Var, lik1Var, mode);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kq10.class), runSequentially.a(tq10Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mq10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nq10(uq10Var, lik1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iq10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new oq10(uq10Var, lik1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hq10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pq10(uq10Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lq10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qq10(uq10Var, lik1Var, mode)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jq10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rq10(uq10Var)));
        this.i = sbl.z(new hr10(new fr10("", (String) null, false, (Mode) null, (String) null, false, 126), false, false), t2m.r, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new jr10(this, (byte) 0), new kr10(this));
        this.t = n3o1.q(this).a(jq00.V0, new wx00(this, (byte) 6));
        j2i j2iVar = new j2i(394680615, new lr10(z, mode, this), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final void e(ve01 ve01Var, String str, b0k b0kVar, int i) {
        Object l2wVar;
        lnm lnmVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2137527073);
        int i2 = i | (x340Var.i(ve01Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(ve01Var) | ((i2 & 112) == 32) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                lnmVar = null;
                l2wVar = new l2w(ve01Var, str, this, (lnm) null, (byte) 23);
                x340Var.s0(l2wVar);
            } else {
                l2wVar = objT;
                lnmVar = null;
            }
            qxd0.t(ve01Var, x340Var, (vu30) l2wVar);
            ven0 ven0VarH = rwq.h(this.f, x340Var, 0);
            ven0 ven0VarH2 = rwq.h(this.g, x340Var, 0);
            Boolean bool = (Boolean) ven0VarH.getValue();
            bool.booleanValue();
            mmr0 mmr0Var = new mmr0(bool, (er10) ven0VarH2.getValue());
            boolean zI2 = x340Var.i(ven0VarH2) | x340Var.i(ven0VarH) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                piu piuVar = new piu(this, ven0VarH2, ven0VarH, lnmVar, (byte) 13);
                x340Var.s0(piuVar);
                objT2 = piuVar;
            }
            qxd0.t(mmr0Var, x340Var, (vu30) objT2);
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI3 = x340Var.i(this) | x340Var.i(iac0Var);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new zf10(iac0Var, this, (byte) 4);
                x340Var.s0(objT3);
            }
            qxd0.i(iac0Var, (iu30) objT3, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(this, ve01Var, str, i, (byte) 6);
        }
    }

    public final fr10 f(fr10 fr10Var, fr10 fr10Var2) {
        cy10 cy10Var;
        String str = fr10Var.a;
        String str2 = fr10Var2.a;
        if (u890.j(str, str2)) {
            return fr10Var2.d == null ? fr10.a(fr10Var2, fr10Var.d) : fr10Var2;
        }
        zx10 zx10Var = (zx10) this.b.a.get(str2);
        if (zx10Var == null) {
            zx10Var = zx10.c;
        }
        int iOrdinal = zx10Var.ordinal();
        if (iOrdinal == 0) {
            cy10Var = cy10.a;
        } else if (iOrdinal != 1) {
            cy10Var = null;
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
        } else {
            cy10Var = cy10.b;
        }
        return fr10.a(fr10Var2, cy10Var);
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
