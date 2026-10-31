package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wet implements wpw {
    public static final Set e = l1d.u(pnt.class);
    public final zob1 a;
    public final ljm0 b = h7w.C(ket.N0, new k9s(this, (byte) 6));
    public final ia00 c = n3o1.q(this).a(v0t.P0, v0t.Q0);
    public final nsw d;

    public wet(a4v0 a4v0Var, zob1 zob1Var, boolean z) {
        this.a = zob1Var;
        this.d = z ? jch0.j(new aft(a4v0Var, (byte) 0)) : jch0.j(new aft(a4v0Var, (byte) 1));
    }

    public final rqw a() {
        return this.c;
    }

    public final rsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
