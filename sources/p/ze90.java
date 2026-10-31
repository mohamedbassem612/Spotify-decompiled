package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ze90 implements ty31 {
    public final BehaviorSubject a = BehaviorSubject.g(Boolean.FALSE);
    public final vku b;

    public ze90(Flowable flowable) {
        vku vkuVar = new vku();
        this.b = vkuVar;
        vkuVar.a(new ObservableFromPublisher(flowable).map(vf61.V0).distinctUntilChanged().subscribe((Consumer) new od30(this, (byte) 22)));
    }

    @Override // p.ty31
    public final rqg0 a(Message message, gmc gmcVar, klc klcVar) {
        return u890.j(this.a.h(), Boolean.TRUE) ? vy31.f : new wy31();
    }

    @Override // p.ty31
    public final void dispose() {
        this.b.c();
    }
}
