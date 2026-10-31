package p;

import android.util.LruCache;
import com.spotify.liveroom.listeningparty.proto.ObservePartyRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zip0 {
    public final xjd0 a;
    public final LruCache b = new LruCache(10);

    public zip0(xjd0 xjd0Var) {
        this.a = xjd0Var;
    }

    public final Observable a(y6b1 y6b1Var) {
        ObservePartyRequest observePartyRequest;
        String string = y6b1Var.toString();
        cjp0 cjp0VarO = ObservePartyRequest.o();
        cjp0VarO.q(string);
        String str = (String) this.b.get(string);
        if (str == null) {
            observePartyRequest = (ObservePartyRequest) cjp0VarO.build();
        } else {
            cjp0VarO.n(str);
            observePartyRequest = (ObservePartyRequest) cjp0VarO.build();
        }
        observePartyRequest.getClass();
        return this.a.a(observePartyRequest).toObservable().flatMap(new drj0(this, y6b1Var, (byte) 22));
    }
}
