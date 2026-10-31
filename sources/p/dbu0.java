package p;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dbu0 {
    public static final dbu0 c = new dbu0("");
    public static final dbu0 d = new dbu0("preload");
    public final String a;
    public final rcl b;

    public dbu0(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new rcl((byte) 3) : null;
    }

    public final synchronized LogSessionId a() {
        rcl rclVar;
        rclVar = this.b;
        rclVar.getClass();
        return (LogSessionId) rclVar.b;
    }
}
