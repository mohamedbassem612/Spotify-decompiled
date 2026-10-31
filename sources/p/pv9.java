package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pv9 extends onm {
    public Map a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ic9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv9(ic9 ic9Var, onm onmVar) {
        super(onmVar);
        this.d = ic9Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i((String) null, (Map) null, this, false);
    }
}
