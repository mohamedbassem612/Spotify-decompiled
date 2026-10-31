package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o5u extends onm {
    public Disposable a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jut c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5u(jut jutVar, onm onmVar) {
        super(onmVar);
        this.c = jutVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, null, this);
    }
}
