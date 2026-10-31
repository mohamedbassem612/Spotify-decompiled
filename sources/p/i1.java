package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(s1 s1Var, byte b) {
        super(1);
        this.a = b;
        this.b = s1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s1 s1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return d3p1.H(s1Var.h, s1Var.t, (c1) obj);
            default:
                ((qtr) obj).b(new k1(s1Var, null, (byte) 0));
                return rih1.a;
        }
    }
}
