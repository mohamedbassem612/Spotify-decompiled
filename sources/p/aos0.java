package p;

import android.content.DialogInterface;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aos0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PermissionsRequestActivity a;
    public final /* synthetic */ String[] b;

    public aos0(PermissionsRequestActivity permissionsRequestActivity, String[] strArr) {
        this.a = permissionsRequestActivity;
        this.b = strArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        PermissionsRequestActivity permissionsRequestActivity = this.a;
        if (permissionsRequestActivity.b) {
            ag0.B0(permissionsRequestActivity, this.b, 49374);
        }
    }
}
