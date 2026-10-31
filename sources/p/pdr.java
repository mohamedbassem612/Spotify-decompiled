package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pdr extends onm {
    public List a;
    public fuf0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rdr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdr(rdr rdrVar, onm onmVar) {
        super(onmVar);
        this.d = rdrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
