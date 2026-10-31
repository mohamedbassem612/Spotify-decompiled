package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ty10 extends onm {
    public long a;
    public Iterator b;
    public dy10 c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ uy10 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty10(uy10 uy10Var, onm onmVar) {
        super(onmVar);
        this.g = uy10Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}
