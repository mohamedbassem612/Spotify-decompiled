package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ftj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftj0(int i, long j, ArrayList arrayList) {
        super(1);
        this.d = arrayList;
        this.c = j;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        int i = this.b;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                p5t0 p5t0Var = (p5t0) obj;
                int i2 = 0;
                for (q5t0 q5t0Var : (ArrayList) obj2) {
                    p5t0Var.f(q5t0Var, (hjl.i(j) - q5t0Var.a) / 2, i2, 0.0f);
                    i2 += q5t0Var.b + i;
                }
                break;
            default:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                nb51.v(lslVar, (y9e1) ((ven0) obj2).getValue(), i, j);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftj0(int i, long j, ven0 ven0Var) {
        super(1);
        this.b = i;
        this.c = j;
        this.d = ven0Var;
    }
}
