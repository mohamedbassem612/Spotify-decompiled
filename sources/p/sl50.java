package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sl50 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tl50 c;
    public r261 d;
    public vl50 e;
    public String f;
    public CancellationException g;
    public String h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl50(tl50 tl50Var, onm onmVar) {
        super(onmVar);
        this.c = tl50Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
