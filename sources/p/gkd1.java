package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gkd1 extends onm {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jkd1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkd1(jkd1 jkd1Var, onm onmVar) {
        super(onmVar);
        this.c = jkd1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((List) null, this);
    }
}
