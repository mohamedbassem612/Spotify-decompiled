package p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jd3 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ u961 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(u961 u961Var, onm onmVar) {
        super(onmVar);
        this.b = u961Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.A(0, null, this, false);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
