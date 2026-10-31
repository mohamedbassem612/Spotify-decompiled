package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dqa0 extends onm {
    public av40 a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ eqa0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqa0(eqa0 eqa0Var, onm onmVar) {
        super(onmVar);
        this.h = eqa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
