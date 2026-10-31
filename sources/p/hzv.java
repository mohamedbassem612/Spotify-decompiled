package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hzv implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg30 b;

    public /* synthetic */ hzv(dg30 dg30Var, byte b) {
        this.a = b;
        this.b = dg30Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                dg30Var.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", dg30Var.getPackageName(), null)));
                break;
            case 1:
                Toast.makeText((Context) dg30Var, 2131955714, 1).show();
                break;
            default:
                dg30Var.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", dg30Var.getPackageName(), null)));
                break;
        }
    }
}
