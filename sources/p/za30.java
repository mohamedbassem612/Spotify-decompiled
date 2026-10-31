package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class za30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public za30(z9h z9hVar, int i, whb1 whb1Var, z9h z9hVar2, int i2, int i3) {
        super(2);
        this.e = z9hVar;
        this.b = i;
        this.f = whb1Var;
        this.g = z9hVar2;
        this.c = i2;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.d;
                b9p1.e((adj1) obj5, (Function0) obj4, (qim0) obj3, this.b, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.d;
                int i2 = this.b;
                lmt0.i((z9h) obj5, i2, (whb1) obj4, (z9h) obj3, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public za30(adj1 adj1Var, Function0 function0, qim0 qim0Var, int i, int i2, int i3) {
        super(2);
        this.e = adj1Var;
        this.f = function0;
        this.g = qim0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
