package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w34 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public w34(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new g82(this, (byte) 20));
    }

    public final boolean a() {
        w34 w34Var = (w34) this.d.getValue();
        return w34Var != null ? w34Var.a() : this.a;
    }

    public final boolean b() {
        w34 w34Var = (w34) this.d.getValue();
        return w34Var != null ? w34Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("is_add_account_page_enabled", "android-accountswitching-addaccountpage", a()), new fpb("is_free_managed_accounts_enabled", "android-accountswitching-addaccountpage", b())});
    }

    public w34(luk lukVar) {
        this(false, false, lukVar);
    }
}
