package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e22 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;
    public final /* synthetic */ j320 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e22(h22 h22Var, j320 j320Var, byte b) {
        super(1);
        this.a = b;
        this.b = h22Var;
        this.c = j320Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j320 j320Var = this.c;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h22Var.Z0().U(new xyz(j320Var.a, (String) obj));
                break;
            case 1:
                h22Var.Z0().U(new vyz(j320Var.a, (String) obj));
                break;
            default:
                h22Var.Z0().U(new bwz(j320Var.a, ((i320) obj).b));
                break;
        }
        return rih1Var;
    }
}
