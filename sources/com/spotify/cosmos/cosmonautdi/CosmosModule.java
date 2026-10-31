package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosModule;", "", "bindRxFireAndForgetResolver", "Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "rxFireAndForgetResolver", "Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface CosmosModule {
    FireAndForgetResolver bindRxFireAndForgetResolver(RxFireAndForgetResolver rxFireAndForgetResolver);
}
