package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jsr extends onm {
    public blc0 a;
    public gj3 b;
    public jmt c;
    public njo d;
    public uio e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jnq h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsr(jnq jnqVar, onm onmVar) {
        super(onmVar);
        this.h = jnqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h((List) null, (blc0) null, false, (gj3) null, this);
    }
}
