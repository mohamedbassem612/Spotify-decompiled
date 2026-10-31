package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tjs extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ xap b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjs(xap xapVar, onm onmVar) {
        super(onmVar);
        this.b = xapVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h((String) null, (Set) null, this);
    }
}
