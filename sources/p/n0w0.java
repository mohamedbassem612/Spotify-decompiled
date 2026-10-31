package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n0w0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0w0 b;

    public /* synthetic */ n0w0(o0w0 o0w0Var, byte b) {
        this.a = b;
        this.b = o0w0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        o0w0 o0w0Var = this.b;
        switch (b) {
            case 0:
                o0w0Var.b.e();
                break;
            case 1:
                c0w0 c0w0Var = (c0w0) obj;
                tv80 tv80Var = c0w0Var.e;
                if (tv80Var != null) {
                    o0w0Var.b.a(c0w0Var.d, tv80Var, (Bundle) null);
                }
                break;
            default:
                tv80 tv80Var2 = ((b0w0) obj).d;
                if (tv80Var2 != null) {
                    o0w0Var.c.a.a(bbm.a(1), tv80Var2, (Bundle) null);
                }
                break;
        }
    }
}
