package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ekc extends ikc {
    public final pih1 b;
    public final LoggingData c;

    public ekc(pih1 pih1Var, LoggingData loggingData) {
        this.b = pih1Var;
        this.c = loggingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekc)) {
            return false;
        }
        ekc ekcVar = (ekc) obj;
        return u890.j(this.b, ekcVar.b) && this.c.equals(ekcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
