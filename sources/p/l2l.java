package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l2l implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        m2l.a.remove("gaia.content_not_supported");
        dialogInterface.dismiss();
    }
}
