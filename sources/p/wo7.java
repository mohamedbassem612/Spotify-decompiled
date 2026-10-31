package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wo7 implements zqw {
    public final lik1 a;
    public final d0r b;
    public final yzc0 c;
    public final String d;
    public final ajq0 e;
    public final uxy0 f;
    public final f4x0 g;
    public final hdn1 h;
    public final nm1 i;
    public final tu11 j;
    public final me30 k;
    public final i5y0 l;
    public final n381 m;
    public final vo7 n;
    public final o3r o;

    public wo7(lik1 lik1Var, d0r d0rVar, yzc0 yzc0Var, String str, ajq0 ajq0Var, uxy0 uxy0Var, f4x0 f4x0Var, hdn1 hdn1Var, nm1 nm1Var, tu11 tu11Var, me30 me30Var, i5y0 i5y0Var) {
        this.a = lik1Var;
        this.b = d0rVar;
        this.c = yzc0Var;
        this.d = str;
        this.e = ajq0Var;
        this.f = uxy0Var;
        this.g = f4x0Var;
        this.h = hdn1Var;
        this.i = nm1Var;
        this.j = tu11Var;
        this.k = me30Var;
        this.l = i5y0Var;
        tsm1 tsm1Var = new tsm1(this, (byte) 27);
        n381 n381Var = p381.a;
        this.m = new n381(tsm1Var);
        this.n = new vo7(this, (byte) 1);
        this.o = w3p1.o(new l4r(pwc0.b, 2, ge7.Q0, new j4r(ge7.O0), ge7.R0), ge7.P0);
    }

    @Override // p.zqw
    public final m381 c() {
        return this.m;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        l7e0 l7e0Var = hwqVar.g;
        j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
        if (j7e0Var == null) {
            return false;
        }
        String str = j7e0Var.b;
        Set set = s4b1.f;
        return uic.x(str).c == blc0.fh;
    }

    @Override // p.zqw
    public final Function0 e() {
        return this.n;
    }
}
