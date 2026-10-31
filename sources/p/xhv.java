package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xhv extends onm {
    public Collection a;
    public Iterator b;
    public String c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yhv h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhv(yhv yhvVar, onm onmVar) {
        super(onmVar);
        this.h = yhvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}
