package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xkr0 implements qt1 {
    public final vwm1 a;
    public final ho1 b;
    public final mt1 c;
    public long d;
    public boolean e;
    public final bpb1 f = gio1.b(0L);
    public final bpb1 g = gio1.b(0L);

    public xkr0(vwm1 vwm1Var, ho1 ho1Var, mt1 mt1Var) {
        this.a = vwm1Var;
        this.b = ho1Var;
        this.c = mt1Var;
    }

    @Override // p.qt1
    public final mr20 a(hy1 hy1Var, x010 x010Var) {
        xkr0 xkr0Var;
        jge e6sVar;
        YourLibraryRequest yourLibraryRequestC = hy1Var.c();
        boolean z = yourLibraryRequestC.n().p().length() == 0;
        vwm1 vwm1Var = this.a;
        if (z) {
            long j = this.d + 1;
            this.d = j;
            bpb1 bpb1VarB = gio1.b(Integer.valueOf(this.e ? Integer.MAX_VALUE : 6));
            xkr0Var = this;
            e6sVar = hu20.e(bpb1VarB, new rkr0(null, yourLibraryRequestC, xkr0Var, j, bpb1VarB));
        } else {
            xkr0Var = this;
            e6sVar = new e6s(vwm1Var.d(yourLibraryRequestC), (byte) 6);
        }
        return new any(h5p1.s(x010Var, e6sVar, new e6s(vwm1Var.d(hy1Var.a()), (byte) 5), new kw0(xkr0Var, z, (lnm) null)), (byte) 18);
    }

    @Override // p.qt1
    public final void b(long j) {
        if (j == 0 || j != this.d) {
            return;
        }
        this.e = true;
        this.g.m((Object) null, Long.valueOf(j));
    }
}
