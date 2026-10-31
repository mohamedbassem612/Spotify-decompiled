package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ s3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        byte b = this.a;
        zl5 zl5Var = this.b;
        switch (b) {
            case 0:
                return new rfr0(d5p1.t(yoi1.g(((mq6) ((lq6) zl5Var.g)).a(str).map(new tqt(str, i)).onErrorReturn(yi20.U0)), (u9c0) zl5Var.o, new alb1(5000L, Long.MAX_VALUE), z6x.a), false);
            default:
                ay8 ay8VarH = d3p1.H((d0r) ((ynb0) zl5Var.f21p).get(), (o3r) zl5Var.x, "spotify:list:available-release-groups:author_".concat(ihc1.V0(str, ':', str)));
                bpb1 bpb1Var = ((kc8) zl5Var.e).a;
                return new rfr0(d5p1.t(new x010(bpb1Var, ay8VarH, new amo(zl5Var, i, null), (byte) 1), (u9c0) zl5Var.o, ey71.a, zl5Var.f(i, (List) ay8VarH.a.getValue(), ((Boolean) bpb1Var.getValue()).booleanValue())), false);
        }
    }
}
