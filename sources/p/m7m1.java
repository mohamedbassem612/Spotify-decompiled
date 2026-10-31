package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7m1 extends onm {
    public String a;
    public Object b;
    public l811 c;
    public CancellationException d;
    public jb20 e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ o7m1 i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7m1(o7m1 o7m1Var, onm onmVar) {
        super(onmVar);
        this.i = o7m1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
