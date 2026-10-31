package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tek0 extends onm {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vek0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tek0(vek0 vek0Var, onm onmVar) {
        super(onmVar);
        this.c = vek0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objB = this.c.b(null, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
