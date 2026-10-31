package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface ljg {
    Single a(String str, TriggerType triggerType, List list, tv80 tv80Var, String str2, uy31 uy31Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, d3j0 d3j0Var);

    void b(String str, DismissReason dismissReason);

    Observable d(ViewRequest viewRequest);

    emc e();
}
