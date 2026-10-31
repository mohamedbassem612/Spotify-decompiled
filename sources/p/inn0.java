package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class inn0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ kd41 b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inn0(kd41 kd41Var, j2i j2iVar) {
        super(2);
        this.b = kd41Var;
        this.c = j2iVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        kd41 kd41Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    hon1.h(kd41Var, j2iVar, x340Var, 0);
                } else {
                    x340 x340Var2 = x340Var;
                    if (!x340Var2.H()) {
                        hon1.h(kd41Var, j2iVar, x340Var, 0);
                    } else {
                        x340Var2.b0();
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                hon1.h(kd41Var, j2iVar, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inn0(kd41 kd41Var, j2i j2iVar, int i) {
        super(2);
        this.b = kd41Var;
        this.c = j2iVar;
    }
}
