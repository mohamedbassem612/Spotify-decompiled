package p;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jw70 {
    public final gw70 a;

    public jw70(gw70 gw70Var) {
        this.a = gw70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, int i, int i2, onm onmVar) {
        hw70 hw70Var;
        Exception exc;
        if (onmVar instanceof hw70) {
            hw70Var = (hw70) onmVar;
            int i3 = hw70Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hw70Var.d = i3 - Integer.MIN_VALUE;
            } else {
                hw70Var = new hw70(this, onmVar);
            }
        } else {
            hw70Var = new hw70(this, onmVar);
        }
        Object objO = hw70Var.b;
        int i4 = hw70Var.d;
        try {
            if (i4 == 0) {
                hm5.M(objO);
                try {
                    try {
                        iw70 iw70Var = new iw70(this, str, i, i2, null);
                        hw70Var.a = str;
                        hw70Var.d = 1;
                        objO = rc2.O(5000L, iw70Var, hw70Var);
                        d9n d9nVar = d9n.a;
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                        str = str;
                    } catch (Exception e) {
                        exc = e;
                        str = str;
                        Logger.l(exc, "[WrappedBackground] Failed to load %s", new Object[]{str});
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    Logger.l(exc, "[WrappedBackground] Failed to load %s", new Object[]{str});
                    return null;
                }
            } else {
                if (i4 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = hw70Var.a;
                try {
                    hm5.M(objO);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    Logger.l(exc, "[WrappedBackground] Failed to load %s", new Object[]{str});
                    return null;
                }
            }
            Bitmap bitmap = (Bitmap) objO;
            if (bitmap != null) {
                return bitmap;
            }
            Logger.k("[WrappedBackground] Timed out loading %s", new Object[]{str});
            return null;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
