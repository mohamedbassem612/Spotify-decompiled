package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dpn implements Connectable {
    public final zwg a;
    public final mp8 b;
    public final c9p c;
    public final cir0 d;

    public dpn(zwg zwgVar, mp8 mp8Var, c9p c9pVar, cir0 cir0Var) {
        this.a = zwgVar;
        this.b = mp8Var;
        this.c = c9pVar;
        this.d = cir0Var;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        zon zonVar = new zon(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z9w.class), runSequentially.a(zonVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(daw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cpn(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new apn(this)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
