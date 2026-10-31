package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class a5j0 {
    public abstract pih1 a();

    public final LoggingData b() {
        if (this instanceof u4j0) {
            return null;
        }
        if (this instanceof t4j0) {
            return yhm0.i(((t4j0) this).b);
        }
        if (this instanceof y4j0) {
            return yhm0.i(((y4j0) this).b);
        }
        if (this instanceof x4j0) {
            return yhm0.i(((x4j0) this).d());
        }
        if (this instanceof v4j0) {
            Message message = ((v4j0) this).b;
            if (message != null) {
                return yhm0.i(message);
            }
            return null;
        }
        if (this instanceof w4j0) {
            return yhm0.i(((w4j0) this).b);
        }
        if (this instanceof z4j0) {
            return yhm0.i(((z4j0) this).b);
        }
        eg.o();
        return null;
    }

    public final Message c() {
        if (this instanceof u4j0) {
            return null;
        }
        if (this instanceof t4j0) {
            return ((t4j0) this).b;
        }
        if (this instanceof y4j0) {
            return ((y4j0) this).b;
        }
        if (this instanceof x4j0) {
            return ((x4j0) this).d();
        }
        if (this instanceof v4j0) {
            return ((v4j0) this).b;
        }
        if (this instanceof w4j0) {
            return ((w4j0) this).b;
        }
        if (this instanceof z4j0) {
            return ((z4j0) this).b;
        }
        eg.o();
        return null;
    }
}
