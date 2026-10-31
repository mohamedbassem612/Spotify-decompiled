package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3b1 extends onm {
    public a4b1 a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a4b1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3b1(a4b1 a4b1Var, onm onmVar) {
        super(onmVar);
        this.d = a4b1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return a4b1.F(this.d, null, this);
    }
}
