package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ga6 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja6 b;

    public /* synthetic */ ga6(ja6 ja6Var, byte b) {
        this.a = b;
        this.b = ja6Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ja6 ja6Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                ja6Var.m(ja6Var.f);
                break;
            default:
                va6 va6Var = (va6) obj;
                if (va6Var != null) {
                    new Integer(va6Var.d.size());
                }
                ArrayList arrayList = va6Var != null ? va6Var.d : null;
                if (arrayList == null) {
                    arrayList = z6x.a;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((ab6) it.next()).a;
                }
                ja6Var.f = va6Var;
                ja6Var.n(va6Var);
                ja6Var.m(va6Var);
                break;
        }
        return rih1Var;
    }
}
