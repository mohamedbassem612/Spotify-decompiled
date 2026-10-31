package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fre1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ hre1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fre1(hre1 hre1Var, onm onmVar) {
        super(onmVar);
        this.b = hre1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g((String) null, (ArrayList) null, (xqe1) null, this);
    }
}
