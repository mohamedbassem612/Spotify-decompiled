package p;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uhl1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ uhl1(JsResult jsResult, byte b) {
        this.a = b;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        JsResult jsResult = this.b;
        switch (b) {
            case 0:
                jsResult.confirm();
                break;
            default:
                jsResult.cancel();
                break;
        }
    }
}
