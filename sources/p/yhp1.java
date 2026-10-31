package p;

import com.google.android.gms.internal.cast.zzaac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yhp1 implements Cloneable {
    public final cip1 a;
    public cip1 b;

    public yhp1(cip1 cip1Var) {
        this.a = cip1Var;
        if (cip1Var.k()) {
            hhg1.n("Default instance must be immutable.");
            throw null;
        }
        this.b = (cip1) cip1Var.j(4, null);
    }

    public final void a() {
        if (this.b.k()) {
            return;
        }
        cip1 cip1Var = (cip1) this.a.j(4, null);
        qjp1.c.a(cip1Var.getClass()).a(cip1Var, this.b);
        this.b = cip1Var;
    }

    public final cip1 b() {
        boolean zK = this.b.k();
        cip1 cip1Var = this.b;
        if (zK) {
            cip1Var.getClass();
            qjp1.c.a(cip1Var.getClass()).f(cip1Var);
            cip1Var.l();
            cip1Var = this.b;
        }
        cip1Var.getClass();
        boolean z = true;
        byte bByteValue = ((Byte) cip1Var.j(1, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zE = qjp1.c.a(cip1Var.getClass()).e(cip1Var);
                cip1Var.j(2, true == zE ? cip1Var : null);
                z = zE;
            }
        }
        if (z) {
            return cip1Var;
        }
        throw new zzaac("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final Object clone() {
        yhp1 yhp1Var = (yhp1) this.a.j(5, null);
        boolean zK = this.b.k();
        cip1 cip1Var = this.b;
        if (zK) {
            cip1Var.getClass();
            qjp1.c.a(cip1Var.getClass()).f(cip1Var);
            cip1Var.l();
            cip1Var = this.b;
        }
        yhp1Var.b = cip1Var;
        return yhp1Var;
    }
}
