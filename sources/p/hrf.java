package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hrf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ n511 c;
    public final /* synthetic */ n511 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrf(long j, n511 n511Var, n511 n511Var2, String str, String str2, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = n511Var;
        this.d = n511Var2;
        this.e = str;
        this.f = str2;
        this.g = function0;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                wwo1.c(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                wwo1.c(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
