package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cca extends n95 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dca b;

    public /* synthetic */ cca(dca dcaVar, byte b) {
        this.a = b;
        this.b = dcaVar;
    }

    public final void a() {
        byte b = this.a;
        dca dcaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                dcaVar.setIndeterminate(false);
                dcaVar.a(dcaVar.b);
                break;
            default:
                if (!dcaVar.f) {
                    dcaVar.setVisibility(dcaVar.g);
                }
                break;
        }
    }
}
