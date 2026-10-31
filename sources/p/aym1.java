package p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aym1 implements Function {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ blc0 b;
    public final /* synthetic */ ru9 c;
    public final /* synthetic */ Intent d;
    public final /* synthetic */ th61 e;

    public aym1(ru9 ru9Var, Intent intent, blc0 blc0Var, th61 th61Var) {
        this.c = ru9Var;
        this.d = intent;
        this.b = blc0Var;
        this.e = th61Var;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                tvm1 tvm1Var = (tvm1) obj;
                boolean z = tvm1Var.a;
                boolean z2 = tvm1Var.b;
                ru9 ru9Var = this.c;
                return ru9Var.c(this.d, this.b, z2 && ((evm1) ru9Var.b).i(), this.e, z);
            default:
                StringBuilder sb = new StringBuilder("Error obtaining cheetara/euterpe state for ");
                blc0 blc0Var = this.b;
                sb.append(blc0Var);
                n57.g(sb.toString(), (Throwable) obj);
                return this.c.c(this.d, blc0Var, false, this.e, false);
        }
    }

    public aym1(blc0 blc0Var, ru9 ru9Var, Intent intent, th61 th61Var) {
        this.b = blc0Var;
        this.c = ru9Var;
        this.d = intent;
        this.e = th61Var;
    }
}
