package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aaa implements Consumer {
    public final /* synthetic */ baa a;
    public final /* synthetic */ gj5 b;

    public aaa(baa baaVar, gj5 gj5Var) {
        this.a = baaVar;
        this.b = gj5Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        MessageResponse.Success success = (MessageResponse.Success) obj;
        baa baaVar = this.a;
        vku vkuVarE = baa.e(baaVar);
        ljg ljgVarB = baa.b(baaVar);
        MessageResponseToken token = success.getToken();
        uy31 uy31VarC = baa.c(baaVar);
        gj5 gj5Var = this.b;
        vkuVarE.a(ljgVarB.d(new ViewRequest(gj5Var, gj5Var, token, (DynamicTagsMetadata) null, (lmc) null, uy31VarC, (d3j0) null, 88, (DefaultConstructorMarker) null)).subscribeOn(baa.a(baaVar)).observeOn(baa.d(baaVar)).subscribe((Consumer) new z9a(baaVar, success)));
    }
}
