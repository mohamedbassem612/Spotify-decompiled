package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly91 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ my91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly91(my91 my91Var, onm onmVar) {
        super(onmVar);
        this.c = my91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c((List) null, this);
    }
}
