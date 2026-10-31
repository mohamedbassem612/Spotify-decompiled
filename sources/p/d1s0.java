package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d1s0 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new gyq0(this, (byte) 23));

    public d1s0(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        d1s0 d1s0Var = (d1s0) this.d.getValue();
        return d1s0Var != null ? d1s0Var.a() : this.a;
    }

    public final boolean b() {
        d1s0 d1s0Var = (d1s0) this.d.getValue();
        return d1s0Var != null ? d1s0Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("account_link_using_auth_code", "partner-account-linking", a()), new fpb("samsung_linking_use_cmp", "partner-account-linking", b()));
    }
}
