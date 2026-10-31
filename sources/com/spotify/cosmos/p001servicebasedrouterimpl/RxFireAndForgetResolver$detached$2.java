package com.spotify.cosmos.p001servicebasedrouterimpl;

import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p.mmr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class RxFireAndForgetResolver$detached$2 implements Function {
    final /* synthetic */ RxFireAndForgetResolver.Companion $tmp0;

    public RxFireAndForgetResolver$detached$2(RxFireAndForgetResolver.Companion companion) {
        this.$tmp0 = companion;
    }

    public final Observable<Response> apply(mmr0 mmr0Var) {
        return RxFireAndForgetResolver.Companion.access$processResponseStatus(this.$tmp0, mmr0Var);
    }
}
