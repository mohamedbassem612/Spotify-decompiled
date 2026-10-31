package p;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a84 {
    public final BluetoothAdapter a;
    public final o4o0 b;
    public final q8n c;
    public final Context d;

    public a84(Context context, BluetoothAdapter bluetoothAdapter, o4o0 o4o0Var, q8n q8nVar) {
        this.a = bluetoothAdapter;
        this.b = o4o0Var;
        this.c = q8nVar;
        this.d = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        z74 z74Var;
        if (onmVar instanceof z74) {
            z74Var = (z74) onmVar;
            int i = z74Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z74Var.c = i - Integer.MIN_VALUE;
            } else {
                z74Var = new z74(this, onmVar);
            }
        } else {
            z74Var = new z74(this, onmVar);
        }
        Object objH = z74Var.a;
        int i2 = z74Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            qm qmVar = new qm(this, (lnm) null, (byte) 24);
            z74Var.c = 1;
            objH = c921.H(this.c, qmVar, z74Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        return objH;
    }
}
