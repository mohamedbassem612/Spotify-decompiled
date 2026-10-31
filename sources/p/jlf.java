package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jlf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jlf(String str, String str2, Function0 function0, qim0 qim0Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = qim0Var;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                buo1.j(czo1.p(1), this.f, this.b, this.c, this.d, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                p8p1.f(czo1.p(1), this.f, this.b, this.c, this.d, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }
}
