package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class u4b1 extends h6s {
    public final bjh0 t;
    public final a9a u;
    public boolean v;
    public boolean w;
    public int x;

    public u4b1(bjh0 bjh0Var) {
        int i = bjh0Var.g;
        int i2 = bjh0Var.d;
        a9a a9aVar = new a9a((byte) 1);
        boolean z = bjh0Var.q;
        int i3 = z ? i2 : i;
        int i4 = z ? i2 : i;
        int i5 = z ? i2 : i;
        int i6 = z ? i2 : i;
        int i7 = bjh0Var.r;
        int i8 = bjh0Var.u;
        super(a9aVar, i3, i4, i5, i6, i7, i7, i8, i8, bjh0Var.h);
        this.t = bjh0Var;
        this.u = a9aVar;
        this.w = true;
        this.x = 13107200;
    }

    public void d(dbu0 dbu0Var) {
        super.d(dbu0Var);
        this.x = 13107200;
        this.v = false;
    }

    public void e(dbu0 dbu0Var) {
        super.e(dbu0Var);
        this.x = 13107200;
        this.v = false;
    }

    public void f(dbu0 dbu0Var) {
        h(dbu0Var);
        this.x = 13107200;
        this.v = false;
    }

    public void g(x1e0 x1e0Var, qnf1 qnf1Var, qp00[] qp00VarArr) {
        pnf1 pnf1VarN;
        if (this.t.m) {
            this.x = b(x1e0Var, qp00VarArr);
            boolean z = false;
            for (qp00 qp00Var : qp00VarArr) {
                if (qp00Var != null && (pnf1VarN = qp00Var.n()) != null && pnf1VarN.c == 2) {
                    z = true;
                    break;
                }
            }
            this.w = z;
        }
        super.g(x1e0Var, qnf1Var, qp00VarArr);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    public boolean i(x1e0 x1e0Var) {
        int i;
        long jW;
        long jW2;
        long j = x1e0Var.e;
        long j2 = x1e0Var.d;
        float f = x1e0Var.f;
        a9a a9aVar = this.u;
        synchronized (a9aVar) {
            i = a9aVar.c * 65536;
        }
        boolean z = true;
        boolean z2 = i >= this.x;
        bjh0 bjh0Var = this.t;
        if ((bjh0Var.a instanceof sn10) && bjh0Var.k && j2 > zoi1.W(bjh0Var.l)) {
            bjh0Var.q = false;
        }
        boolean z3 = this.w;
        bjh0 bjh0Var2 = this.t;
        boolean z4 = bjh0Var2.q;
        if (z3) {
            jW = zoi1.W(z4 ? bjh0Var2.d : bjh0Var2.g);
        } else {
            jW = zoi1.W(z4 ? bjh0Var2.c : 420000);
        }
        boolean z5 = this.w;
        bjh0 bjh0Var3 = this.t;
        boolean z6 = bjh0Var3.q;
        if (z5) {
            jW2 = zoi1.W(z6 ? bjh0Var3.d : bjh0Var3.g);
        } else {
            jW2 = zoi1.W(z6 ? bjh0Var3.c : 900000);
        }
        bjh0 bjh0Var4 = this.t;
        if (bjh0Var4.s && j2 < zoi1.W(bjh0Var4.f)) {
            jW = zoi1.W(this.t.e);
            jW2 = jW;
        }
        if (f > 1.0f) {
            jW = (long) Math.min(zoi1.H(f, jW), jW2);
        }
        if (j < Math.max(jW, 500000L)) {
            if (z2) {
                z = false;
            }
        } else if (j >= jW2 || z2) {
            z = false;
        } else {
            z = this.v;
        }
        this.v = z;
        if (!z && j < 500000) {
            Logger.k("Target buffer size reached with less than 500ms of buffered media data.", new Object[0]);
        }
        return this.v;
    }
}
