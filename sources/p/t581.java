package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t581 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x581 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t581(x581 x581Var, String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = x581Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = function0;
        this.g = function1;
        this.h = qim0Var;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                m6p1.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                m6p1.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
