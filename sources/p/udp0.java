package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class udp0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vnr0 b;
    public final /* synthetic */ bor0 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udp0(vnr0 vnr0Var, bor0 bor0Var, float f) {
        super(2);
        this.b = vnr0Var;
        this.c = bor0Var;
        this.d = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        bor0 bor0Var = this.c;
        vnr0 vnr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    z6p1.h(vnr0Var, bor0Var, f, x340Var2, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                z6p1.h(vnr0Var, bor0Var, f, (b0k) obj, czo1.p(9));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udp0(vnr0 vnr0Var, bor0 bor0Var, float f, int i) {
        super(2);
        this.b = vnr0Var;
        this.c = bor0Var;
        this.d = f;
    }
}
