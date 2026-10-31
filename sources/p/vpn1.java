package p;

import android.os.SystemClock;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vpn1 extends a6o1 {
    public final /* synthetic */ byte e;

    @Override // p.a6o1
    public final long v() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
