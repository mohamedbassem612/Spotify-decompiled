package p;

import android.app.Activity;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dsg implements Consumer {
    public final /* synthetic */ byte a;
    public final Activity b;
    public final lzn0 c;
    public final a1r0 d;

    public /* synthetic */ dsg(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var, byte b) {
        this.a = b;
        this.b = activity;
        this.c = lzn0Var;
        this.d = a1r0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        a1r0 a1r0Var = this.d;
        Activity activity = this.b;
        lzn0 lzn0Var = this.c;
        switch (b) {
            case 0:
                if (!a1r0Var.h(activity)) {
                    lzn0Var.e();
                } else {
                    a1r0Var.g();
                }
                break;
            default:
                tv80 tv80Var = ((jz01) obj).a;
                if (!lzn0Var.j(activity)) {
                    a1r0.m(a1r0Var, trn0.a, tv80Var, (Bundle) null, 12);
                } else {
                    lzn0Var.a(trn0.a, tv80Var, (Bundle) null);
                }
                break;
        }
    }
}
