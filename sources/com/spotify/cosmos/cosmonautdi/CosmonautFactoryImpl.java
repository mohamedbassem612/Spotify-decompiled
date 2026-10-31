package com.spotify.cosmos.cosmonautdi;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.converters.ByteArrayConverters;
import com.spotify.cosmos.converters.KotlinxSerializationCosmonautConverters;
import com.spotify.cosmos.converters.ProtoJavaliteConverters;
import com.spotify.cosmos.converters.StringConverters;
import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.cosmonautatoms.CosmonautImpl;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.List;
import kotlin.Metadata;
import p.nfa0;
import p.p7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautFactoryImpl;", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "Lp/nfa0;", "json", "<init>", "(Lp/nfa0;)V", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "provideCosmonaut", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "converterFactories", "Ljava/util/List;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CosmonautFactoryImpl implements CosmonautFactory {
    private final List<Converter.Factory> converterFactories;

    public CosmonautFactoryImpl(nfa0 nfa0Var) {
        this.converterFactories = p7h.M(new Converter.Factory[]{new ByteArrayConverters(), new StringConverters(), new ProtoJavaliteConverters(), new KotlinxSerializationCosmonautConverters(nfa0Var)});
    }

    @Override // com.spotify.cosmos.cosmonaut.CosmonautFactory
    public Cosmonaut provideCosmonaut(RxRouter rxRouter) {
        return new CosmonautImpl(rxRouter, this.converterFactories);
    }
}
