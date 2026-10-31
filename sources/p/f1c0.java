package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f1c0 extends onm {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jrb0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1c0(jrb0 jrb0Var, onm onmVar) {
        super(onmVar);
        this.c = jrb0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
