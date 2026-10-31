package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t6y0 extends onm {
    public String a;
    public UUID b;
    public UUID c;
    public n6y0 d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u6y0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6y0(u6y0 u6y0Var, onm onmVar) {
        super(onmVar);
        this.g = u6y0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.p(null, null, null, null, false, this);
    }
}
