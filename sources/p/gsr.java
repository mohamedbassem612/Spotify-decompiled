package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gsr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jnq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsr(jnq jnqVar, onm onmVar) {
        super(onmVar);
        this.b = jnqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((List) null, (String) null, (String) null, (gy1) null, (tv80) null, false, this);
    }
}
