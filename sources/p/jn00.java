package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jn00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jn00(String str, qim0 qim0Var, String str2, c380 c380Var, c380 c380Var2, iu30 iu30Var, int i, int i2) {
        super(2);
        this.b = str;
        this.e = qim0Var;
        this.c = str2;
        this.f = c380Var;
        this.g = c380Var2;
        this.h = iu30Var;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.d;
                String str = this.b;
                String str2 = this.c;
                wgo1.i((Function0) obj6, (Function0) obj5, str, str2, (String) obj4, (String) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.d;
                String str3 = this.b;
                String str4 = this.c;
                z5p1.c(str3, (qim0) obj6, str4, (c380) obj5, (c380) obj4, (iu30) obj3, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jn00(Function0 function0, Function0 function1, String str, String str2, String str3, String str4, int i, int i2) {
        super(2);
        this.e = function0;
        this.f = function1;
        this.b = str;
        this.c = str2;
        this.g = str3;
        this.h = str4;
        this.d = i2;
    }
}
