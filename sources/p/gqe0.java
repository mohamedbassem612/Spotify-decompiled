package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gqe0 implements xpw {
    public final j2e0 a;
    public final ikp b;
    public final iac0 c;
    public final e7m0 d;
    public final u7h1 e;
    public final psw f;

    public gqe0(fqe0 fqe0Var, j2e0 j2e0Var, ikp ikpVar, iac0 iac0Var) {
        this.a = j2e0Var;
        this.b = ikpVar;
        this.c = iac0Var;
        gje0 gje0Var = gje0.i;
        xxb0 xxb0Var = xxb0.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        upe0 upe0Var = new upe0(fqe0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lpe0.class), runSequentially.a(upe0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mpe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vpe0(fqe0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(npe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wpe0(fqe0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ope0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xpe0(fqe0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ppe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aqe0(fqe0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rpe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ype0(fqe0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qpe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cqe0(fqe0Var)));
        this.d = sbl.A(gje0Var, xxb0Var, new a(fqe0Var.g, coroutinesSubtypeEffectHandlerBuilderI), x5d0.T0, new l6d0(this, (byte) 24));
        this.e = new u7h1(x5d0.U0, new lh2(3, uqe0.a, uqe0.class, "resolveInteraction", "resolveInteraction(Lcom/spotify/lockstate/lockedscreen/data/LockDefinition;Lcom/spotify/lockstate/lockedscreen/elements/LockState;Lcom/spotify/lockstate/lockedscreen/elements/LockScreenEvent;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0, (byte) 8));
        j2i j2iVar = new j2i(1077843770, new qcd0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
