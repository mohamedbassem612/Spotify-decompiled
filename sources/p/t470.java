package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t470 extends yfu {
    public final /* synthetic */ byte d = 0;
    public final Object e;

    public t470(b570 b570Var) {
        super(b570Var.c);
        this.e = b570Var;
    }

    public final void t(Parcelable parcelable, WeakHashMap weakHashMap) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (parcelable instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelable;
                    bundle.setClassLoader(t470.class.getClassLoader());
                    if (bundle.containsKey("hubs_adapter_states")) {
                        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("hubs_adapter_states");
                        f670 f670Var = ((b570) obj).d;
                        int size = f670Var.size();
                        for (int i = 0; i < sparseParcelableArray.size(); i++) {
                            int iKeyAt = sparseParcelableArray.keyAt(i);
                            if (iKeyAt >= size) {
                                Logger.k("Inconsistent saved state: position is %d but size is %d", new Object[]{Integer.valueOf(iKeyAt), Integer.valueOf(size)});
                            } else {
                                y570 y570Var = (y570) ((b570) f670Var.b).b.get(iKeyAt);
                                y570Var.getClass();
                                String strA = y570Var.a();
                                if (strA != null) {
                                    weakHashMap.put(strA, (Parcelable) sparseParcelableArray.valueAt(i));
                                }
                            }
                        }
                    }
                }
                break;
            default:
                kz50 kz50Var = (kz50) obj;
                y570 y570Var2 = (y570) kz50Var.g;
                if (y570Var2 != null && y570Var2.a() != null) {
                    weakHashMap.put(((y570) kz50Var.g).a(), parcelable);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t470(kz50 kz50Var, uo5 uo5Var) {
        super(uo5Var);
        this.e = kz50Var;
    }
}
