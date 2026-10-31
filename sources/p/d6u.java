package p;

import com.google.protobuf.Empty;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d6u implements Function0 {
    public final jkp0 a;

    public d6u(jkp0 jkp0Var) {
        this.a = jkp0Var;
    }

    public final Object invoke() {
        jkp0 jkp0Var = this.a;
        return jkp0Var.a(false).p(qz70.Y0).c(((be) jkp0Var.b).callSingle("spotify.puffin_esperanto.proto.PuffinService", "LeaveProcessingEnvironment", Empty.n()).map(u9x0.c).ignoreElement().p(b6j0.X0));
    }
}
