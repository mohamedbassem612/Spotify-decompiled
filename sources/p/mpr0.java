package p;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mpr0 extends fho1 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ fho1 e;

    public /* synthetic */ mpr0(fho1 fho1Var, byte b) {
        this.d = b;
        this.e = fho1Var;
    }

    public final void l(un21 un21Var, Object obj) {
        byte b = this.d;
        fho1 fho1Var = this.e;
        switch (b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        fho1Var.l(un21Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        fho1Var.l(un21Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
