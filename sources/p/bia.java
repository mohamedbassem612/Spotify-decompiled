package p;

import android.content.Context;
import android.content.IntentFilter;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bia implements f961 {
    public final Context a;
    public final BehaviorSubject b = BehaviorSubject.f();
    public final aia c;

    public bia(Context context, uha uhaVar) {
        this.a = context;
        aia aiaVar = new aia(this, uhaVar, (byte) 0);
        this.c = aiaVar;
        i2p1.s(context, aiaVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 28);
    }

    public final void shutdown() {
        this.a.unregisterReceiver(this.c);
    }

    public final Object getApi() {
        return this;
    }
}
