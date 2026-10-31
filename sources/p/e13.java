package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e13 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e13(int i, int i2, int i3, Function0 function0, qim0 qim0Var) {
        super(2);
        this.a = (byte) 0;
        this.b = qim0Var;
        this.c = i;
        this.f = function0;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                qim0 qim0Var = this.b;
                int i2 = this.c;
                k1u.a(qim0Var, i2, 2, (Function0) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                int i3 = this.c;
                suo1.d(i3, iP2, b3, (String) obj3, (b0k) obj, this.b);
                break;
            case 2:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP3 = czo1.p(i | 1);
                byte b4 = this.e;
                iu90.b(this.c, this.b, j2iVar, (b0k) obj, iP3, b4);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.e;
                sbl.o((s171) obj3, this.b, this.c, (b0k) obj, iP4, b5);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b6 = this.e;
                mth1.i((Integer) obj3, this.c, this.b, (b0k) obj, iP5, b6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e13(byte b, int i, int i2, int i3, Object obj, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e13(int i, qim0 qim0Var, j2i j2iVar, int i2, int i3) {
        super(2);
        this.a = (byte) 2;
        this.c = i;
        this.b = qim0Var;
        this.f = j2iVar;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e13(Integer num, int i, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = (byte) 4;
        this.f = num;
        this.c = i;
        this.b = qim0Var;
        this.d = i2;
        this.e = i3;
    }
}
