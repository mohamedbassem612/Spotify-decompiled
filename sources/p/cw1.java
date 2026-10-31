package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cw1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cw1(String str, int i, int i2, boolean z) {
        super(2);
        this.d = str;
        this.b = z;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.c;
        boolean z = this.b;
        Object obj3 = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                g9p1.k(czo1.p(1), b2, (String) obj3, b0kVar, z);
                break;
            default:
                wpo1.i((pdi0) obj3, z, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cw1(pdi0 pdi0Var, boolean z, int i) {
        super(2);
        this.d = pdi0Var;
        this.b = z;
        this.c = i;
    }
}
