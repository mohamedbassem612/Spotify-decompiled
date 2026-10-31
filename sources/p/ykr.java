package p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ykr extends onm {
    public Set a;
    public List b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ clr f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykr(clr clrVar, onm onmVar) {
        super(onmVar);
        this.f = clrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
