package p;

import android.content.Context;
import android.net.Uri;
import com.google.wear.Sdk;
import com.google.wear.services.remoteinteractions.RemoteInteractionsManager;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a321 {
    public final RemoteInteractionsManager a;
    public final boolean b;

    public a321(Context context) {
        this.a = (context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && hgl1.b("WEAR_TIRAMISU_4")) ? (RemoteInteractionsManager) Sdk.getWearManager(context, RemoteInteractionsManager.class) : null;
        this.b = context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && hgl1.b("WEAR_BAKLAVA_0");
    }

    public final void a(Uri uri, List list, Executor executor, ry11 ry11Var) {
        if (!this.b) {
            hhg1.h("Should not call wear sdk when not supported.");
            return;
        }
        RemoteInteractionsManager remoteInteractionsManager = this.a;
        remoteInteractionsManager.getClass();
        remoteInteractionsManager.startRemoteActivity(uri, list, executor, ry11Var);
    }
}
