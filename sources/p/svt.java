package p;

import com.spotify.deviceproxy.navigation.v1.DeregisterSupportedNavigationCommandsRequest;
import com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest;
import com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\rJ$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lp/svt;", "", "Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsRequest;", "request", "Lp/fq21;", "requiresRegional", "Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsResponse;", "a", "(Lcom/spotify/deviceproxy/navigation/v1/RegisterSupportedNavigationCommandsRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/deviceproxy/navigation/v1/DeregisterSupportedNavigationCommandsRequest;", "Lp/rih1;", "b", "(Lcom/spotify/deviceproxy/navigation/v1/DeregisterSupportedNavigationCommandsRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "p/rvt", "src_main_java_com_spotify_deviceproxy_supportednavigationcommandregistrarimpl-supportednavigationcommandregistrarimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface svt {
    public static final /* synthetic */ rvt a = rvt.a;

    @Deprecated
    public static final String b = "device-proxy/spotify/v1/navigation/supported-commands";

    @Deprecated
    public static final String c = "device-proxy/spotify/v1/navigation/supported-commands:deregister";

    @Deprecated
    public static final String d = "Content-Type: application/x-protobuf";

    static /* synthetic */ Object c(svt svtVar, RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: register");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return svtVar.a(registerSupportedNavigationCommandsRequest, fq21Var, lnmVar);
    }

    static /* synthetic */ Object d(svt svtVar, DeregisterSupportedNavigationCommandsRequest deregisterSupportedNavigationCommandsRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: deregister");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = fq21.a;
        }
        return svtVar.b(deregisterSupportedNavigationCommandsRequest, fq21Var, lnmVar);
    }

    @yyq0(b)
    @u360({d})
    Object a(@elb RegisterSupportedNavigationCommandsRequest registerSupportedNavigationCommandsRequest, @rod1 fq21 fq21Var, lnm<? super RegisterSupportedNavigationCommandsResponse> lnmVar);

    @u360({d})
    @wyq0(c)
    Object b(@elb DeregisterSupportedNavigationCommandsRequest deregisterSupportedNavigationCommandsRequest, @rod1 fq21 fq21Var, lnm<? super rih1> lnmVar);
}
