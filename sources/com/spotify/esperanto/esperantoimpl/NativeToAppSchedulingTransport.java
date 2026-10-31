package com.spotify.esperanto.esperantoimpl;

import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeToAppSchedulingTransport;", "Lcom/spotify/esperanto/esperanto/Transport;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "transport", "<init>", "(Lio/reactivex/rxjava3/core/Scheduler;Lcom/spotify/esperanto/esperanto/Transport;)V", "callStream", "Lio/reactivex/rxjava3/core/Observable;", "", "service", "", "method", "payload", "callSingle", "Lio/reactivex/rxjava3/core/Single;", "callSync", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NativeToAppSchedulingTransport implements Transport {
    private final Scheduler scheduler;
    private final Transport transport;

    public NativeToAppSchedulingTransport(Scheduler scheduler, Transport transport) {
        this.scheduler = scheduler;
        this.transport = transport;
    }

    public Single<byte[]> callSingle(String service, String method, byte[] payload) {
        return this.transport.callSingle(service, method, payload).subscribeOn(this.scheduler).unsubscribeOn(this.scheduler);
    }

    public Observable<byte[]> callStream(String service, String method, byte[] payload) {
        return this.transport.callStream(service, method, payload).subscribeOn(this.scheduler).unsubscribeOn(this.scheduler);
    }

    public byte[] callSync(String service, String method, byte[] payload) {
        return this.transport.callSync(service, method, payload);
    }
}
