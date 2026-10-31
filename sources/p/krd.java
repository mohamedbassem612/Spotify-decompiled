package p;

import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class krd implements Action {
    public final /* synthetic */ long a;

    public krd(long j) {
        this.a = j;
    }

    public final void run() {
        Logger.b(l1d.l(SystemClock.elapsedRealtime() - this.a, "[AA-RESUME] doResume exit elapsedMs="), new Object[0]);
    }
}
