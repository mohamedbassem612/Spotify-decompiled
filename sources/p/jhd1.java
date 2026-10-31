package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jhd1 {
    public final vx40 a;
    public final qzn0 b;
    public final dh30 c;
    public final q8n d;
    public final q8n e;
    public final myq0 f;
    public final l7m0 g;

    public jhd1(vx40 vx40Var, qzn0 qzn0Var, dh30 dh30Var, q8n q8nVar, q8n q8nVar2, myq0 myq0Var, l7m0 l7m0Var) {
        this.a = vx40Var;
        this.b = qzn0Var;
        this.c = dh30Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        this.f = myq0Var;
        this.g = l7m0Var;
    }

    public final MobiusLoop a() {
        wam0 wam0Var = new wam0((byte) 21);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        qzn0 qzn0Var = this.b;
        ufd1 ufd1Var = new ufd1(qzn0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pfd1.class), runSequentially.a(ufd1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qfd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vfd1(qzn0Var)));
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        myq0 myq0Var = this.f;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rfd1.class), runSequentially2.a(new bgd1(myq0Var, qzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sfd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wfd1(this.c)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mfd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xfd1(myq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ofd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dgd1(this.g, myq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nfd1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new zfd1(this.a, myq0Var)));
        return Mobius.d(wam0Var, new a(this.e, coroutinesSubtypeEffectHandlerBuilderI)).b(new zb91(this, (byte) 12)).d(new ezb1(this, (byte) 5)).a(new khd1(), Collections.singleton(ofd1.a));
    }
}
