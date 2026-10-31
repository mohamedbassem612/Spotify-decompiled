package p;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r8l {
    public final Set a;
    public final HashMap b = new HashMap(5);

    public r8l(t380 t380Var) {
        this.a = t380Var;
    }

    public final m210 a(String str) {
        if (str == null) {
            pbq pbqVar = new pbq((String) null);
            pbqVar.u0("app_to_app");
            pbqVar.s0("media_session");
            pbqVar.t0(str);
            return pbqVar.v();
        }
        m210 m210Var = (m210) this.b.get(str);
        if (m210Var != null) {
            return m210Var;
        }
        for (uxh0 uxh0Var : this.a) {
            if (uxh0Var.b(str)) {
                return uxh0Var.a(str);
            }
        }
        pbq pbqVar2 = new pbq((String) null);
        pbqVar2.u0("app_to_app");
        pbqVar2.s0("media_session");
        pbqVar2.t0(str);
        return pbqVar2.v();
    }
}
