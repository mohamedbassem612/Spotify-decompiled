package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uj20 extends onm {
    public Map a;
    public Iterator b;
    public di61 c;
    public xgn0 d;
    public Map e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vj20 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj20(vj20 vj20Var, onm onmVar) {
        super(onmVar);
        this.h = vj20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
