package p;

import android.os.Trace;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ni7 extends jmr0 implements ky11 {
    public static final ia4 W0 = new ia4((byte) 3);
    public iu30 O0;
    public ri7 R0;
    public hi7 S0;
    public final bpb1 T0;
    public final bpb1 U0;
    public final xe01 V0;
    public dt71 X;
    public c9n Z;
    public ColorFilter h;
    public boolean i;
    public faa0 t;
    public final hrr0 f = xto.t((Object) null);
    public float g = 1.0f;
    public long Y = 9205357640488583168L;
    public iu30 N0 = W0;
    public j6m P0 = mif1.Q0;
    public int Q0 = 1;

    public ni7(hi7 hi7Var) {
        this.S0 = hi7Var;
        this.T0 = gio1.b(hi7Var);
        bpb1 bpb1VarB = gio1.b(ii7.a);
        this.U0 = bpb1VarB;
        this.V0 = d5p1.h(bpb1VarB);
    }

    @Override // p.jmr0
    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    @Override // p.ky11
    public final void b() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (jmr0) this.f.getValue();
            ky11 ky11Var = obj instanceof ky11 ? (ky11) obj : null;
            if (ky11Var != null) {
                ky11Var.b();
            }
            hi7 hi7Var = this.S0;
            if (hi7Var != null) {
                c9n c9nVar = this.Z;
                if (c9nVar == null) {
                    u890.C("scope");
                    throw null;
                }
                xab1 xab1VarK = fap1.k(c9nVar, new vs0(this, hi7Var, (lnm) null, (byte) 7));
                faa0 faa0Var = this.t;
                if (faa0Var != null) {
                    ha71.o(faa0Var);
                }
                this.t = xab1VarK;
            }
            this.i = true;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p.jmr0
    public final boolean c(ColorFilter colorFilter) {
        this.h = colorFilter;
        return true;
    }

    @Override // p.ky11
    public final void f() {
        faa0 faa0Var = this.t;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.t = null;
        Object obj = (jmr0) this.f.getValue();
        ky11 ky11Var = obj instanceof ky11 ? (ky11) obj : null;
        if (ky11Var != null) {
            ky11Var.f();
        }
        this.i = false;
    }

    @Override // p.ky11
    public final void h() {
        faa0 faa0Var = this.t;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.t = null;
        Object obj = (jmr0) this.f.getValue();
        ky11 ky11Var = obj instanceof ky11 ? (ky11) obj : null;
        if (ky11Var != null) {
            ky11Var.h();
        }
        this.i = false;
    }

    @Override // p.jmr0
    public final long i() {
        jmr0 jmr0Var = (jmr0) this.f.getValue();
        if (jmr0Var != null) {
            return jmr0Var.i();
        }
        return 9205357640488583168L;
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) {
        long j = drawScope.j();
        if (!Size.c(this.Y, j)) {
            this.Y = j;
            dt71 dt71Var = this.X;
            if (dt71Var != null) {
                dt71Var.a(new Size(j));
            }
        }
        jmr0 jmr0Var = (jmr0) this.f.getValue();
        if (jmr0Var != null) {
            jmr0Var.e(drawScope, drawScope.j(), this.g, this.h);
        }
    }

    public final void k(hi7 hi7Var) {
        if (u890.j(this.S0, hi7Var)) {
            return;
        }
        this.S0 = hi7Var;
        if (hi7Var == null) {
            faa0 faa0Var = this.t;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            this.t = null;
        } else if (this.i && hi7Var != null) {
            c9n c9nVar = this.Z;
            if (c9nVar == null) {
                u890.C("scope");
                throw null;
            }
            xab1 xab1VarK = fap1.k(c9nVar, new vs0(this, hi7Var, (lnm) null, (byte) 7));
            faa0 faa0Var2 = this.t;
            if (faa0Var2 != null) {
                ha71.o(faa0Var2);
            }
            this.t = xab1VarK;
        }
        if (hi7Var != null) {
            this.T0.m((Object) null, hi7Var);
        }
    }

    public final zy70 l(zy70 zy70Var, boolean z) {
        z291 z291Var = zy70Var.f156p;
        xy70 xy70Var = zy70Var.t;
        if (z291Var instanceof of01) {
            of01 of01Var = (of01) z291Var;
            dt71 dt71VarE = this.X;
            if (dt71VarE == null) {
                dt71VarE = mgo1.e(1, 0, 2, 2);
                long j = this.Y;
                if (j != 9205357640488583168L) {
                    dt71VarE.a(new Size(j));
                }
                this.X = dt71VarE;
            }
            of01Var.a.a(dt71VarE);
        }
        vy70 vy70VarA = zy70.a(zy70Var);
        vy70VarA.d = new em3(zy70Var, this, (byte) 22);
        if (xy70Var.g == null) {
            vy70VarA.n = z291.l0;
        }
        if (xy70Var.h == null) {
            j6m j6mVar = this.P0;
            int i = xpi1.b;
            vy70VarA.o = (u890.j(j6mVar, mif1.Q0) || u890.j(j6mVar, mif1.T0)) ? dg41.b : dg41.a;
        }
        if (xy70Var.i == 0) {
            vy70VarA.f129p = 2;
        }
        if (z) {
            o6x o6xVar = o6x.a;
            vy70VarA.h = o6xVar;
            vy70VarA.i = o6xVar;
            vy70VarA.j = o6xVar;
        }
        return vy70VarA.a();
    }

    public final void m(mi7 mi7Var) {
        bpb1 bpb1Var = this.U0;
        mi7 mi7Var2 = (mi7) bpb1Var.getValue();
        mi7 mi7Var3 = (mi7) this.N0.invoke(mi7Var);
        bpb1Var.l(mi7Var3);
        jmr0 jmr0VarV = vbe.v(mi7Var2, mi7Var3, this.P0);
        if (jmr0VarV == null) {
            jmr0VarV = mi7Var3.a();
        }
        this.f.setValue(jmr0VarV);
        if (mi7Var2.a() != mi7Var3.a()) {
            Object objA = mi7Var2.a();
            ky11 ky11Var = objA instanceof ky11 ? (ky11) objA : null;
            if (ky11Var != null) {
                ky11Var.h();
            }
            Object objA2 = mi7Var3.a();
            ky11 ky11Var2 = objA2 instanceof ky11 ? (ky11) objA2 : null;
            if (ky11Var2 != null) {
                ky11Var2.b();
            }
        }
        iu30 iu30Var = this.O0;
        if (iu30Var != null) {
            iu30Var.invoke(mi7Var3);
        }
    }
}
