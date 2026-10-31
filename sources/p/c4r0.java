package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c4r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ c4r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        sua suaVar = ey71.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var, str, i, (byte) 9), (u9c0) zl5Var.o, suaVar, zl5Var.m(i, str, (ioj0) zob1Var.getValue())), false);
            default:
                zl5 zl5Var2 = this.b;
                return new rfr0(d5p1.t(new x010(((v8n0) zl5Var2.k).a(), zob1Var, new e3r0(zl5Var2, str, i, (lnm) null, (byte) 3), (byte) 1), (u9c0) zl5Var2.o, suaVar, z6x.a), false);
        }
    }
}
