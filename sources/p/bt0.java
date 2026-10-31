package p;

import com.spotify.adonappopen.logger.events.proto.AdOnAppOpenClientEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bt0 {
    public final t2j0 a;

    public bt0(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public static void a(bt0 bt0Var, at0 at0Var, String str, List list, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        bt0Var.getClass();
        ps0 ps0VarO = AdOnAppOpenClientEvent.o();
        ps0VarO.q(at0Var.a);
        if (str != null) {
            ps0VarO.s(str);
        }
        if (list != null) {
            ps0VarO.n(list);
        }
        if (str2 != null) {
            ps0VarO.r(str2);
        }
        AdOnAppOpenClientEvent adOnAppOpenClientEventBuild = ps0VarO.build();
        t2j0 t2j0Var = bt0Var.a;
        adOnAppOpenClientEventBuild.getClass();
        t2j0Var.a(adOnAppOpenClientEventBuild);
    }
}
