package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wdc0 extends onm {
    public ouc0 a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zdc0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdc0(zdc0 zdc0Var, onm onmVar) {
        super(onmVar);
        this.e = zdc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.m(null, null, this);
    }
}
