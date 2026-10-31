package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bc61 extends onm {
    public vb61 a;
    public String b;
    public sg0 c;
    public Function0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dc61 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc61(dc61 dc61Var, onm onmVar) {
        super(onmVar);
        this.f = dc61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, null, null, null, this);
    }
}
