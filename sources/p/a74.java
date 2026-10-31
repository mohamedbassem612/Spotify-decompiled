package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a74 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ a74(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                Logger.b("Search got results, onSuccess was: " + iu30Var, new Object[0]);
                iu30Var.invoke((List) obj);
                break;
            case 1:
                Logger.b("MBS: Search got results, onSuccess was: %s", new Object[]{iu30Var});
                iu30Var.invoke((List) obj);
                break;
            case 2:
                iu30Var.invoke(obj);
                break;
            case 3:
                if (iu30Var != null) {
                    iu30Var.invoke(gs41.c);
                }
                break;
            case 4:
                Throwable th = (Throwable) obj;
                if (iu30Var != null) {
                    iu30Var.invoke(th instanceof TimeoutException ? gs41.d : gs41.b);
                }
                break;
            case 5:
                iu30Var.invoke(Integer.valueOf((int) ((Long) obj).longValue()));
                break;
            case 6:
                iu30Var.invoke(obj);
                break;
            default:
                iu30Var.invoke((bcg1) obj);
                break;
        }
    }
}
