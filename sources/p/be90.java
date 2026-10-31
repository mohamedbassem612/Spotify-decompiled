package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class be90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be90(String str, String str2, Function0 function0, j2i j2iVar) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                d1u.x(czo1.p(385), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hti1 hti1Var = hti1.e;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    f6o1.b(this.b, this.c, hti1Var, uyn1.z(6.0f, 0.0f, 2, qim0VarF), null, this.d, apo.r(1792292980, new j2r0(this.e, (byte) 29), x340Var2), x340Var2, 1573248, 16);
                }
                break;
            default:
                ((Number) obj2).intValue();
                p1p1.o(czo1.p(1), this.b, this.c, this.d, this.e, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be90(String str, String str2, j2i j2iVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.e = j2iVar;
        this.d = function0;
    }
}
