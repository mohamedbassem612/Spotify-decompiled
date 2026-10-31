package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class izs0 extends onm {
    public Collection a;
    public Iterator b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jzs0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izs0(jzs0 jzs0Var, onm onmVar) {
        super(onmVar);
        this.f = jzs0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
