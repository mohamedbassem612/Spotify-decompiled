package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class up21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ unc0 b;

    public /* synthetic */ up21(unc0 unc0Var, byte b) {
        this.a = b;
        this.b = unc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        unc0 unc0Var = this.b;
        switch (b) {
            case 0:
                ujo1.q((CopyOnWriteArrayList) unc0Var.h, false, false);
                break;
            default:
                Iterator it = ((CopyOnWriteArrayList) unc0Var.h).iterator();
                while (it.hasNext()) {
                    ((hnh0) it.next()).a();
                }
                break;
        }
    }
}
