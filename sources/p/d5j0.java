package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d5j0 implements Supplier {
    public final /* synthetic */ List a;
    public final /* synthetic */ MessageRequest b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i5j0 d;

    public d5j0(List list, MessageRequest messageRequest, String str, i5j0 i5j0Var) {
        this.a = list;
        this.b = messageRequest;
        this.c = str;
        this.d = i5j0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        List list = this.a;
        boolean z = list instanceof Collection;
        String str = this.c;
        MessageRequest messageRequest = this.b;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (ihc1.y0(((ClientMessage) it.next()).getId())) {
                    Single singleJust = Single.just(new MessageResponse.Failure(messageRequest, str, new DiscardReason.DataMalformed("Supplied message id must not be blank")));
                    singleJust.getClass();
                    return singleJust;
                }
            }
        }
        return Single.defer(new f5j0(messageRequest, this.d, str));
    }
}
