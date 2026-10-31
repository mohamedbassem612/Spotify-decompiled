package p;

import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1v0 extends onm {
    public InputStream a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xmu0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1v0(xmu0 xmu0Var, onm onmVar) {
        super(onmVar);
        this.c = xmu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
