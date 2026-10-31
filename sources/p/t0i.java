package p;

import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.Header;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t0i {
    public final g3g1 a;

    public t0i(g3g1 g3g1Var) {
        this.a = g3g1Var;
    }

    public final void a(Object obj) {
        String name = null;
        if (obj != null) {
            if (obj instanceof wab) {
                name = ((wab) obj).a;
            } else if (obj instanceof Header) {
                name = ((Header) obj).getName();
            } else if (obj instanceof AuthMethod) {
                name = ((AuthMethod) obj).getName();
            } else if (obj instanceof Authentication) {
                name = ((Authentication) obj).getName();
            } else {
                n57.e("Unsupported component");
            }
        }
        if (name == null || ihc1.y0(name)) {
            return;
        }
        this.a.a.e(new tf81(name));
    }
}
