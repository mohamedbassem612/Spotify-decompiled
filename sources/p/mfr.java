package p;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mfr implements e9d0, plh0, b2i0, e2i0, akl {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mfr(Object obj, int i, long j) {
        this.c = obj;
        this.a = i;
        this.b = j;
    }

    public void accept(Object obj) {
        frc1 frc1Var = (frc1) this.c;
        bfo bfoVar = (bfo) obj;
        frc1Var.h.getClass();
        byte[] bArrW = nhc.w(bfoVar.a, bfoVar.c);
        izr0 izr0Var = frc1Var.c;
        izr0Var.P(bArrW, bArrW.length);
        frc1Var.a.f(bArrW.length, izr0Var);
        long j = bfoVar.b;
        ie30 ie30Var = frc1Var.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            dm5.y(ie30Var.u == Long.MAX_VALUE);
        } else {
            long j3 = ie30Var.u;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        frc1Var.a.b(j2, this.a | 1, bArrW.length, 0, null);
    }

    public void b(ffu0 ffu0Var, ixh0 ixh0Var) {
        h2i0 h2i0Var = (h2i0) this.c;
        ffu0Var.m0(h2i0Var.b1(ixh0Var, ffu0Var, this.a), this.b);
    }

    public void f(kh70 kh70Var, int i) {
        rlh0 rlh0Var = (rlh0) this.c;
        kh70Var.P(rlh0Var.c, i, this.a, this.b);
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        int iQ0;
        long jV;
        try {
            b380 b380VarA = occ.a((IBinder) this.c);
            v280 v280VarM = b380.m();
            for (int i2 = 0; i2 < b380VarA.size(); i2++) {
                Bundle bundle = (Bundle) b380VarA.get(i2);
                bundle.getClass();
                v280VarM.c(yoh0.b(ixh0Var.c, bundle));
            }
            bg11 bg11VarG = v280VarM.g();
            int i3 = this.a;
            if (i3 == -1) {
                fzh0Var.C();
                iQ0 = fzh0Var.t.Q0();
            } else {
                iQ0 = i3;
            }
            if (i3 == -1) {
                fzh0Var.C();
                jV = fzh0Var.t.v();
            } else {
                jV = this.b;
            }
            return fzh0Var.x(ixh0Var, bg11VarG, iQ0, jV);
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for MediaItem", e);
            return new c280(e);
        }
    }

    public void invoke(Object obj) {
        ((uz3) obj).o((tz3) this.c, this.a, this.b);
    }

    public /* synthetic */ mfr(tz3 tz3Var, int i, long j, long j2) {
        this.c = tz3Var;
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ mfr(frc1 frc1Var, long j, int i) {
        this.c = frc1Var;
        this.b = j;
        this.a = i;
    }
}
