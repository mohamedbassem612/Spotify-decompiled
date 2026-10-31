package com.spotify.cosmos.p001servicebasedrouterimpl;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.mmr0;

/* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver$resolve$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u00010\u0003¢\u0006\u0002\b\u00012\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/spotify/cosmos/cosmos/Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "response", "Lp/mmr0;", "Lcom/spotify/cosmos/cosmos/Request;", "apply", "(Lcom/spotify/cosmos/cosmos/Response;)Lp/mmr0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class C0001RxFireAndForgetResolver$resolve$1<T, R> implements Function {
    final /* synthetic */ Request $request;

    public C0001RxFireAndForgetResolver$resolve$1(Request request) {
        this.$request = request;
    }

    public final mmr0 apply(Response response) {
        return new mmr0(this.$request, response);
    }
}
