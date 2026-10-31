package p;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dt91 implements Handler.Callback {
    public final /* synthetic */ ua91 a;

    public dt91(ua91 ua91Var) {
        this.a = ua91Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ua91 ua91Var = this.a;
        et91 et91Var = (et91) message.obj;
        synchronized (ua91Var.b) {
            if (((et91) ua91Var.d) == et91Var || ((et91) ua91Var.e) == et91Var) {
                ua91Var.w(et91Var, 2);
            }
        }
        return true;
    }
}
