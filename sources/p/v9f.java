package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9f extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y9f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9f(y9f y9fVar, byte b) {
        super(3);
        this.a = b;
        this.b = y9fVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y9f y9fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                otw.c((maa) y9fVar.j.get(), foo0.a, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
            default:
                ((Number) obj3).intValue();
                otw.c(y9fVar.f, new pln(new qln(y9fVar.d)), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
