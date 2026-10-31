package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/cv91;", "Lp/uim0;", "Lp/ev91;", "src_main_java_com_spotify_byom_presentationimpl-presentationimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class cv91 extends uim0 {
    public final f8n a;
    public final iu30 b;
    public final g8n c;
    public final n8b1 d;

    public cv91(f8n f8nVar, iu30 iu30Var, g8n g8nVar, n8b1 n8b1Var) {
        this.a = f8nVar;
        this.b = iu30Var;
        this.c = g8nVar;
        this.d = n8b1Var;
    }

    public final pim0 a() {
        return new ev91(this.a, this.b, this.c, this.d);
    }

    public final void b(pim0 pim0Var) {
        ev91 ev91Var = (ev91) pim0Var;
        g8n g8nVar = ev91Var.S0;
        g8n g8nVar2 = this.c;
        boolean z = g8nVar != g8nVar2;
        f8n f8nVar = ev91Var.Q0;
        f8n f8nVar2 = this.a;
        boolean z2 = f8nVar != f8nVar2;
        ev91Var.Q0 = f8nVar2;
        ev91Var.R0 = this.b;
        ev91Var.S0 = g8nVar2;
        ev91Var.T0 = this.d;
        if (!((pim0) ev91Var).N0 || ev91Var.V0) {
            return;
        }
        if (z || z2) {
            ev91Var.K1(false);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cv91) {
            cv91 cv91Var = (cv91) obj;
            if (this.a == cv91Var.a && this.b.equals(cv91Var.b) && this.c == cv91Var.c && this.d.equals(cv91Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
