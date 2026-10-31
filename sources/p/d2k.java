package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d2k implements yt90 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public d2k(c9c0 c9c0Var, xx91 xx91Var, wy90 wy90Var) {
        this.b = new d2k(new yt90[]{c9c0Var, xx91Var, wy90Var});
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yt90[] yt90VarArr = (yt90[]) obj;
                for (int i = 0; i < 3; i++) {
                    yt90VarArr[i].start();
                }
                break;
            default:
                ((d2k) obj).start();
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList((Collection) new i36((yt90[]) obj, false));
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((yt90) it.next()).stop();
                }
                break;
            default:
                ((d2k) obj).stop();
                break;
        }
    }

    public d2k(yt90[] yt90VarArr) {
        this.b = yt90VarArr;
    }
}
