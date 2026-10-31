package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z7n extends Scheduler {
    public final a8n c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public z7n(a8n a8nVar) {
        this.c = a8nVar;
    }

    public final Scheduler.Worker b() {
        return new y7n(this);
    }
}
