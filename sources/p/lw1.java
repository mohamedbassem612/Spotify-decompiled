package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lw1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ av1 b;
    public final /* synthetic */ so1 c;
    public final /* synthetic */ tx4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw1(av1 av1Var, so1 so1Var, tx4 tx4Var, byte b) {
        super(1);
        this.a = b;
        this.b = av1Var;
        this.c = so1Var;
        this.d = tx4Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ww1(nw1.a(this.b, this.c, this.d, null, null, false), ((vw1) obj).a);
            default:
                Bundle bundle = (Bundle) obj;
                return new ww1(nw1.a(this.b, this.c, this.d, (fo1) jhc1.t(bundle, "curationContext", fo1.class), (ma61) jhc1.t(bundle, "sessionChanges", ma61.class), bundle.getBoolean("emptyLibraryRedirectInProgress")), nw1.a);
        }
    }
}
