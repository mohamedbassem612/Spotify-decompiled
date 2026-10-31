package p;

import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xlo1 extends mh70 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ bsd1 m;

    public /* synthetic */ xlo1(bsd1 bsd1Var, byte b) {
        this.l = b;
        this.m = bsd1Var;
    }

    public final void Z0(Status status, dm00 dm00Var) {
        switch (this.l) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                u0p1.u(status, dm00Var, this.m);
                break;
        }
    }

    public final void a1(Status status, mc80 mc80Var) {
        switch (this.l) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                u0p1.u(status, mc80Var, this.m);
                break;
        }
    }

    private final void b1(Status status, dm00 dm00Var) {
    }

    private final void c1(Status status, mc80 mc80Var) {
    }
}
