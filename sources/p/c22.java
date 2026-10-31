package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c22 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;
    public final /* synthetic */ m320 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c22(h22 h22Var, m320 m320Var, byte b) {
        super(1);
        this.a = b;
        this.b = h22Var;
        this.c = m320Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m320 m320Var = this.c;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h22Var.Z0().U(new xyz(m320Var.a, (String) obj));
                break;
            default:
                h22Var.Z0().U(new vyz(m320Var.a, (String) obj));
                break;
        }
        return rih1Var;
    }
}
