package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tx20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ux20 b;

    public /* synthetic */ tx20(ux20 ux20Var, byte b) {
        this.a = b;
        this.b = ux20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ux20 ux20Var = this.b;
        switch (b) {
            case 0:
                Iterator it = ux20Var.c.iterator();
                while (it.hasNext()) {
                    ((hnh0) it.next()).a();
                }
                break;
            case 1:
                ujo1.q(ux20Var.c, false, false);
                break;
            default:
                ujo1.q(ux20Var.c, true, false);
                break;
        }
    }
}
