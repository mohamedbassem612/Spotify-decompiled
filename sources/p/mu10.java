package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mu10 implements Connectable {
    public final bi0 a;
    public final m7o0 b;
    public final kt91 c;
    public final gw10 d;
    public final i8h1 e;
    public final q8n f;

    public mu10(bi0 bi0Var, m7o0 m7o0Var, kt91 kt91Var, gw10 gw10Var, i8h1 i8h1Var, q8n q8nVar) {
        this.a = bi0Var;
        this.b = m7o0Var;
        this.c = kt91Var;
        this.d = gw10Var;
        this.e = i8h1Var;
        this.f = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        cu10 cu10Var = new cu10(this, consumer);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dt10.class), runSequentially.a(cu10Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new du10(this, consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(et10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eu10(this, consumer)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gu10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hu10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ot10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ut10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(it10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new ju10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ht10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zt10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nt10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new au10(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ft10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bu10(this)));
        return new a(this.f, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }

    public final void a(Consumer consumer, int i, iu30 iu30Var, iu30 iu30Var2) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i);
        n57.k(i != 0, "Invalid resource ID provided: %s", new Object[]{numValueOf});
        this.c.k(new er91((fs91) null, "", numValueOf, (String) null, 2131963078, new lu10(iu30Var, iu30Var2, this, consumer, i), (cvr) null, (xq91) null, false));
    }
}
