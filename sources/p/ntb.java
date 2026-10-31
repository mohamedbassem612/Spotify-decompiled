package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ntb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntb(hdn0 hdn0Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 3;
        this.c = hdn0Var;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        err0 err0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new ry5(ven0Var, err0Var, (lnm) null, (byte) 27);
                abc0Var.a = new vk1(ven0Var, (lnm) null, (byte) 5);
                break;
            case 1:
                elb0 elb0Var = (elb0) obj;
                kaa0.j(elb0Var.E(0L), ven0Var);
                err0Var.t((int) (elb0Var.b() >> 32));
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                if (ven0Var.getValue() == ulx0.a) {
                    err0Var.t(iIntValue);
                }
                break;
            default:
                err0Var.t(jch0.U(((Number) obj).floatValue()));
                ven0Var.setValue(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntb(ven0 ven0Var, hdn0 hdn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = hdn0Var;
    }
}
