package p;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uib implements aib {
    public final ajq0 a;
    public final BluetoothManager b;
    public final Context c;

    public uib(ajq0 ajq0Var, BluetoothManager bluetoothManager, Context context) {
        this.a = ajq0Var;
        this.b = bluetoothManager;
        this.c = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.aib
    public final Object a(Set set, qhb qhbVar, rhb rhbVar, boolean z, gaa gaaVar, lnm lnmVar) {
        tib tibVar;
        g23 g23Var;
        if (lnmVar instanceof tib) {
            tibVar = (tib) lnmVar;
            int i = tibVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tibVar.d = i - Integer.MIN_VALUE;
            } else {
                tibVar = new tib(this, (onm) lnmVar);
            }
        } else {
            tibVar = new tib(this, (onm) lnmVar);
        }
        Object obj = tibVar.b;
        int i2 = tibVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            Context context = this.c;
            boolean zIsEmpty = set.isEmpty();
            BluetoothManager bluetoothManager = this.b;
            xhb xhbVarP = sok.p(bluetoothManager, context, zIsEmpty);
            mmr0 mmr0VarN = xhbVarP != null ? oqn1.n(xhbVarP, cu9.R0) : null;
            if (mmr0VarN != null) {
                return mmr0VarN;
            }
            g23 g23VarM = e9k.m(this.a, set, gaaVar);
            int iA = lya.a(set);
            tibVar.a = g23VarM;
            tibVar.d = 1;
            d9n d9nVarZ = sok.z(bluetoothManager, qhbVar, rhbVar, iA, z, tibVar);
            d9n d9nVar = d9n.a;
            if (d9nVarZ == d9nVar) {
                return d9nVar;
            }
            obj = d9nVarZ;
            g23Var = g23VarM;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g23Var = tibVar.a;
            hm5.M(obj);
        }
        mmr0 mmr0Var = (mmr0) obj;
        return oqn1.n((zhb) mmr0Var.a, new rqa(g23Var, (Function0) mmr0Var.b, (byte) 3));
    }
}
