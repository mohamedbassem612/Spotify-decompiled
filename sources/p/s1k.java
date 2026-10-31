package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s1k extends onm {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u1k d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1k(u1k u1kVar, onm onmVar) {
        super(onmVar);
        this.d = u1kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c((List) null, this);
    }
}
