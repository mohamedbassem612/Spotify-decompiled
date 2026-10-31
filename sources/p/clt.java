package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class clt extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clt(kp5 kp5Var, byte b) {
        super(0);
        this.a = b;
        this.b = kp5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kp5 kp5Var = this.b;
        switch (b) {
            case 0:
                String strC = ((zwm1) kp5Var.b).c();
                ltm1 ltm1Var = (ltm1) kp5Var.d;
                Context context = (Context) kp5Var.a;
                ltm1Var.getClass();
                return new blt(strC, new ykt(ltm1.b(context)));
            default:
                String strH = ((zwm1) kp5Var.b).h();
                ltm1 ltm1Var2 = (ltm1) kp5Var.d;
                Context context2 = (Context) kp5Var.a;
                ltm1Var2.getClass();
                return new blt(strH, new ykt(ltm1.e(context2)));
        }
    }
}
