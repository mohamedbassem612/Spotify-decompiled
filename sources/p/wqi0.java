package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wqi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wqi0(String str, qim0 qim0Var, boolean z, Function0 function0, int i, int i2) {
        super(2);
        this.b = str;
        this.e = qim0Var;
        this.c = z;
        this.d = function0;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                xto1.n(czo1.p(i | 1), this.g, this.b, this.d, (b0k) obj, this.e, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                rc2.h(czo1.p(i | 1), this.g, this.b, this.d, (b0k) obj, this.e, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wqi0(String str, boolean z, Function0 function0, qim0 qim0Var, int i, int i2) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = qim0Var;
        this.f = i;
        this.g = i2;
    }
}
