package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class le4 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new wb4(this, (byte) 27));

    public le4(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        le4 le4Var = (le4) this.c.getValue();
        return le4Var != null ? le4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_signin_request", "android-engagesdk-engagesigninrequest", a()));
    }
}
