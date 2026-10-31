package p;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tx5 {
    public final Context a;
    public final BroadcastReceiver b;
    public final ox5 c;

    public tx5(Context context, BroadcastReceiver broadcastReceiver, ox5 ox5Var) {
        this.a = context;
        this.b = broadcastReceiver;
        this.c = ox5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(sc01 sc01Var, onm onmVar) {
        sx5 sx5Var;
        if (onmVar instanceof sx5) {
            sx5Var = (sx5) onmVar;
            int i = sx5Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sx5Var.d = i - Integer.MIN_VALUE;
            } else {
                sx5Var = new sx5(this, onmVar);
            }
        } else {
            sx5Var = new sx5(this, onmVar);
        }
        Object objY = sx5Var.b;
        int i2 = sx5Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                ComponentName componentName = new ComponentName(this.a, this.b.getClass());
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                hi2 hi2Var = new hi2(this, componentName, (lnm) null, (byte) 27);
                sx5Var.a = sc01Var;
                sx5Var.d = 1;
                objY = fn31.Y(b3sVar, hi2Var, sx5Var);
                if (objY == d9nVar) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(objY);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sc01Var = sx5Var.a;
            hm5.M(objY);
            int[] iArr = (int[]) objY;
            sx5Var.a = null;
            sx5Var.d = 2;
            return sc01Var.invoke(iArr, sx5Var) == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (RuntimeException e2) {
            Logger.e(e2, "Failed to update recommendations widget", new Object[0]);
            return rih1Var;
        }
    }
}
