package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ack1 {
    public static final rtw0 a = new rtw0((byte) 20);

    public static final gsg a(xbk1 xbk1Var) {
        gsg gsgVarR;
        synchronized (a) {
            gsgVarR = xbk1Var.R("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (gsgVarR == null) {
                gsgVarR = g2p1.D();
                xbk1Var.P("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", gsgVarR);
            }
        }
        return gsgVarR;
    }
}
