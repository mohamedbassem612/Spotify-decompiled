package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jpe0 extends onm {
    public Function0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kpe0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpe0(kpe0 kpe0Var, onm onmVar) {
        super(onmVar);
        this.c = kpe0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
