package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqf(c380 c380Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 2:
                this.b = c380Var;
                this.c = iu30Var;
                this.d = i;
                super(2);
                break;
            default:
                this.b = c380Var;
                this.c = iu30Var;
                this.d = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        c380 c380Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i2 = 0;
                    for (Object obj3 : c380Var) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        h5f h5fVar = (h5f) obj3;
                        boolean z = i == i2;
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.e(h5fVar.ordinal());
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new ame(iu30Var, h5fVar, (byte) 7);
                            x340Var2.s0(objT);
                        }
                        m5n1.b(z, (Function0) objT, cwl1.o0(x340Var2, h5fVar.a), (qim0) null, (idn0) null, (max) null, (vu30) null, (hw61) null, (ga80) null, 2, x340Var2, 0, 6, 1016);
                        i2 = i3;
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                epo1.g(c380Var, iu30Var, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                epo1.s(c380Var, iu30Var, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqf(int i, iu30 iu30Var, c380 c380Var) {
        super(2);
        this.a = (byte) 0;
        this.b = c380Var;
        this.d = i;
        this.c = iu30Var;
    }
}
