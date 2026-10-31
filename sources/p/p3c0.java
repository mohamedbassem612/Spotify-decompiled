package p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p3c0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q3c0 b;

    public /* synthetic */ p3c0(q3c0 q3c0Var, byte b) {
        this.a = b;
        this.b = q3c0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        q3c0 q3c0Var = this.b;
        switch (b) {
            case 0:
                yzu yzuVar = q3c0Var.b;
                ou80 ou80Var = ((j3c0) obj).c;
                ynb0 ynb0Var = (ynb0) yzuVar.c;
                if (ou80Var != null) {
                    e7p0.d((e7p0) ynb0Var.get(), ou80Var);
                } else {
                    ((e7p0) ynb0Var.get()).c();
                }
                ((ozx) yzuVar.a).invoke();
                break;
            default:
                k3c0 k3c0Var = (k3c0) obj;
                yzu yzuVar2 = q3c0Var.b;
                String str = k3c0Var.c;
                ((Activity) yzuVar2.d).runOnUiThread(new uu1(k3c0Var.d, yzuVar2, str, (byte) 11));
                ((ozx) yzuVar2.a).invoke();
                break;
        }
    }
}
