package p;

import android.os.Bundle;
import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class cf11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ df11 b;

    public /* synthetic */ cf11(df11 df11Var, byte b) {
        this.a = b;
        this.b = df11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        df11 df11Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = df11Var.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((hwh0) sparseArray.valueAt(i)).a((String) null, (Bundle) null);
                }
                sparseArray.clear();
                break;
            default:
                if11 if11Var = df11Var.i;
                if (if11Var.N0 == df11Var) {
                    if11Var.k();
                }
                break;
        }
    }
}
