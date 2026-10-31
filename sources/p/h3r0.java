package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ h3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        sua suaVar = ey71.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var, str, i, (byte) 1), (u9c0) zl5Var.o, suaVar, z6x.a), false);
            case 1:
                zl5 zl5Var2 = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var2, str, i, (byte) 11), (u9c0) zl5Var2.o, suaVar, zl5Var2.N(i, str, (ioj0) zob1Var.getValue())), false);
            default:
                String strConcat = "spotify:list:popular-releases:author_".concat(ihc1.V0(str, ':', str));
                zl5 zl5Var3 = this.b;
                ay8 ay8VarH = d3p1.H((d0r) ((ynb0) zl5Var3.f21p).get(), (o3r) zl5Var3.x, strConcat);
                return new rfr0(d5p1.t(new x010(zob1Var, ay8VarH, new p4r0(zl5Var3, str, i, (lnm) null, (byte) 0), (byte) 1), (u9c0) zl5Var3.o, suaVar, zl5Var3.d((ioj0) zob1Var.getValue(), str, i, true ^ ((Collection) ay8VarH.a.getValue()).isEmpty())), false);
        }
    }
}
