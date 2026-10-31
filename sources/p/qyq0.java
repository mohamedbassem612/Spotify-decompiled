package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qyq0 implements x310 {
    public static final List b = p7h.M("1.1.1", "1.2.0", "1.2.1");
    public final ynb0 a;

    public qyq0(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    @Override // p.x310
    public final boolean a(r9c r9cVar) {
        m210 m210VarB = r9cVar.b();
        boolean z = "partner_ui".equals(m210VarB != null ? m210VarB.a : null) && b.contains(m210VarB.i);
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(r9cVar.e()).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) && z;
    }

    @Override // p.x310
    public final w310 b(r9c r9cVar) {
        return (w310) this.a.get();
    }
}
