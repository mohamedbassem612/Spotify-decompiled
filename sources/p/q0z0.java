package p;

import com.spotify.serviceapi.android.quasarworker.QuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q0z0 extends onm {
    public m0z0 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ QuasarWorker d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0z0(QuasarWorker quasarWorker, onm onmVar) {
        super(onmVar);
        this.d = quasarWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.z((m0z0) null, (m0z0) null, this);
    }
}
