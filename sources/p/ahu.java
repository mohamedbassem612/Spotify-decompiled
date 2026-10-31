package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ahu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahu(String str, String str2, Function0 function0, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = function0;
        this.f = qim0Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                e130.e(czo1.p(i | 1), this.c, this.d, this.e, (b0k) obj, this.f, this.b);
                break;
            case 1:
                ((Number) obj2).intValue();
                y9g1.h(czo1.p(i | 1), this.c, this.d, this.e, (b0k) obj, this.f, this.b);
                break;
            case 2:
                ((Number) obj2).intValue();
                rqg0.k(czo1.p(i | 1), this.c, this.d, this.e, (b0k) obj, this.f, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                o1p1.k(czo1.p(i | 1), this.c, this.d, this.e, (b0k) obj, this.f, this.b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahu(String str, String str2, boolean z, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = str;
        this.d = str2;
        this.b = z;
        this.e = function0;
        this.f = qim0Var;
        this.g = i;
    }
}
