package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ada1 extends onm {
    public String a;
    public UUID b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dda1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ada1(dda1 dda1Var, onm onmVar) {
        super(onmVar);
        this.d = dda1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
