package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x860 {
    public final jjz a;
    public final kt91 b;
    public final dg30 c;
    public final vcd0 d;
    public final q8n e;
    public xab1 f;

    public x860(jjz jjzVar, kt91 kt91Var, dg30 dg30Var, vcd0 vcd0Var, q8n q8nVar) {
        this.a = jjzVar;
        this.b = kt91Var;
        this.c = dg30Var;
        this.d = vcd0Var;
        this.e = q8nVar;
    }

    public final jhm a(String str, String str2, d5i1 d5i1Var) {
        boolean z = d5i1Var == d5i1.b;
        return new jhm("hide_user_listening_activity", z ? nrx.c : znx.c, (fhm) null, Integer.valueOf(z ? 2131956557 : 2131956556), (String) null, false, (tm81) null, new ihm(chm.c, z ? new ghm(v160.a1, v160.b1) : new ghm(v160.c1, v160.d1), new gh1((byte) 14, this, str, str2, z)), 244);
    }

    public final void b(String str, String str2, tv80 tv80Var, boolean z) {
        u9c0 u9c0VarQ = cto1.q(this.c);
        String str3 = ihc1.y0(str2) ? str : str2;
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = fn31.T(u9c0VarQ, (o8n) null, 0, new fhl(this, z, str3, u9c0VarQ, str, str2, tv80Var, (lnm) null, (byte) 2), 3);
    }
}
