package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lov0 extends onm {
    public String a;
    public aru0 b;
    public Iterable c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ aru0 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lov0(aru0 aru0Var, onm onmVar) {
        super(onmVar);
        this.i = aru0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.n(null, this);
    }
}
