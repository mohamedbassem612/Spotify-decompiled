package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mhb extends onm {
    public int a;
    public dt71 b;
    public ayh c;
    public AtomicBoolean d;
    public ohb e;
    public /* synthetic */ Object f;
    public final /* synthetic */ phb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhb(phb phbVar, onm onmVar) {
        super(onmVar);
        this.g = phbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(this);
    }
}
