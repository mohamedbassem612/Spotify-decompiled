package p;

import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class i170 implements fka1 {
    public final l370 a;
    public final jf30 b;
    public boolean c;
    public final /* synthetic */ n170 d;

    public i170(n170 n170Var, l370 l370Var) {
        this.d = n170Var;
        this.a = l370Var;
        this.b = new jf30(((ff01) n170Var.c.c).a.l());
    }

    @Override // p.fka1
    public long O0(nac nacVar, long j) throws IOException {
        n170 n170Var = this.d;
        try {
            return ((ff01) n170Var.c.c).O0(nacVar, j);
        } catch (IOException e) {
            n170Var.b.b();
            a(n170.f);
            throw e;
        }
    }

    public final void a(v360 v360Var) {
        azp0 azp0Var;
        mif1 mif1Var;
        n170 n170Var = this.d;
        byte b = n170Var.d;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            bhn0.r(n170Var.d, "state: ");
            return;
        }
        jf30 jf30Var = this.b;
        gve1 gve1Var = jf30Var.e;
        jf30Var.e = gve1.d;
        gve1Var.a();
        gve1Var.b();
        n170Var.d = (byte) 6;
        if (v360Var.size() <= 0 || (azp0Var = n170Var.a) == null || (mif1Var = azp0Var.j) == null) {
            return;
        }
        int i = y270.a;
        if (mif1Var == mif1.W0) {
            return;
        }
        Pattern pattern = v2n.k;
        ejo1.s(this.a, v360Var).isEmpty();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.b;
    }
}
