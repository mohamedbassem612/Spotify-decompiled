package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t9y0 implements mqw {
    public final /* synthetic */ byte a = 0;
    public final oud b;
    public final q8n c;
    public final e7m0 d;

    public t9y0(oud oudVar, q8n q8nVar, ygj1 ygj1Var) {
        this.b = oudVar;
        this.c = q8nVar;
        egj1 egj1Var = egj1.Z;
        gp71 gp71Var = gp71.u;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        wmy wmyVar = ygj1Var.c;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xgj1 xgj1Var = new xgj1(wmyVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ahj1.class), runSequentially.a(xgj1Var));
        yeu0 yeu0Var = ygj1Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bhj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tgj1(yeu0Var)));
        laz lazVar = ygj1Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zgj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ugj1(lazVar)));
        zb91 zb91Var = ygj1Var.d;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(chj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vgj1(zb91Var)));
        this.d = sbl.A(egj1Var, gp71Var, new a(ygj1Var.e, coroutinesSubtypeEffectHandlerBuilderI), zhi1.a1, new xaj1(this, (byte) 9));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        byte b = this.a;
        e7m0 e7m0Var = this.d;
        switch (b) {
            case 0:
                return e7m0Var.a((pay0) obj, ipb1Var);
            default:
                return e7m0Var.a((qhj1) obj, ipb1Var);
        }
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        byte b = this.a;
        e7m0 e7m0Var = this.d;
        switch (b) {
            case 0:
                return e7m0Var.b((qay0) obj, dtsVar, str);
            default:
                return e7m0Var.b((rhj1) obj, dtsVar, str);
        }
    }

    public final mc41 c() {
        byte b = this.a;
        e7m0 e7m0Var = this.d;
        switch (b) {
            case 0:
                break;
        }
        return e7m0Var.c();
    }

    public final Object d(Object obj) {
        byte b = this.a;
        e7m0 e7m0Var = this.d;
        switch (b) {
            case 0:
                return (qay0) e7m0Var.a.invoke((pay0) obj);
            default:
                return (rhj1) e7m0Var.a.invoke((qhj1) obj);
        }
    }

    public t9y0(oud oudVar, q8n q8nVar, aay0 aay0Var) {
        this.b = oudVar;
        this.c = q8nVar;
        e6y0 e6y0Var = e6y0.Z0;
        t7p0 t7p0Var = t7p0.f37p;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        y9y0 y9y0Var = new y9y0(aay0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cay0.class), runSequentially.a(y9y0Var));
        tzr0 tzr0Var = aay0Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(day0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v9y0(tzr0Var)));
        ki20 ki20Var = aay0Var.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bay0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w9y0(ki20Var)));
        this.d = sbl.A(e6y0Var, t7p0Var, new a(aay0Var.d, coroutinesSubtypeEffectHandlerBuilderI), j8y0.f, new hox0(this, (byte) 18));
    }
}
