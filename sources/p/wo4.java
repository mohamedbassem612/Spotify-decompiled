package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wo4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new zn4(this, (byte) 15));

    public wo4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        wo4 wo4Var = (wo4) this.e.getValue();
        return wo4Var != null ? wo4Var.a() : this.a;
    }

    public final boolean b() {
        wo4 wo4Var = (wo4) this.e.getValue();
        return wo4Var != null ? wo4Var.b() : this.b;
    }

    public final boolean c() {
        wo4 wo4Var = (wo4) this.e.getValue();
        return wo4Var != null ? wo4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("use_page_api_context_menu", "android-list-platform-contextmenuimpl", a()), new fpb("use_suspend_header_provider", "android-list-platform-contextmenuimpl", b()), new fpb("use_suspend_item_provider", "android-list-platform-contextmenuimpl", c()));
    }
}
