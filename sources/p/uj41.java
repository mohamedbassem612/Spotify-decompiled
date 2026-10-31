package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uj41 extends onm {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wj41 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj41(wj41 wj41Var, onm onmVar) {
        super(onmVar);
        this.d = wj41Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
