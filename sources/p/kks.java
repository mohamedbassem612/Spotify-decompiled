package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kks extends onm {
    public Collection a;
    public Iterator b;
    public Collection c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mks g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kks(mks mksVar, onm onmVar) {
        super(onmVar);
        this.g = mksVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return mks.a(this.g, this);
    }
}
