package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hs21 implements Function {
    public final /* synthetic */ String a;

    public hs21(String str) {
        this.a = str;
    }

    public final Object apply(Object obj) {
        Object obj2 = ((e331) obj).a;
        ArrayList arrayList = new ArrayList();
        if (!(obj2 instanceof m231)) {
            arrayList.add(new fhy(this.a, ((MessageResponse.Success) obj2).getToken()));
        }
        return o7h.l1(arrayList);
    }
}
