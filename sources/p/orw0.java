package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class orw0 extends onm {
    public c9n a;
    public Function0 b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ prw0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orw0(prw0 prw0Var, onm onmVar) {
        super(onmVar);
        this.e = prw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, 0L, null, this);
    }
}
