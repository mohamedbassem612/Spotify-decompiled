package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ecd1 implements xpw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ecd1(jly0 jly0Var, kt91 kt91Var, caq caqVar, q8n q8nVar, q8n q8nVar2, d0r d0rVar, q4h0 q4h0Var) {
        this.a = (byte) 4;
        o3r o3rVar = zsh1.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        tsh1 tsh1Var = new tsh1(d0rVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ksh1.class), runSequentially.a(tsh1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ish1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vsh1(jly0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lsh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xsh1(jly0Var, q8nVar2, kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(msh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qsh1(caqVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jsh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rsh1(q4h0Var)));
        this.c = sbl.z(new jth1(fg91.b, "", "", null, null, null, false, false, false, "", ""), gp71.r, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), kth1.a, osh1.t);
        this.b = n3o1.q(this).a(swg1.c1, swg1.d1);
        this.d = new azg(this);
        j2i j2iVar = dpj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (hy00) this.d;
            case 1:
                return (ia00) this.e;
            case 2:
                return (ia00) this.d;
            case 3:
                return (ia00) this.d;
            default:
                return (azg) this.d;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                return (psw) this.e;
            case 1:
                return (rbc0) this.d;
            case 2:
                return (psw) this.e;
            case 3:
                return (psw) this.e;
            default:
                return (psw) this.e;
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (ljm0) obj;
            case 1:
                return (ljm0) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (rey0) obj;
            default:
                return (e7m0) this.c;
        }
    }

    public ecd1(qrp qrpVar, q8n q8nVar, sm51 sm51Var, zge1 zge1Var, mhg0 mhg0Var) {
        this.a = (byte) 1;
        this.c = mhg0Var;
        ggv ggvVar = (ggv) ((y6i0) ((qq) qrpVar.a.c).a).r.get();
        c8o.l(ggvVar);
        this.d = new rbc0(ggvVar, sm51Var, zge1Var, (byte) 3);
        this.b = h7w.B(nhe1.t, q8nVar, (iu30) null, new nsb1(this, (byte) 17), 4);
        this.e = n3o1.q(this).a(kle1.f, kle1.g);
    }

    public ecd1(hwa0 hwa0Var) {
        this.a = (byte) 3;
        this.c = hwa0Var;
        this.b = new rey0(new e9f1(this, (byte) 8));
        this.d = n3o1.q(this).a(vrf1.Y0, new zyf1(this, (byte) 3));
        j2i j2iVar = new j2i(1079159934, new xyh(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ecd1(j4f1 j4f1Var, fcd1 fcd1Var) {
        this.a = (byte) 0;
        this.c = fcd1Var;
        this.b = h7w.B(d6d1.i, (o8n) null, (iu30) null, new nsb1(this, (byte) 9), 6);
        this.d = new hy00(j4f1Var, xi81.X0, i6d1.e);
        j2i j2iVar = imj.c;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ecd1(bpb1 bpb1Var, any anyVar, esf1 esf1Var, String str, uqv0 uqv0Var) {
        this.a = (byte) 2;
        this.c = ((k511) uqv0Var.b).a(str);
        this.b = x3p1.m(new x010(new ipr(new dsf1("", z6x.a, false), anyVar, new bu51(3, (lnm) null, (byte) 13), (byte) 16), bpb1Var, new ap51(3, (lnm) null, (byte) 10), (byte) 1), bpf1.T0, ggf1.X, (o8n) null, (iu30) null, 24);
        this.d = n3o1.q(this).a(vrf1.d, vrf1.e);
        j2i j2iVar = new j2i(-822371011, new t20(this, esf1Var, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
