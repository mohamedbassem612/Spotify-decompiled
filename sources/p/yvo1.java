package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yvo1 extends onm {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fqn1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvo1(fqn1 fqn1Var, onm onmVar) {
        super(onmVar);
        this.c = fqn1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
