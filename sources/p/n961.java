package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n961 extends onm {
    public vu30 a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jga e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n961(jga jgaVar, onm onmVar) {
        super(onmVar);
        this.e = jgaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
