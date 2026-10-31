package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ux1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ux1(int i, int i2, String str, qim0 qim0Var) {
        super(2);
        this.a = (byte) 3;
        this.b = qim0Var;
        this.e = str;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                v9p1.s((fu1) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1), b2);
                break;
            case 1:
                nln.a((rin0) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1), b2);
                break;
            case 2:
                fq7.v((uyl) obj4, (lwb0) obj3, b0kVar, czo1.p(i | 1), b2);
                break;
            case 3:
                int iP = czo1.p(i | 1);
                luo1.c(iP, b2, (String) obj4, b0kVar, (qim0) obj3);
                break;
            case 4:
                ey00.d(czo1.p(i | 1), b2, (Function0) obj4, b0kVar, (qim0) obj3);
                break;
            case 5:
                ((otn0) obj4).a(czo1.p(i | 1), b2, b0kVar, (qim0) obj3);
                break;
            case 6:
                epo1.m((c380) obj4, (Integer) obj3, b0kVar, czo1.p(i | 1), b2);
                break;
            case 7:
                hqq0.e((quf1) obj4, b2, (iu30) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                two1.b((r061) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1), b2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ux1(Object obj, Object obj2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ux1(c380 c380Var, Integer num, int i, int i2) {
        super(2);
        this.a = (byte) 6;
        this.e = c380Var;
        this.b = num;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ux1(quf1 quf1Var, int i, iu30 iu30Var, int i2) {
        super(2);
        this.a = (byte) 7;
        this.e = quf1Var;
        this.d = i;
        this.b = iu30Var;
        this.c = i2;
    }
}
