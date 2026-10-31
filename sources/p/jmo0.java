package p;

import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jmo0 extends onm {
    public t45 a;
    public Long b;
    public iu30 c;
    public p811 d;
    public p811 e;
    public Throwable f;
    public /* synthetic */ Object g;
    public final /* synthetic */ NotificationHandlingQuasarWorker h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo0(NotificationHandlingQuasarWorker notificationHandlingQuasarWorker, onm onmVar) {
        super(onmVar);
        this.h = notificationHandlingQuasarWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.E((t45) null, (Long) null, (iu30) null, (iu30) null, this);
    }
}
