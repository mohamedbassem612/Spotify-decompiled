package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ j3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        sua suaVar = ey71.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                boolean zR = ((xf4) zl5Var.i).r();
                z6x z6xVar = z6x.a;
                return !zR ? new rfr0(gio1.b(z6xVar), false) : new rfr0(d5p1.t(new x010(((v8n0) zl5Var.k).a(), zob1Var, new e3r0(str, zl5Var, i, (lnm) null, (byte) 2), (byte) 1), (u9c0) zl5Var.o, suaVar, z6xVar), false);
            default:
                zl5 zl5Var2 = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var2, str, i, (byte) 13), (u9c0) zl5Var2.o, suaVar, zl5Var2.u(i, str, (ioj0) zob1Var.getValue())), false);
        }
    }
}
