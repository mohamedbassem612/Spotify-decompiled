package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z3h1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v3h1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3h1(v3h1 v3h1Var, int i, Object obj, int i2) {
        super(2);
        this.a = (byte) 3;
        this.b = v3h1Var;
        this.c = i;
        this.d = obj;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                w0o1.a(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                w0o1.a(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                w0o1.e(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w0o1.a(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3h1(v3h1 v3h1Var, int i, Object obj, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = v3h1Var;
        this.c = i;
        this.d = obj;
        this.e = i2;
    }
}
