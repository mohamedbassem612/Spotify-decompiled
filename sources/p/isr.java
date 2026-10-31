package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class isr extends onm {
    public nj3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jnq c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isr(jnq jnqVar, onm onmVar) {
        super(onmVar);
        this.c = jnqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g((gj3) null, (nj3) null, (List) null, (List) null, (List) null, (String) null, (String) null, this);
    }
}
