package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ykj0 extends onm {
    public Map a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w6e0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykj0(w6e0 w6e0Var, onm onmVar) {
        super(onmVar);
        this.c = w6e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objE = this.c.e((Map) null, this);
        return objE == d9n.a ? objE : new e331(objE);
    }
}
