package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wvb0 extends a8b0 {
    public final s1c1 b;
    public final Function0 c;
    public final toe0 d;

    public wvb0(s1c1 s1c1Var, Function0 function0) {
        this.b = s1c1Var;
        this.c = function0;
        this.d = new toe0((voe0) s1c1Var, function0);
    }

    @Override // p.a8b0
    public final zpi0 E() {
        return x0().E();
    }

    @Override // p.a8b0
    public final List r0() {
        return x0().r0();
    }

    @Override // p.a8b0
    public final e0h1 s0() {
        return x0().s0();
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return x0().t0();
    }

    public final String toString() {
        toe0 toe0Var = this.d;
        return (toe0Var.c == uoe0.a || toe0Var.c == uoe0.b) ? "<Not computed yet>" : x0().toString();
    }

    @Override // p.a8b0
    public final boolean u0() {
        return x0().u0();
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new wvb0(this.b, new jqb0(g8b0Var, this, (byte) 2));
    }

    @Override // p.a8b0
    public final gmh1 w0() {
        a8b0 a8b0VarX0 = x0();
        while (a8b0VarX0 instanceof wvb0) {
            a8b0VarX0 = ((wvb0) a8b0VarX0).x0();
        }
        return (gmh1) a8b0VarX0;
    }

    public final a8b0 x0() {
        return (a8b0) this.d.invoke();
    }
}
