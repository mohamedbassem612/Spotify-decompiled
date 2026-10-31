package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dc60 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob60 b;
    public final /* synthetic */ mb60 c;
    public final /* synthetic */ ipb1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc60(ob60 ob60Var, mb60 mb60Var, ipb1 ipb1Var, byte b) {
        super(3);
        this.a = b;
        this.b = ob60Var;
        this.c = mb60Var;
        this.d = ipb1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                otw.c(this.b, this.c, uyn1.w(nim0.a, (vzq0) obj), this.d, b0kVar, 72, 0);
                break;
            default:
                vzq0 vzq0Var = (vzq0) obj;
                ((Number) obj3).intValue();
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, vzq0Var.a(), 5);
                otw.c(this.b, this.c, qim0VarB, this.d, (b0k) obj2, 72, 0);
                break;
        }
        return rih1Var;
    }
}
