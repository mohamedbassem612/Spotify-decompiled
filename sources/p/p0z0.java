package p;

import com.spotify.serviceapi.android.quasarworker.QuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p0z0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ QuasarWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0z0(QuasarWorker quasarWorker, onm onmVar) {
        super(onmVar);
        this.b = quasarWorker;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x(null, this);
    }
}
