package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iw71 {
    public final Context a;
    public final bfd b;
    public final iyc0 c;
    public final op31 d;
    public final lzn0 e;
    public final fw71 f;
    public final c9n g;
    public final q8n h;
    public final q8n i;
    public final a j;

    public iw71(Context context, bfd bfdVar, iyc0 iyc0Var, op31 op31Var, lzn0 lzn0Var, fw71 fw71Var, c9n c9nVar, q8n q8nVar, q8n q8nVar2) {
        this.a = context;
        this.b = bfdVar;
        this.c = iyc0Var;
        this.d = op31Var;
        this.e = lzn0Var;
        this.f = fw71Var;
        this.g = c9nVar;
        this.h = q8nVar;
        this.i = q8nVar2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(qw71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hw71(this)));
        this.j = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
