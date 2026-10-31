package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vy71 {
    public final boolean a;
    public final iu30 b;
    public final boolean c;
    public fe5 d;
    public final s24 e;
    public ni20 f;
    public ni20 g;

    public vy71(boolean z, Function0 function0, Function0 function1, xy71 xy71Var, iu30 iu30Var, boolean z2) {
        this.a = z;
        this.b = iu30Var;
        this.c = z2;
        if (z && xy71Var == xy71.c) {
            hhg1.n("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && xy71Var == xy71.a) {
            hhg1.n("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.d = ly71.a;
        this.e = new s24(xy71Var, new ki5(function0, (byte) 8), function1, new ww21(this, (byte) 10), iu30Var);
        this.f = irn1.j0();
        this.g = irn1.j0();
    }

    public static Object a(vy71 vy71Var, xy71 xy71Var, ni20 ni20Var, lnm lnmVar) {
        Object objQ = vy71Var.e.q(xy71Var, hfn0.a, new uy71(vy71Var, ((drr0) vy71Var.e.Z).s(), ni20Var, null), lnmVar);
        return objQ == d9n.a ? objQ : rih1.a;
    }

    public final Object b(a8d1 a8d1Var) {
        Object objA;
        iu30 iu30Var = this.b;
        xy71 xy71Var = xy71.b;
        return (((Boolean) iu30Var.invoke(xy71Var)).booleanValue() && (objA = a(this, xy71Var, this.f, a8d1Var)) == d9n.a) ? objA : rih1.a;
    }

    public final s24 c() {
        return this.e;
    }

    public final xy71 d() {
        return (xy71) ((hrr0) this.e.h).getValue();
    }

    public final boolean e() {
        zmg0 zmg0VarI = this.e.I();
        return zmg0VarI.a.containsKey(xy71.b);
    }

    public final boolean f() {
        zmg0 zmg0VarI = this.e.I();
        return zmg0VarI.a.containsKey(xy71.c);
    }

    public final float g() {
        return ((drr0) this.e.Y).s();
    }

    public final Object h(lnm lnmVar) {
        Object objA;
        if (this.c) {
            eg.m("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        iu30 iu30Var = this.b;
        xy71 xy71Var = xy71.a;
        return (((Boolean) iu30Var.invoke(xy71Var)).booleanValue() && (objA = a(this, xy71Var, this.g, lnmVar)) == d9n.a) ? objA : rih1.a;
    }

    public final boolean i() {
        return ((hrr0) this.e.h).getValue() != xy71.a;
    }

    public final Object j(a8d1 a8d1Var) {
        Object objA;
        if (this.a) {
            eg.m("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        iu30 iu30Var = this.b;
        xy71 xy71Var = xy71.c;
        return (((Boolean) iu30Var.invoke(xy71Var)).booleanValue() && (objA = a(this, xy71Var, this.g, a8d1Var)) == d9n.a) ? objA : rih1.a;
    }

    public final Object k(a8d1 a8d1Var) {
        Object objA;
        xy71 xy71Var = f() ? xy71.c : xy71.b;
        return (((Boolean) this.b.invoke(xy71Var)).booleanValue() && (objA = a(this, xy71Var, this.f, a8d1Var)) == d9n.a) ? objA : rih1.a;
    }

    public /* synthetic */ vy71(boolean z, Function0 function0, Function0 function1, xy71 xy71Var, iu30 iu30Var, int i) {
        this(z, function0, function1, xy71Var, (i & 16) != 0 ? new z9((byte) 28) : iu30Var, false);
    }
}
