package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tjc extends t3k1 {
    public final List b;
    public final TriggerType c;

    public tjc(List list, TriggerType triggerType) {
        this.b = list;
        this.c = triggerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjc)) {
            return false;
        }
        tjc tjcVar = (tjc) obj;
        return this.b.equals(tjcVar.b) && this.c == tjcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
