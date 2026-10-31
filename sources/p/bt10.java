package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bt10 implements h691 {
    public final ljg a;
    public final wm4 b;

    public bt10(ljg ljgVar, wm4 wm4Var) {
        this.a = ljgVar;
        this.b = wm4Var;
    }

    public final Completable a(PlayerState playerState, tv80 tv80Var) {
        if (this.b.a()) {
            Completable completableIgnoreElement = ljg.c(this.a, "recs-quality:skip-next:v1", (TriggerType) null, (String) null, (List) null, tv80Var, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 494).ignoreElement();
            completableIgnoreElement.getClass();
            return completableIgnoreElement;
        }
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        completableEmpty.getClass();
        return completableEmpty;
    }
}
