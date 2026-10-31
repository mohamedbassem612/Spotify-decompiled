package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uni0 extends onm {
    public List a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yrg0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uni0(yrg0 yrg0Var, onm onmVar) {
        super(onmVar);
        this.d = yrg0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p((List) null, this);
    }
}
