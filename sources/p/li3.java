package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class li3 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cwb b;

    public /* synthetic */ li3(cwb cwbVar, byte b) {
        this.a = b;
        this.b = cwbVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        cwb cwbVar = this.b;
        switch (b) {
            case 0:
                cwbVar.g().L(3);
                break;
            default:
                cwbVar.g().L(3);
                break;
        }
    }
}
