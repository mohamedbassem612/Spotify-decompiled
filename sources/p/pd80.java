package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface pd80 {
    static Observable a(pd80 pd80Var, Context context, iac0 iac0Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, int i) {
        String entityUri;
        String creatorName;
        String entityName;
        String entityImageUrl;
        String entityImageUrl2 = null;
        if ((i & 8) != 0) {
            dynamicTagsMetadata = null;
        }
        d3j0 d3j0Var = new d3j0(new b3j0(true), x2j0.a);
        ae80 ae80Var = (ae80) pd80Var;
        ljg ljgVar = ae80Var.a;
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata2 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            entityUri = dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityUri() : null;
            if (entityUri == null) {
                entityUri = messageResponseToken.getMessageRequest().getPageUri();
            }
        }
        if (dynamicTagsMetadata == null || (creatorName = dynamicTagsMetadata.getCreatorName()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata3 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            creatorName = dynamicTagsMetadata3 != null ? dynamicTagsMetadata3.getCreatorName() : null;
        }
        if (dynamicTagsMetadata == null || (entityName = dynamicTagsMetadata.getEntityName()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata4 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            entityName = dynamicTagsMetadata4 != null ? dynamicTagsMetadata4.getEntityName() : null;
        }
        if (dynamicTagsMetadata == null || (entityImageUrl = dynamicTagsMetadata.getEntityImageUrl()) == null) {
            DynamicTagsMetadata dynamicTagsMetadata5 = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
            if (dynamicTagsMetadata5 != null) {
                entityImageUrl2 = dynamicTagsMetadata5.getEntityImageUrl();
            }
        } else {
            entityImageUrl2 = entityImageUrl;
        }
        return ljgVar.d(new ViewRequest(context, iac0Var, messageResponseToken, new DynamicTagsMetadata(entityUri, creatorName, entityName, entityImageUrl2), lmc.a, fh80.a, d3j0Var)).map(new xd80(ae80Var, messageResponseToken, iac0Var));
    }

    static Single b(pd80 pd80Var, String str, String str2, DynamicTagsMetadata dynamicTagsMetadata, int i) {
        String entityUri;
        DynamicTagsMetadata dynamicTagsMetadata2 = (i & 4) != 0 ? null : dynamicTagsMetadata;
        ae80 ae80Var = (ae80) pd80Var;
        return Single.amb(p7h.M(Single.timer(500L, TimeUnit.MILLISECONDS, ae80Var.b).map(new zd80(str)), ae80Var.a.a(str, (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : TriggerType.CLIENT_EVENT, (152 & 8) != 0 ? z6x.a : null, (152 & 16) != 0 ? null : null, (152 & 4) != 0 ? "" : str2, (152 & 32) != 0 ? vks.a : fh80.a, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : new DynamicTagsMetadata((dynamicTagsMetadata2 == null || (entityUri = dynamicTagsMetadata2.getEntityUri()) == null) ? str2 : entityUri, null, dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityName() : null, dynamicTagsMetadata2 != null ? dynamicTagsMetadata2.getEntityImageUrl() : null, 2, null), (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : new d3j0(new b3j0(true), x2j0.a)))).map(yd80.a);
    }
}
