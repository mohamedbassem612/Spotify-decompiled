package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vte extends onm {
    public qte a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xid d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vte(xid xidVar, onm onmVar) {
        super(onmVar);
        this.d = xidVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, this);
    }
}
