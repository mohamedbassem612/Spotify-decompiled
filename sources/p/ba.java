package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ba {
    public ca[] a;
    public int b;
    public int c;
    public foc1 d;

    public final ca f() {
        ca caVarG;
        foc1 foc1Var;
        synchronized (this) {
            try {
                ca[] caVarArrH = this.a;
                if (caVarArrH == null) {
                    caVarArrH = h();
                    this.a = caVarArrH;
                } else if (this.b >= caVarArrH.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(caVarArrH, caVarArrH.length * 2);
                    this.a = (ca[]) objArrCopyOf;
                    caVarArrH = (ca[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    caVarG = caVarArrH[i];
                    if (caVarG == null) {
                        caVarG = g();
                        caVarArrH[i] = caVarG;
                    }
                    i++;
                    if (i >= caVarArrH.length) {
                        i = 0;
                    }
                } while (!caVarG.a(this));
                this.c = i;
                this.b++;
                foc1Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (foc1Var != null) {
            foc1Var.x(1);
        }
        return caVarG;
    }

    public ca g() {
        return new hpb1();
    }

    public ca[] h() {
        return new hpb1[2];
    }

    public final void i(ca caVar) {
        foc1 foc1Var;
        int i;
        lnm[] lnmVarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                foc1Var = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                lnmVarArrB = caVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lnm lnmVar : lnmVarArrB) {
            if (lnmVar != null) {
                lnmVar.resumeWith(rih1.a);
            }
        }
        if (foc1Var != null) {
            foc1Var.x(-1);
        }
    }

    public final foc1 j() {
        foc1 foc1Var;
        synchronized (this) {
            foc1Var = this.d;
            if (foc1Var == null) {
                int i = this.b;
                foc1Var = new foc1(1, Integer.MAX_VALUE, 2);
                foc1Var.a(Integer.valueOf(i));
                this.d = foc1Var;
            }
        }
        return foc1Var;
    }
}
