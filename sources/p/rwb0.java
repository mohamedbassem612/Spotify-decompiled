package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rwb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ swb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwb0(swb0 swb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = swb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        swb0 swb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = (String) obj;
                h22 h22Var = swb0Var.c2;
                if (h22Var != null) {
                    h22Var.a1(str);
                    return rih1Var;
                }
                u890.C("listener");
                throw null;
            default:
                String str2 = (String) obj;
                h22 h22Var2 = swb0Var.c2;
                if (h22Var2 != null) {
                    h22Var2.a1(str2);
                    return rih1Var;
                }
                u890.C("listener");
                throw null;
        }
    }
}
