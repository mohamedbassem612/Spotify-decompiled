package p;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gvs0 {
    public final Context a;
    public final dma1 b;

    public gvs0(Context context, dma1 dma1Var) {
        this.a = context;
        this.b = dma1Var;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Context context = this.a;
        int iCheckOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName());
        return iCheckOpNoThrow == 0 || iCheckOpNoThrow == 3;
    }
}
