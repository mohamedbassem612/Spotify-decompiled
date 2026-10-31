package p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ServiceBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sz4 implements ServiceBase {
    public final zwz0 a;
    public final x7n b;

    public sz4(zwz0 zwz0Var, x7n x7nVar) {
        this.a = zwz0Var;
        this.b = x7nVar;
    }

    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
    }

    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
            return null;
        }
        if (str2.equals("reachability")) {
            Empty.q(bArr).getClass();
            return yoi1.i(o4p1.r(new u70(this.a.d(), (byte) 20), this.b), o6x.a).map(bjx0.d);
        }
        jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        return null;
    }

    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
    }

    public final String getName() {
        return "spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor";
    }
}
