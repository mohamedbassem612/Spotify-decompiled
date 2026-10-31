package p;

import com.google.protobuf.Empty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p021 extends x7e0 {
    public final String d;
    public final byp0 e;
    public final rku f = new rku();
    public final bpb1 g;
    public final any h;

    public p021(String str, byp0 byp0Var) {
        this.d = str;
        this.e = byp0Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        this.h = new any(bpb1VarB, (byte) 18);
    }

    public final void e() {
        if (this.g.getValue() != null) {
            i();
        } else {
            j();
        }
    }

    public final void f() {
        this.f.a();
    }

    public final void k() {
        this.f.b(this.e.a.callSingle("spotify.offline_esperanto.proto.Offline", "LicenseStatus", Empty.n()).map(ta20.T0).map(va20.T0).map(p5x0.g).onErrorReturnItem(5).flatMapObservable(new zgz0(this, (byte) 7)).subscribe());
    }

    public final m6e0 l() {
        return f4p1.g(this);
    }
}
