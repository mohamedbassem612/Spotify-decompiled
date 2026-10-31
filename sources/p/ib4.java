package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ib4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public ib4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new u74(this, (byte) 23));
    }

    public final boolean a() {
        ib4 ib4Var = (ib4) this.d.getValue();
        return ib4Var != null ? ib4Var.a() : this.a;
    }

    public final boolean b() {
        ib4 ib4Var = (ib4) this.d.getValue();
        return ib4Var != null ? ib4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("forbidden_certificates_check", "android-connectivity", a()), new fpb("shared_ssl_socket_factory", "android-connectivity", b())});
    }

    public ib4(luk lukVar) {
        this(true, false, lukVar);
    }
}
