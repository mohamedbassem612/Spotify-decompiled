package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fv7 implements omv0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public final boolean apply(Object obj) {
        boolean zIsEmpty;
        switch (this.a) {
            case 0:
                zIsEmpty = ((gv7) obj).a.m;
                break;
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            case 2:
                return ((String) obj) != null;
            case 3:
                z390 z390Var = (z390) obj;
                return z390Var.b.equals("com.apple.iTunes") && z390Var.c.equals("iTunSMPB");
            case 4:
                return ((String) obj) != null;
            case 5:
                Iterator it = ((f4w) obj).a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!((e4w) it.next()).f.a.isEmpty()) {
                        if (i != -1) {
                            return true;
                        }
                        return false;
                    }
                    i++;
                }
                i = -1;
                if (i != -1) {
                    return true;
                }
                return false;
            default:
                zIsEmpty = ((e4w) obj).f.b.isEmpty();
                break;
        }
        return !zIsEmpty;
    }
}
