package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rrs extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mxr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrs(mxr mxrVar, onm onmVar) {
        super(onmVar);
        this.c = mxrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.w(null, this);
    }
}
