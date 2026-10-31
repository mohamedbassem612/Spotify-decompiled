package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html;
import com.spotify.pendragon.v1.proto.MessageCreative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xxi0 implements iu30 {
    public final ip31 a;
    public final b170 b;

    public xxi0(ip31 ip31Var, b170 b170Var) {
        this.a = ip31Var;
        this.b = b170Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        MessageCreative messageCreative = (MessageCreative) obj;
        if (messageCreative.w()) {
            return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative.FormatCreative(messageCreative.p(), messageCreative.u(), messageCreative.q(), messageCreative.v(), messageCreative.o(), this.a.v(messageCreative.s()));
        }
        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative.HtmlCreative(messageCreative.p(), messageCreative.u(), messageCreative.q(), messageCreative.v(), messageCreative.o(), (Html) this.b.invoke(messageCreative.t()));
    }
}
