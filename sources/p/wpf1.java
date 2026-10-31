package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wpf1 implements ObservableTransformer {
    public final pd80 a;
    public final zpg0 b;
    public final zpg0 c;
    public final lik1 d;
    public String e;
    public String f;

    public wpf1(pd80 pd80Var, zpg0 zpg0Var, zpg0 zpg0Var2, lik1 lik1Var) {
        this.a = pd80Var;
        this.b = zpg0Var;
        this.c = zpg0Var2;
        this.d = lik1Var;
    }

    public final y570 a(MessageResponseToken messageResponseToken) {
        HubsImmutableComponentBundle hubsImmutableComponentBundleA = this.b.a(messageResponseToken);
        return gd70.c.a.P("cmp:inlineCard", s570.b.a).E("cmp:inlineCard:" + messageResponseToken.getMessageData().getId()).o(hubsImmutableComponentBundleA).o(this.c.a(messageResponseToken.getMessageData().getFormat())).x();
    }

    public final ObservableSource apply(Observable observable) {
        return Observable.combineLatest(observable, observable.take(1L).flatMap(new vpf1(this)), new dn81(this, (byte) 21));
    }
}
