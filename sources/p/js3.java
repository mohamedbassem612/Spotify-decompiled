package p;

import android.os.Looper;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class js3 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks3 b;

    public /* synthetic */ js3(ks3 ks3Var, byte b) {
        this.a = b;
        this.b = ks3Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                fn3 fn3Var = (fn3) obj;
                this.b.j = fn3Var;
                if (fn3Var.d instanceof hm3) {
                    zo41 zo41Var = fn3Var.b.c;
                    if (!(zo41Var instanceof to41) && !(zo41Var instanceof xo41) && !(zo41Var instanceof vo41)) {
                    }
                }
                this.b.getClass();
                ls3 ls3Var = new ls3(fn3Var.a, fn3Var.b, fn3Var.c);
                ks3 ks3Var = this.b;
                nx2 nx2Var = new nx2(ks3Var, ls3Var, (byte) 6);
                ks3Var.getClass();
                if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    ks3Var.f.post(new is3(nx2Var, (byte) 0));
                } else {
                    nx2Var.invoke();
                }
                break;
            default:
                gn3 gn3Var = (gn3) obj;
                if (!(gn3Var instanceof gn3)) {
                    eg.o();
                } else {
                    ks3 ks3Var2 = this.b;
                    nx2 nx2Var2 = new nx2(ks3Var2, gn3Var, (byte) 7);
                    ks3Var2.getClass();
                    if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                        ks3Var2.f.post(new is3(nx2Var2, (byte) 0));
                    } else {
                        nx2Var2.invoke();
                    }
                }
                break;
        }
    }
}
