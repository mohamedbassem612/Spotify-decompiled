package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class br30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br30(String str, String str2, Function0 function0, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = qim0Var;
        this.f = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                m87.g(czo1.p(24577), this.b, this.c, this.d, (b0k) obj, qim0Var, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                boolean z = this.f;
                fae1.d(czo1.p(1), this.b, this.c, this.d, (b0k) obj, this.e, z);
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                t3p1.p(czo1.p(1), this.b, this.c, this.d, (b0k) obj, qim0Var2, this.f);
                break;
            case 3:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.e;
                x2g0.v(czo1.p(1), this.b, this.c, this.d, (b0k) obj, qim0Var3, this.f);
                break;
            case 4:
                ((Number) obj2).intValue();
                qim0 qim0Var4 = this.e;
                two1.n(czo1.p(24577), this.b, this.c, this.d, (b0k) obj, qim0Var4, this.f);
                break;
            case 5:
                ((Number) obj2).intValue();
                qim0 qim0Var5 = this.e;
                fqo1.d(czo1.p(1), this.b, this.c, this.d, (b0k) obj, qim0Var5, this.f);
                break;
            case 6:
                ((Number) obj2).intValue();
                boolean z2 = this.f;
                two1.l(czo1.p(1), this.b, this.c, this.d, (b0k) obj, this.e, z2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var6 = this.e;
                t3p1.s(czo1.p(1), this.b, this.c, this.d, (b0k) obj, qim0Var6, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br30(String str, String str2, boolean z, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.f = z;
        this.d = function0;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br30(String str, boolean z, String str2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.f = z;
        this.c = str2;
        this.d = function0;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br30(String str, boolean z, Function0 function0, String str2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = str;
        this.f = z;
        this.d = function0;
        this.c = str2;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br30(Function0 function0, qim0 qim0Var, String str, String str2, boolean z, int i) {
        super(2);
        this.a = (byte) 6;
        this.d = function0;
        this.e = qim0Var;
        this.b = str;
        this.c = str2;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br30(boolean z, Function0 function0, String str, String str2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.f = z;
        this.d = function0;
        this.b = str;
        this.c = str2;
        this.e = qim0Var;
    }
}
