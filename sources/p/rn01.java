package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rn01 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tn01 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn01(tn01 tn01Var, onm onmVar) {
        super(onmVar);
        this.c = tn01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
