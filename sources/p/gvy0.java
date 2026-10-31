package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gvy0 extends onm {
    public Function0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ivy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvy0(ivy0 ivy0Var, onm onmVar) {
        super(onmVar);
        this.c = ivy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, null, null, null, this);
    }
}
