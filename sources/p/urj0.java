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
public final class urj0 implements ljg {
    public final /* synthetic */ qjg a;

    public urj0(qjg qjgVar) {
        this.a = qjgVar;
    }

    @Override // p.ljg
    public final Single a(String str, TriggerType triggerType, List list, tv80 tv80Var, String str2, uy31 uy31Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, d3j0 d3j0Var) {
        return this.a.a(str, triggerType, list, tv80Var, str2, uy31Var, dynamicTagsMetadata, conflictResolutionStrategy, d3j0Var);
    }

    @Override // p.ljg
    public final void b(String str, DismissReason dismissReason) {
        this.a.b(str, dismissReason);
    }

    @Override // p.ljg
    public final Observable d(ViewRequest viewRequest) {
        return this.a.d(viewRequest);
    }

    @Override // p.ljg
    public final emc e() {
        return this.a.c;
    }
}
