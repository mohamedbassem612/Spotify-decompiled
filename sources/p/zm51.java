package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zm51 implements sm51 {
    public final sm51 a;
    public final yqg b;
    public long d = -1;
    public final byte c = 50;

    public zm51(sm51 sm51Var, yqg yqgVar) {
        this.a = sm51Var;
        this.b = yqgVar;
    }

    @Override // p.sm51
    public final rm51 a(int i, long j, int i2) {
        long jB = this.b.b();
        long j2 = this.d;
        if (j2 != -1 && jB - j2 < this.c) {
            return null;
        }
        this.d = jB;
        return this.a.a(i, j, i2);
    }
}
