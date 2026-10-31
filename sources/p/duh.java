package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class duh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duh(String str, String str2, String str3, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = function0;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = this.e;
                t9p1.a(czo1.p(1), this.b, this.c, this.d, function0, (b0k) obj, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                bzn1.c(czo1.p(1), this.b, this.c, this.d, this.e, (b0k) obj, qim0Var);
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                rwq.c(czo1.p(1), this.b, this.c, this.d, this.e, (b0k) obj, qim0Var2);
                break;
            case 3:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.f;
                gho1.h(czo1.p(1), this.b, this.c, this.d, this.e, (b0k) obj, qim0Var3);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.e;
                aq8.m(czo1.p(1), this.b, this.c, this.d, function1, (b0k) obj, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duh(String str, String str2, String str3, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = qim0Var;
        this.e = function0;
    }
}
