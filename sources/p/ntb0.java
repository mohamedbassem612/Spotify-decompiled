package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ntb0 extends k9 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ long O0;
    public final /* synthetic */ xtb0 P0;
    public final /* synthetic */ pl3 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;
    public final ktb0 c;
    public final isb0 d;
    public final long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ isb0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ nl3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntb0(long j, boolean z, ktb0 ktb0Var, isb0 isb0Var, int i, int i2, nl3 nl3Var, pl3 pl3Var, boolean z2, int i3, int i4, long j2, xtb0 xtb0Var) {
        super((byte) 10);
        this.f = z;
        this.g = isb0Var;
        this.h = i;
        this.i = i2;
        this.t = nl3Var;
        this.X = pl3Var;
        this.Y = z2;
        this.Z = i3;
        this.N0 = i4;
        this.O0 = j2;
        this.P0 = xtb0Var;
        this.c = ktb0Var;
        this.d = isb0Var;
        this.e = jjl.b(0, z ? hjl.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : hjl.h(j), 5);
    }

    public final jsb0 M0(long j, int i, int i2, int i3) {
        return v1(i, j);
    }

    public final qtb0 v1(int i, long j) {
        ktb0 ktb0Var = this.c;
        Object objD = ktb0Var.d(i);
        Object objW = ktb0Var.b.w(i);
        return new qtb0(i, V0(this.d, i, j), this.f, this.t, this.X, this.g.b.getLayoutDirection(), this.Y, this.Z, this.N0, i == this.h + (-1) ? 0 : this.i, this.O0, objD, objW, this.P0.o, j);
    }
}
