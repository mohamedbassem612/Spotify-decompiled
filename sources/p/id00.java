package p;

import com.spotify.eventsender.musicintegration.eventsenderworker.EventSenderWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class id00 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ EventSenderWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id00(EventSenderWorker eventSenderWorker, onm onmVar) {
        super(onmVar);
        this.b = eventSenderWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D((vuk) null, this);
    }
}
