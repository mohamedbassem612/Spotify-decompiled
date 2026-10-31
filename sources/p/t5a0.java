package p;

import android.app.Activity;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t5a0 implements je61 {
    public final yfu a;
    public final b0a0 b;

    public t5a0(yfu yfuVar, b0a0 b0a0Var) {
        this.a = yfuVar;
        this.b = b0a0Var;
    }

    public final void a() {
        if (((no4) this.b.a.get()).y()) {
            yfu yfuVar = this.a;
            Activity activityA = ((e831) yfuVar.b).a();
            if (activityA != null) {
                ((ljg) ((hu90) yfuVar.c).invoke(activityA)).a("jam:jam-ended-survey:v1", (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : null, (152 & 8) != 0 ? z6x.a : null, (152 & 16) != 0 ? null : null, (152 & 4) != 0 ? "" : null, (152 & 32) != 0 ? vks.a : null, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : null, (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : null).doOnSuccess(k530.R0).onErrorComplete().subscribe();
            }
        }
    }
}
