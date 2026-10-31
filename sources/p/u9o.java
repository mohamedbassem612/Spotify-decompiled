package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u9o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u9o(int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 0;
        this.b = i;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.b;
        Object obj3 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fuo1.m(b2, czo1.p(1), b0kVar, (qim0) obj3);
                break;
            case 1:
                nyo1.e((hux) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 2:
                kno1.a((e7s0) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            default:
                qej1.a((vu30) obj3, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u9o(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
