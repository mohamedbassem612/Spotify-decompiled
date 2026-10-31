package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ytu0 extends onm {
    public final /* synthetic */ fdc X;
    public int Y;
    public xtu0 a;
    public wa71 b;
    public Collection c;
    public Iterator d;
    public u771 e;
    public exy f;
    public Collection g;
    public int h;
    public int i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytu0(fdc fdcVar, onm onmVar) {
        super(onmVar);
        this.X = fdcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.Y |= os00.INVALID_ID;
        return this.X.Y(null, this);
    }
}
