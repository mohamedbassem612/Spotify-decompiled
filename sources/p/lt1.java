package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lt1 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rzq b;

    public /* synthetic */ lt1(rzq rzqVar, byte b) {
        this.a = b;
        this.b = rzqVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        rzq rzqVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rzqVar.l();
                break;
            case 1:
                iac0Var.getLifecycle().d(this);
                rzqVar.l();
                break;
            case 2:
                rzqVar.l();
                break;
            case 3:
                rzqVar.l();
                iac0Var.getLifecycle().d(this);
                break;
            case 4:
                rzqVar.l();
                break;
            case 5:
                rzqVar.l();
                break;
            default:
                rzqVar.l();
                break;
        }
    }
}
