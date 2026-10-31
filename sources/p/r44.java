package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r44 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new m44(this, (byte) 4));

    public r44(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        r44 r44Var = (r44) this.d.getValue();
        return r44Var != null ? r44Var.a() : this.a;
    }

    public final boolean b() {
        r44 r44Var = (r44) this.d.getValue();
        return r44Var != null ? r44Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_handler", "android-aipartner-naturallanguageurihandler", a()), new fpb("enable_interceptor", "android-aipartner-naturallanguageurihandler", b()));
    }
}
