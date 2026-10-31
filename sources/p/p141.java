package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p141 extends onm {
    public Function0 a;
    public /* synthetic */ Object b;
    public int c;

    public p141(onm onmVar) {
        super(onmVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return fc11.k((Observable) null, (Function0) null, this);
    }
}
