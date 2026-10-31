package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d22 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;
    public final /* synthetic */ l320 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d22(h22 h22Var, l320 l320Var, byte b) {
        super(1);
        this.a = b;
        this.b = h22Var;
        this.c = l320Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l320 l320Var = this.c;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h22Var.Z0().U(new xyz(l320Var.a, (String) obj));
                break;
            default:
                h22Var.Z0().U(new vyz(l320Var.a, (String) obj));
                break;
        }
        return rih1Var;
    }
}
