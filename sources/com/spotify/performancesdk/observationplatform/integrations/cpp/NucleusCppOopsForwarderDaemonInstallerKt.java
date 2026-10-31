package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.ax4;
import p.dwo;
import p.go80;
import p.hab0;
import p.hlm;
import p.klm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp/hlm;", "contextRuntime", "Lkotlin/Function0;", "Lp/ax4;", "perfTrackingProperties", "Lp/go80;", "installCppOopsForwarderDaemon", "(Lp/hlm;Lkotlin/jvm/functions/Function0;)Lp/go80;", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 2, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NucleusCppOopsForwarderDaemonInstallerKt {

    /* JADX INFO: renamed from: com.spotify.performancesdk.observationplatform.integrations.cpp.NucleusCppOopsForwarderDaemonInstallerKt$installCppOopsForwarderDaemon$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/dwo;", "invoke", "()Lp/dwo;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Function0 $perfTrackingProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0 function0) {
            super(0);
            this.$perfTrackingProperties = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dwo invoke() {
            return new CppOopsForwarderDaemon((ax4) this.$perfTrackingProperties.invoke());
        }
    }

    public static final go80 installCppOopsForwarderDaemon(hlm hlmVar, Function0 function0) {
        return ((klm) hlmVar).a("CppOopsForwarderDaemon", new AnonymousClass1(function0));
    }
}
