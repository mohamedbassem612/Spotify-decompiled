package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ovy0 extends onm {
    public String a;
    public File b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xmu0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovy0(xmu0 xmu0Var, onm onmVar) {
        super(onmVar);
        this.d = xmu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, null, this);
    }
}
