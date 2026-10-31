package p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ox5 {
    public final Context a;
    public final q8n b;
    public final idd1 c = new idd1(new f85(this, (byte) 23));

    public ox5(Context context, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ComponentName componentName, onm onmVar) {
        lx5 lx5Var;
        if (onmVar instanceof lx5) {
            lx5Var = (lx5) onmVar;
            int i = lx5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx5Var.c = i - Integer.MIN_VALUE;
            } else {
                lx5Var = new lx5(this, onmVar);
            }
        } else {
            lx5Var = new lx5(this, onmVar);
        }
        Object objY = lx5Var.a;
        int i2 = lx5Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            k2 k2Var = new k2(this, componentName, (lnm) null, (byte) 29);
            lx5Var.c = 1;
            objY = fn31.Y(this.b, k2Var, lx5Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, onm onmVar) {
        mx5 mx5Var;
        if (onmVar instanceof mx5) {
            mx5Var = (mx5) onmVar;
            int i2 = mx5Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mx5Var.c = i2 - Integer.MIN_VALUE;
            } else {
                mx5Var = new mx5(this, onmVar);
            }
        } else {
            mx5Var = new mx5(this, onmVar);
        }
        Object objY = mx5Var.a;
        int i3 = mx5Var.c;
        if (i3 == 0) {
            hm5.M(objY);
            nx5 nx5Var = new nx5(this, i, (lnm) null, (byte) 0);
            mx5Var.c = 1;
            objY = fn31.Y(this.b, nx5Var, mx5Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }
}
