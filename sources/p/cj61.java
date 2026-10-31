package p;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cj61 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ SessionWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj61(SessionWorker sessionWorker, onm onmVar) {
        super(onmVar);
        this.b = sessionWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.f(this);
    }
}
