package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hok1 implements ink1 {
    public final e7m0 N0;
    public final psw O0;
    public final ia00 P0;
    public final kge X;
    public final boolean Y;
    public final iu30 Z;
    public final Context a;
    public final kt91 b;
    public final exg1 c;
    public final mr4 d;
    public final q8n e;
    public final w9u0 f;
    public final ty60 g;
    public final xs3 h;
    public final q2j0 i;
    public final enk1 t;

    public hok1(Context context, pe peVar, Flowable flowable, kt91 kt91Var, exg1 exg1Var, mr4 mr4Var, q8n q8nVar, w9u0 w9u0Var, ty60 ty60Var, xs3 xs3Var, q2j0 q2j0Var, iu30 iu30Var, enk1 enk1Var) {
        this.a = context;
        this.b = kt91Var;
        this.c = exg1Var;
        this.d = mr4Var;
        this.e = q8nVar;
        this.f = w9u0Var;
        this.g = ty60Var;
        this.h = xs3Var;
        this.i = q2j0Var;
        this.t = enk1Var;
        vbm[] vbmVarArr = q601.a;
        this.X = new kge(flowable);
        byte b = 2;
        this.Y = peVar.b(2);
        this.Z = iu30Var == null ? new snk1(this, b) : iu30Var;
        snk1 snk1Var = new snk1(this, (byte) 0);
        t7i1 t7i1Var = new t7i1(this, (byte) 6);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        dok1 dok1Var = new dok1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qnk1.class), cancelPrevious.a(dok1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vnk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xnk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ynk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new znk1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fok1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(onk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aok1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lnk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bok1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(knk1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cok1(this)));
        this.N0 = sbl.A(snk1Var, t7i1Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), olj1.Z0, new snk1(this, (byte) 1));
        j2i j2iVar = new j2i(222513195, new l6i1(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
        this.P0 = n3o1.q(this).a(cxj1.N0, cxj1.O0);
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final Object e(eok1 eok1Var) {
        Object objI = fc11.i(this.f.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement(), eok1Var);
        return objI == d9n.a ? objI : rih1.a;
    }

    public final Object f(gok1 gok1Var) {
        Object objI = fc11.i(this.f.a(new h9u0(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement(), gok1Var);
        return objI == d9n.a ? objI : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(onm onmVar) {
        gok1 gok1Var;
        if (onmVar instanceof gok1) {
            gok1Var = (gok1) onmVar;
            int i = gok1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gok1Var.c = i - Integer.MIN_VALUE;
            } else {
                gok1Var = new gok1(this, onmVar);
            }
        } else {
            gok1Var = new gok1(this, onmVar);
        }
        Object obj = gok1Var.a;
        int i2 = gok1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gok1Var.c = 1;
                Object objF = f(gok1Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to resume playback", e2);
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.N0;
    }
}
