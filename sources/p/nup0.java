package p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ServiceBase;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nup0 implements ServiceBase {
    public abstract Observable a(EsOfflinePlugin.DownloadCommand downloadCommand);

    public abstract Single b(EsOfflinePlugin.IdentifyCommand identifyCommand);

    public abstract Single c(EsOfflinePlugin.RemoveCommand removeCommand);

    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.offline.proto.v2.OfflinePlugin")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.offline.proto.v2.OfflinePlugin]"));
            return null;
        }
        if (str2.equals("identify")) {
            EsOfflinePlugin.IdentifyCommand identifyCommandO = EsOfflinePlugin.IdentifyCommand.o(bArr);
            identifyCommandO.getClass();
            return b(identifyCommandO).map(fj10.T0);
        }
        if (str2.equals("stopDownload")) {
            EsOfflinePlugin.StopDownloadCommand.n(bArr).getClass();
            return d().map(ok10.S0);
        }
        if (!str2.equals("remove")) {
            jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
            return null;
        }
        EsOfflinePlugin.RemoveCommand removeCommandO = EsOfflinePlugin.RemoveCommand.o(bArr);
        removeCommandO.getClass();
        return c(removeCommandO).map(sl10.W0);
    }

    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.offline.proto.v2.OfflinePlugin")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.offline.proto.v2.OfflinePlugin]"));
            return null;
        }
        if (!str2.equals("download")) {
            jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
            return null;
        }
        EsOfflinePlugin.DownloadCommand downloadCommandN = EsOfflinePlugin.DownloadCommand.n(bArr);
        downloadCommandN.getClass();
        return a(downloadCommandN).map(as10.T0);
    }

    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.offline.proto.v2.OfflinePlugin")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.offline.proto.v2.OfflinePlugin]"));
    }

    public Single d() {
        return Single.just(Empty.n());
    }

    public final String getName() {
        return "spotify.offline.proto.v2.OfflinePlugin";
    }
}
