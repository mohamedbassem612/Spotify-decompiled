package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8n;
import p.f961;
import p.hab0;
import p.hlm;
import p.io80;
import p.klm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp/hlm;", "contextRuntime", "Lkotlin/Function0;", "Lp/a8n;", "coreThreadingApi", "Lp/io80;", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "installSharedCosmosRouterService", "(Lp/hlm;Lkotlin/jvm/functions/Function0;)Lp/io80;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 2, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NucleusSharedCosmosRouterServiceInstallerKt {

    /* JADX INFO: renamed from: com.spotify.cosmos.sharedcosmosrouterservice.NucleusSharedCosmosRouterServiceInstallerKt$installSharedCosmosRouterService$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/f961;", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "invoke", "()Lp/f961;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Function0 $coreThreadingApi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0 function0) {
            super(0);
            this.$coreThreadingApi = function0;
        }

        public final f961 invoke() {
            return SharedCosmosRouterServiceKt.createSharedCosmosRouterService(new SharedCosmosRouterServiceDependencies((a8n) this.$coreThreadingApi.invoke()));
        }
    }

    public static final io80 installSharedCosmosRouterService(hlm hlmVar, Function0 function0) {
        return ((klm) hlmVar).b("SharedCosmosRouterService", new AnonymousClass1(function0));
    }
}
