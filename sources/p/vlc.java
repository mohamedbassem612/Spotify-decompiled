package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.mobius.MobiusLoop;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vlc {
    public volatile MobiusLoop a;
    public volatile DiscardReason.UserLoggingOut b;

    public final DiscardReason a(String str) {
        klc klcVar;
        Set set;
        Object next;
        DiscardReason discardReason = this.b;
        if (discardReason == null) {
            MobiusLoop mobiusLoop = this.a;
            discardReason = null;
            if (mobiusLoop != null && (klcVar = (klc) mobiusLoop.i) != null && (set = klcVar.g) != null) {
                Iterator it = set.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u890.j(((gmc) ((mmr0) next).a).a, str));
                mmr0 mmr0Var = (mmr0) next;
                if (mmr0Var != null) {
                    return (DiscardReason) mmr0Var.b;
                }
            }
        }
        return discardReason;
    }
}
