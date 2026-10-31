package p;

import com.spotify.profileconfig.proto.v1.ProfileCompletionRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yww0 {
    public final w0x0 a;

    public yww0(w0x0 w0x0Var) {
        this.a = w0x0Var;
    }

    public final Single a(tjb0 tjb0Var) {
        uzw0 uzw0VarO = ProfileCompletionRequest.o();
        uzw0VarO.n(tjb0Var.a);
        return this.a.b(uzw0VarO.build()).flatMap(cj20.e1);
    }
}
