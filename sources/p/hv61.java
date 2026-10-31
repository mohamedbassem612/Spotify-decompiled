package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hv61 extends onm {
    public /* synthetic */ Object X;
    public final /* synthetic */ kv61 Y;
    public int Z;
    public zu61 a;
    public Collection b;
    public Iterator c;
    public xt61 d;
    public Collection e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv61(kv61 kv61Var, onm onmVar) {
        super(onmVar);
        this.Y = kv61Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(null, null, false, this);
    }
}
