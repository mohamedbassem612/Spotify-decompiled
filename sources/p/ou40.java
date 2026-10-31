package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ou40 extends onm {
    public Function0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tu40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou40(tu40 tu40Var, onm onmVar) {
        super(onmVar);
        this.c = tu40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Function0) null, this);
    }
}
