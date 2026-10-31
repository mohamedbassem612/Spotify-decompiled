package p;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class v94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha4 b;

    public /* synthetic */ v94(ha4 ha4Var, byte b) {
        this.a = b;
        this.b = ha4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ha4 ha4Var = this.b;
        switch (b) {
            case 0:
                n36 n36Var = ha4Var.i;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!n36Var.isEmpty()) {
                    try {
                        ((Function0) n36Var.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            default:
                ha4Var.X1 = false;
                MotionEvent motionEvent = ha4Var.N1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    ha4Var.J(motionEvent);
                    return;
                } else {
                    eg.m("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
