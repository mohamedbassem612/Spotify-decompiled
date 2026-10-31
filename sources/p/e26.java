package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e26 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new f85(this, (byte) 27));

    public e26(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        e26 e26Var = (e26) this.d.getValue();
        return e26Var != null ? e26Var.a() : this.a;
    }

    public final boolean b() {
        e26 e26Var = (e26) this.d.getValue();
        return e26Var != null ? e26Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("material_you_enabled", "apps-music-features-widget", a()), new fpb("promote_new_widget", "apps-music-features-widget", b()));
    }
}
