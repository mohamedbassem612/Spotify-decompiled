package p;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class glt0 implements h8q0, d5q0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dzp0 b;
    public final /* synthetic */ l441 c;

    public /* synthetic */ glt0(dzp0 dzp0Var, l441 l441Var, byte b) {
        this.a = b;
        this.b = dzp0Var;
        this.c = l441Var;
    }

    public void i(Exception exc) {
        byte b = this.a;
        l441 l441Var = this.c;
        dzp0 dzp0Var = this.b;
        switch (b) {
            case 1:
                ((wmy) dzp0Var.b).M("failure");
                l441Var.resumeWith(new e331(new m231(exc)));
                break;
            default:
                ((wmy) dzp0Var.b).O("failure");
                l441Var.resumeWith(exc instanceof ApiException ? new o0f1(fbp1.p(((ApiException) exc).getStatusCode())) : new o0f1(l1d.m("Failed to generate token: ", exc.getMessage())));
                break;
        }
    }

    public void onSuccess(Object obj) {
        byte b = this.a;
        l441 l441Var = this.c;
        dzp0 dzp0Var = this.b;
        switch (b) {
            case 0:
                c6n1 c6n1Var = (c6n1) obj;
                ((wmy) dzp0Var.b).M("success");
                dzp0Var.d = c6n1Var;
                l441Var.resumeWith(new e331(c6n1Var));
                break;
            default:
                ((wmy) dzp0Var.b).O("success");
                l441Var.resumeWith(new n0f1(((b6n1) obj).a));
                break;
        }
    }
}
