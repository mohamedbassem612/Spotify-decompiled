package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y7b implements xpw {
    public final h8l0 a;
    public final n8l0 b;
    public final iu30 c;
    public final rey0 d = new rey0(new gaa(this, (byte) 13));
    public final ia00 e;
    public final psw f;

    public y7b(h8l0 h8l0Var, n8l0 n8l0Var, sb40 sb40Var, iu30 iu30Var) {
        this.a = h8l0Var;
        this.b = n8l0Var;
        this.c = iu30Var;
        this.e = sb40Var.b.b() ? n3o1.q(this).a(new x7b(this, (byte) 1), new v08(this, (byte) 4)) : n3o1.q(this).a(new x7b(this, (byte) 0), new v08(this, (byte) 3));
        j2i j2iVar = new j2i(883637530, new qsj(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String e(i7g0 i7g0Var, x340 x340Var) throws NoWhenBranchMatchedException {
        int iOrdinal = i7g0Var.ordinal();
        if (iOrdinal == 0) {
            x340Var.i0(2108305565);
            x340Var.r(false);
            eg.m("NONE section doesn't exist in the UI");
            return null;
        }
        if (iOrdinal == 1) {
            return x0d.k(x340Var, 2108308942, 2131958069, x340Var, false);
        }
        if (iOrdinal == 2) {
            return x0d.k(x340Var, 2108312813, 2131958070, x340Var, false);
        }
        throw p3d1.k(x340Var, 2108303860, false);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
