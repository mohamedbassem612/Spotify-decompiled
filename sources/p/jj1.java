package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj1(mj1 mj1Var, byte b) {
        super(1);
        this.a = b;
        this.b = mj1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mj1 mj1Var = this.b;
        switch (b) {
            case 0:
                mj1Var.b.a(new y231(new vof(new rof((List) obj))));
                break;
            case 1:
                mj1Var.b.a(new y231(new vof(new sof((piz) obj))));
                break;
            case 2:
                cas casVar = (a7m0) obj;
                casVar.a = kj1.a;
                casVar.d = new lj1(mj1Var, (byte) 0);
                casVar.e = new lj1(mj1Var, (byte) 1);
                casVar.a(uh1.g, uh1.h);
                break;
            case 3:
                mj1Var.b.a(new y231(new vof(new tof((String) obj))));
                break;
            default:
                mj1Var.b.a(new y231(new vof(new tof((String) obj))));
                break;
        }
        return rih1Var;
    }
}
