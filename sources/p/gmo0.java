package p;

import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gmo0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ NotificationHandlingQuasarWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmo0(NotificationHandlingQuasarWorker notificationHandlingQuasarWorker, onm onmVar) {
        super(onmVar);
        this.b = notificationHandlingQuasarWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D(this);
    }
}
