package p;

import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.Poll;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6v0 {
    public final CompositeDisposable a = new CompositeDisposable();
    public final cce b = new cce((byte) 13);

    public final void a(ClientPollResponse clientPollResponse) {
        Object next;
        cce cceVar = this.b;
        BehaviorSubject behaviorSubject = (BehaviorSubject) cceVar.d;
        ArrayList arrayList = (ArrayList) cceVar.b;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((ClientPollResponse) next).o().getEntityUri(), clientPollResponse.o().getEntityUri()));
        ClientPollResponse clientPollResponse2 = (ClientPollResponse) next;
        if (clientPollResponse2 == null) {
            arrayList.add(clientPollResponse);
            behaviorSubject.onNext(clientPollResponse);
            return;
        }
        if (!clientPollResponse.o().w()) {
            alg algVarR = ClientPollResponse.r(clientPollResponse);
            yav0 yav0VarX = Poll.x(clientPollResponse.o());
            yav0VarX.n(clientPollResponse2.o().p());
            algVarR.n(yav0VarX);
            clientPollResponse = (ClientPollResponse) algVarR.build();
        }
        int iIndexOf = arrayList.indexOf(clientPollResponse2);
        clientPollResponse.getClass();
        arrayList.set(iIndexOf, clientPollResponse);
        behaviorSubject.onNext(clientPollResponse);
    }
}
