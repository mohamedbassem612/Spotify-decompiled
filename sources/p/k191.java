package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k191 extends oba {
    public final ie30 n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f80p;

    public k191(o2r o2rVar, n3r n3rVar, ie30 ie30Var, int i, Object obj, long j, long j2, long j3, ie30 ie30Var2) {
        super(o2rVar, n3rVar, ie30Var, i, obj, j, j2, -9223372036854775807L, j3);
        this.n = ie30Var2;
    }

    @Override // p.f9e0
    public final void a() {
        rsb1 rsb1Var = this.i;
        it8 it8Var = this.l;
        it8Var.getClass();
        int iE = 0;
        for (n541 n541Var : (n541[]) it8Var.c) {
            if (n541Var.I != 0) {
                n541Var.I = 0L;
                n541Var.C = true;
            }
        }
        gtf1 gtf1VarC = it8Var.C(3);
        gtf1VarC.a(this.n);
        try {
            long jT = rsb1Var.t(this.b.d(this.o));
            if (jT != -1) {
                jT += this.o;
            }
            uyr uyrVar = new uyr(rsb1Var, this.o, jT);
            while (true) {
                long j = this.o;
                if (iE == -1) {
                    gtf1VarC.b(this.g, 1, (int) j, 0, null);
                    n3p1.k(rsb1Var);
                    this.f80p = true;
                    return;
                }
                this.o = j + ((long) iE);
                iE = gtf1VarC.e(uyrVar, Alert.DURATION_SHOW_INDEFINITELY, true);
            }
        } catch (Throwable th) {
            n3p1.k(rsb1Var);
            throw th;
        }
    }

    @Override // p.tjh0
    public final boolean d() {
        return this.f80p;
    }

    @Override // p.f9e0
    public final void b() {
    }
}
