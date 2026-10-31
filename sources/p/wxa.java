package p;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxa implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    public /* synthetic */ wxa(ohd ohdVar, byte b) {
        this.a = b;
        this.b = ohdVar;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        byte b = this.a;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(uri);
                }
                break;
            default:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(uri);
                }
                break;
        }
    }
}
