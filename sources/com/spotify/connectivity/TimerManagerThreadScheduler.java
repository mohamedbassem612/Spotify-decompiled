package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/connectivity/TimerManagerThreadScheduler;", "Lcom/spotify/connectivity/Scheduler;", "Lcom/spotify/concurrency/async/Scheduler;", "timerManagerThread", "<init>", "(Lcom/spotify/concurrency/async/Scheduler;)V", "Ljava/lang/Runnable;", "callback", "Lp/rih1;", "post", "(Ljava/lang/Runnable;)V", "Lcom/spotify/concurrency/async/Scheduler;", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class TimerManagerThreadScheduler implements Scheduler {
    private final com.spotify.concurrency.async.Scheduler timerManagerThread;

    public TimerManagerThreadScheduler(com.spotify.concurrency.async.Scheduler scheduler) {
        this.timerManagerThread = scheduler;
    }

    @Override // com.spotify.connectivity.Scheduler
    public void post(Runnable callback) {
        this.timerManagerThread.post(callback);
    }
}
