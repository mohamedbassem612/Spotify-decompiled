package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l470 implements ViewTreeObserver.OnScrollChangedListener {
    public ViewTreeObserver a;
    public final /* synthetic */ n470 b;

    public l470(n470 n470Var) {
        this.b = n470Var;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Bundle bundle;
        Parcelable parcelable;
        n470 n470Var = this.b;
        y570 y570Var = n470Var.e;
        yfu yfuVar = n470Var.f;
        if (y570Var == null || yfuVar == null) {
            return;
        }
        t470 t470Var = n470Var.c.f;
        WeakHashMap weakHashMap = (WeakHashMap) ((yfu) t470Var).b;
        if (weakHashMap.isEmpty()) {
            bundle = null;
        } else {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            f670 f670Var = ((b570) t470Var.e).d;
            for (int i = 0; i < f670Var.size(); i++) {
                y570 y570Var2 = (y570) ((b570) f670Var.b).b.get(i);
                y570Var2.getClass();
                String strA = y570Var2.a();
                if (strA != null && (parcelable = (Parcelable) weakHashMap.get(strA)) != null) {
                    sparseArray.put(i, parcelable);
                }
            }
            bundle = new Bundle();
            bundle.putSparseParcelableArray("hubs_adapter_states", sparseArray);
        }
        yfuVar.r(y570Var, new m470(bundle, n470Var.b.x0()));
    }
}
