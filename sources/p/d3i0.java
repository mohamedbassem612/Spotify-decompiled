package p;

import android.os.Trace;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d3i0 implements w2i0, c9v {
    public final f3i0 a;
    public final /* synthetic */ g3i0 b;

    public d3i0(g3i0 g3i0Var, f3i0 f3i0Var) {
        this.b = g3i0Var;
        this.a = f3i0Var;
    }

    public final void D(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new z2i0(this, pairA, qqh0Var, (byte) 0));
        }
    }

    public final void E(int i, p2i0 p2i0Var, final d2e0 d2e0Var, final qqh0 qqh0Var, final int i2) {
        final Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new Runnable() { // from class: p.c3i0
                @Override // java.lang.Runnable
                public final void run() {
                    pfr pfrVar = this.a.b.i;
                    Pair pair = pairA;
                    pfrVar.E(((Integer) pair.first).intValue(), (p2i0) pair.second, d2e0Var, qqh0Var, i2);
                }
            });
        }
    }

    public final void F(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new z2i0(this, pairA, qqh0Var, (byte) 1));
        }
    }

    public final void N(int i, p2i0 p2i0Var, twa twaVar) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new vqh0((Object) this, (Object) pairA, (Object) twaVar, (byte) 6));
        }
    }

    public final void U(int i, p2i0 p2i0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new a3i0(this, pairA, (byte) 1));
        }
    }

    public final void V(int i, p2i0 p2i0Var, int i2) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new pvt((Object) this, (Object) pairA, i2, (byte) 2));
        }
    }

    public final Pair a(int i, p2i0 p2i0Var) {
        p2i0 p2i0VarA;
        f3i0 f3i0Var = this.a;
        p2i0 p2i0Var2 = null;
        if (p2i0Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= f3i0Var.c.size()) {
                    p2i0VarA = null;
                    break;
                }
                if (((p2i0) f3i0Var.c.get(i2)).d == p2i0Var.d) {
                    Object obj = p2i0Var.a;
                    Object obj2 = f3i0Var.b;
                    int i3 = uwu0.n;
                    p2i0VarA = p2i0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (p2i0VarA == null) {
                return null;
            }
            p2i0Var2 = p2i0VarA;
        }
        return Pair.create(Integer.valueOf(i + f3i0Var.d), p2i0Var2);
    }

    public final void d(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new b3i0(this, pairA, d2e0Var, qqh0Var, (byte) 1));
        }
    }

    public final void h(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new b3i0(this, pairA, d2e0Var, qqh0Var, (byte) 0));
        }
    }

    public final void q(int i, p2i0 p2i0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new a3i0(this, pairA, (byte) 2));
        }
    }

    public final void v(int i, p2i0 p2i0Var, final d2e0 d2e0Var, final qqh0 qqh0Var, final IOException iOException, final boolean z) {
        final Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            final byte b = 1;
            this.b.j.f(new Runnable() { // from class: p.efa
                @Override // java.lang.Runnable
                public final void run() {
                    ten0 ten0VarC;
                    byte b2 = b;
                    Object obj = iOException;
                    Object obj2 = qqh0Var;
                    Object obj3 = d2e0Var;
                    Object obj4 = pairA;
                    Object obj5 = this;
                    switch (b2) {
                        case 0:
                            lee1 lee1Var = (lee1) obj5;
                            flb0 flb0Var = (flb0) obj4;
                            String str = (String) obj3;
                            wat watVar = (wat) obj2;
                            f930 f930Var = (f930) obj;
                            boolean z2 = z;
                            Trace.beginSection("BackgroundTextMeasurement");
                            try {
                                ten0 ten0VarH = pv91.h();
                                ten0 ten0Var = ten0VarH instanceof ten0 ? ten0VarH : null;
                                if (ten0Var == null || (ten0VarC = ten0Var.C((iu30) null, (iu30) null)) == null) {
                                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                }
                                try {
                                    jv91 jv91VarJ = ten0VarC.j();
                                    try {
                                        lee1 lee1VarF = z6p1.F(lee1Var, flb0Var);
                                        z6x z6xVar = z6x.a;
                                        rw4 rw4Var = new rw4(str, lee1VarF, z6xVar, z6xVar, f930Var, watVar, z2);
                                        rw4Var.d();
                                        rw4Var.e();
                                        jv91.q(jv91VarJ);
                                        ten0VarC.w().q();
                                        ten0VarC.c();
                                        Trace.endSection();
                                        return;
                                    } catch (Throwable th) {
                                        jv91.q(jv91VarJ);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ten0VarC.c();
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                Trace.endSection();
                                throw th4;
                            }
                        default:
                            Pair pair = (Pair) obj4;
                            ((d3i0) obj5).b.i.v(((Integer) pair.first).intValue(), (p2i0) pair.second, (d2e0) obj3, (qqh0) obj2, (IOException) obj, z);
                            return;
                    }
                }
            });
        }
    }

    public final void y(int i, p2i0 p2i0Var, Exception exc) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new vqh0((Object) this, (Object) pairA, (Object) exc, (byte) 7));
        }
    }

    public final void z(int i, p2i0 p2i0Var) {
        Pair pairA = a(i, p2i0Var);
        if (pairA != null) {
            this.b.j.f(new a3i0(this, pairA, (byte) 0));
        }
    }
}
