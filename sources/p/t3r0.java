package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ t3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        sua suaVar = ey71.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var, str, i, (byte) 0), (u9c0) zl5Var.o, suaVar, zl5Var.b(i, str, (ioj0) zob1Var.getValue())), false);
            default:
                String strConcat = "spotify:list:artist-connections-shelf:".concat(ihc1.V0(str, ':', str));
                zl5 zl5Var2 = this.b;
                ay8 ay8VarH = d3p1.H((d0r) ((ynb0) zl5Var2.f21p).get(), (o3r) zl5Var2.w, strConcat);
                return new rfr0(d5p1.t(new ked(ay8VarH, zl5Var2, str, i, (byte) 1), (u9c0) zl5Var2.o, suaVar, zl5Var2.g(str, (z2r0) ay8VarH.a.getValue(), i)), false);
        }
    }
}
