package p;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k7s {
    public static final /* synthetic */ int b = 0;
    public final Context a;

    static {
        zno1.u(new p58((byte) 2));
    }

    public k7s(fp7 fp7Var) {
        Context context = fp7Var.a;
        this.a = context;
        ((NotificationManager) context.getSystemService("notification")).getClass();
    }
}
