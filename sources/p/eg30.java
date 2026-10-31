package p;

import android.content.res.Resources;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eg30 implements bv1 {
    public final /* synthetic */ byte a = 0;
    public final bv1 b;

    public eg30(Resources resources, av1 av1Var) {
        this.b = new v9a(resources, av1Var.t);
    }

    @Override // p.bv1
    public final int a(int i, int i2) {
        byte b = this.a;
        bv1 bv1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((v9a) bv1Var).a(i, i2);
            default:
                return ((bxb) bv1Var).a(i, i2);
        }
    }

    public eg30(bxb bxbVar) {
        this.b = bxbVar;
    }
}
