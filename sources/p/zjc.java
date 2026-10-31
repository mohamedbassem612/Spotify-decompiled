package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zjc extends t3k1 {
    public final gmc b;
    public final List c;
    public final TriggerType d;

    public zjc(gmc gmcVar, List list, TriggerType triggerType) {
        this.b = gmcVar;
        this.c = list;
        this.d = triggerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjc)) {
            return false;
        }
        zjc zjcVar = (zjc) obj;
        return this.b.equals(zjcVar.b) && this.c.equals(zjcVar.c) && this.d == zjcVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(this.b.hashCode() * 31, 31, this.c);
    }
}
