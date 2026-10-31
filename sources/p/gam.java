package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gam extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ham c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gam(ham hamVar, onm onmVar) {
        super(onmVar);
        this.c = hamVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
