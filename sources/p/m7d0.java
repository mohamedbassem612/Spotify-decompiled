package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m7d0 extends onm {
    public Set a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wj3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7d0(wj3 wj3Var, onm onmVar) {
        super(onmVar);
        this.e = wj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.q(null, this);
    }
}
