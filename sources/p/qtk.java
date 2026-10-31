package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qtk extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ stk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtk(stk stkVar, onm onmVar) {
        super(onmVar);
        this.c = stkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
