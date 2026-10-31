package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q6e1 implements ct41 {
    public final /* synthetic */ ct41 a;
    public final mdt b;
    public final mdt c;

    public q6e1(ct41 ct41Var, final r6e1 r6e1Var) {
        this.a = ct41Var;
        final byte b = 0;
        this.b = yv91.a(new Function0() { // from class: p.p6e1
            public final Object invoke() {
                byte b2 = b;
                r6e1 r6e1Var2 = r6e1Var;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(r6e1Var2.a.s() < r6e1Var2.b.s());
                    default:
                        return Boolean.valueOf(r6e1Var2.a.s() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = yv91.a(new Function0() { // from class: p.p6e1
            public final Object invoke() {
                byte b3 = b2;
                r6e1 r6e1Var2 = r6e1Var;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(r6e1Var2.a.s() < r6e1Var2.b.s());
                    default:
                        return Boolean.valueOf(r6e1Var2.a.s() > 0.0f);
                }
            }
        });
    }

    public final Object a(hfn0 hfn0Var, vu30 vu30Var, lnm lnmVar) {
        return this.a.a(hfn0Var, vu30Var, lnmVar);
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final float e(float f) {
        return this.a.e(f);
    }
}
