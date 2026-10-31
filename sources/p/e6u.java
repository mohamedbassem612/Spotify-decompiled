package p;

import com.google.protobuf.Empty;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e6u implements Function0 {
    public final /* synthetic */ byte a;
    public final jkp0 b;

    public /* synthetic */ e6u(jkp0 jkp0Var, byte b) {
        this.a = b;
        this.b = jkp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jkp0 jkp0Var = this.b;
        switch (b) {
            case 0:
                return jkp0Var.a(false).p(zhm0.W0);
            case 1:
                return ((be) jkp0Var.b).callSingle("spotify.puffin_esperanto.proto.PuffinService", "LibraryVersion", Empty.n()).map(vbx0.c).map(c4x0.c);
            case 2:
                return ((be) jkp0Var.b).callSingle("spotify.puffin_esperanto.proto.PuffinService", "LeaveProcessingEnvironment", Empty.n()).map(u9x0.c).ignoreElement().p(aj20.i);
            default:
                return ((be) jkp0Var.b).callStream("spotify.puffin_esperanto.proto.PuffinService", "SubscribeToErrors", Empty.n()).map(wbx0.c).map(e4x0.c);
        }
    }
}
