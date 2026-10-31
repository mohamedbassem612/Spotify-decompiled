package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class l2o1 implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BroadcastReceiver.PendingResult d;

    public /* synthetic */ l2o1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = intent;
        this.b = context;
        this.c = z;
        this.d = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseInstanceIdReceiver.a(this.a, this.b, this.c, this.d);
    }
}
