package p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class cs50 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fns fnsVar = igu.a;
                ((ohd) obj).C(pyf0.a, Long.valueOf(j));
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? ph5.h(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new pj5((Context) obj, (byte) 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
