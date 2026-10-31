package p;

import com.spotify.serviceapi.android.quasarworker.QuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o0z0 extends onm {
    public l2t a;
    public wex0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ QuasarWorker d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0z0(QuasarWorker quasarWorker, onm onmVar) {
        super(onmVar);
        this.d = quasarWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p((s2t) null, this);
    }
}
