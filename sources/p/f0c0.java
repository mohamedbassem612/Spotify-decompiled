package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f0c0 extends onm {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g0c0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0c0(g0c0 g0c0Var, onm onmVar) {
        super(onmVar);
        this.c = g0c0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((List) null, this);
    }
}
