package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tn9 extends onm {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q59 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn9(q59 q59Var, onm onmVar) {
        super(onmVar);
        this.c = q59Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.s(null, this);
    }
}
