package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cre1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hre1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre1(hre1 hre1Var, onm onmVar) {
        super(onmVar);
        this.b = hre1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((String) null, (List) null, this);
    }
}
