package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xuy0 extends onm {
    public rba a;
    public Iterator b;
    public wuy0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yuy0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuy0(yuy0 yuy0Var, onm onmVar) {
        super(onmVar);
        this.e = yuy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
