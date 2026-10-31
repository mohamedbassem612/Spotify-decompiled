package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class da70 implements de70 {
    public static final HubsImmutableComponentBundle b;
    public static final HubsImmutableComponentBundle c;
    public final r630 a;

    static {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        b = hubsImmutableComponentBundle.a.m("following", true).o();
        c = hubsImmutableComponentBundle.a.m("following", false).o();
    }

    public da70(r630 r630Var) {
        this.a = r630Var;
    }

    public final y570 b(y570 y570Var) {
        me70 me70VarT = y570Var.t();
        if (me70VarT != null) {
            md70 md70Var = ((od70) me70VarT).a;
            if (md70Var.b.contains("toggle-follow")) {
                String str = md70Var.a;
                Set set = s4b1.f;
                n57.k(uic.x(str).c == blc0.ee, "Invalid link type, %s, model id: %s", new Object[]{str, y570Var.a()});
                i430 i430VarC = this.a.c(str);
                boolean z = i430VarC != null && i430VarC.b;
                if (y570Var.g().b("following", false) != z) {
                    return y570Var.toBuilder().o(z ? b : c).x();
                }
            }
        }
        return y570Var;
    }
}
