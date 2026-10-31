package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h70 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(String str, hux huxVar, String str2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = huxVar;
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
                h0p1.a(czo1.p(i | 1), this.b, this.d, this.e, (b0k) obj, this.c, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                qpn1.a(czo1.p(i | 1), this.b, this.d, this.e, (b0k) obj, this.c, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(hux huxVar, String str, String str2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.c = huxVar;
        this.b = str;
        this.d = str2;
        this.e = function0;
        this.f = qim0Var;
        this.g = i;
    }
}
