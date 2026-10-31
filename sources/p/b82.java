package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b82 implements l381 {
    public final /* synthetic */ byte a = 0;
    public final o3r b;

    public b82(d82 d82Var) {
        this.b = (o3r) d82Var.f;
    }

    public final o3r b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public final boolean t(Object obj) {
        String string;
        switch (this.a) {
            case 0:
                return ((qxc0) obj).t.b;
            case 1:
                return Boolean.parseBoolean((String) ((qxc0) obj).X.get("should_show_promo_disclosure"));
            case 2:
                qxc0 qxc0Var = (qxc0) obj;
                if (gyo1.L(qxc0Var.O0)) {
                    Set set = t7y0.h;
                    Map map = qxc0Var.X;
                    Set set2 = h4d0.a;
                    String str = (String) map.get("generation_status");
                    if (str == null || (string = ihc1.e1(str).toString()) == null) {
                        string = "";
                    }
                    if (!set.contains(qyo1.u(string))) {
                        return false;
                    }
                }
                return true;
            default:
                qxc0 qxc0Var2 = (qxc0) obj;
                exc0 exc0Var = qxc0Var2.t.g;
                return (exc0Var.a || exc0Var.c || exc0Var.b) && !gyo1.L(qxc0Var2.O0);
        }
    }

    public b82(zwr zwrVar) {
        this.b = zwrVar.e;
    }

    public b82(t7y0 t7y0Var) {
        this.b = t7y0Var.e;
    }

    public b82(zlx0 zlx0Var) {
        this.b = zlx0Var.c;
    }
}
