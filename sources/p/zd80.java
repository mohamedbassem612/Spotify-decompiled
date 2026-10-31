package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zd80 implements Function {
    public final /* synthetic */ String a;

    public zd80(String str) {
        this.a = str;
    }

    public final Object apply(Object obj) {
        return new MessageResponse.Failure(new MessageRequest(this.a, (TriggerType) null, (List) null, (tv80) null, (String) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510, (DefaultConstructorMarker) null), "messageRequestId", new DiscardReason() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$RequestTimedOut
            public static final int $stable = 0;
        });
    }
}
