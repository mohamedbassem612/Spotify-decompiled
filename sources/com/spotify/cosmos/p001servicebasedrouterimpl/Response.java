package com.spotify.cosmos.p001servicebasedrouterimpl;

import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.mmr0;

/* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver$detached$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¢\u0006\u0002\b\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/spotify/cosmos/cosmos/Response;", "response", "Lp/mmr0;", "Lcom/spotify/cosmos/cosmos/Request;", "Lkotlin/jvm/internal/EnhancedNullability;", "apply", "(Lcom/spotify/cosmos/cosmos/Response;)Lp/mmr0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class Response<T, R> implements Function {
    final /* synthetic */ Request $request;

    public Response(Request request) {
        this.$request = request;
    }

    public final mmr0 apply(com.spotify.cosmos.cosmos.Response response) {
        return new mmr0(this.$request, response);
    }
}
