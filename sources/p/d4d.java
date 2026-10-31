package p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d4d {
    public final ic9 a;
    public final ArrayMap b = new ArrayMap(4);

    public d4d(ic9 ic9Var) {
        this.a = ic9Var;
    }

    public static d4d a(Context context, Handler handler) {
        ic9 e4dVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            e4dVar = new g4d(context, null);
        } else if (i >= 29) {
            e4dVar = new f4d(context, null);
        } else {
            e4dVar = i >= 28 ? new e4d(context, null) : new ic9(context, new h4d(handler));
        }
        return new d4d(e4dVar);
    }

    public final w2d b(String str) {
        w2d w2dVar;
        synchronized (this.b) {
            w2dVar = (w2d) this.b.get(str);
            if (w2dVar == null) {
                try {
                    w2d w2dVar2 = new w2d(this.a.f(str), str);
                    this.b.put(str, w2dVar2);
                    w2dVar = w2dVar2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return w2dVar;
    }
}
