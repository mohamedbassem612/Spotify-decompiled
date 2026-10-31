package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ybc0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ccc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybc0(ccc0 ccc0Var, onm onmVar) {
        super(onmVar);
        this.b = ccc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((List) null, (ubc0) null, this);
    }
}
