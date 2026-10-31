package p;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class akx0 extends qba {
    public final boolean N0;
    public final ie30 O0;
    public boolean P0 = true;
    public long Q0 = -9223372036854775807L;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public yeg1 U0;
    public yoh0 V0;
    public pwu W0;
    public final f9v X;
    public final ij81 Y;
    public final int Z;
    public final k2r i;
    public final pjq0 t;

    public akx0(yoh0 yoh0Var, k2r k2rVar, pjq0 pjq0Var, f9v f9vVar, ij81 ij81Var, int i, boolean z, ie30 ie30Var) {
        this.V0 = yoh0Var;
        this.i = k2rVar;
        this.t = pjq0Var;
        this.X = f9vVar;
        this.Y = ij81Var;
        this.Z = i;
        this.N0 = z;
        this.O0 = ie30Var;
    }

    public final void A() {
        long j = this.Q0;
        boolean z = this.R0;
        boolean z2 = this.S0;
        yoh0 yoh0VarM = m();
        sqe1 c091Var = new c091(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, yoh0VarM, z2 ? yoh0VarM.c : null);
        if (this.P0) {
            c091Var = new yjx0(c091Var);
        }
        s(c091Var);
    }

    public final void B(long j, fn51 fn51Var, boolean z) {
        if (this.T0 && fn51Var.a()) {
            return;
        }
        this.T0 = !fn51Var.a();
        if (j == -9223372036854775807L) {
            j = this.Q0;
        }
        boolean zD = fn51Var.d();
        if (!this.P0 && this.Q0 == j && this.R0 == zD && this.S0 == z) {
            return;
        }
        this.Q0 = j;
        this.R0 = zD;
        this.S0 = z;
        this.P0 = false;
        A();
        pwu pwuVar = this.W0;
        if (pwuVar != null) {
            pwuVar.i = fn51Var;
        }
    }

    @Override // p.qba
    public final boolean c(yoh0 yoh0Var) {
        soh0 soh0Var = m().b;
        soh0Var.getClass();
        soh0 soh0Var2 = yoh0Var.b;
        return soh0Var2 != null && soh0Var2.a.equals(soh0Var.a) && soh0Var2.h == soh0Var.h && Objects.equals(soh0Var2.f, soh0Var.f);
    }

    @Override // p.qba
    public final arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        o2r o2rVarJ = this.i.j();
        yeg1 yeg1Var = this.U0;
        if (yeg1Var != null) {
            o2rVarJ.a(yeg1Var);
        }
        soh0 soh0Var = m().b;
        soh0Var.getClass();
        Uri uri = soh0Var.a;
        this.g.getClass();
        return new xjx0(uri, o2rVarJ, new cab((hc10) this.t.b, (byte) 10), this.X, new b9v(this.d.c, 0, p2i0Var), this.Y, e(p2i0Var), this, hw3Var, soh0Var.f, this.Z, this.N0, this.O0, zoi1.W(soh0Var.h), null);
    }

    @Override // p.qba
    public final synchronized yoh0 m() {
        return this.V0;
    }

    @Override // p.qba
    public final void r(yeg1 yeg1Var) {
        this.U0 = yeg1Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        f9v f9vVar = this.X;
        f9vVar.h(looperMyLooper, dbu0Var);
        f9vVar.e();
        A();
    }

    @Override // p.qba
    public final void t(arh0 arh0Var) {
        xjx0 xjx0Var = (xjx0) arh0Var;
        if (xjx0Var.Z0) {
            for (n541 n541Var : xjx0Var.W0) {
                n541Var.j();
                y8v y8vVar = n541Var.h;
                if (y8vVar != null) {
                    y8vVar.c(n541Var.e);
                    n541Var.h = null;
                    n541Var.g = null;
                }
            }
        }
        xjx0Var.N0.x(xjx0Var);
        xjx0Var.S0.removeCallbacksAndMessages(null);
        xjx0Var.T0 = null;
        xjx0Var.u1 = true;
    }

    @Override // p.qba
    public final void w() {
        this.X.release();
    }

    @Override // p.qba
    public final synchronized void z(yoh0 yoh0Var) {
        this.V0 = yoh0Var;
    }
}
