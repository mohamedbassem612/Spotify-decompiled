package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dap1 {
    public final Context a;
    public int b;
    public byte c = 0;

    public dap1(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        byte b = this.c;
        if (b != 0) {
            return b;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (mjm1.a(this.a).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i = 1;
        if (!wyo1.j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.c = (byte) 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.c = (byte) 2;
            return 2;
        }
        if (wyo1.j()) {
            this.c = (byte) 2;
            i = 2;
        } else {
            this.c = (byte) 1;
        }
        return i;
    }
}
