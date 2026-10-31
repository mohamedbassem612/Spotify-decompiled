package p;

import com.comscore.util.log.LogLevel;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f991 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g991 b;

    public /* synthetic */ f991(g991 g991Var, byte b) {
        this.a = b;
        this.b = g991Var;
    }

    public final void run() {
        byte b = this.a;
        vt7 vt7Var = vt7.c;
        g991 g991Var = this.b;
        switch (b) {
            case 0:
                g991Var.c.d(vt7Var);
                break;
            default:
                g991Var.c.b(vt7Var, LogLevel.NONE, 0.0f);
                break;
        }
    }
}
