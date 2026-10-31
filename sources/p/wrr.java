package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wrr extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gfr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrr(gfr gfrVar, onm onmVar) {
        super(onmVar);
        this.c = gfrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
