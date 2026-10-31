package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iac implements hw61 {
    public final int a;

    public iac(int i) {
        this.a = i;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        cr31 cr31VarC;
        ww4.a();
        int iC = l1d.C(this.a);
        if (iC == 0) {
            cr31VarC = er31.c(4.0f, 16.0f, 16.0f, 16.0f);
        } else if (iC == 1) {
            cr31VarC = er31.c(16.0f, 4.0f, 16.0f, 16.0f);
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            cr31VarC = er31.b(16.0f);
        }
        return cr31VarC.a(j, flb0Var, watVar);
    }
}
