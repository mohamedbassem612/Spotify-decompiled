package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xua {
    public final rua a;
    public final wua b;
    public tua c;
    public final int d;

    public xua(uua uuaVar, wua wuaVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = wuaVar;
        this.d = i;
        this.a = new rua(uuaVar, j, j2, j3, j4, j5);
    }

    public static int b(fc10 fc10Var, long j, sfv0 sfv0Var) {
        if (j == fc10Var.getPosition()) {
            return 0;
        }
        sfv0Var.a = j;
        return 1;
    }

    public final int a(fc10 fc10Var, sfv0 sfv0Var) {
        while (true) {
            tua tuaVar = this.c;
            tuaVar.getClass();
            long jB = tua.b(tuaVar);
            long jC = tua.c(tuaVar);
            long jD = tua.d(tuaVar);
            long j = jC - jB;
            long j2 = this.d;
            wua wuaVar = this.b;
            if (j <= j2) {
                this.c = null;
                wuaVar.d();
                return b(fc10Var, jB, sfv0Var);
            }
            long position = jD - fc10Var.getPosition();
            if (position < 0 || position > 262144) {
                return b(fc10Var, jD, sfv0Var);
            }
            fc10Var.u((int) position);
            fc10Var.f();
            vua vuaVarC = wuaVar.c(fc10Var, tua.e(tuaVar));
            int iA = vua.a(vuaVarC);
            if (iA == -3) {
                this.c = null;
                wuaVar.d();
                return b(fc10Var, jD, sfv0Var);
            }
            if (iA == -2) {
                tua.g(tuaVar, vua.b(vuaVarC), vua.c(vuaVarC));
            } else {
                if (iA != -1) {
                    if (iA != 0) {
                        eg.m("Invalid case");
                        return 0;
                    }
                    long jC2 = vua.c(vuaVarC) - fc10Var.getPosition();
                    if (jC2 >= 0 && jC2 <= 262144) {
                        fc10Var.u((int) jC2);
                    }
                    this.c = null;
                    wuaVar.d();
                    return b(fc10Var, vua.c(vuaVarC), sfv0Var);
                }
                tua.f(tuaVar, vua.b(vuaVarC), vua.c(vuaVarC));
            }
        }
    }

    public final void c(long j) {
        tua tuaVar = this.c;
        if (tuaVar == null || tua.a(tuaVar) != j) {
            rua ruaVar = this.a;
            this.c = new tua(j, ruaVar.l(j), 0L, rua.h(ruaVar), rua.i(ruaVar), rua.j(ruaVar), rua.k(ruaVar));
        }
    }
}
