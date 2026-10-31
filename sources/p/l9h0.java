package p;

import android.content.Context;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l9h0 implements Connectable {
    public final Context a;
    public final lzn0 b;
    public final kt91 c;
    public final n801 d;
    public final k6c0 e;
    public final q8n f;

    public l9h0(Context context, lzn0 lzn0Var, kt91 kt91Var, n801 n801Var, k6c0 k6c0Var, q8n q8nVar) {
        this.a = context;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.d = n801Var;
        this.e = k6c0Var;
        this.f = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        f9h0 f9h0Var = new f9h0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b9h0.class), runSequentially.a(f9h0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e9h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k9h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a9h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g9h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c9h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h9h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d9h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i9h0(this, consumer)));
        return new a(this.f, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
