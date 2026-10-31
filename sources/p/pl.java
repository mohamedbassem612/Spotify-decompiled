package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl(String str, c380 c380Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = c380Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        c380 c380Var = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hxo1.a(str, c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                zro1.g(str, c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
