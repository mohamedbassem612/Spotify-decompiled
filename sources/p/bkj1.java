package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bkj1 extends onm {
    public File a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n58 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkj1(n58 n58Var, onm onmVar) {
        super(onmVar);
        this.c = n58Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
