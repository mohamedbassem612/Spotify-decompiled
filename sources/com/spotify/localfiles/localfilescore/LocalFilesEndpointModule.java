package com.spotify.localfiles.localfilescore;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.cv30;
import p.f0o1;
import p.iv30;
import p.tv30;
import p.u890;
import p.xde0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesEndpointModule;", "", "<init>", "()V", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "callbackRouter", "Lp/xde0;", "provideLocalFilesEsperantoClient", "(Lcom/spotify/cosmos/callbackrouter/CallbackRouter;)Lp/xde0;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LocalFilesEndpointModule {
    public static final LocalFilesEndpointModule INSTANCE = new LocalFilesEndpointModule();

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesEndpointModule$provideLocalFilesEsperantoClient$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* synthetic */ class AnonymousClass1 implements EsperantoCallbackRouter, iv30 {
        final /* synthetic */ CallbackRouter $tmp0;

        public AnonymousClass1(CallbackRouter callbackRouter) {
            this.$tmp0 = callbackRouter;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof EsperantoCallbackRouter) && (obj instanceof iv30)) {
                return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p.iv30
        public final cv30 getFunctionDelegate() {
            return new tv30(2, this.$tmp0, CallbackRouter.class, "resolve", "resolve(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
            return this.$tmp0.resolve(request, resolveCallback);
        }
    }

    private LocalFilesEndpointModule() {
    }

    public final xde0 provideLocalFilesEsperantoClient(CallbackRouter callbackRouter) {
        return f0o1.g(new CosmosCoroutineTransport(new AnonymousClass1(callbackRouter)));
    }
}
