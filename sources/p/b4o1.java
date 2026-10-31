package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b4o1 extends BroadcastReceiver {
    public final /* synthetic */ j4o1 a;

    public b4o1(j4o1 j4o1Var) {
        this.a = j4o1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
