package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cfk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfk(jb3 jb3Var, byte b) {
        super(1);
        this.a = b;
        this.b = jb3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jb3 jb3Var = this.b;
        switch (b) {
            case 0:
                return (ymd0) jb3Var.f;
            default:
                z2s z2sVar = (z2s) obj;
                z2sVar.R(yek.class, (sgk) jb3Var.c, rdk.T0, rdk.U0, rdk.Z0, false, yzj.h);
                z2sVar.R(zek.class, (qtw) jb3Var.e, rdk.V0, rdk.W0, rdk.a1, false, yzj.i);
                z2sVar.R(afk.class, (ug3) jb3Var.d, rdk.X0, rdk.Y0, rdk.b1, false, yzj.t);
                return rih1.a;
        }
    }
}
