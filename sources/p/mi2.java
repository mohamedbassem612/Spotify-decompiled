package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mi2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(int i, String str, Function0 function0, Function0 function1) {
        super(2);
        this.b = str;
        this.c = function0;
        this.d = function1;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = this.d;
                int iP = czo1.p(1);
                z47.a(this.e, this.b, this.c, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.e | 1);
                wro1.e(this.b, this.c, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(int i, String str, Function0 function0, Function0 function1, int i2) {
        super(2);
        this.e = i;
        this.b = str;
        this.c = function0;
        this.d = function1;
    }
}
