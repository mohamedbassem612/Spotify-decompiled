package p;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class uvh0 extends mv2 {
    public fvh0 i;
    public final c8d0 j;

    public uvh0(zvh0 zvh0Var) {
        super(zvh0Var);
        this.j = new c8d0(this, (byte) 18);
    }

    public final void a(Context context) {
        fvh0 fvh0Var = this.i;
        if (fvh0Var != null) {
            fvh0Var.attachBaseContext(context);
        }
    }

    public final xvh0 i(Messenger messenger, int i, String str) {
        return new tvh0(this, messenger, i, str);
    }

    public final IBinder u(Intent intent) {
        zvh0 zvh0Var = (zvh0) ((mv2) this).c;
        zvh0Var.b();
        if (this.i == null) {
            this.i = new fvh0(this);
            if (zvh0Var.getBaseContext() != null) {
                this.i.attachBaseContext(zvh0Var);
            }
        }
        IBinder iBinderU = super.u(intent);
        return iBinderU != null ? iBinderU : this.i.onBind(intent);
    }

    public final void w(jqd0 jqd0Var) {
        super.w(jqd0Var);
        this.i.g(jqd0Var);
    }
}
