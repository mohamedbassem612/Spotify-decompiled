package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zca1 extends onm {
    public UUID a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dda1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca1(dda1 dda1Var, onm onmVar) {
        super(onmVar);
        this.c = dda1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
