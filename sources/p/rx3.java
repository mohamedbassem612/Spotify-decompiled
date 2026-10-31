package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rx3 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sx3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx3(sx3 sx3Var, onm onmVar) {
        super(onmVar);
        this.c = sx3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
