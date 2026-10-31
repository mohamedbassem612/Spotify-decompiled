package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qed1 extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) qed1.class);
        intent.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
    }
}
