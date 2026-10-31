package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lm30 implements mrq0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ lm30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.mrq0
    public final Completable a(tv80 tv80Var) {
        switch (this.a) {
            case 0:
                return ljg.c((ljg) this.b, "upsell:skip-limit-reached:v1", (TriggerType) null, (String) null, (List) null, tv80Var, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 494).ignoreElement();
            default:
                return new CompletableFromAction(new wqd0(this, (byte) 4));
        }
    }
}
