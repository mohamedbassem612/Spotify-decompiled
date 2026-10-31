package p;

import com.spotify.esperanto.esperanto.ServiceBase;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rz11 implements ServiceBase {
    public final lw21 a;

    public rz11(lw21 lw21Var) {
        this.a = lw21Var;
    }

    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
    }

    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
    }

    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
            return null;
        }
        boolean zEquals = str2.equals("lookupBool");
        lw21 lw21Var = this.a;
        if (zEquals) {
            EsRemoteConfig.LookupRequest lookupRequestP = EsRemoteConfig.LookupRequest.p(bArr);
            lookupRequestP.getClass();
            uqz uqzVarN = EsRemoteConfig.BoolResponse.n();
            Boolean bool = lw21Var.c(lookupRequestP.o(), lookupRequestP.getName()).c;
            if (bool != null) {
                uqzVarN.n(bool.booleanValue());
            }
            return uqzVarN.build().toByteArray();
        }
        if (str2.equals("lookupInt")) {
            EsRemoteConfig.LookupRequest lookupRequestP2 = EsRemoteConfig.LookupRequest.p(bArr);
            lookupRequestP2.getClass();
            wqz wqzVarN = EsRemoteConfig.IntResponse.n();
            Integer num = lw21Var.c(lookupRequestP2.o(), lookupRequestP2.getName()).d;
            if (num != null) {
                wqzVarN.n(num.intValue());
            }
            return wqzVarN.build().toByteArray();
        }
        if (!str2.equals("lookupEnum")) {
            jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
            return null;
        }
        EsRemoteConfig.LookupRequest lookupRequestP3 = EsRemoteConfig.LookupRequest.p(bArr);
        lookupRequestP3.getClass();
        vqz vqzVarN = EsRemoteConfig.EnumResponse.n();
        String str3 = lw21Var.c(lookupRequestP3.o(), lookupRequestP3.getName()).e;
        if (str3 != null) {
            vqzVarN.n(str3);
        }
        return vqzVarN.build().toByteArray();
    }

    public final String getName() {
        return "spotify.remote_config.esperanto.proto.RemoteConfig";
    }
}
