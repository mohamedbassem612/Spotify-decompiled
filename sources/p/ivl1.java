package p;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ivl1 extends Binder {
    public final efr a;

    public ivl1(efr efrVar) {
        this.a = efrVar;
    }

    public final void a(jvl1 jvl1Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = jvl1Var.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.a.b;
        bsd1 bsd1Var = new bsd1();
        firebaseMessagingService.a.execute(new c45(firebaseMessagingService, intent, bsd1Var, (byte) 17));
        bsd1Var.a.l(new l5o(), new iyh1(jvl1Var, (byte) 16));
    }
}
