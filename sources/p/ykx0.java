package p;

import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ykx0 {
    public final Context a;

    public ykx0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(onm onmVar) {
        xkx0 xkx0Var;
        if (onmVar instanceof xkx0) {
            xkx0Var = (xkx0) onmVar;
            int i = xkx0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkx0Var.c = i - Integer.MIN_VALUE;
            } else {
                xkx0Var = new xkx0(this, onmVar);
            }
        } else {
            xkx0Var = new xkx0(this, onmVar);
        }
        Object objB = xkx0Var.a;
        int i2 = xkx0Var.c;
        pmm1 pmm1Var = pmm1.a;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                if (Build.VERSION.SDK_INT < 34) {
                    return pmm1Var;
                }
                cua cuaVar = wkx0.d;
                Context context = this.a;
                xkx0Var.c = 1;
                objB = cuaVar.b(context, xkx0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            return ((wkx0) objB).a().contains(ukx0.a) ? pmm1.b : pmm1.c;
        } catch (Exception e) {
            Logger.d("ProjectedDeviceControllerProvider", new Object[]{"Error creating ProjectedDeviceController", e});
            return pmm1Var;
        }
    }
}
