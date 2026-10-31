package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x2e0 extends onm {
    public boolean a;
    public List b;
    public p811 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y2e0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2e0(y2e0 y2e0Var, onm onmVar) {
        super(onmVar);
        this.e = y2e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c((String) null, this, false);
    }
}
