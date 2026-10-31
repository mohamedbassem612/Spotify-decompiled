package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class noo0 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zoo0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noo0(zoo0 zoo0Var, onm onmVar) {
        super(onmVar);
        this.c = zoo0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
