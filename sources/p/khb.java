package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class khb extends onm {
    public qt7 a;
    public dt71 b;
    public ayh c;
    public AtomicBoolean d;
    public zwg e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ phb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khb(phb phbVar, onm onmVar) {
        super(onmVar);
        this.h = phbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
