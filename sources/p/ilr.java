package p;

import com.spotify.libs.connect.events.proto.CastTransferSteps;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ilr {
    public final t2j0 a;
    public final ynb0 b;
    public String c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public final idd1 f = new idd1(new z5o(this, (byte) 29));

    public ilr(t2j0 t2j0Var, ynb0 ynb0Var) {
        this.a = t2j0Var;
        this.b = ynb0Var;
    }

    public final synchronized void a() {
        this.c = null;
        this.d = false;
        this.e.clear();
    }

    public final synchronized void b(m4e m4eVar) {
        try {
            if (this.d) {
                c(m4eVar);
            } else {
                this.e.add(m4eVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(m4e m4eVar) {
        n4e n4eVarN = CastTransferSteps.n();
        n4eVarN.r(m4eVar.a());
        String str = this.c;
        if (str != null) {
            n4eVarN.q(str);
        }
        idd1 idd1Var = this.f;
        Long l = (Long) idd1Var.getValue();
        if (l != null) {
            n4eVarN.n(l.longValue());
        }
        this.a.a(n4eVarN.build());
        m4eVar.toString();
    }
}
