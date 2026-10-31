package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dow extends onm {
    public Collection a;
    public Iterator b;
    public u310 c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ eow h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dow(eow eowVar, onm onmVar) {
        super(onmVar);
        this.h = eowVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
