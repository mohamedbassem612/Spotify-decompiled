package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mta0 implements wra0 {
    public final Function0 N0;
    public final e7m0 O0;
    public final ia00 P0;
    public final psw Q0;
    public final g9m X;
    public final hfp Y;
    public final yqg Z;
    public final a1r0 a;
    public final yo2 b;
    public final rqa0 c;
    public final mr4 d;
    public final kvp e;
    public final w9u0 f;
    public final mpa1 g;
    public final g38 h;
    public final exg1 i;
    public final pe t;

    public mta0(a1r0 a1r0Var, yo2 yo2Var, rqa0 rqa0Var, mr4 mr4Var, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, exg1 exg1Var, pe peVar, g9m g9mVar, hfp hfpVar, yqg yqgVar, Function0 function0) {
        this.a = a1r0Var;
        this.b = yo2Var;
        this.c = rqa0Var;
        this.d = mr4Var;
        this.e = kvpVar;
        this.f = w9u0Var;
        this.g = mpa1Var;
        this.h = g38Var;
        this.i = exg1Var;
        this.t = peVar;
        this.X = g9mVar;
        this.Y = hfpVar;
        this.Z = yqgVar;
        this.N0 = function0;
        hu90 hu90Var = new hu90(this, (byte) 13);
        dq7 dq7Var = new dq7(this, (byte) 15);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        cta0 cta0Var = new cta0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(isa0.class), runSequentially.a(cta0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new msa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new osa0()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qsa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eta0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(csa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gta0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ksa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rsa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(asa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ita0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tsa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xra0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vsa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hsa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xsa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yra0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysa0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zra0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kta0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(esa0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ata0(this)));
        this.O0 = new e7m0(hu90Var, new dq7(dq7Var, (byte) 21), new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), new gs90(this, (byte) 10), new cas());
        this.P0 = n3o1.q(this).a(mx90.e1, lta0.b);
        j2i j2iVar = new j2i(-305473868, new pba0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.Q0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.Q0;
    }

    public final mqw getBehavior() {
        return this.O0;
    }
}
