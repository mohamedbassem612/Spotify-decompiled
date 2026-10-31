package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xkr extends onm {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ clr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkr(clr clrVar, onm onmVar) {
        super(onmVar);
        this.d = clrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
