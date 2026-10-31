package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class e0c implements Update {
    public final Next a(Object obj, Object obj2) {
        DismissReason dismissReason;
        i0c i0cVar = (i0c) obj;
        zzb zzbVar = (zzb) obj2;
        MessageResponseToken messageResponseToken = i0cVar.a;
        if (zzbVar.equals(xzb.a)) {
            return Next.a(Collections.singleton(new rzb(messageResponseToken)));
        }
        if (!zzbVar.equals(vzb.a) && !zzbVar.equals(wzb.a) && !zzbVar.equals(yzb.a)) {
            eg.o();
            return null;
        }
        if (i0cVar.c) {
            return Next.j();
        }
        i0c i0cVar2 = new i0c(messageResponseToken, i0cVar.b, true);
        if (zzbVar instanceof vzb) {
            dismissReason = DismissReason.BackButtonTapped.INSTANCE;
        } else {
            dismissReason = zzbVar instanceof yzb ? DismissReason.MessageSwiped.INSTANCE : DismissReason.BackgroundViewTapped.INSTANCE;
        }
        return Next.i(i0cVar2, Collections.singleton(new qzb(messageResponseToken, dismissReason)));
    }
}
